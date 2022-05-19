package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import entity.PersonEntity;
import service.PrintPersonService;

public class PrintPersonServiceImpl extends UnicastRemoteObject implements PrintPersonService{

    private static final long serialVersionUID = 5471018647833463871L;

    public PrintPersonServiceImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }
    public void printPerson(List<PersonEntity> persons) {
        System.out.println("The server calls printperson()!");
        for (PersonEntity person : persons) {
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}