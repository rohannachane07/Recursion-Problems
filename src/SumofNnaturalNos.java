import java.util.Scanner;

public class SumofNnaturalNos
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n==0)
        return 0;
        else
            return n+sum(n-1);
    }
}
