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
import modelo.Usuario;


public class UsuarioDAO {
    
    public static List<Usuario> obterUsuarios() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from usuario");
            while (rs.next()){
                Usuario usuario = new Usuario
                                   (rs.getString("nome"),
                                    rs.getString("sexo"),
                                    rs.getString("dataDeNasc"),
                                    rs.getString("estadoCivil"),       
                                    rs.getString("cpf"),       
                                    rs.getString("rg"),
                                    rs.getString("login"),
                                    rs.getString("senha"),       
                                    rs.getInt("id_usuario"));
                usuarios.add(usuario);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return usuarios;
    }
    
}

