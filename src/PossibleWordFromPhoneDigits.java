import java.util.*;


public class PossibleWordFromPhoneDigits {


//User function Template for Java

    class Solution
    {
        //Function to find list of all words possible by pressing given numbers.
        static ArrayList <String> possibleWords(int a[], int N)
        {
            ArrayList<String> list=new ArrayList<>();
            poswor(a,N,"",0,list);
            return list;
        }
        public static void  poswor(int[]s,int N,String ans,int i,ArrayList<String> list)
        {

            String[] keypad={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            if(N==i)
            {
                list.add(ans);
                return;
            }
            String key=keypad[s[i]];
            for(int j=0;j<key.length();j++)
            {
                poswor(s,N,ans + key.charAt(j),i+1,list);
            }
            return;
        }

    }

}
