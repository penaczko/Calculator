import javax.swing.*;

public class CEButtonController {
    JTextField jTextField;

    CEButtonController(JTextField jTextField) {
        this.jTextField = jTextField;
    }


    public void button_CEActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField.setText(null);
    }

}
