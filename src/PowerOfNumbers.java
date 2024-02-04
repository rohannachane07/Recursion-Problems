public class PowerOfNumbers {


//User function Template for Java

    class Solution
    {

        static long power(int N,int R)
        {
            long mod=1000000007;
            if(N==0)
                return 0;
            if(R==0)
                return 1;
            long tmp=power(N,R/2);
            tmp=tmp*tmp;
            if(R%2==0)
                return tmp%mod;
            else
                return (tmp%mod*N%mod);

        }

    }
}
