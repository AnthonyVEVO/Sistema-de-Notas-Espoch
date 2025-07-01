
package ec.edu.espoch.sistemadenotas.modelo;



public class Titulo {
    private String codTitulos;
    private String titulo;

    public Titulo() {}
    
    public Titulo(String codTitulos, String titulo) {
        this.codTitulos = codTitulos;
        this.titulo = titulo;
    }

    public String getCodTitulos() {
        return codTitulos;
    }

    public void setCodTitulos(String codTitulos) {
        this.codTitulos = codTitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
}

