

fun main(){
    val options = arrayOf("Rock", "Scissors", "Paper")

    val computer = getComputerChoice(options)
    val human = getHumanChoice(options)
    printResult(computer, human)

}


fun getComputerChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getHumanChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var humanChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        var humanInput = readLine()

        if (humanInput != null && humanInput in optionsParam) {
            isValidChoice = true
            humanChoice = humanInput
        }
    }

    return humanChoice
}

fun printResult (computer: String, human: String){
    var result: String
    if (computer == human) result = "Tie"
    else if ( (computer == "Rock" && human == "Paper")
        || (computer == "Paper" && human == "Scissors")
        || (computer == "Scissors" && human == "Rock"))
    {
        result = "You win !"

    } else {
        result = "You lose !"
    }

    println("Your choice is: $human Computer choice is: $computer -> $result")
}
