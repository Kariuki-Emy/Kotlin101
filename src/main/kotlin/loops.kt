fun main(args: Array<String>) {
    // this is a for loop

    for (i in 5 .. 12){
        println("loop : $i ")
    }
    val myarr= arrayOf("ab", "cd", "ef", "gh", )

    for (n in myarr){
        println(n)
    }
    // this is a while loop
    var num = 10
    var num2 = 2
    var num3 = 100
    while (num >= 0){
        println("Loop : $num")
        num--
    }
    do {
        println("Loop : $num3")
        num3++
    } while (num2 >= 185)

}