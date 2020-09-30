package com.ezanetta.altoquepr

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    val resultNumbers = mutableListOf<Int>()

    numbers.forEach {
        if (it % 2 == 0) {
            resultNumbers.add(it)
        }
    }

    return resultNumbers
}