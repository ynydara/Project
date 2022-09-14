/*
-Accessor methods= methods that give read/write capabilities outside the class.
        -aka getters and setters.
getters and setters are accessor methods

All getters: provide read access
All setters: update attributes/ provides write access

-will be in class with the private attribute

'static' reserved keyword
static attribute: attributes is shared among all objects of the same class.

-if you change a static attribute for 1 object, you change for all objects
-static attributes are known as class attributes/methods

'final' variables cannot be reassigned,

no keyword for nonstatic

static methods:
    -don't have access to non-static resources
    -aka class methods
    -non-static methods , CAN use static resources

 */


public class Main {
    public static void main(String[] args) {
       /* Weird w = new Weird(1);
        System.out.println(w.getAa());
        w.setAa(10);
        System.out.println(w.getAa());
*/
     /*  Circle c0 = new Circle(1);
        System.out.println(c0.getRadius());
        c0.setRadius(10);
         System.out.println(c0.getRadius());
        System.out.println(c0.getCircumference());
*/
        Circle c0 = new Circle(1);
        Circle c1 = new Circle(10);

        //c0.PI = 3.141592; can't be changed because of final modifier
        System.out.println(Circle.PI); //1 (3 ways does the same thing in this example.)
        System.out.println(Circle.methodA());//2
        System.out.println(c1.methodA());//3 //if it was declared private you won't be able to do this one.

        System.out.println(c0.PI);
        System.out.println(c1.PI);
        System.out.println(Math.PI); //CTRL click = look at source code,
    }


}
