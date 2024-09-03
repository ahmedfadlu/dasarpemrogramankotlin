fun main(args: Array<String>) {
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a :" +(a === a))
    val boxedA: Int? =a
    val anotherBoxedA: Int? =a
    println("boxedA Apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA :" + (boxedA === anotherBoxedA))

    println("boxedA Apakah memiliki nilai yang sama dengan anotherBoxedA : " +(boxedA == anotherBoxedA))
}