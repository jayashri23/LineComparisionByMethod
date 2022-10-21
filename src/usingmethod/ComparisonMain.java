package usingmethod;




public class ComparisonMain {

    static void equality() {
        LineComputationComparison obj = new LineComputationComparison();

        obj.setLine1x1coordinate(2);
        obj.setLine1x2coordinate(4);
        obj.setLine1y1coordinate(4);
        obj.setLine1y2coordinate(8);
        obj.setLine2x2coordinate(4);
        obj.setLine2x1coordinate(2);
        obj.setLine1y1coordinate(8);
        obj.setLine2y2coordinate(4);

        double a = (obj.getLine1x2coordinate() - obj.getLine1x1coordinate()) ^ 2 + (obj.getLine1y2coordinate() - obj.getLine1y1coordinate()) ^ 2;
        double b = (obj.getLine2x2coordinate() - obj.getLine2x1coordinate()) ^ 2 + (obj.getLine2y2coordinate() - obj.getLine2y1coordinate()) ^ 2;
        double lengthLine1 = (double) Math.sqrt(a);
        double lengthLine2 = (double) Math.sqrt(b);
        System.out.println("Length of Line1 = " + lengthLine1);
        System.out.println("Length of Line2 = " + lengthLine2);
        if(lengthLine2 > lengthLine1)
            System.out.println("Length of line1 is greater than Length of line2");
        else
            System.out.println("Length of line2 is greater than Length of line1");
        }
        public static void main(String [] args){
        equality();
        }

    }

