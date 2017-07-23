/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import dao.ClienteDAO;
import dao.FilmesDAO;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa {

    public static List<Cliente> obterClientes() 
        throws ClassNotFoundException, SQLException {
        
        return ClienteDAO.obterClientes();
    
    } 
    
  
    private ArrayList dependentes;
    private int id_cliente;
    private static ArrayList<Locadora> historico;

    public Cliente(String nome, String sexo, String dataDeNasc, String estadoCivil, String cpf, String rg, int id_cliente) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataDeNasc(dataDeNasc);
        this.setEstadoCivil(estadoCivil);
        this.setCpf(cpf);
        this.setRg(rg);
        this.id_cliente = id_cliente;
        new ArrayList<Locadora>();
    }

    public static ArrayList<Locadora> getHistorico() {
        return historico;
    }

    public static void setHistorico(ArrayList<Locadora> historico) {
        Cliente.historico = historico;
    }

    public ArrayList getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList dependentes) {
        this.dependentes.add(dependentes);
    }
}
