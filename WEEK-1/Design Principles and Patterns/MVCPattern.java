public class MVCPattern {

    static class Student {

        private String name;
        private int id;
        private String grade;

        Student(String name, int id, String grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
    }

    static class StudentView {

        public void displayStudentDetails(Student student) {

            System.out.println("Student Details");
            System.out.println("Name : " + student.getName());
            System.out.println("ID : " + student.getId());
            System.out.println("Grade : " + student.getGrade());
        }
    }

    static class StudentController {

        private Student model;
        private StudentView view;

        StudentController(Student model, StudentView view) {
            this.model = model;
            this.view = view;
        }

        public void updateGrade(String grade) {
            model.setGrade(grade);
        }

        public void updateView() {
            view.displayStudentDetails(model);
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Parshvi", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.updateGrade("A+");

        System.out.println();

        controller.updateView();
    }
}