
package dao;

import static dao.BD.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoDeMidia;


public class TipoDeMidiaDAO {
    
    public static List<TipoDeMidia> obterTipoDeMidias() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<TipoDeMidia> tiposdemidias = new ArrayList<TipoDeMidia>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from tipodemidia");
            while (rs.next()){
                TipoDeMidia tipodemidia = new TipoDeMidia
                                   (rs.getString("nome"),
                                    rs.getString("descricao"),
                                    rs.getInt("id_tipoDeMidia"));
                tiposdemidias.add(tipodemidia);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return tiposdemidias;
    }
    
}
