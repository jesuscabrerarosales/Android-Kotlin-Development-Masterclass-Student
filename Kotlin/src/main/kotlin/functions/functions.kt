package functions

fun main() {
//    println(sayHello("Jesus"))
//    println(getMax(10,4))
    sumAuto(1,2,3,4,5,6,7,8,9)
}

fun sayHello(name:String):String{
    return "Hello world! By $name"
}

fun getMax(a:Int, b:Int): Int{
    val max = if(a>b)a else b

    return max;
}
fun sumAuto(vararg numbers: Int){
   numbers.forEach{ println(it)}
}