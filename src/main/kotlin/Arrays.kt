fun main(args: Array<String>) {
    var names = arrayListOf("Yvonne","Erick","Dennis","Alphy","Thelma")
    println(names [2])
    names.add("King")

    //Use for loop to print
    for (i in 0 until (names.size -1)){
        println(names[i])
    }

        //For each loop
    names.forEach{
        println(it)
    }
}