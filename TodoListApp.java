import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine();
                    todoList.add(newTask);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter the number of the task to remove: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (taskNumber >= 1 && taskNumber <= todoList.size()) {
                            String removedTask = todoList.remove(taskNumber - 1);
                            System.out.println("Task '" + removedTask + "' removed successfully.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting To-Do List application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
