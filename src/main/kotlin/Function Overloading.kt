fun main(args: Array<String>) {
    addition(12,34.0)
    addition(50, 70.0, 80)
}
fun addition(x : Int, y : Double){
    var jibu = x + y
    println("Your answer from fun1 is $jibu")
}

fun addition(x : Int, y : Double, z : Int){
    var jibu = x + y + z
    println("Your answer from fun2 is $jibu")
}