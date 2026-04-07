package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface {

    private String message;
    List<ClientCallback> clients;

    public ChatImpl() throws RemoteException {
        clients = new ArrayList<>();
    }

    public void registerClient(ClientCallback client) throws RemoteException {
        clients.add(client);
        System.out.println("Client registered: " + client);
    }

    @Override
    public String receiveMessage() throws RemoteException {
        return message;
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        this.message = message;

        for (ClientCallback client : clients) {
            client.receiveMessage(message);
        }
    }
}