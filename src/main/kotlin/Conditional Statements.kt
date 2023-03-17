fun main(args: Array<String>) {

    //IF STATEMENTS
    var age = 20
    if (age < 18) {
        println("You are Underage,go do your homework")
    } else {
        println("Welcome To the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18) {
        println("Underweight")
    } else if (bmi <= 24) {
        println("Normal weight")
    } else if (bmi <= 29) {
        println("Overweight")
    } else {
        println("Obese")
    }

    var score = 93
    if (score <= 50) {
        println("Your grade is a 'C'")
    }else if (score <= 70 ){
        println("Your grade is a 'B'")
    }else if (score <= 90){
        println("Your grade is an 'A'")
    }else if (score <= 100){
        println("Excellent You have an 'A+'")
    }


    //WHEN STATEMENTS

    var bettingNumber  = 0
    when (bettingNumber) {
        1 -> {
            println("You lost")
        }
        2 -> {
            println("You lost")
        }
            3 -> {
        println("You won")
    }
        4 -> {
            println("You lost")
        }
        else ->{
            println("Please enter a number from 1 - 4")
        }
    }
    
}


