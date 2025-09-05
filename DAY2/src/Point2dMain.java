


class Point2dMain {
 public static void main(String[] args) {
    Point2D p1=new Point2D(10,20);
    Point2D p2=new Point2D(10, 20);

    System.out.println(p1.isEqual(p2));
    System.out.println(p1.calculateDistance(p2));
 }
    
}
