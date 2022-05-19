package client;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * 创建服务端远程服务接口
 * 此方法用于服务端响应客户端查询*/

import service.PrintPersonService;

public interface PersonService extends Remote{
    public void getPersons(PrintPersonService printService) throws RemoteException;
}

