public class EmployeeManagement {

    static class Employee {
        int employeeId;
        String name;
        String position;
        double salary;

        Employee(int employeeId, String name, String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public String toString() {
            return "ID: " + employeeId +
                    ", Name: " + name +
                    ", Position: " + position +
                    ", Salary: " + salary;
        }
    }

    static Employee[] employees = new Employee[10];
    static int count = 0;

    static void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    static Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Rahul", "Manager", 70000));
        addEmployee(new Employee(102, "Priya", "Developer", 55000));
        addEmployee(new Employee(103, "Amit", "Tester", 45000));

        System.out.println("Employee List:");
        traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");
        System.out.println(searchEmployee(102));

        deleteEmployee(101);

        System.out.println("\nEmployee List After Deletion:");
        traverseEmployees();
    }
}

