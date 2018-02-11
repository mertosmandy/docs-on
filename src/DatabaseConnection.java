
import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {

    static String mySQLServer = "sql4.freesqldatabase.com:3306/sql4100665";
    static String mySQLUserName = "sql4100665";
    static String mySQLPassword = "VUPqKzEaEq";
    static String sQLiteLocation = "";
    static String option = "MySQL";

    public static Connection ConnectDB() {
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            if (option.equals("MySQL")) {
                con = DriverManager.getConnection("jdbc:mysql://" + mySQLServer, mySQLUserName, mySQLPassword);
            } else {
                con = DriverManager.getConnection("jdbc:sqlite:" + sQLiteLocation);
            }
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static String getMySQLServer() {
        return mySQLServer;
    }

    public void setMySQLServer(String mySQLServer) {
        this.mySQLServer = mySQLServer;
    }

    public static String getMySQLUserName() {
        return mySQLUserName;
    }

    public void setMySQLUserName(String mySQLUserName) {
        this.mySQLUserName = mySQLUserName;
    }

    public static String getMySQLPassword() {
        return mySQLPassword;
    }

    public void setMySQLPassword(String mySQLPassword) {
        this.mySQLPassword = mySQLPassword;
    }

    public static String getSQLiteLocation() {
        return sQLiteLocation;
    }

    public void setSQLiteLocation(String sQLiteLocation) {
        this.sQLiteLocation = sQLiteLocation;
    }

    public static String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
