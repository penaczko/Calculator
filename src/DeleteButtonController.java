import javax.swing.*;

public class DeleteButtonController {
    Model model;
    JTextField jTextField;

    DeleteButtonController(Model model , JTextField jTextField) {
        this.model = model;
        this.jTextField = jTextField;
    }


    public void button_DELETEActionPerformed(java.awt.event.ActionEvent evt) {
        String backspace = null;

        if(jTextField.getText().length() > 0){
            StringBuilder sB = new StringBuilder(jTextField.getText());
            sB.deleteCharAt(jTextField.getText().length() - 1);
            backspace = sB.toString();
            jTextField.setText(backspace);
        }
    }
}
