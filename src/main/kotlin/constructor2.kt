class mimi(val jina:String, val shule:String, val mwaka:Int){

}
fun main(args: Array<String>) {
    val myobj=mimi("Erick", "eMobilis", 2021)
    println("My name is ${myobj.jina}, I have schooled in ${myobj.shule} from the year ${myobj.mwaka}")
}