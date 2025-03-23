public class Main {

    public static void main(String[] args) {

        Student student = new Student("Kamil","Pomorski",27484,"s27484@pjwstk.edu.pl","xyz",new double[] {2, 2.5, 3, 3.5, 4, 4.5, 5});

        Student student2 = new Student("Kamil","Pomorski",27485,"s27484@pjwstk.edu.pl","xyz",new double[] {2, 3.5, 5, 2, 2, 1, 2});

        Student student3 = new Student("Kamil","Pomorski",27485,"s27484@pjwstk.edu.pl","xyz",new double[] {2, 3.5, 5, 2, 2, 1, 2});

        Teacher teacher = new Teacher("Jan","PPJ");

        System.out.println(student.countAVG(student.grades));

        System.out.println(student2.countAVG(student2.grades));

        StudentGroup studentGroup = new StudentGroup("27c",teacher);

        studentGroup.addstudent(student);

        studentGroup.addstudent(student2);

        studentGroup.addstudent(student3);

    }
}