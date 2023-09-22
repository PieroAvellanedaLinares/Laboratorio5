
package laboratorio5;

import javax.swing.JTextField;

public class CustomTextField extends JTextField {
    public CustomTextField() {
        setCaret(new CustomCaret());
    }
}