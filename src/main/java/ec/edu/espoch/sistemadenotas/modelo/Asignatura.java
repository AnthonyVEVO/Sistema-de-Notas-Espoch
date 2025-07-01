
package ec.edu.espoch.sistemadenotas.modelo;

public class Asignatura {
    private String idAsignatura;
    private String idDocente;
    private String nivel;
    private String nombre;
    private int creditos;

    public Asignatura() {}
    
    public Asignatura(String idAsignatura, String idDocente, String nivel, String nombre, int creditos) {
        this.idAsignatura = idAsignatura;
        this.idDocente = idDocente;
        this.nivel = nivel;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    
}

