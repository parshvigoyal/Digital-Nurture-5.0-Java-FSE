public class TaskManagement {

    static class Task {
        int taskId;
        String taskName;
        String status;
        Task next;

        Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }
    }

    static Task head = null;

    static void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newTask;
    }

    static Task searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id)
                return temp;
            temp = temp.next;
        }

        return null;
    }

    static void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    static void displayTasks() {
        Task temp = head;

        while (temp != null) {
            System.out.println("Task ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Status: " + temp.status);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        addTask(101, "Design UI", "Pending");
        addTask(102, "Write Code", "In Progress");
        addTask(103, "Testing", "Pending");

        System.out.println("Task List:");
        displayTasks();

        System.out.println("\nSearching Task ID 102:");
        Task task = searchTask(102);

        if (task != null)
            System.out.println("Found: " + task.taskName);

        deleteTask(101);

        System.out.println("\nTask List After Deletion:");
        displayTasks();
    }
}