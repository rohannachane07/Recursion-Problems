import java.util.*;
public class powerSet {
    //User function Template for Java


    class LexSort
    {
        //Function to return the lexicographically sorted power-set of the string.
        static ArrayList<String> powerSet(String s)
        {
            ArrayList<String> ans=new ArrayList();
            printPowerSet(s,"",0,ans);
            return ans;
        }
        public static void printPowerSet(String s,String curr,int index,ArrayList<String>list)
        {
            if(s.length()==index)
            {
                list.add(curr);

                return;
            }
            printPowerSet(s,curr,index+1,list);//Not include
            printPowerSet(s,curr+s.charAt(index),index+1,list);//Include
        }
    }



}
