package variables
const val oldAge = 18
var age : Int = 10;
var separador : String = "########################";
var case1 : String = "- Eres menor de edad"
var case2 : String =  "- Eres mayor de edad"
var caseF : String = ""
fun main() {
    var userName:String  = "Jesus CR"
    println(userName)
    println(separador)
    var finalAge = age(age)
    println(finalAge)

    if(age< oldAge){
        println(case1)
        caseF = case1
    }else{
        println(case2)
        caseF = case2
    }

    println(separador)
    println("** Reporte Final: $userName, edad: $age, $caseF")
}

fun age(ageInput:Int):String{
    if(ageInput == null){
        return "- No se ha obtenido la  edad!"
    };
    return "- Tu edad es $ageInput";
}

