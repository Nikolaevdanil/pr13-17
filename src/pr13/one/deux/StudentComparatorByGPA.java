package pr13.one.deux;



import java.util.Comparator;

public class StudentComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

}