import java.rmi.Remote;
import java.rmi.RemoteException;
/**
* RMI调用对象接口定义
* @author 王华东
*/
public interface InterfaceService extends Remote {
/**远程服务对象所必须实现的方法
* 所有的远程调用的方法,必须声明throws RemoteException
* */
Object service(Object obj) throws RemoteException;
}
