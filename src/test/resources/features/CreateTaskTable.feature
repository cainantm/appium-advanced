Feature: Create New Task - Table
  Scenario Outline: The user can add new task
    Given Click Add new Task
    Given Enter "<TaskName>" and "<TaskDesc>"
    Then Task added successfully

Examples:
    | TaskName | TaskDesc |
    | Cucumber Task 1 | Cucumber Task Details 1 |
    | Cucumber Task 2 | Cubumber Task Details 2 |