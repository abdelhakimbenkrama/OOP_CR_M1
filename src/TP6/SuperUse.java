

class Box {
    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
}

class BoxWithWeightAndColor extends Box{
    int color;
    double wigth ;
    BoxWithWeightAndColor(double h, double w, double d ,double wi , int c){
        super(h,w,d);
        color = c;
        wigth = wi;
    }
}

public class SuperUse {
    public static void main(String[] args) {
        BoxWithWeightAndColor b1 = new BoxWithWeightAndColor(10,10,12,300,12987);
    }
}
