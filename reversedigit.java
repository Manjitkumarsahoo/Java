//display all digit of a number in reverse order
import java.util.Scanner;

public class reversedigit {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        scanner.close();

        System.out.println("digit in reverse order:");
        while(number!=0){
            int digit=number%10;
            System.out.println(digit);
            number=number/10;
        }

    }
}
