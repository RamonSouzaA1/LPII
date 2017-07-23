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
public class Dependente {
    private String nome;
    private String grauDeParentesco;
    private String dataDeNascimento;
    private int id_dependente;
    

    public Dependente(String nome, String grauDeParentesco, String dataDeNascimento, int id_dependente) {
        this.nome = nome;
        this.grauDeParentesco = grauDeParentesco;
        this.dataDeNascimento = dataDeNascimento;
        this.id_dependente = id_dependente;
    }
   
    public int getId() {
        return id_dependente;
    }
    
    public void setId(int id_dependente) {
        this.id_dependente = id_dependente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    } 
}
