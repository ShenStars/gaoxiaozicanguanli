package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.PersonEntity;
/*Client远程接口
 * 回调函数也需要以远程接口的方式实现，供服务端调用。在调用回调函数的过程中，客户端与服务端的角色反转。*/
public interface PrintPersonService extends Remote{
    public void printPerson(List<PersonEntity> persons) throws RemoteException;
}

