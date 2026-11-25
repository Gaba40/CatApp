fun main() {
    val double = { x: Int -> x * 2 }
    println(double(5))

    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(2, 3))

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.filter {it % 2 == 0})
    println(numbers.map {it * 10})
    println(numbers.any {it > 5})
    println(numbers. count {it > 2})
    println(numbers. sortedByDescending { it})
}
main()