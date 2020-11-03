package pr13.one.deux;


public class StudentTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Aaron", 20, new double[] {1, 1, 1}),
                new Student(2, "Bob", 19, new double[] {2, 2, 2}),
                new Student(1, "Clark", 19, new double[] {3, 3, 3})
        };

        new MergeSort<Student>().accept(students, new StudentComparatorByGPA());

        for (var student : students) {
            System.out.println(student.toString());
        }


    }

}

