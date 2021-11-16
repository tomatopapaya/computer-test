import java.util.*;
public class fourth_test {
    public static void main(String[] args)
    {
        int Array[]={77,5,5,22,13,55,97,4,796,1,0,9};
        List<Integer>list=new ArrayList<>();
        int max=Array[0];
        for(int i=1;i<Array.length;i++)
        {
            if( max < Array[i])
            {
                max=Array[i];
            }
        }
        list.add(max);
        System.out.println(list);
        System.out.println(max);

    }
}
