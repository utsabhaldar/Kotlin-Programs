import OOP.Person

fun main(){
    val p1 = Person()
    println("My name is ${p1.firstName} ${p1.lastName} and I am ${p1.age} years old.")
    val p2 = Person(firstName = "Utpal", lastName = "Haldar", age = 48)
    println(p2.fullName)

    val p3 = Person(year = 3)
    println("My name is ${p1.firstName} ${p1.lastName} and I am ${p1.age} years old.")
    println("p2's id is: ${p3.id}")
    
}