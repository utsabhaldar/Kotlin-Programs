package OOP

class Person ( val firstName : String = "Utsab" val lastName : String = "Haldar" val age : Int = 20){
    val fullName : String
    get() = "$firstName $lastName" 

constructor(year: Int): this(){
    age +- year
}

val id : String
init{
    id = fullName + age
}

}
