fun main(){
    println("what day is today?")
    val day = readLine()
    // when(day) {
    //     "Mon" -> println("Paratha")
    //     "Tue" -> println("Poha")
    //     "Sun" -> println("egg")
    //     else -> println("wrong information")
    // }


    val food = when(day){
        "Mon","Wed","Thu" -> ("Paratha")
        "Tue" -> ("Poha")
        "Sun" -> ("egg")
        else -> ("wrong information")
    }

    println(food)

}