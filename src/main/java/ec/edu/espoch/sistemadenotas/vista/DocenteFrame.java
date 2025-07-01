
package ec.edu.espoch.sistemadenotas.vista;


import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import ec.edu.espoch.sistemadenotas.controlador.ControladorDocente;
import ec.edu.espoch.sistemadenotas.modelo.Docente;

public class DocenteFrame extends javax.swing.JFrame {
    private JTextField txtNombre, txtApellido;
    private JLabel lblIdDocente;

    private JTable tblAsignaturas;
    private DefaultTableModel modelAsignaturas;
    
    private JComboBox<String> cmbAsignaturas;
    private JTable tblEstudiantes;
    
    


    
    
    
    public DocenteFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        panelDatos = new javax.swing.JPanel();
        panelAsignaturas = new javax.swing.JPanel();
        panelNotas = new javax.swing.JPanel();
        panelReportes = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel del Docente");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Datos Personales", panelDatos);

        javax.swing.GroupLayout panelAsignaturasLayout = new javax.swing.GroupLayout(panelAsignaturas);
        panelAsignaturas.setLayout(panelAsignaturasLayout);
        panelAsignaturasLayout.setHorizontalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        panelAsignaturasLayout.setVerticalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Mis Asignaturas", panelAsignaturas);

        javax.swing.GroupLayout panelNotasLayout = new javax.swing.GroupLayout(panelNotas);
        panelNotas.setLayout(panelNotasLayout);
        panelNotasLayout.setHorizontalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Registrar Notas", panelNotas);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Reportes", panelReportes);

        btnCerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private JPanel createSubjectsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        
        // Configuración de tabla
        String[] columns = {"Código", "Asignatura", "Grupo", "Horario"};
        modelAsignaturas = new DefaultTableModel(columns, 0);
        tblAsignaturas = new JTable(modelAsignaturas);
        
        // Botones de acción
        JButton btnRefresh = new JButton("Actualizar");
        btnRefresh.addActionListener(e -> ControladorDocente.loadSubjects());
        
        panel.add(new JScrollPane(tblAsignaturas), BorderLayout.CENTER);
        panel.add(btnRefresh, BorderLayout.SOUTH);
        
        return panel;
    }

    private void createFooterPanel() {
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        JButton btnGuardarCambios = new JButton("Guardar Cambios");
        btnGuardarCambios.addActionListener(e -> ControladorDocente.saveChanges());
        
        btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.addActionListener(e -> dispose());
        
        footer.add(btnGuardarCambios);
        footer.add(btnCerrarSesion);
        add(footer, BorderLayout.SOUTH);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JPanel panelAsignaturas;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
