fun main(args: Array<String>) {
    var marks = 68
    var grade = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }
    println(grade)


    //when
    var bettingNumber = 3
    var bettingResult = when (bettingNumber){
        1 -> {
            "You lost"
        }
        2 -> {
            "You lost"
        }
        3 -> {
            "You won"
        }
        4 -> {
            "You lost"
        }
        else ->{
            "Please enter a number from 1 - 3"
        }
    }
    println(bettingResult)
}