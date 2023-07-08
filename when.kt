fun main(){
    fun String.getQType() : String{
        return when {
            last() == '!' -> "Exclamanation"
            last() == '.' -> "Statement"
            last() == '?' -> "Question"
            else -> "Unidentified"

        }
    }
    val s = "What a beautiful day it is!"
    println(s)
    println(s.getQType())

    val h = "You are good enough."
    println(h)
    println(h.getQType())

    val r = "How are you?"
    println(r)
    println(r.getQType())
}