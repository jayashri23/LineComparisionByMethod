package usingmethod;

public class LineComputationComparison {
                private int Line1x1;

                private int Line1x2;

                private int Line1y1;

                private int Line1y2;

                private int Line2x1;

                private int Line2x2;

                private int Line2y1;

                private int Line2y2;

                public int getLine1x1coordinate () {
                        return Line1x1;
                }
                public void setLine1x1coordinate ( int Line1x1){
                        this.Line1x1 = Line1x1;
                }
                public int getLine1x2coordinate () {
                        return Line1x2;
                }
                public void setLine1x2coordinate ( int Line1x2){
                        this.Line1x2 = Line1x2;
                }
                public int getLine1y1coordinate () {
                        return Line1y1;
                }
                public void setLine1y1coordinate ( int Line1y1){
                        this.Line1y1 = Line1y1;
                }
                public int getLine1y2coordinate () {
                        return Line1y2;
                }
                public void setLine1y2coordinate ( int Line1y2){
                        this.Line1y2 = Line1y2;
                }
                public int getLine2x1coordinate () {
                        return Line2x1;
                }
                public void setLine2x1coordinate ( int Line2x1){
                        this.Line2x1 = Line2x1;
                }
                public int getLine2x2coordinate () {
                        return Line2x2;
                }
                public void setLine2x2coordinate ( int Line2x2){
                        this.Line2x2 = Line2x2;
                }
                public int getLine2y1coordinate () {
                        return Line2y1;
                }
                public void setLine2y1coordinate ( int Line2y1){
                        this.Line2y1 = Line2y1;
                }
                public int getLine2y2coordinate () {
                        return Line2y2;
                }
                public void setLine2y2coordinate ( int Line2y2){
                        this.Line2y2 = Line2y2;
                }

                @Override
                public String toString () {
                        return "ComputationComparison {"+ "Line1x1Coordinate: " + Line1x1 +
                                "\n , Line1x2Coordinate : " + Line1x2 +

                                "\n , Line1y1Coordinate : " + Line1y1 +
                                "\n , Line1y2Coordinate : " + Line2y2 +
                                "\n , Line2x1Coordinate : " + Line2x1 +
                                "\n , Line2x2Coordinate : " + Line2x2 +
                                "\n , Line2y1Coordinate : " + Line2y1 +
                                " ,\n Line2y2Coordinate : " + Line2y2 + '}';
                }
        }
