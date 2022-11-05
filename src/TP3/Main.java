package TP3;

class Box {
    double w, h, d;
    // Constructor

    void volume() {
        System.out.println("Volume = " + w * h * d);
    }
}

class Box2 {
    double w, high, depth;

    // Constructor
    Box2(double w, double h, double d) {
        this.w = w;
        high = h;
        depth = d;
    }

    double volume() {
        return w * high * depth;
    }
}

public class Main {
    public static void main(String[] args) {

        double v;

        Box b1 = new Box();
        Box2 b2 = new Box2(3.6, 3.6, 4.3);


        b1.w = 9.7;
        b1.h = 6.7;
        b1.d = 2.7;


        // box volume
        //v= b1.w*b1.h*b1.d;
        //System.out.println(v);
        v = b2.volume();
        System.out.println(v);


    }
}
