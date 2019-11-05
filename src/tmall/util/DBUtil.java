package tmall.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * author totoro
 * create 2019/11/5
 **/
public class DBUtil {
    static String ip="127.0.0.1";
    static int port=3306;
    static String database="tmall";
    static String endoding="UTF-8";
    static String loginName="root";
    static String password="cyx12580";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        String url=String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",ip,port,database,endoding);
        return DriverManager.getConnection(url,loginName,password);
    }
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}