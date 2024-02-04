public class GenerateSubsets
{
    static void printsub(String str,String curr,int index)
    {
        if(index==str.length())
        {
            System.out.print(curr+" ");
            return;
        }
        printsub(str,curr,index+1);
        printsub(str,curr+str.charAt(index),index+1);
    }

    public static void main(String[] args)
    {
        String str="ABC";
        printsub(str," ",0);
    }
}
