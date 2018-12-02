import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Penaczko
 */
public class MainFrame extends javax.swing.JFrame {
    private javax.swing.JButton button_0;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JButton button_CE;
    private javax.swing.JButton button_DELETE;
    private javax.swing.JButton button_addition;
    private javax.swing.JButton button_division;
    private javax.swing.JButton button_komma;
    private javax.swing.JButton button_multiplication;
    private javax.swing.JButton button_result;
    private javax.swing.JButton button_subtraction;
    private javax.swing.JTextField jTextField;
    final Font buttonFont = new Font("Times New Roman", Font.BOLD, 14);
    final Dimension buttonSize = new Dimension(75,75);
    Model model;

    public MainFrame(Model model) {
        this.model = model;
        initComponents();
    }

    private void initComponents() {

        jTextField = new javax.swing.JTextField();

        button_0 = ButtonCreator.createButton("0", buttonFont , buttonSize , new NumbersController("0" , model , jTextField));
        button_1 = ButtonCreator.createButton("1", buttonFont, buttonSize , new NumbersController("1" , model , jTextField));
        button_2 = ButtonCreator.createButton("2", buttonFont, buttonSize , new NumbersController("2" , model , jTextField));
        button_3 = ButtonCreator.createButton("3", buttonFont, buttonSize , new NumbersController("3" , model , jTextField));
        button_4 = ButtonCreator.createButton("4", buttonFont, buttonSize , new NumbersController("4" , model , jTextField));
        button_5 = ButtonCreator.createButton("5", buttonFont, buttonSize , new NumbersController("5" , model , jTextField));
        button_6 = ButtonCreator.createButton("6", buttonFont, buttonSize , new NumbersController("6" , model , jTextField));
        button_7 = ButtonCreator.createButton("7", buttonFont, buttonSize , new NumbersController("7" , model , jTextField));
        button_8 = ButtonCreator.createButton("8", buttonFont, buttonSize , new NumbersController("8" , model , jTextField));
        button_9 = ButtonCreator.createButton("9", buttonFont, buttonSize , new NumbersController("9" , model , jTextField));

        button_addition = ButtonCreator.createButton("+", buttonFont, buttonSize , new OperationsController(Operation.ADDITION , model , jTextField));
        button_multiplication = ButtonCreator.createButton("*", buttonFont, buttonSize , new OperationsController(Operation.MULTIPLICATION , model , jTextField));
        button_subtraction = ButtonCreator.createButton("-", buttonFont, buttonSize , new OperationsController(Operation.SUBTRACTION , model , jTextField));
        button_division = ButtonCreator.createButton("/", buttonFont, buttonSize , new OperationsController(Operation.DIVISION , model , jTextField));

        button_result = ButtonCreator.createButton("=", buttonFont, buttonSize , new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new ResultButtonController(model , jTextField).button_resultActionPerformed(evt);
            }
        });

        button_komma = ButtonCreator.createButton(",", buttonFont, buttonSize , new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new KommaButtonController(model , jTextField).button_kommaActionPerformed(evt);
            }
        });
        button_CE = ButtonCreator.createButton("CE", buttonFont, buttonSize , new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new CEButtonController(jTextField).button_CEActionPerformed(evt);
            }
        });
        button_DELETE = ButtonCreator.createButton("DEL", buttonFont, buttonSize , new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new DeleteButtonController(model , jTextField).button_DELETEActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);


        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                new TextFieldKeyReleased(model , jTextField).jTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new TextFieldKeyTypedController().jTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(button_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button_addition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(button_komma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_result, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_addition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(67, 67, 67)))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button_komma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_result, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }

    public static class ButtonCreator{

        ButtonCreator(){}

        public static JButton createButton(String buttonName , Font font , Dimension buttonSize , ActionListener event) {
            JButton button = new JButton(buttonName);
            button.setFont(font);
            button.addActionListener(event);

            button.setMaximumSize(buttonSize);
            button.setMinimumSize(buttonSize);
            button.setPreferredSize(buttonSize);

            return button;
        }
    }
}
