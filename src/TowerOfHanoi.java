public class TowerOfHanoi
{
   static void TOH(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println("Move Disc 1 from "+a+" to "+c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("Move Disc "+n+" from "+a+" to "+c);
        TOH(n-1,b,a,c);
    }

    public static void main(String[] args) {

        TOH(3,'a','b','c');
    }
}
