/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Kaio
 */
import static dao.BD.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Contato;


public class ContatoDAO {
    
    public static List<Contato> obterContatos() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Contato> contatos = new ArrayList<Contato>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from contato");
            while (rs.next()){
                Contato contato = new Contato
                                   (rs.getString("telefone1"),
                                    rs.getString("telefone2"),
                                    rs.getString("nomecelular"),
                                    rs.getString("email"),  
                                    rs.getInt("id_contato"));
                contatos.add(contato);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return contatos;
    }
    
}
