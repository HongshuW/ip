/**
 * Represents a processor that can delete a task from the task list. A subclass of the Processor class.
 */
public class DeleteATaskProcessor extends Processor {
    /**
     * Constructor of the class `DeleteATaskProcessor`.
     *
     * @param task Task to be deleted.
     */
    public DeleteATaskProcessor(Task task) {
        super("delete");
        this.task = task;
    }

    /**
     * Updates the message to be printed.
     */
    @Override
    public void process() {
        Duke.removeFromList(this.task);
        this.message = String.format(
                "Noted. I've removed this task:\n  %s\nNow you have %o tasks in the list.\n",
                this.task, Duke.getNumOfTasks());
    }
}