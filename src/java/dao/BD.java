
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
    
    public static Connection getConexao() 
        
        throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection("jdbc:mysql://localhost/phpmyadmin/sclbd", "root", "");
        return conexao;
    }
    
    public static void fecharConexao (Connection conexao, Statement comando){
        try{
            if(comando != null){
                comando.close();
            }
            if(conexao != null){
                conexao.close();
            }
        }catch (SQLException e){
    }
    }
}
