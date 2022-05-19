package registry;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import client.PersonService;
import service.PersonServiceImpl;
/*
 * 服务注册、发布远程接口*/
public class ServiceRegistry {
    public static void main(String[] args) {//服务端程序入口
        try {
            PersonService personService = new PersonServiceImpl();
            LocateRegistry.createRegistry(32479);
            Naming.bind("rmi://127.0.0.1:32479/PersonService", personService);
            System.out.println("Service is started...");
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}