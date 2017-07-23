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
import modelo.Fornecedor;


public class FornecedorDAO {
    
    public static List<Fornecedor> obterFornecedores() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from fornecedor");
            while (rs.next()){
                Fornecedor fornecedor = new Fornecedor
                                   (rs.getInt("id_fornecedor"),
                                    rs.getString("razaoSocial"),
                                    rs.getString("nomeFantasia"),
                                    rs.getString("cnpj"),
                                    rs.getString("nomeDoContato"),       
                                    null,
                                    null);
           fornecedor.setId_contato(rs.getInt("id_contato"));
           fornecedor.setId_endereco(rs.getInt("id_endereco")); 
           fornecedores.add(fornecedor);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return fornecedores;
    }
    
}
