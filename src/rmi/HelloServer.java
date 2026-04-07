package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();

            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("HelloService", obj);

            System.out.println("HelloServer is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
