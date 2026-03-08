import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Task added successfully.");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nTask List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.get(index - 1).markAsCompleted();
        System.out.println("Task marked as completed.");
    }

    public void deleteTask(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(index - 1);
        System.out.println("Task deleted successfully.");
    }
}