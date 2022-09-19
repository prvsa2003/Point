package acp;
public class MyCircle {
    MyPoint b = new MyPoint();
    private MyPoint center = b ;
    private int radius = 1 ; 

    public MyCircle() {
        center = new MyPoint();
        this.radius=getRadius();
    }

    public MyCircle(int x , int y , int radius ) {
         center = new MyPoint(x, y);
         this.radius = radius;
    }

    public MyCircle(MyPoint center , int radius ) {
        this.center=center;
        this.radius=radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getCenterx() {
        return this.center.getX()/2;
    }
    public int getCentery() {
        return this.center.getY()/2;
    }
    public int[] getCenterxy() {
        return this.center.getXY();
       
    }
     public void setCenterx(int x) {
         this.center.setX(x);
    }
      public void setCentery(int y) {
        this.center.setY( y);
    }
       public void setCenterxy(int x , int y) {
    this.center.setXY(x, y);
    }

    @Override
       public String toString() {
        return "MyCircle[center = "+this.center+" radius="+this.radius +"]";
    }

       public double getArea(){
           double pi = 3.14;
        return 2*pi*radius;
           
       }
       public double getCircumference(){
           double pi = 3.14 ; 
        return (Math.pow(pi, 2))*radius;
           
       }
       public double distance(MyCircle another){
         return center.distance(another.center);
       }
}