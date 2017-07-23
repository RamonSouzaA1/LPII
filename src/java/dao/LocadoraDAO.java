package dao;

import static dao.BD.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Locadora;


public class LocadoraDAO {
    
    public static List<Locadora> obterLocadora() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Locadora> locadoras = new ArrayList<Locadora>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from locadora");
            while (rs.next()){
                Locadora locadora = new Locadora
                                   (rs.getString("dataLocacao"),
                                    rs.getInt("id_locadora"),
                                    null,
                                    null,
                                    null);
           locadora.setId_usuario(rs.getInt("id_usuario"));
           locadora.setId_filmes(rs.getInt("id_filmes")); 
           locadora.setId_cliente(rs.getInt("id_cliente"));
          
           locadoras.add(locadora);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return locadoras;
    }
    
}
