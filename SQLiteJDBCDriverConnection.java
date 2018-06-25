import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteJDBCDriverConnection {
	public void connect() {
       Connection conn = null;
       try {
    	   Class.forName("org.sqlite.JDBC");
           String url = "jdbc:sqlite:D:/Downloads/sqlite-tools-win32-x86-3240000/teste.db";
           conn = DriverManager.getConnection(url);
           System.out.println("Connection to SQLite has been established.");           
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       } catch (ClassNotFoundException e) {
           System.out.println("Referência para "+e.getMessage()
           +" inexistente, verifique as bibliotecas referenciadas");
       } finally {
           try {
               if (conn != null) {
                   conn.close();
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
   }
     
}