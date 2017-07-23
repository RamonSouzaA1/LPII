/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Locadora {
    private String dataLocacao;
    private int id_locadora;
    private Usuario usuario;
    private int id_usuario;
    private Filmes filme;
    private int id_filmes;
    private Cliente cliente;
    private int id_cliente;

    public Locadora(String dataLocacao, int id_locadora, Usuario usuario, Filmes filmes, Cliente cliente) {
        this.dataLocacao = dataLocacao;
        this.id_locadora = id_locadora;
        this.id_usuario = id_usuario;
        this.id_filmes = id_filmes;
        this.id_cliente = id_cliente;
    }
    
    
    
    private ArrayList<Filmes> locacoes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Usuario> usuarios;

    public ArrayList<Filmes> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(ArrayList<Filmes> locacoes) {
        this.locacoes.add(filme);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes.add(cliente);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios.add(usuario);
    }
   
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id) {
        this.id_usuario = id;
    }

    public int getId_filmes() {
        return id_filmes;
    }

    public void setId_filmes(int id_filmes) {
        this.id_filmes = id_filmes;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getData() {
        return dataLocacao;
    }

    public void setData(String data) {
        this.dataLocacao = data;
    }

}
