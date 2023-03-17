fun main(args: Array<String>) {
    avg(34,15.0,)
    avg(35, 36.0, 67)
}

fun avg(x:Int, y:Double){
    var answer = (x+y)/3.0
    println("Result from avg1 is $answer")
}

fun avg(x:Int, y:Double, z:Int){
    var answer = (x+y+z)/3.0
    println("result from avg2 is $answer")
}