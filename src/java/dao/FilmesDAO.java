/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.BD.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Filmes;


public class FilmesDAO {
    
    public static List<Filmes> obterFilmes() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Filmes> filmes = new ArrayList<Filmes>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from filmes");
            while (rs.next()){
                Filmes filme = new Filmes
                                   (rs.getString("titulo"),
                                    rs.getString("tituloOriginal"),
                                    rs.getString("nomeDiretor"),
                                    rs.getString("nomeAtorPrincipal"),       
                                    rs.getString("nomePremiacoes"),       
                                    rs.getString("anoProducao"),
                                    rs.getString("anoLancamento"),       
                                    rs.getInt("id_filmes"),
                                    null,
                                    null,
                                    null,
                                    null);
           filme.setId_tipoDeMidia(rs.getInt("id_tipoDeMidia"));
           filme.setId_genero(rs.getInt("id_genero")); 
           filme.setId_fornecedor(rs.getInt("id_fornecedor"));
           filme.setId_categoria(rs.getInt("id_categoria"));
           filmes.add(filme);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return filmes;
    }
    
}
