/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import dao.FornecedorDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Fornecedor {

    
    private int id_fornecedor;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String nomeDoContato;

    private Contato contato;
    private int id_contato;
    private Endereco endereco;
    private int id_endereco;

    public Fornecedor(int id_fornecedor, String razaoSocial, String nomeFantasia, String cnpj, String nomeDoContato, Contato contato, Endereco endereco) {
        this.id_fornecedor = id_fornecedor;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.nomeDoContato = nomeDoContato;
        this.contato = contato;
        this.endereco = endereco;
    }
    
    public static List<Fornecedor> obterFornecedores() 
        throws ClassNotFoundException, SQLException {
        
        return FornecedorDAO.obterFornecedores();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeDoContato() {
        return nomeDoContato;
    }

    public void setNomeDoContato(String nomeDoContato) {
        this.nomeDoContato = nomeDoContato;
    }
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the id_contato
     */
    public int getId_contato() {
        return id_contato;
    }

    /**
     * @param id_contato the id_contato to set
     */
    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    /**
     * @return the id_endereco
     */
    public int getId_endereco() {
        return id_endereco;
    }

    /**
     * @param id_endereco the id_endereco to set
     */
    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
}
