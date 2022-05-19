import java.net.MalformedURLException;  
import java.rmi.Naming;  
import java.rmi.RemoteException;  
import java.rmi.registry.LocateRegistry;  
  
public class MyServer {  
    public static void main(String[] args) {  
        /** 
         * 我们把系统的java.security.policy设置为我们自己定义的一个client.policy， 
         * 在client.policy中我们定义了一个访问规则 
         * */  
        System.setProperty("java.security.policy",  
                MyServer.class.getResource("client.policy").toString());  
  
        if (System.getSecurityManager() == null) {  
            /* 使用了我们定义的policy文件以后，要定义一个有效的SecurityManager来保证系统正确的应用了我们的规则 */  
            System.setSecurityManager(new SecurityManager());  
        }  
  
        try {  
            
            LocateRegistry.createRegistry(1099);  
            Naming.rebind("cul", MyCalculaterImpl.getInstance()); //rmi://"+serverIP+":"+listerPort+"/"+serviceObjName
            System.out.println(Thread.currentThread().getName());  
        } catch (RemoteException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (MalformedURLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
}  