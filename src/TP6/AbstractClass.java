/*
* This chapter examines two of
*  Java’s most innovative features: packages and interfaces.
*  Packagesare containers for classes.
* They are used to keep the class name space compartmentalized.
* */


abstract  class A{
    abstract void callMe();
    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A{
    @Override
    void callMe() {
        System.out.println("Implementation of Call me");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}
