import java.util.ArrayList

class TaskManager {

    private val currentTasks: ArrayList<Task> = arrayListOf()
    private val completedTasks: ArrayList<Task> = arrayListOf()

    fun addTask(task: Task) {
        currentTasks.add(task)
    }

    fun completeTask(task: Task) {
        task.id = -1
        task.complete()
        currentTasks.remove(task)
        completedTasks.add(task)
    }

    fun removeTask(task: Task) {
        currentTasks.remove(task)
    }

    fun displayAllTasks() {
        for (task in currentTasks) {
            task.printTask()
            print("\n----------------------\n")
        }
    }
}


