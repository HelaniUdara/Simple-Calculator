package lk.uok.task1;

import java.util.Scanner;
public class Main {

    public static double getAddition(double a, double b){

        return a+b;
    }

    public static double getSubtraction(double a, double b){

        return a-b;
    }

    public static double getMultiplication(double a, double b){

        return a*b;
    }

    public static double getDivition(double a, double b){

        return a/b;
    }


    public static void main(String[] args) {

        int operator;
        double n1=0,n2=0, answer=0;

        System.out.println("Hello!");
        System.out.println("What do you want to do?\n\n");
        System.out.println("Press number 1 for sum ");
        System.out.println("Press number 2 for difference ");
        System.out.println("Press number 3 for multiplication ");
        System.out.println("Press number 4 for division \n\n");

        System.out.println("Press your option :  ");
        Scanner input = new Scanner(System.in);

        operator=input.nextInt();

        if(operator>=1 && operator<=4){
            System.out.println("Enter number 1 :  ");
            n1=input.nextDouble();
            System.out.println("Enter number 2 :  ");
            n2=input.nextDouble();
        }

        switch (operator){

            case 1: answer=getAddition(n1,n2);break;
            case 2: answer=getSubtraction(n1,n2);break;
            case 3: answer=getMultiplication(n1,n2);break;
            case 4: answer=getDivition(n1,n2);break;
            default:
                System.out.println("Not a valid operator..\nEnter a number between 1-4");
        }

        System.out.println("\nAnswer is : "+ answer);

    }
}
