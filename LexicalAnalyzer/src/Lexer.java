/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Kenneth
 */
import java.util.Scanner;

public class Lexer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '+':
                    System.out.println("Identifier: +, Symbolic Name: PLUS");
                    break;

                case '-':
                    System.out.println("Identifier: -, Symbolic Name: MINUS");
                    break;

                case '*':
                    System.out.println("Identifier: *, Symbolic Name: TIMES");
                    break;

                case '/':
                    System.out.println("Identifier: /, Symbolic Name: DIVIDE");
                    break;

                case '(':
                    System.out.println("Identifier: (, Symbolic Name: LPAREN");
                    break;

                case ')':
                    System.out.println("Identifier: ), Symbolic Name: RPAREN");
                    break;

                case '=':
                    System.out.println("Identifier: =, Symbolic Name: ASSSIGN");
                    break;

                case ';':
                    System.out.println("Identifier: ;, Symbolic Name: SEMI");
                    break;

                case '0':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '1':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '2':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '3':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '4':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '5':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '6':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '7':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '8':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                case '9':
                    System.out.println("Identifier: ;, Symbolic Name: NUMBER");
                    break;

                default:

                    System.out.print("Identifier: " + input.charAt(i));
                    System.out.println(", Symbolic Name: CHARACTER");
            }
        }

    }

}
