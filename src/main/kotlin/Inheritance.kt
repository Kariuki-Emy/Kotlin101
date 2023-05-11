open class Wazazi{
    val Mother="She likes cooking"
    val Father="He likes football"
}
class Son:Wazazi(){
    fun boy(){
        println(Father)
    }
}
class Daughter:Wazazi(){
    fun girl(){
        println(Mother)
    }
}

fun main(args: Array<String>) {
    val sonobj=Son()
    sonobj.boy()
    val daughterobj=Daughter()
    daughterobj.girl()
}