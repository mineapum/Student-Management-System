
package student_managment;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Sovuthyna
 */
public class SetIcons {
    public void SetIcons(JFrame jf){
        ImageIcon fimg = new ImageIcon(getClass().getResource("/img/mba_64px.png"));
        jf.setIconImage(fimg.getImage());
    }
    public void setTableHeaders(JTable jt){
        jt.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
}
