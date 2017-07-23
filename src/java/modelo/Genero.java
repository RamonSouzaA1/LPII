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
public class Genero {
    private String nome;
    private String descricao;
    private int id_genero;

    public Genero(String nome, String descricao, int id_genero) {
        this.nome = nome;
        this.descricao = descricao;
        this.id_genero = id_genero;
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
