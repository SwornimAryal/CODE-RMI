package rmi;
import java.rmi.server.UnicastRemoteObject;
 public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, World!";
    }
 }
