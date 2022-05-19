package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import client.PersonService;
import entity.PersonEntity;
/*
 * 实现服务端远程服务*/

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService{

    private static final long serialVersionUID = 621297838434573682L;

    public PersonServiceImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * 接收客户端的远程接口实例PrintPersonService
    */
    public void getPersons(PrintPersonService printService)
            throws RemoteException {
        System.out.println("Get a list of person ");
        try {
            Thread.currentThread();
            Thread.sleep(3000); //睡眠3秒用于模拟执行所需时间
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<PersonEntity> persons = new ArrayList<PersonEntity>();
        persons.add(new PersonEntity("Zhangsan", 11));
        persons.add(new PersonEntity("Lisi", 12));
        printService.printPerson(persons); //执行客户端的回调函数
    }
}