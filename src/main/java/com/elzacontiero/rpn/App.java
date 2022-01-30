package com.elzacontiero.rpn;
import java.util.Scanner;
import java.util.Stack;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Contiero RPN Calculator!");

        Scanner scan = new Scanner (System.in);
        Stack<Double> pile = new Stack <Double> ();
        while(true) {
            System.out.print("Enter a number or operation: ");
            if(scan.hasNextDouble()) {
                Double d = scan.nextDouble();
                pile.push(d);
            }
            else {
               
                String operator = "";
                while(operator.isEmpty()) {
                    operator = scan.nextLine();
                }


                if (operator.equals("+")) {
                    // we need to know if the two arguments exist in the pile.
                    if(pile.size() >= 2) {
                        Double argument1 = pile.pop();
                        Double argument2 = pile.pop();
    
                        pile.push(argument2 + argument1);

                    }
                    else {
                        System.out.println("not enough elements in the pile");
                    }

                }
                else if (operator.equals("-")) {
                    if (pile.size() >=2) {
                        Double argument1 = pile.pop();
                        Double argument2 = pile.pop();
    
                        pile.push(argument2 - argument1);

                    }
                    else {
                        System.out.println("not enough elements in the pile");
                    }
                   
                }
                else if (operator.equals("*")) {
                    if (pile.size() >=2) {
                        Double argument1 = pile.pop();
                        Double argument2 = pile.pop();
                        pile.push(argument2 * argument1);

                    }
                   else {
                       System.out.println("not enough elements in the pile");
                   }
                }
                else if (operator.equals("/")) {
                    if (pile.size() >=2) {
                        Double argument1 = pile.pop();
                        Double argument2 = pile.pop();
    
                        pile.push(argument2 / argument1);

                    }
                    else {
                        System.out.println("not enough elements in the pile");
                    }
                   
                }
                else if (operator.equals("d")) {
                    if (pile.empty()) {
                        System.out.println("pile is empty");
                    }
                    else {
                        pile.pop();
                    }
                }
                else {
                    System.out.println("invalid operation");
                }

            }

            // loop to print out the Stack
            for(Double x: pile) {
                System.out.println(x);
            }
        }

    }
}
