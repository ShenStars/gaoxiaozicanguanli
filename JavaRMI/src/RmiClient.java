import java.rmi.*;

/**
* RMI调用客户端
* @author 王华东
*/
public class RmiClient {
public static void main(String[] args) {
int listerPort=9911;//设置RMI监听器在9911端口,1099是默认端口
String serverIP="localhost";//监听的IP
String serviceObjName="service";//要导出的服务对象名字
try {
//查找服务器上的服务对象
InterfaceService stub = (InterfaceService)
Naming.lookup("rmi://"+serverIP+":"+listerPort+"/"+serviceObjName);
for(int i=0;i<10;i++){
//调用对象的服务方法
Object response = stub.service("请说话....."+i);
System.out.println("RMI服务器应答:" + response.toString());
Thread.sleep(1000);

}
} catch (Exception e) {
System.err.println("Client exception: " + e.toString());
e.printStackTrace();
} } }
