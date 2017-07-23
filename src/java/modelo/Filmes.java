/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import dao.FilmesDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Filmes {
    private int id_filme;
    private String titulo;
    private String tituloOriginal;
    private String nomeDiretor;
    private String nomeAtorPrincipal;
    private String nomePremiacoes;
    private String anoProducao;
    private String anoLancamento;
    private TipoDeMidia tipoDeMidia;
    private int id_tipoDeMidia;
    private Genero genero;
    private int id_genero;
    private Fornecedor fornecedor;
    private int id_fornecedor;
    private Categoria categoria;
    private int id_categoria;
    //private Cadastro cadastro; criar classe cadastro

    public Filmes(String titulo, String tituloOriginal, String nomeDiretor, String nomeAtorPrincipal, String nomePremiacoes, String anoProducao, String anoLancamento, int id_filmes, TipoDeMidia tipoDeMidia, Genero genero, Fornecedor fornecedor, Categoria categoria) {
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.nomeDiretor = nomeDiretor;
        this.nomeAtorPrincipal = nomeAtorPrincipal;
        this.nomePremiacoes = nomePremiacoes;
        this.anoProducao = anoProducao;
        this.anoLancamento = anoLancamento;
        this.id_filme = id_filme;
        this.tipoDeMidia = tipoDeMidia;
        this.genero = genero;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }
    
    public static List<Filmes> obterFilmes() 
        throws ClassNotFoundException, SQLException {
        
        return FilmesDAO.obterFilmes();
    
    }
    
    public int getId() {
        return id_filme;
    }

    public void setId(int id) {
        this.id_filme = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeAtorPrincipal() {
        return nomeAtorPrincipal;
    }

    public void setNomeAtorPrincipal(String nomeAtorPrincipal) {
        this.nomeAtorPrincipal = nomeAtorPrincipal;
    }

    public String getNomePremiacoes() {
        return nomePremiacoes;
    }

    public void setNomePremiacoes(String nomePremiacoes) {
        this.nomePremiacoes = nomePremiacoes;
    }

    public String getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(String anoProducao) {
        this.anoProducao = anoProducao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public TipoDeMidia getTipoDeMidia() {
        return tipoDeMidia;
    }

    public void setTipoDeMidia(TipoDeMidia tipoDeMidia) {
        this.tipoDeMidia = tipoDeMidia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
/*
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }*/
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the id_tipoDeMidia
     */
    public int getId_tipoDeMidia() {
        return id_tipoDeMidia;
    }

    /**
     * @param id_tipoDeMidia the id_tipoDeMidia to set
     */
    public void setId_tipoDeMidia(int id_tipoDeMidia) {
        this.id_tipoDeMidia = id_tipoDeMidia;
    }

    /**
     * @return the id_genero
     */
    public int getId_genero() {
        return id_genero;
    }

    /**
     * @param id_genero the id_genero to set
     */
    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    /**
     * @return the id_fornecedor
     */
    public int getId_fornecedor() {
        return id_fornecedor;
    }

    /**
     * @param id_fornecedor the id_fornecedor to set
     */
    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
}
