import java.rmi.RemoteException;  
import java.rmi.server.UnicastRemoteObject;  
  
/** 
 * MyCalculater的实现类，继承了UnicastRemoteObject 
 *  
 * */  
public class MyCalculaterImpl extends UnicastRemoteObject implements  
        MyCalculater {  
  
    protected MyCalculaterImpl() throws RemoteException {  
        super();  
    }  
  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    private static final Object lock = new Object();  
    private static MyCalculater instance;  
  
    public long plus(long num1, long num2) throws RemoteException {  
        System.out.println("服务端运行加法");  
        System.out.println(Thread.currentThread().getId() + ":"  
                + Thread.currentThread().getName());  
        return num1 + num2;  
    }  
   
    public long minus(long num1, long num2) throws RemoteException {  
        System.out.println("服务端运行减法");  
        System.out.println(Thread.currentThread().getId() + ":"  
                + Thread.currentThread().getName());  
        return num1 - num2;  
    }  
   
    public long multi(long num1, long num2) throws RemoteException {  
        System.out.println("服务端运行乘法");  
        System.out.println(Thread.currentThread().getId() + ":"  
                + Thread.currentThread().getName());  
        return num1 * num2;  
    }  
   
    public long division(long num1, long num2) throws RemoteException {  
        System.out.println("服务端运行除法");  
        System.out.println(Thread.currentThread().getId() + ":"  
                + Thread.currentThread().getName());  
        return num1 / num2;  
    }  
  
    public static MyCalculater getInstance() throws RemoteException {  
        if (null == instance) {  
            synchronized (lock) {  
                instance = new MyCalculaterImpl();  
            }  
        }  
        return instance;  
    }  
  
}  

