fun main(args: Array<String>) {
    typeInference()
}

fun typeInference() {
    println ("\n============================================================")
    println ("               Using Type Inference in Kotlin              ")
    println ("============================================================")

    val doubleNumber = 1200.45
    val floatNumber = 700.78f
    val longNumber = 98765432L
    val intNumber = 123456
    val shortNumber = 345
    val byteNumber = 127

    println("doubleNumber value is: :  " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  :  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   :  " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    :  " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  :  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   :  " + byteNumber + ", and the type is: " + byteNumber.javaClass)
}