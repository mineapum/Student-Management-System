
package student_managment;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author Sovuthyna
 */
public class Student_Managment {

    public static void main(String[] args){
        Splash_screen spl = new Splash_screen();
        Login_form Lg = new Login_form();
        spl.setVisible(true);
        
        try {
            for (int i=0; i<=100; i++)
            {
                Thread.sleep(70);
                Splash_screen.lbl_loard.setText(Integer.toString(i)+"%");
                Splash_screen.loard_bar.setValue(i);
                
                if(i >= 50 && i < 80){
                    Splash_screen.lbl_show_loard.setText("Preparing...");
                }else if(i > 80){
                    Splash_screen.lbl_show_loard.setText("Opening...");
                }
                Splash_screen.lbl_show_loard.setForeground(new Color(0,i+30,0));
            }
            
        Thread.sleep(2000);
            
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        spl.dispose();
        Lg.setVisible(true);
        
    }
}
