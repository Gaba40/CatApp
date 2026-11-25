interface Describable {
    fun describe(): String
}

class Student(val name: String, val course: String) : Describable {
    override fun describe(): String = "Student $name studies $course"
}

class Event(val title: String, val seatsLeft: Int) : Describable {
    override fun describe() = "Event $title has $seatsLeft seats left"
}

fun main() {
    val things: List<Describable> = listOf(
        Student("Aisha", "Computing"),
        Event("Python Workshop", 4),
        Student("Omar", "Software Engineering")
    )

    for (t in things) {
        println(t.describe())
    }
}
main()