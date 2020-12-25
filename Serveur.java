import java.net.MalformedURLException;
import java.rmi.*;
public class Server extends UnicastRemoteObject implements MyInterface { 
public Server() throws RemoteException {} 
int solde=10000;
public void debiter(double a) {
solde+=a;
 } 
public void crediter(double b) { 
solde-=b; 
} 
public double lireSolde() { 
return solde; 
} 
public static void main(String[] args) throws RemoteException, MalformedURLException { 
Server server = new Server(); 
java.rmi.registry.LocateRegistry.createRegistry(1250); 
Naming.rebind("rmi://127.0.0.1:1250/server", server); 
}
}
