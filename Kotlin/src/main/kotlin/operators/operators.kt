package operators
var separador : String = "#################"
fun main() {
    var resultSum = sum(10, 5);
    var resultRest = rest(10,5);
    var resultMult = mult(10,5);
    var resultDiv = div(10,5);
    println(separador)
    println("$resultSum, de la Suma");
    println("$resultRest, de la Resta");
    println("$resultMult, de la Multiplicacion");
    println("$resultDiv, de la Division");
}

fun sum(x:Int, y:Int):String{
    var result = x+y;
    return "Resultado: $result";
}

fun rest(x:Int, y:Int):String{
    var result = x-y;
    return "Resultado: $result";
}

fun mult(x:Int, y:Int):String{
    var result = x*y;
    return "Resultado: $result";
}

fun div(x:Int, y:Int):String{
    var result = x/y;
    return "Resultado: $result";
}
