package pr13.one.one;

public class prOne {
    public static void main(String[] args) {
        TestStudent testStudent=new TestStudent();
        testStudent.test();
    }

}

class TestStudent
{
    public void test()
    {

            Student[] arr=new Student[5];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=new Student(10-i);
            }
            Student student=new Student();
            student.sortArr(arr);


    }

}

