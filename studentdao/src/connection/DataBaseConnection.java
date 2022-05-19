
package connection;

import java.sql.*;

public class DataBaseConnection{
    private final String DBDriver ="org.apache.derby.jdbc.ClientDriver";
    private final String DBURL ="jdbc:derby://localhost:1527/myeclipse";
    private final String DBUSER ="classiccars";
    private final String DBPASSWORD ="classiccars";
    private Connection conn = null;
//构造器
    public DataBaseConnection(){
       try{
           Class.forName(DBDriver);
           conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
           }
        catch(Exception e){  }
                                 }

//获得连接
public Connection getConnection(){
return this.conn; }

//关闭连接
public void close() throws SQLException{
    this.conn.close(); }
} 
