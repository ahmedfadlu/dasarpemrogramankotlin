fun main(args: Array<String>) {


    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")


    var message = ""

    val  alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...","-.-.","-..",".", "..-.","--.", "....", "..", ".---", "-.-",".-..", "--", "-.","---", ".--.", "--.-", ".-.","...", "-", "..-", "...-",".--", "-..-", "-.--","--..")

    val character = s.split(" ")

    for (morseChar in character){
        val index = morseChars.indexOf(morseChar)

        if (index != -1){
            message += alphabetChars[index]
        }
    }

    println("The decoded message: $message" )
}