
package laboratorio5;
import javax.swing.text.DefaultCaret;
import java.awt.Color;

public class CustomCaret extends DefaultCaret {
    @Override
    public void paint(java.awt.Graphics g) {
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
        g2d.setPaint(new Color(200, 81, 44));  
        super.paint(g);
    }
}