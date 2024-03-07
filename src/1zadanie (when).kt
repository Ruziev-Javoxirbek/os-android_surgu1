fun checkRectanglesWithWhen(left1: Int, right1: Int, top1: Int, bottom1: Int,
                            left2: Int, right2: Int, top2: Int, bottom2: Int) {
    when {
        left1 >= left2 && right1 <= right2 && top1 <= top2 && bottom1 >= bottom2 -> {
            println("Первый прямоугольник находится внутри второго")
        }
        (left1 <= right2 && right1 >= left2 && top1 >= bottom2 && bottom1 <= top2) ||
                (left2 <= right1 && right2 >= left1 && top2 >= bottom1 && bottom2 <= top1) -> {
            println("Прямоугольники пересекаются")
        }
        else -> {
            println("Прямоугольники не пересекаются и не вложены друг в друга")
        }
    }
}

fun main() {
    // Примеры координат прямоугольников
    val left1 = 1
    val right1 = 5
    val top1 = 7
    val bottom1 = 3

    val left2 = 2
    val right2 = 6
    val top2 = 8
    val bottom2 = 4

    checkRectanglesWithWhen(left1, right1, top1, bottom1, left2, right2, top2, bottom2)
}
