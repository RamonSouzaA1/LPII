/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Aluno
 */
public class TipoDeMidia {
    private String nome;
    private String descricao;
    private int id_tipoDeMidia;

    public TipoDeMidia(String nome, String descricao, int id_tipoDeMidia) {
        this.nome = nome;
        this.descricao = descricao;
        this.id_tipoDeMidia = id_tipoDeMidia;
    }

    public int getId_tipoDeMidia() {
        return id_tipoDeMidia;
    }

    public void setId_tipoDeMidia(int id_tipoDeMidia) {
        this.id_tipoDeMidia = id_tipoDeMidia;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
