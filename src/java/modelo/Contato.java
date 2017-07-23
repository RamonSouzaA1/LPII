/*

 */

package modelo;

public class Contato {
    private String telefone1;
    private String telefone2;
    private String celular;
    private String email;

    public Contato(String telefone1, String telefone2, String celular, String email, int id_contato) {
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.celular = celular;
        this.email = email;
        this.id_contato = id_contato;
    }
    private int id_contato;
    

   
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
          
}
