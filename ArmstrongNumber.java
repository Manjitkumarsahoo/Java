import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int no=s.nextInt();
        int t1=no;
        int leng=0;
        while (t1!=0)
        {
                leng=leng+1;
                t1=t1/10;
        }
        
        int t2=no;
        int arm=0;
        int rem;

        while(t2!=0)
        {
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=leng;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(no==arm)
        {
            System.out.println(no+"is a Armstrong number");
        }
        else
        {
            System.out.println(no+"is not a Armstrong number");
        }
        s.close();
    }    
}
