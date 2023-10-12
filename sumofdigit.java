//sum of digit of number

import java.util.Scanner;
public class sumofdigit {
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        scanner.close();

        int sum=0;
        int originalnumber=number;

        while(number!=0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println("sum of digit"   +originalnumber+   "is" +sum);
    }
}
