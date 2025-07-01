
package ec.edu.espoch.sistemadenotas.modelo;





public class Alumno {
    private String codEstudiante;
    private String idAula;
    private String nombre;
    private String apellido;
    private String matricula;
    private String correo;

    // Constructor, getters y setters
    public Alumno() {}
    
    public Alumno(String codEstudiante, String idAula, String nombre, String apellido, String matricula, String correo) {
        this.codEstudiante = codEstudiante;
        this.idAula = idAula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public String getCodEstudiante() {
        return codEstudiante;
    }

    public void setCodEstudiante(String codEstudiante) {
        this.codEstudiante = codEstudiante;
    }
    
}
