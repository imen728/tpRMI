import java.rmi.*;
public interface MyInterface extends Remote { 
void debiter(double a)throws RemoteException; 
void crediter(double b)throws RemoteException; 
double lireSolde()throws RemoteException;
}
