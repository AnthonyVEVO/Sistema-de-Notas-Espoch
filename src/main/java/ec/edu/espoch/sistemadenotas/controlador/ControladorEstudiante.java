


package ec.edu.espoch.sistemadenotas.controlador;

import ec.edu.espoch.sistemadenotas.modelo.Alumno;
import ec.edu.espoch.sistemadenotas.vista.EstudianteFrame;
import ec.edu.espoch.sistemadenotas.modelo.Nota;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class ControladorEstudiante {

    private EstudianteFrame vista;

    
    public ControladorEstudiante(EstudianteFrame vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        cargarDatosEstudiante();
        cargarNotasEstudiante();
    }
    
    private void cargarDatosEstudiante() {
        Alumno alumno = new Alumno("EST001", "AULA101", "Juan", "Pérez", "MAT2023001", "juan@universidad.edu");
        
        vista.setCodEstudiante(alumno.getCodEstudiante());
        vista.setNombre(alumno.getNombre());
        vista.setApellido(alumno.getApellido());
        vista.setMatricula(alumno.getMatricula());
        vista.setCorreo(alumno.getCorreo());
        vista.setAula(alumno.getIdAula());
    }
    
    private void cargarNotasEstudiante() {
        // Ejemplo con datos estáticos
        Object[][] datosNotas = {
            {"MAT101", "Matemáticas Básicas", 85, 4},
            {"FIS101", "Física General", 78, 3},
            {"PROG101", "Programación I", 92, 5}
        };
        
        String[] columnas = {"Código", "Asignatura", "Nota", "Créditos"};
        DefaultTableModel model = new DefaultTableModel(datosNotas, columnas);
        vista.setTablaNotas(model);
    }
}
}
