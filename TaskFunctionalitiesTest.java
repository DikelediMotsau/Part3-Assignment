/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.jar;

public class TaskFunctionalitiesTest {

    @Test
    public void testDeveloperArrayPopulated() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        assertArrayEquals(expectedDevelopers, taskManager.developers);
    }

    @Test
    public void testLongestTaskDuration() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        taskManager.displayLongestTask();
        // The longest task is 'Add Arrays' by Glenda Oberholzer with duration 11.
    }

    @Test
    public void testSearchTaskByName() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        taskManager.searchTaskByName("Create Login");
        // Check the output for the correct task details
    }

    @Test
    public void testSearchTasksByDeveloper() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        taskManager.searchTasksByDeveloper("Samantha Paulson");
        // Verify the output for the correct task details
    }

    @Test
    public void testDeleteTask() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        taskManager.deleteTaskByName("Create Reports");
        // Check if task "Create Reports" has been deleted successfully.
    }

    @Test
    public void testDisplayReport() {
        TaskFunctionalities taskManager = new TaskFunctionalities();
        taskManager.displayReport();
        // This should print the full report of all tasks.
    }
}




