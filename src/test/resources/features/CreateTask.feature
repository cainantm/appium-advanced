Feature: Create New Task
  Scenario: The User can add new task
    Given Click Add new Task
    Given Enter Taskname
    Given Enter TaskDesc
    When Click Save
    Then Task added successfully