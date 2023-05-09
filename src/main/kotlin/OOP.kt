class Stubborn{
    //datamember
   private var nambari=5
    // member function
    fun calculate():Int{
       return nambari * nambari
    }
}

fun main(args: Array<String>) {
    // This is an object
    val myobject=Stubborn()
    println(myobject.calculate())
    //create object
    var obj=eMobilis()
    println(obj.Hesabu())

}
class eMobilis{
    // data member
    var num:Int=6
    //member function
    fun Hesabu():Int{
        return num *num
    }
}
