package OOP

fun main(args: Array<String>) {
    //These are objects
    var f1 = Fruit ("Mango","Yellow","200g",30.0)
    var f2 = Fruit ("Apple","Pink","200g",30.0)
    println(f1.name)
    println(f2.colour)

    var c1 = Car("Mercedes","KDG 009J",30000000.00)
    var c2 = Car("Aston Martin","KDG 009J",450000000.00)
    println(c2.model)
    println(c1.reg_no)
    c2.accelerate()
    c1.brake()
}
//This is a class
class Fruit(name: String,colour : String,size : String,price : Double){
    //Declare properties
    var name : String
    var colour : String
    var size : String
    var price : Double

    //Initialize the properties
    init {
        this.name = name
        this.colour = colour
        this.size = size
        this.price = price
    }
}
class Car (model:String,reg_no:String,price:Double){
    var model : String
    var reg_no : String
    var price : Double
    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    //These are class functions
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("I am a $model and i can brake")
    }
}