package ru.otus.homework
fun main() {
    println(sumOfTwo(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7),5).contentToString())
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val array = Array(2) {0}
    for (i in numbers.copyOfRange(0, numbers.size - 1)) {
        for (j in numbers.copyOfRange(i + 1, numbers.size)) {
            if (numbers[i] + numbers[j] == target) {
                array [0] = i
                array [1] = j
            }
        }
    }
    //return array.toIntArray()
    return if (array[0] == 0 && array[1] == 0) {
        throw Exception("IllegalArgumentException")
    } else {
        array.toIntArray()
    }
}