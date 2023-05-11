class Students(val name:String,var gender:String, val age:Int){
}
fun main(args: Array<String>) {
    val myobj1=Students("Erick", "Male", 33)
    val myobj2=Students("John", "Male",23)
    val myobj3=Students("Zendaya", "Female", 26)
    val myobj4=Students("Mitchelle", "Female", 18)
    val myobj5=Students("Tom", "Male", 43)
    println(" Student name is ${myobj1.name} who is a ${myobj1.gender}, of the age ${myobj1.age} years ")
    println(" Student name is ${myobj2.name} who is a ${myobj2.gender}, of the age ${myobj2.age} years ")
    println(" Student name is ${myobj3.name} who is a ${myobj3.gender}, of the age ${myobj3.age} years ")
    println(" Student name is ${myobj4.name} who is a ${myobj4.gender}, of the age ${myobj4.age} years ")
    println(" Student name is ${myobj5.name} who is a ${myobj5.gender}, of the age ${myobj5.age} years ")
}
