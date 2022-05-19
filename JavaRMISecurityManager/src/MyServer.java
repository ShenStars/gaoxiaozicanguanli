import java.net.MalformedURLException;  
import java.rmi.Naming;  
import java.rmi.RemoteException;  
import java.rmi.registry.LocateRegistry;  
  
public class MyServer {  
    public static void main(String[] args) {  
        /** 
         * ���ǰ�ϵͳ��java.security.policy����Ϊ�����Լ������һ��client.policy�� 
         * ��client.policy�����Ƕ�����һ�����ʹ��� 
         * */  
        System.setProperty("java.security.policy",  
                MyServer.class.getResource("client.policy").toString());  
  
        if (System.getSecurityManager() == null) {  
            /* ʹ�������Ƕ����policy�ļ��Ժ�Ҫ����һ����Ч��SecurityManager����֤ϵͳ��ȷ��Ӧ�������ǵĹ��� */  
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