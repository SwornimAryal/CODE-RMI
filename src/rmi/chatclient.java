package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class chatclient extends UnicastRemoteObject implements ClientCallback {

    protected  chatclient() throws RemoteException {
        super();
    }

    @Override
    public void receiveMessage(String message) throws RemoteException {
        System.out.println("Message received: " + message);
    }
}
