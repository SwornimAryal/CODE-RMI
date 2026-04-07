package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

    public static void main(String[] args) {
        try {
            CalculatorImpl calculator = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("CalculatorService", calculator);
            System.out.println("Calculator Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}