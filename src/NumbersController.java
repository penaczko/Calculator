import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class NumbersController implements ActionListener {
    String buttonText;
    Model model;
    JTextField jTextField;


    NumbersController(String buttonText , Model model , JTextField jTextField) {
        this.buttonText = buttonText;
        this.model = model;
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.typedNumber = jTextField.getText() + buttonText;
        jTextField.setText(model.typedNumber);
    }
}