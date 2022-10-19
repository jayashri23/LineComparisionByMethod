package usingmethod;

import java.util.Scanner;

public class EqualityOfTwoLines {


    public void equality (){

        System.out.println("Welcome to line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first line end points: ");
        System.out.println("Enter first Co-ordinates(x1,y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter Second Co-ordinates(x2,y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length1 = (double) Math.sqrt(a);
        System.out.println();
        System.out.println("Enter second line end points:");
        System.out.println("Length of the line1: " + length1 );

        System.out.println("Enter second Co-ordinates(x3,y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Enter second Co-ordinates(x4,y4): ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double b = (x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3);
        double length2 = (double) Math.sqrt(b);
        System.out.println();
        System.out.println("length of line2:" + length2);

        if (length1 > length2) {
            System.out.println("Line1 is greater then Line2.");
        } else if (length1 < length2) {
            System.out.println("Line1 is small  than Line2.");
        } else {
            System.out.println("line1 and line2 are equal.");
        }
    }
    public static void main(String [] args){

        EqualityOfTwoLines equal =new EqualityOfTwoLines();
        equal.equality();
    }
}

