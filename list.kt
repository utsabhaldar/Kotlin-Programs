fun main(){
    val list = listOf("kt","c","cpp","dart")
    val map = mapOf(1 to "kt", 2 to "c", 3 to "cpp", 4 to "dart")

    for((key, value) in map)(
        println("$key => $value")
    )

    for(i in 1..9){
        println(i)
    }

    for (i in 1 until 9){
        println(i)
    }

    for (i in 9 downTo 1){
        println(i)
    }

    for (i in list){
        println(i)
    }

}