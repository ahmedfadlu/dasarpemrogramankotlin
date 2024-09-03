fun main(args: Array<String>) {
    var charA : Char = 'A'

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val  strA : String = charA.toString()
    println("kini charA sudah menjadi String =" + strA)
}