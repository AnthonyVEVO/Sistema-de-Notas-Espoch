


package ec.edu.espoch.sistemadenotas.modelo;



public class Nota {

    private String codEstudiante;
    private String idAsignatura;
    private double nota;

    public Nota() {}
    
    public Nota(String codEstudiante, String idAsignatura, double nota) {
        this.codEstudiante = codEstudiante;
        this.idAsignatura = idAsignatura;
        this.nota = nota;
    }

    public String getCodEstudiante() {
        return codEstudiante;
    }

    public void setCodEstudiante(String codEstudiante) {
        this.codEstudiante = codEstudiante;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
}

