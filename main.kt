import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s1 = scanner.nextLong()
    val oper = scanner.next()
    val s2 = scanner.nextLong()
    when (oper) {
        "+" -> println(s1 + s2)
        "-" -> println(s1 - s2)
        "/" -> {if (s2 != 0.toLong()) {println(s1.div(s2))} else {
            println("Division by 0!")}}
        "*" -> println(s1*s2)
        else -> println("Unknown operator" )
    }
}
