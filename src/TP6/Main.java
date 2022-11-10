package TP6;

class A {
    int i, j;
    // cannot be access by class B
    private int x;
    void showIJ() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("K : " + k);
    }

    void sum() {
        System.out.println("i+j+k = " + (j + i + k));
    }
}


public class Main {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        ob1.i = 3;
        ob1.j = 4;

        ob1.showIJ();

        ob2.k = 8;
        ob2.showK();
        ob2.sum();

        ob2.i =4;
        ob2.j = 10;
        ob2.sum();
    }
}
