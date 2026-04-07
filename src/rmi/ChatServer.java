package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the chat implementation
            ChatImpl chatServer = new ChatImpl();

            // Create the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the chat server to the registry with the name "ChatServer"
            registry.rebind("ChatServer", chatServer);

            System.out.println("Chat server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
