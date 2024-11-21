/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deede
 */
import java.util.Arrays;
import java.util.Scanner;

public class TaskFunctionalities {
    String[] developers = {
        "Mike Smith", 
        "Edward Harrison", 
        "Samantha Paulson", 
        "Glenda Oberholzer"
    };
    
    private String[] taskNames = {
        "Create Login", 
        "Create Add Features", 
        "Create Reports", 
        "Add Arrays"
    };
    
    private int[] taskIDs = {1, 2, 3, 4};
    private int[] taskDurations = {5, 8, 2, 11};
    private String[] taskStatuses = {
        "To Do", 
        "Doing", 
        "Done", 
        "To Do"
    };

    // Display all tasks with status 'Done'
    public void displayDoneTasks() {
        System.out.println("Tasks with status 'Done':");
        for (int i = 0; i < taskStatuses.length; i++) {
            if ("Done".equals(taskStatuses[i])) {
                System.out.println("Developer: " + developers[i] + ", Task: " + taskNames[i] + ", Duration: " + taskDurations[i]);
            }
        }
    }

    // Display Developer and Duration for the task with the longest duration
    public void displayLongestTask() {
        int maxDuration = 0;
        int index = -1;
        for (int i = 0; i < taskDurations.length; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Longest Task: Developer: " + developers[index] + ", Duration: " + maxDuration);
        }
    }

    // Search for a task by Task Name
    public void searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                System.out.println("Task: " + taskNames[i] + ", Developer: " + developers[i] + ", Status: " + taskStatuses[i]);
            }
        }
    }

    // Search for all tasks assigned to a developer
    public void searchTasksByDeveloper(String developer) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equalsIgnoreCase(developer)) {
                System.out.println("Task: " + taskNames[i] + ", Status: " + taskStatuses[i]);
            }
        }
    }

    // Delete a task by Task Name
    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                // Shift elements to the left to remove the task
                for (int j = i; j < taskNames.length - 1; j++) {
                    taskNames[j] = taskNames[j + 1];
                    developers[j] = developers[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                // Nullify the last elements
                taskNames[taskNames.length - 1] = null;
                developers[developers.length - 1] = null;
                taskIDs[taskIDs.length - 1] = 0;
                taskDurations[taskDurations.length - 1] = 0;
                taskStatuses[taskStatuses.length - 1] = null;
                System.out.println("Entry '" + taskName + "' successfully deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // Display report of all tasks
    public void displayReport() {
        System.out.println("Full Task Report:");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i] != null) {
                System.out.println("Task ID: " + taskIDs[i] + ", Developer: " + developers[i] + ", Task: " + taskNames[i] + ", Duration: " + taskDurations[i] + ", Status: " + taskStatuses[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        
        // Display all done tasks
        taskManager.displayDoneTasks();
        
        // Display the longest task
        taskManager.displayLongestTask();
        
        // Search for a specific task
        taskManager.searchTaskByName("Create Login");
        
        // Search for tasks assigned to a developer
        taskManager.searchTasksByDeveloper("Samantha Paulson");
           // Delete a task
        taskManager.deleteTaskByName("Create Reports");
        
        // Display report
        taskManager.displayReport();
    }
}




