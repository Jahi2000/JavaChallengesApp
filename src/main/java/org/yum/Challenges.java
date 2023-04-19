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


    public int calculator () {
        System.out.println("Welcome to this Interactive Calculator");
        System.out.println("Type number 1 for to add");
        System.out.println("Type number 2 for to subtraction");
        System.out.println("Type number 3 for to multiplication");
        System.out.println("Enter number below");
        Scanner scan = new Scanner(System.in);
        int numC = scan.nextInt();
        int result = 0;

        switch (numC) {
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("Invalid Number");
        }
         return result;
    }

    public int findthesmallest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        return Math.min(num1,num2);
    }

    public int findthedifference(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        return Math.abs(num2 - num1);
        }


     public String convertToLowerCase(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a Uppercase word");
        String word1 = scan.nextLine();
        return word1.toLowerCase();
     }

    public String length(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word1 = scan.nextLine();
        return "The length of the word is " + word1.length();
    }


    }




