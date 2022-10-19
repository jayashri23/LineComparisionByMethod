package usingmethod;

import java.util.Scanner;

public class LengthOfLine {

    static void length(){

        int x1, y1, x2, y2;
        double length;
        Scanner sc = new Scanner(System.in);
        System.out.println("x2= ");
        x2 = sc.nextInt();
        System.out.println("x1= ");
        x1 = sc.nextInt();
        System.out.println("y2= ");
        y2 = sc.nextInt();
        System.out.println("y1= ");
        y1 = sc.nextInt();
        length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Length of Line ="  +length);
    }
    public static void main(String [] args){
        System.out.println("Enter values for length calculation:" );
        length();
    }
}
