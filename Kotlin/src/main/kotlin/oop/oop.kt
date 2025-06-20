package oop

import oop.car.Car
import oop.user.User

fun main() {
//    usingClassCar()
    usingClassUser()
}

fun usingClassUser() {
    val user = User("Al", "Cabrera Rosales", 21)

    println("\n")
    println("About The User:")
    println("Name = ${user.name}")
    println("Name = ${user.lastName}")

}

fun usingClassCar() {
    val car1 = Car("Tesla", "S Plaid", "Red", 2);

    println("About The Car:")
    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")
    car1.move()
    car1.stop()

    val car2 = Car("NISSAN", "HX2", "BLUE", 4);

    println("\n")
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")
    car2.move()
    car2.stop()
}
