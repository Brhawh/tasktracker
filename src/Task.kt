import java.time.Duration
import java.time.LocalDateTime

// Main object for storing information on completable tasks
class Task (private val title: String,
            private val description: String,
            private val deadline: LocalDateTime?,
            private var completed: Boolean = false) {

    private var daysRemaining: Long = 0
    private var hoursRemaining: Long = 0
    private var minutesRemaining: Long = 0

    init {
        updateTimeRemaining()
    }

    private fun updateTimeRemaining() {
        var diff = Duration.between(LocalDateTime.now(), deadline)
        daysRemaining = diff.toDays()
        diff = diff.minusDays(daysRemaining)
        hoursRemaining = diff.toHours()
        diff = diff.minusHours(hoursRemaining)
        minutesRemaining = diff.toMinutes()
    }

    fun printTask() {
        val completedString = if (completed) "yes" else "no"
        print("Title: $title \nDescription: $description \nTime Remaining:\n" +
                "\tDays: $daysRemaining\n" +
                "\tHours: $hoursRemaining\n" +
                "\tMinutes: $minutesRemaining\n" +
                "Completed: $completedString")
    }
}