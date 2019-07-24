import java.time.LocalDateTime

fun main() {
    val task = Task("Coding", "Collection of coding tasks", LocalDateTime.now().plusDays(5).plusHours(6))
    task.printTask()
}