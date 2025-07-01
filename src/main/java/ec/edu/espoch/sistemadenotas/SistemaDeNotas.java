

package ec.edu.espoch.sistemadenotas;

import ec.edu.espoch.sistemadenotas.vista.LoginFrame;
import javax.swing.SwingUtilities;

import ec.edu.espoch.sistemadenotas.controlador.ControladorLogin;

public class SistemaDeNotas {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        SwingUtilities.invokeLater(() -> {
            LoginFrame login = new LoginFrame();
            new ControladorLogin(login);
        });
    }
}



/*public class SistemaDeNotas {

    
       public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
        });
    }
       
}/*

