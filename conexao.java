package conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
    
    private static final String DRIVER_CLASS = "org.hsqldb.jdbcDriver";
    private static Connection con = null;
    private static String PathBase = "jdbc:hsqldb:file:C:\\Users\\Italo\\Documents\\NetBeansProjects\\usina\\lib\\cand";
    private static final String URL = "jdbc:hsqldb:file:" + PathBase + ";shutdown=true;hsqldb.write_delay=false; ";
    
    public static Connection conectar (){
        if (con == null) {
            try{
            //Caminho do drive
            Class.forName(DRIVER_CLASS);
            //estabelece a conexão caminho/usuario/senha
            con = DriverManager.getConnection(PathBase, "italo","");
//            JOptionPane.showMessageDialog(null, "DB concetado com sucesso!!");
            
            }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null," Error no ClassName " + e);
            
            }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB concetado não com sucesso!!" + ex );

        } 
        }else{JOptionPane.showMessageDialog(null, "Já está em outra conexão!");}
        
      return con;  
    }
 
    public static void fecharcon (){
            try {
                    con.close();
                    con = null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado ao fechar a conexão" + e );
        }
    }
    
}
