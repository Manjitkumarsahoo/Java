import java.util.Scanner;
public  class Calculater {
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter first no");
            int no1=s.nextInt();
            System.out.println("Enter 2nd number");
            int no2=s.nextInt();
            System.out.println("select symbol(+,-,/,*)");
            String sym=s.next();
            int res;
            switch(sym)
            {
                case"+":res=no1+no2;
                        System.out.println("addition is :"+res);
                        break;
                case"-":res=no1-no2;
                        System.out.println("subtraction is :"+res);
                        break;
                case"/":res=no1/no2;
                        System.out.println("division is :"+res);
                        break;
                case"*":res=no1*no2;
                        System.out.println("multiplication is :"+res);
                        break;
                default: System.out.println("invalid symbol");
                        break;

                
            }s.close();
            
        }
    
}
