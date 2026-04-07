package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote {
    void registerClient(ClientCallback client) throws RemoteException;
    String receiveMessage() throws RemoteException;
    void sendMessage(String message) throws RemoteException;
}