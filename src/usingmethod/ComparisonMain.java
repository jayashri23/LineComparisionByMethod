package usingmethod;




public class Comparison {

    static void equality() {
        LineComputationComparison obj = new LineComputationComparison();

        obj.setLine1x1coordinate(10);
        obj.setLine1x2coordinate(20);
        obj.setLine1y1coordinate(30);
        obj.setLine1y2coordinate(40);
        obj.setLine2x1coordinate(40);
        obj.setLine2x1coordinate(30);
        obj.setLine1y1coordinate(20);
        obj.setLine2y2coordinate(10);

        int LengthLine1 = (obj.getLine2x1coordinate() - obj.getLine1x1coordinate()) ^ 2 + (obj.getLine1y2coordinate() - obj.getLine1y1coordinate()) ^ 2;
        int LengthLine2 = (obj.getLine2x2coordinate() - obj.getLine2x1coordinate()) ^ 2 + (obj.getLine2y2coordinate() - obj.getLine2y1coordinate()) ^ 2;
        System.out.println("Length of Line1 = " + LengthLine1);
        System.out.println("Length of Line2 = " + LengthLine2);
        if(LengthLine2 > LengthLine1)
            System.out.println("Length of line1 is greater than Length of line2");
        else
            System.out.println("Length of line2 is greater than Length of line1");
        }
        public static void main(String [] args){
        equality();
        }

    }

