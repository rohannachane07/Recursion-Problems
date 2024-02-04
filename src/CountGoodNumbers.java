public class CountGoodNumbers
{
    public static void  count(int n)
    {
        int odd=n/2,even=(n+1)/2,mod=1000000007;
       for(int i=0;i<n;i++)
       {
           if(i%2==0)
           {
               even*=5;
               even%=mod;
               System.out.println(even);
           }
           else
           {
               odd*=4;
               odd%=mod;
               System.out.println(odd);
           }
       }

    }

    public static void main(String[] args)
    {
        int n=1;
        count(n);
    }
}
