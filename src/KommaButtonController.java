import javax.swing.*;
import java.awt.event.ActionEvent;

public class KommaButtonController {
    Model model;
    JTextField jTextField;

    KommaButtonController(Model model , JTextField jTextField) {
        this.model = model;
        this.jTextField = jTextField;
    }

    public void button_kommaActionPerformed(ActionEvent evt) {
        int pointer = 0;
        String typedNumber;
        for(int i = 0 ; i < jTextField.getText().length() ; i++) {
            if(jTextField.getText().charAt(i) == '.') {
                pointer++;
            }
        }

        if(pointer == 0 ) {
            typedNumber = jTextField.getText() + ".";
        }
        else {
            typedNumber = jTextField.getText();
        }

        jTextField.setText(typedNumber);

    }
}
