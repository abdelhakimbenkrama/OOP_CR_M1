package Networking;
import java.net.*;
public class Main {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress Adress = InetAddress.getLocalHost();
        System.out.println(Adress);

        Adress = InetAddress.getByName("www.google.com");
        System.out.println(Adress);
    }
}
