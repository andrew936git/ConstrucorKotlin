class Box(_width: Int = 0, _height: Int = 0, _depth:Int = 0) {
    val width: Int = _width
     val height: Int = _height
    val depth: Int = _depth

    fun boxCapacity(): Int{
        return width * height * depth
    }
}