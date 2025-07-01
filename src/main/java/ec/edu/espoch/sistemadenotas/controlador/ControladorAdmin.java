


package ec.edu.espoch.sistemadenotas.controlador;
import ec.edu.espoch.sistemadenotas.modelo.Alumno;
import ec.edu.espoch.sistemadenotas.modelo.Docente;
import ec.edu.espoch.sistemadenotas.vista.AdminFrame;
import ec.edu.espoch.sistemadenotas.modelo.Asignatura;
import ec.edu.espoch.sistemadenotas.modelo.Aula;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;



public class ControladorAdmin {

    private AdminFrame vista;
    
    public ControladorAdmin(AdminFrame vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        cargarEstudiantes();
        cargarDocentes();
        // Puedes añadir más métodos para cargar otras tablas
    }
    
    private void cargarEstudiantes() {
        // Ejemplo con datos estáticos
        List<Alumno> estudiantes = new ArrayList<>();
        estudiantes.add(new Alumno("EST001", "AULA101", "Juan", "Pérez", "MAT2023001", "juan@universidad.edu"));
        estudiantes.add(new Alumno("EST002", "AULA102", "Ana", "López", "MAT2023002", "ana@universidad.edu"));
        
        String[] columnas = {"Código", "Nombre", "Apellido", "Matrícula", "Correo", "Aula"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);
        
        for(Alumno alumno : estudiantes) {
            Object[] fila = {
                alumno.getCodEstudiante(),
                alumno.getNombre(),
                alumno.getApellido(),
                alumno.getMatricula(),
                alumno.getCorreo(),
                alumno.getIdAula()
            };
            model.addRow(fila);
        }
        
        vista.setTablaEstudiantes(model);
    }
    
    private void cargarDocentes() {
        // Ejemplo con datos estáticos
        List<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("DOC001", "TIT001", "María", "González"));
        docentes.add(new Docente("DOC002", "TIT002", "Carlos", "Martínez"));
        
        String[] columnas = {"ID Docente", "Nombre", "Apellido", "Título"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);
        
        for(Docente docente : docentes) {
            Object[] fila = {
                docente.getIdDocente(),
                docente.getNombre(),
                docente.getApellido(),
                "Licenciado" // Esto vendría de la relación con títulos
            };
            model.addRow(fila);
        }
        
        vista.setTablaDocentes(model);
    }
}

