
package acp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //Test My Point Class
        System.out.println("Test My Point Class");
        MyPoint point = new MyPoint();
        System.out.println(point); //(0,0)
        MyPoint m = new MyPoint(10, 5);
        System.out.println(m.distance());
        System.out.println(point.distance());
        System.out.println(m.distance(point));
        System.out.println(m.distance(2, 3));
        System.out.println(point.distance(m));
        System.out.println(m.getY());
        System.out.println(point.getX());
        //Test My Circle Class
        System.out.println("Test My Circle Class");
        MyCircle circle = new MyCircle();
        MyCircle n = new MyCircle(m, 2);
        MyCircle k = new MyCircle(4, 8, 12);
        System.out.println(circle.getArea());
        System.out.println(circle.distance(n));
        System.out.println(k.getCenter());
        System.out.println((double) n.getCenterx());
        System.out.println((double) n.getCentery());
        System.out.println(k.getArea());
        System.out.println(Arrays.toString(k.getCenterxy()));
//        Test My Triangle Class 
        System.out.println("Test My Triangle Class");
        MyTriangle tri = new MyTriangle(m , point , m );
         MyTriangle trit = new MyTriangle(2, 5, 3, 4,1, 10);
         System.out.println(tri.getPerimeter());
         System.out.println(tri.printType());
        System.out.println(tri.toString());
        System.out.println(trit.getPerimeter());
        System.out.println(trit.printType());
        System.out.println(trit.toString());
        
        
    }
}
