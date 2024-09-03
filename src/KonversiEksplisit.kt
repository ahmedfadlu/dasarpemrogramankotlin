fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long =  3L + valInt
    println("Konversi veriabel valInt secara implisit : " +valSum)
    val valLong: Long = valInt.toLong()
    println("Konversi veriabel valInt secara eksplisit :" +valLong)
}