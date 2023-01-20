package math.calculations;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Please enter numbers: ");
        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.println("Please Enter Mathematic Operator(Add, Substract, Multiply, Divide): ");
        String operator = sc.nextLine();

        if(operator.equalsIgnoreCase("Add")){
            result = num1+num2;
            System.out.println("Result of Addition is: "+result);
        }
        else if(operator.equalsIgnoreCase("Substract")){
            if(num1 > num2){
                result = num1-num2;
            }
            else{
                result = num2-num1;
            }
            System.out.println("Result of Substraction is: "+result);
        }
        else if(operator.equalsIgnoreCase("Multiply")){
            result = num1*num2;
            System.out.println("Result of Multiplication is: "+result);
        }
        else if(operator.equalsIgnoreCase("Divide")){
            if(num2 == 0){
                System.out.println("Divide by Zero is not possible");
            }
            else{
                result = num1/num2;
            }
            System.out.println("Result of Multiplication is: "+result);
        }
        else{
            System.out.println("Operator is not defined");
        }

        sc.close();
    }
}
