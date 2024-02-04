import java.util.Scanner;
public class sumofDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        //if(n==0)
          //  return 0;
        if(n<=9)
            return n;
        else
            return (sum(n/10)+n%10);
    }
}
