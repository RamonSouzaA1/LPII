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
public class Usuario extends Pessoa{
    private String login;
    private String senha;
    private int id_usuario;

    public Usuario(String nome, String sexo, String dataDeNasc, String estadoCivil, String cpf, String rg, String login, String senha, int id_usuario) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataDeNasc(dataDeNasc);
        this.setEstadoCivil(estadoCivil);
        this.setCpf(cpf);
        this.setRg(rg);
        this.login = login;
        this.senha = senha;
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
