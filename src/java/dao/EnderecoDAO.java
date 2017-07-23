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
import modelo.Endereco;


public class EnderecoDAO {
    
    public static List<Endereco> obterEnderecos() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Endereco> enderecos = new ArrayList<Endereco>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from endereco");
            while (rs.next()){
                Endereco endereco = new Endereco
                                   (rs.getString("cep"),
                                    rs.getString("bairro"),
                                    rs.getString("logradouro"),       
                                    rs.getInt("numero"),
                                    rs.getString("complemento"),
                                    rs.getString("cidade"),
                                    rs.getString("estado"),       
                                    rs.getInt("id_endereco"));   
                enderecos.add(endereco);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return enderecos;
    }
    
}

