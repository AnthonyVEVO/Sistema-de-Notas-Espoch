
package ec.edu.espoch.sistemadenotas.modelo;



public class Aula {
    private String idAula;
    private int nSillas;
    private String aula;
    private String semestre;

    public Aula() {}
    
    public Aula(String idAula, int nSillas, String aula, String semestre) {
        this.idAula = idAula;
        this.nSillas = nSillas;
        this.aula = aula;
        this.semestre = semestre;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public int getnSillas() {
        return nSillas;
    }

    public void setnSillas(int nSillas) {
        this.nSillas = nSillas;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }


}

