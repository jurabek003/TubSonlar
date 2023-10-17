import java.util.Scanner

fun main() {
    val input=Scanner(System.`in`)
    println("N ni kiritng")
    val n=input.nextInt()
    val array=ArrayList<Int>()
    if (n > 3){
        array.add(0,2)
        array.add(1,3)
    }
    for (i in 2 until n+1){
        if (i % 2 != 0  && i % 3 !=0  ){
            array.add(i)
        }
    }
    for (i in 0 until array.size){
        print("${array[i]}, ")
    }
    println("")
    println("Ko'paytmasi")
    var sum:Int=1
    for (i in  0 until array.size){
       sum*=array[i]
    }
    println(sum)

}