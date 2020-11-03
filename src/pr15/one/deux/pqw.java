package pr15.one.deux;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class pqw {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        addList(list);
        deleteList(list);
        System.out.println( findIndex(list,3));
        System.out.println( findNumber(list,5));
        System.out.println( maxList(list));
        System.out.println(minList(list));
        System.out.println(meanList(list));
        Sout(list);
    }
    public static void addList( ArrayList<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

    }
    public static void deleteList( ArrayList<Integer> list){
        list.remove(5);
    }
    public static int findNumber( ArrayList<Integer> list,int number){
        int s=0;
        for(Integer x: list)
        {
            if(x.equals(number))
            {
                s = x;
                break;
            }
        }
        return s;
    }
    public static int findIndex( ArrayList<Integer> list,int index){
        int s=0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(i==index)
            {
                s=list.get(i);
            }
        }
        return s;
    }
    public static int maxList(ArrayList<Integer> list){
        int max=0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }
        return max;
    }
    public static int minList(ArrayList<Integer> list){
        int min=10000;
        for(int i=0;i<list.size()-1;i++)
        {
            if(min>list.get(i))
            {
                min=list.get(i);
            }
        }
        return min;
    }
    public static int meanList(ArrayList<Integer> list){
        int sum=0;
        for(Integer x:list)
        {
            sum+=x;
        }
        return sum;
    }
    public static void Sout(ArrayList<Integer> list){

        for(Integer x:list)
        {
            System.out.print(x+" ");
        }

    }
}
