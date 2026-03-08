import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    taskManager.addTask(title);
                    break;

                case 2:
                    taskManager.showTasks();
                    break;

                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    if (scanner.hasNextInt()) {
                        int completeIndex = scanner.nextInt();
                        scanner.nextLine();
                        taskManager.markTaskAsCompleted(completeIndex);
                    } else {
                        System.out.println("Please enter a valid number.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    if (scanner.hasNextInt()) {
                        int deleteIndex = scanner.nextInt();
                        scanner.nextLine();
                        taskManager.deleteTask(deleteIndex);
                    } else {
                        System.out.println("Please enter a valid number.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }

        scanner.close();
    }
}