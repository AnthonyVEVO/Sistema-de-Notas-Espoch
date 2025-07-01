
package ec.edu.espoch.sistemadenotas.controlador;


import ec.edu.espoch.sistemadenotas.vista.LoginFrame;
import ec.edu.espoch.sistemadenotas.vista.EstudianteFrame;
import ec.edu.espoch.sistemadenotas.vista.DocenteFrame;
import ec.edu.espoch.sistemadenotas.vista.AdminFrame;
import ec.edu.espoch.sistemadenotas.vista.EstudianteFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class ControladorLogin {
    private LoginFrame vista;
    
    public ControladorLogin(LoginFrame vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.addLoginListener(new LoginListener());
    }
    
    class LoginListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            String usuario = vista.getUsuario();
            String password = vista.getPassword();
            String tipoUsuario = vista.getTipoUsuario();
            
            if(validarCredenciales(usuario, password, tipoUsuario)) {
                redirigirSegunTipoUsuario(tipoUsuario);
                vista.dispose();
            } else {
                vista.mostrarMensajeError("Credenciales inválidas");
            }
        }
        
        private boolean validarCredenciales(String usuario, String password, String tipoUsuario) {
            // En una aplicación real, esto consultaría a una base de datos
            // Aquí un ejemplo básico de validación
            if(usuario.isEmpty() || password.isEmpty()) return false;
            
            switch(tipoUsuario) {
                case "Estudiante":
                    return usuario.equals("estudiante") && password.equals("123");
                case "Docente":
                    return usuario.equals("docente") && password.equals("123");
                case "Administrador":
                    return usuario.equals("admin") && password.equals("admin123");
                default:
                    return false;
            }
        }
        
        private void redirigirSegunTipoUsuario(String tipoUsuario) {
            switch(tipoUsuario) {
                case "Estudiante":
                    new ControladorEstudiante(new EstudianteFrame());
                    break;
                case "Docente":
                    new ControladorDocente(new DocenteFrame());
                    break;
                case "Administrador":
                    new ControladorAdmin(new AdminFrame());
                    break;
            }
        }
    }
}
    

