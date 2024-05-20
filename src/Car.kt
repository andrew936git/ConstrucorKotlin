class Car(private val _mass: Int = 0, private val _speed:Int = 0) {
    private var mass = _mass
    private var speed = _speed

    fun gasPedal(){
        if (speed == 0) print("Машина начинает движение ")
        speed += 10
        println("Скорость $speed")
    }

    fun brakePedal (){
        if (speed == 0) println("Машина остановлена")
        else {
            speed -= 10
            println("Скорость $speed")
        }
    }
}