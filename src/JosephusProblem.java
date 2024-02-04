public class JosephusProblem {


    class Solution
    {
        public int josephus(int n, int k)
        {
            return jos(n,k)+1;
        /*if(n==1)
        return 1;
        else
        return ((josephus(n-1,k)+k)%n)+1;*/
        }
        int jos(int n,int k)
        {
            if(n==1)
                return 0;
            return (jos(n-1,k)+k)%n;
        }

    }
}
