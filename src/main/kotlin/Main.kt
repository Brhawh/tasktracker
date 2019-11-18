import java.time.LocalDateTime

class Main {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val taskManager = TaskManager()
            val task = Task("Coding", "Collection of coding tasks", LocalDateTime.now().plusDays(5).plusHours(6))
            val task1 = Task("Running", "Have to go for a run", LocalDateTime.now().plusDays(7).plusHours(9))
            val task2 = Task("Sleep", "Go to bed before 12", LocalDateTime.now().plusDays(0).plusHours(12))
            val task3 = Task("Rugby", "Do rugby exercises", LocalDateTime.now().plusDays(0).plusHours(7))
            val task4 = Task("Write", "Practice writing skills", LocalDateTime.now().plusDays(5).plusHours(6))
            val task5 = Task("Read", "Read research papers", LocalDateTime.now().plusDays(5).plusHours(6))

            taskManager.addTask(task)
            taskManager.addTask(task1)
            taskManager.addTask(task2)
            taskManager.addTask(task3)
            taskManager.addTask(task4)
            taskManager.addTask(task5)

            taskManager.displayAllTasks()

            task5.complete()

            taskManager.displayAllTasks()
        }
    }
}