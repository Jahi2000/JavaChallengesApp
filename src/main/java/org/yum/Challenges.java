package org.yum;
import java.util.Scanner;
public class Challenges {

    public String greeting(String name, int age) {


        if (age > 21) {
            return "Welcome to the party " + name;
        } else {
            return "Next time Youngin";
        }
    }

    public int addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        return num1 + num2;
    }

    public int subtractTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        return num1 - num2;
    }

    public int multiplyTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        return num1 * num2;
    }

}


