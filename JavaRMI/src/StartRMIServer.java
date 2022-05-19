import java.rmi.*;
import java.rmi.registry.*;
/**
* 启动RMI服务器,导出服务对象
* @author 王华东
*/
public class StartRMIServer {
/**启动方法*/
public static void main(String[] args) {
int listerPort=9911; //设置RMI监听器在9911端口
String serverIP="localhost"; //监听的IP
String serviceObjName="service"; //要导出的服务对象名字
try {
LocateRegistry.createRegistry(listerPort); //设置RMI服务器监听端口
//ImpService.setLog(System.out); //设置日志对象,打印到控制台
ImpService remoteObj = new ImpService(); //创建导出的对象, 绑定服务
Naming.rebind("rmi://"+serverIP+":"+listerPort+"/"+serviceObjName, remoteObj);
System.out.println("RMI启动在"+serverIP+": "+listerPort+" 服务名为: "+serviceObjName);
} catch (Exception e) {
System.err.println("Server exception: " + e.toString());
e.printStackTrace();
}
}
}
