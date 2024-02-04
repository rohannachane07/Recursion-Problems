import java.util.Scanner;

public class Palindromecheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int start=0;
        int end=n-1;
        System.out.println(palindrome(str,start,end));
    }
    static boolean palindrome(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        return (str.charAt(start)==str.charAt(end) && palindrome(str,start+1,end-1));
    }
}
