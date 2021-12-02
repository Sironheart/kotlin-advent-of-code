fun main() {
    fun part1(input: List<String>): Int {
        var depth = 0
        var acceleration = 0

        for (line in input) {
            val output = line.split(" ").map { it.trim() }
            val command = output[0]
            val amount = output[1].toInt()

            if (command == "forward") {
                acceleration += amount
            }
            else if (command == "up") {
                depth -= amount
            }
            else if (command == "down") {
                depth += amount
            }
        }

        return depth * acceleration
    }

    fun part2(input: List<String>): Int {
        var depth = 0
        var acceleration = 0
        var aim = 0

        for (line in input) {
            val output = line.split(" ").map { it.trim() }
            val command = output[0]
            val amount = output[1].toInt()

            if (command == "forward") {
                acceleration += amount
                depth += (aim * amount)
            }
            else if (command == "up") {
                aim -= amount
            }
            else if (command == "down") {
                aim += amount
            }
        }

        return depth * acceleration
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}