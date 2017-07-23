package modelo;

import dao.CategoriaDAO;
import java.sql.SQLException;
import java.util.List;

public class Categoria {

    
    private String nome;
    private String descricao;
    private int periodoDeTroca;
    private int id_categoria;
    
    public Categoria(int id_categoria, String nome, String descricao, int periodoDeTroca, String proxCategoria) {
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.descricao = descricao;
        this.periodoDeTroca = periodoDeTroca;
        this.proxCategoria = proxCategoria;
    }
    public Categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    private String proxCategoria;

   
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

    public int getPeriodoDeTroca() {
        return periodoDeTroca;
    }

    public void setPeriodoDeTroca(int periodoDeTroca) {
        this.periodoDeTroca = periodoDeTroca;
    }

    public String getProxCategoria() {
        return proxCategoria;
    }

    public void setProxCategoria(String proxCategoria) {
        this.proxCategoria = proxCategoria;
    }
    
    public static List<Categoria> obterCategorias() throws ClassNotFoundException, SQLException {
        return CategoriaDAO.obterCategorias();
    }

}
