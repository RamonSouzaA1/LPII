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
import modelo.Dependente;


public class DependenteDAO {
    
    public static List<Dependente> obterDependentes() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        Statement comando = null;
        List<Dependente> dependentes = new ArrayList<Dependente>();
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from dependente");
            while (rs.next()){
                Dependente dependente = new Dependente
                                   (rs.getString("nome"),
                                    rs.getString("grauDeParentesco"),
                                    rs.getString("dataDeNascimento"),       
                                    rs.getInt("id_dependente"));
                dependentes.add(dependente);
            }
            
        }
        catch(SQLException e){
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, comando);
    
        }
        return dependentes;
    }
    
}
