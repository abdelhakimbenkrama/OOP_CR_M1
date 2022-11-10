package TP6;

interface Callback {
    void callback(int param);

}
class Client implements Callback {
    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
       Client c = new Client();
       c.callback(3);
       c.nonIfaceMeth();
    }
}
