//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val box = Box(2, 5, 6)
    println("Объем равен ${box.boxCapacity()} см3.")

//2
    val array = arrayOf(-1, 3, 6, -8 ,0, -4, 9, 15, -10, 0)
   println("Масимальное число ${ array.max() }, минимальное число ${array.min()}")

//3
    val array2 = arrayOf(3,67,1, 55, 65, 89, 23)
    println(array2.contentToString())

//4
    println("Введите целое число")
    val num = readln().toInt()
    when{
        (num < 0 && num % 2 != 0) -> println("Отрицательное нечетное число")
        (num < 0 && num % 2 == 0) -> println("Отрицательное четное число")
        (num == 0) -> println("Нулевое число")
        (num > 0 && num % 2 != 0) -> println("Положительное нечетное число")
        (num > 0 && num % 2 == 0) -> println("Положительное четное число")
    }

//5
    val car = Car()
    car.gasPedal()
    car.gasPedal()
    car.gasPedal()
    car.brakePedal()
    car.brakePedal()
    car.brakePedal()
    car.brakePedal()
}