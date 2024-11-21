/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg3.assignment;

/**
 *
 * @author deede
 */
import java.util.Scanner;


public class Part3Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          TaskFunctionalities taskManager = new TaskFunctionalities();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to Task Functionality System");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1: Display all done tasks");
            System.out.println("2: Display the longest task");
            System.out.println("3: Search for a task by name");
            System.out.println("4: Search for tasks by developer");
            System.out.println("5: Delete a task by name");
            System.out.println("6: Display full report of tasks");
            System.out.println("0: Exit");
             command = scanner.nextLine();

            switch (command) {
                case "1":
                    taskManager.displayDoneTasks();
                    break;
                case "2":
                    taskManager.displayLongestTask();
                    break;
                case "3":
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskManager.searchTaskByName(taskName);
                       break;
                case "4":
                    System.out.print("Enter developer name: ");
                    String developerName = scanner.nextLine();
                    taskManager.searchTasksByDeveloper(developerName);
                    break;
                case "5":
                    System.out.print("Enter task name to delete: ");
                    String deleteTaskName = scanner.nextLine();
                    taskManager.deleteTaskByName(deleteTaskName);
                     break;
                case "6":
                    taskManager.displayReport();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                        }
        }
    }

    private static class TaskFunctionalities {

        public TaskFunctionalities() {
        }

        private void displayDoneTasks() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void displayLongestTask() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void searchTaskByName(String taskName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void searchTasksByDeveloper(String developerName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void deleteTaskByName(String deleteTaskName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void displayReport() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
    
    

