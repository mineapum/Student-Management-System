
package student_managment;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sovuthyna
 */
public class ConDB {
    
    private static String db_name="student_db";
    private static String user="root";
    private static String password="";
    private static Connection con;
    private static String url="jdbc:mysql://localhost/"+db_name+"";
    public static Connection getConnection() {

    try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection(url,user,password);
        //JOptionPane.showMessageDialog(null, "Connected..");
    }
    catch(ClassNotFoundException | SQLException e) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
	return con;
    }
   
}
