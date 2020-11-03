package pr13.one.one;

import java.util.Arrays;

public class Student {
    protected int[] iDNumber;
    protected  int scoce;
    public Student(){}
    public Student(int scoce)
    {
        this.scoce=scoce;
    }
    public void sortArr(Student[]arr)
    {
        iDNumber=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            iDNumber[i]=arr[i].scoce;
        }
        Arrays.sort(iDNumber);
        for(int  x: iDNumber)
        {
            System.out.println(x);
        }
    }
    public void Sout(Student[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].iDNumber);
        }
    }

    public int getScoce() {
        return scoce;
    }

    public void setScoce(int iDNumber) {
        this.scoce = scoce;
    }
}
