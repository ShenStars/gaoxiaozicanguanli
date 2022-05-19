import java.rmi.Remote;  
import java.rmi.RemoteException;    
public interface MyCalculater extends Remote {  
  
    public long plus(long num1, long num2) throws RemoteException;  
  
    public long minus(long num1, long num2) throws RemoteException;  
  
    public long multi(long num1, long num2) throws RemoteException;  
  
    public long division(long num1, long num2) throws RemoteException;  
}  