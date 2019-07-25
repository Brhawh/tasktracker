import java.time.LocalDateTime

class Main {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val task = Task("Coding", "Collection of coding tasks", LocalDateTime.now().plusDays(5).plusHours(6))
            task.printTask()
        }
    }
}