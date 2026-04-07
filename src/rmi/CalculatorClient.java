package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            Calculator stub = (Calculator) registry.lookup("CalculatorService");
            int result = stub.add(5, 3);
            System.out.println("Result of 5 + 3: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
