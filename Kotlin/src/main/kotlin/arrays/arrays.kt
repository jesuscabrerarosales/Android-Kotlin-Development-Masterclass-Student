package arrays

fun main(args: Array<String>) {
    val max= findMax(arrayOf(1,2,3,4,5,6))
    val min = findMin(arrayOf(16,22,54,53,58))

    println(max)
    println(min)

//    val names: Array<String> = arrayOf("Jesus", "Juan")
//    val numbers = arrayOf(1,2,3,4,5,6);
//    val num2:Array<Int>
////    var i = 0;
//    for (name in names){
//        println(name)
//    }
//
//    for (i in numbers){
//        if(i is Int){
//            println(i)
//        }
//    }
}

fun findMax(numbers: Array<Int>):Int{
    var max : Int = numbers[0]

    for(number in numbers){
        if(number > max){
            max = number
        }
    }

    return max;
}

fun findMin(numbers: Array<Int>):Int{
    var min : Int = numbers[0]

    for(number in numbers){
        if(number < min){
            min = number
        }
    }

    return min;
}