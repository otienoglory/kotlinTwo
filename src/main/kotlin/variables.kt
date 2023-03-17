fun main(args: Array<String>) {
    var x : Int
    var y : Float
    var w : Double
    var m : Char
    var v : String
    var j : Boolean
    var answer: Double
    var age : Int
    var name : String

    x = 10
    y = 20.0f
    w = 30.0
    m = 'A'
    v = "elsie"
    j = true
    answer = y+w
    println(answer)

    // concatination
    age = 18
    name = "Elsie"

    println("hello "+name+" you are "+age+" years old")
    println("hello $name you are $age years old")

    var firstNum = 30
    var secondNum = 40
    var jibu = firstNum + secondNum
    println("Hello $name.Your answer is $jibu")
}