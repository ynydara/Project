public class Circle {

    private double radius; //nonstatic
    private double circumference;
    private double area;
    final public static double PI = 3.14;


    Circle(double radius){
        if(radius > 0 ){
            this.radius = radius;
            this.circumference = 2 * 3.14 * radius;
        }else{
            this.radius= 1.0;
            this.circumference = 2 * 3.14 * 1.0;
        }

    }

    //getter
    public double getRadius(){
        return radius;
    }

    //setter
    public void setRadius(double radius){
        if(radius > 0) {
            this.radius = radius;
        }
    }
    //circumference = 2*π*r
 //getter for cir
 public double getCircumference(){
        return 2 * 3.14 * radius;
 }

    public double getArea() {

        //area = pir^2
        return methodA() * radius * radius;
    }

    //static method //does not work for circles
    //static method example

    static double methodA(){
        return PI; //works because I declared it as static
        //return radius;//doesn't work because I declared it as non-static
    }

}
