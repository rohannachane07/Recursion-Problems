public class CountTotalDigitsInaNumber {


//User function Template for Java

    class Solution
    {
        // complete the below function
        public static int countDigits(int n)
        {
            if(n<10)
                return 1;
            return 1+countDigits(n/10);
        }
    }
}
