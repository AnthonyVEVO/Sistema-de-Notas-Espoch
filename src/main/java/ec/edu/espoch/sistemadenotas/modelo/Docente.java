
package ec.edu.espoch.sistemadenotas.modelo;



public class Docente {
    private String idDocente;
    private String codTitulos;
    private String nombre;
    private String apellido;

    public Docente() {}
    
    public Docente(String idDocente, String codTitulos, String nombre, String apellido) {
        this.idDocente = idDocente;
        this.codTitulos = codTitulos;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getCodTitulos() {
        return codTitulos;
    }

    public void setCodTitulos(String codTitulos) {
        this.codTitulos = codTitulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}

