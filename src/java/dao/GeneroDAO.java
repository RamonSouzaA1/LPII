
package dao;

import static dao.BD.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Genero;


public class GeneroDAO {
    
    public static List<Genero> obterGeneros() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Genero> generos = new ArrayList<Genero>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from genero");
            while (rs.next()){
                Genero genero = new Genero
                                   (rs.getString("nome"),
                                    rs.getString("descricao"),
                                    rs.getInt("id_genero"));
                generos.add(genero);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return generos;
    }
    
}


