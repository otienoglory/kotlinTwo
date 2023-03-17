package OOP

fun main(args: Array<String>) {
    //Inheritance and Polymorphism
    var studentOne = Student("Jared","jared@gmail.com","jared123")
    var studentTwo = Student("Joy","joy@gmail.com","joy123")
    println(studentOne.name)
    println(studentTwo.email)

    var teacherOne = Teacher("King","king@gmail.com","king123")
    var teacherTwo = Teacher("Eric","eric@gmail.com","eric123")
    println(teacherOne.name)
    teacherTwo.register()

    var headteacherOne = HeadTeacher("King","king@gmail.com","king123")
    var headteacherTwo = HeadTeacher("Eric","eric@gmail.com","eric123")
    println(headteacherOne.name)
    headteacherOne.register()
    headteacherOne.login()
    headteacherOne.suspendStudent()
    headteacherOne.approveCash()

}

open class Student(open var name : String,open var email : String, open var password : String){

    fun register(){
        println("$name,You register with email $email and  password $password")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }

}

open class Teacher(name:String, email:String, password: String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I  can suspend a student")
    }
}
class HeadTeacher(name:String, email:String, password: String):Teacher(name, email, password){
    fun approveCash(){
        println("Yeah,I can approve cash")
    }
}