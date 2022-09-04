
import java.util.Scanner;
public class calculator{

public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);
    String choose;
    int result ;

    do{
           System.out.println("'+' - Addition");
           System.out.println("'-' - Substraction");
           System.out.println("'*' - Multiplication");
           System.out.println("'/' - Division");

           System.out.print("Choose an operator : ");
           String operator = s.next();

           System.out.println( "                              ");

           System.out.print("Input firstnumber : ");
           int num1 = s.nextInt();

            System.out.print("Input secondnumber : ");
           int num2 = s.nextInt();

           
        System.out.println( "                              ");
           
        switch(operator){
            
                    case "+":
                    result = num1 + num2;
                    System.out.println(" The result is :  "+result);
                    break;

                    case "-":
                    result = num1 - num2;
                System.out.println(" The result is :  "+result);
                break;


                    case "*":
                    result = num1 * num2;
                    System.out.println(" The result is :  "+result);
                    break;

                    case "/":
                    result = num1 / num2;
                System.out.println(" The result is :  "+result);
                break;

                default:
                    System.out.println("Missing operator");
                
           }

           System.out.print("Do you want to continue? (Y/N) : ");
           choose = s.next();

    }while(choose.equals("Y"));
}

}
