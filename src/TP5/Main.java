package TP5;
// overload methods
class OverloadDemo {

    void test() {
        System.out.println("No Parameters");
    }

    void test(int a) {
        System.out.println("with one Parameter A = " + a);
    }

    void test(int a, int b) {
        System.out.println("with two  Parameter A = " + a + " , B= " + b);
    }

    double test(double a) {
        System.out.println("with a return value");
        return a * a;
    }

}
// overload a constructor
class Box {
    double width , height , depth ;
    Box (double w ,  double h  , double d){
        width = w ;
        height = h ;
        depth =d ;
    }
    // no dim Box
    Box (){
        width =-1;
        height =-1;
        depth = -1;
    }
    // when cube is declared
    Box (double len){
        width =height = depth = len;
    }
    double volume (){
        return   width *height * depth;
    }

    // intialise Box using another Box object
    Box(Box b){
        width = b.width ;
        height = b.height ;
        depth =b.depth ;
    }
}
// using Objects as Parameters
class Test{
    int a , b;
    Test(int a , int b){
        this.a =a;
        this.b = b;
    }
    boolean EqualTo(Test Obj) {
        if(Obj.a == a && Obj.b == b) return true;
        else return false;
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadDemo O = new OverloadDemo();
        O.test();
        O.test(10);
        O.test(10, 20);
        double x = O.test(10.8);
        System.out.println(x);

        // test to call test with int type and get the double result


        // Box Test
        Box b1 = new Box(10 ,20,15);
        Box b2 = new Box();
        Box b3 = new Box(3);
        double v1 , v2 , v3 ;
        v1 = b1.volume();
        v2 = b2.volume();
        v3 = b3.volume();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // Obj as par
        Test o1 = new Test(100,22);
        Test o2 = new Test(100,22);
        Test o3 = new Test(1,22);
        System.out.println("o1 == o2 :" + o1.EqualTo(o2));
        System.out.println("o1 == o3 :" + o1.EqualTo(o3));

        // intialise Box using another box
        Box b4 = new Box(b1);
        System.out.println("b1 volume = " +b1.volume());
        System.out.println("b4 volume = " +b4.volume());
    }
}
