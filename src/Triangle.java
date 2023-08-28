public class Triangle {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public void perimeter() {
        double sideP1 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double sideP2 = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        double sideP3 = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        double perimeter = sideP1 + sideP2 + sideP3;
        System.out.println("perimeter = " + perimeter);
    }

    private class MyPoint {
        private final int x;
        private final int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
