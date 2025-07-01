


package ec.edu.espoch.sistemadenotas.controlador;

import ec.edu.espoch.sistemadenotas.modelo.Docente;
import ec.edu.espoch.sistemadenotas.vista.DocenteFrame;
import ec.edu.espoch.sistemadenotas.modelo.Asignatura;

import javax.swing.table.DefaultTableModel;

public class ControladorDocente {

    private DocenteFrame vista;
    
    public ControladorDocente(DocenteFrame vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        cargarDatosDocente();
        cargarAsignaturasDocente();
    }
    
    private void cargarDatosDocente() {
        // Ejemplo con datos estáticos
        Docente docente = new Docente("DOC001", "TIT001", "María", "González");
        
        vista.setIdDocente(docente.getIdDocente());
        vista.setNombre(docente.getNombre());
        vista.setApellido(docente.getApellido());
        vista.setTitulo("Licenciada en Educación"); // Esto vendría de una relación con la tabla títulos
    }
    
    private void cargarAsignaturasDocente() {
        // Ejemplo con datos estáticos
        Object[][] datosAsignaturas = {
            {"MAT101", "Matemáticas Básicas", "Primer Nivel", 4},
            {"MAT201", "Matemáticas Avanzadas", "Segundo Nivel", 5}
        };
        
        String[] columnas = {"Código", "Asignatura", "Nivel", "Créditos"};
        DefaultTableModel model = new DefaultTableModel(datosAsignaturas, columnas);
        vista.setTablaAsignaturas(model);
    }
}
}
