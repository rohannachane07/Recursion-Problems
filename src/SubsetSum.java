public class SubsetSum
{
    static int subsum(int arr[],int n,int sum)
    {
        if(n==arr.length)
        {
            return (sum==0)?1 : 0;
        }
        return subsum(arr,n+1,sum)
               +  subsum(arr,n+1,sum-arr[n]);
    }

    public static void main(String[] args) {
        int arr[]={10,20,15,5};
        System.out.println(subsum(arr,0,25));
    }
}
