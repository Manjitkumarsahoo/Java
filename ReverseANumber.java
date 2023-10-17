import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int no=s.nextInt();
    int rev=0,rem=0;
    while(no!=0)
    {
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;
    }
    System.out.println(rev);
    s.close();
    }
    
    
    
}
