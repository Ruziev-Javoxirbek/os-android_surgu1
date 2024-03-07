fun classifyTriangleWithIf(a: Double, b: Double, c: Double) {
    if (a == b && b == c) {
        println("Треугольник равносторонний")
    } else if (a == b || a == c || b == c) {
        println("Треугольник равнобедренный")
    } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
        println("Треугольник прямоугольный")
    } else {
        println("Треугольник произвольный")
    }
}

fun main() {
    print("Введите длину стороны a: ")
    val a = readLine()?.toDouble() ?: 0.0

    print("Введите длину стороны b: ")
    val b = readLine()?.toDouble() ?: 0.0

    print("Введите длину стороны c: ")
    val c = readLine()?.toDouble() ?: 0.0

    classifyTriangleWithIf(a, b, c)
}