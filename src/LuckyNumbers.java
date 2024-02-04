public class LuckyNumbers {

    //User function Template for Java
    class Solution
    {
        // Complete the function
        // n: Input n
        // Return True if the given number is a lucky number else return False
        public static boolean isLucky(int n)
        {
            int counter=2;
            return isLuc(n,counter);
        }
        public static boolean isLuc(int n,int counter)
        {
            if(n%counter==0)
                return false;
            if(n<counter)
                return true;
            return isLuc(n-(n/counter),counter+1);
        }
    }
}
