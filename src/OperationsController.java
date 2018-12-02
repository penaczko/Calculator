import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OperationsController implements ActionListener {
    Operation sign;
    Model model;
    JTextField jTextField;


    OperationsController(Operation operation , Model model , JTextField jTextField) {
        this.sign = operation;
        this.model = model;
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (sign) {
            case ADDITION:
                model.firstNumber = Double.parseDouble(jTextField.getText());
                jTextField.setText("");
                model.operation = sign;
                break;

            case DIVISION:
                model.firstNumber = Double.parseDouble(jTextField.getText());
                jTextField.setText("");
                model.operation = sign;
                break;

            case SUBTRACTION:
                model.firstNumber = Double.parseDouble(jTextField.getText());
                jTextField.setText("");
                model.operation = sign;
                break;

            case MULTIPLICATION:
                model.firstNumber = Double.parseDouble(jTextField.getText());
                jTextField.setText("");
                model.operation = sign;
                break;
        }
    }
}