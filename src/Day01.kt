fun main() {
    fun part1(input: List<String>): Int {
        var previousValue: Int? = null
        var counter = 0

        for (value in input) {
            if (previousValue != null && previousValue < value.toInt()) counter++

            previousValue = value.toInt()
        }

        return counter
    }

    fun part2(input: List<String>): Int {
        var previousValue: Int? = null
        var counter = 0

        for (value in input.indices) {
            if (input.lastIndex < value + 2) continue

            val calculated = input[value].toInt() + input[value + 1].toInt() + input[value + 2].toInt()

            if (previousValue != null && previousValue!! < calculated) counter++

            previousValue = calculated
        }

        return counter
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 0)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}