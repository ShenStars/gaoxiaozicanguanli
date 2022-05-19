import java.net.MalformedURLException;  
import java.rmi.Naming;  
import java.rmi.NotBoundException;  
import java.rmi.RemoteException;  
  
public class Test {  
    public static void main(String[] args) {  
        try {  
            MyCalculater my = (MyCalculater) Naming  
                    .lookup("rmi://localhost:1099/" + "cul");  
            System.out.println(my.plus(1, 2));  
            Thread.sleep(1000);  
            System.out.println(my.minus(1, 2));  
            Thread.sleep(1000);  
            System.out.println(my.multi(2, 6));  
            Thread.sleep(1000);  
            System.out.println(my.division(20, 2));  
            Thread.sleep(1000);  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (RemoteException e) {  
            e.printStackTrace();  
        } catch (NotBoundException e) {  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}  