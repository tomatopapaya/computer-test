import java.util.*;
public class Third_test
{
    public static void main(String args[])
    {
        int Array[] = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> odd= new ArrayList<>();
        List<Integer> even= new ArrayList<>();
        int odd_sum=0;
        int even_sum=0;

        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]%2!=0) {
                odd_sum += i;
                odd.add(Array[i]);
            }
            else {
                even_sum += i;
                even.add(Array[i]);
            }
        }
        System.out.println("奇數陣列:"+odd);
        System.out.println("偶數陣列:"+even);
        System.out.println("奇數總和-偶數總和:"+(odd_sum-even_sum));

    }
}
