import java.util.Scanner;
public class ROPECUTTING
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(maxpiece(n,a,b,c));
    }
    static int maxpiece(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int tmp1=maxpiece(n-a,a,b,c);
        int tmp2=maxpiece(n-b,a,b,c);
        int tmp3=maxpiece(n-c,a,b,c);

        int res=Math.max(tmp1,
                Math.max(tmp2,tmp3));

        if(res==-1)
            return -1;

            return res+1;
    }
}
