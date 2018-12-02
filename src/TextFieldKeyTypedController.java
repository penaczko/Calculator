public class TextFieldKeyTypedController {
    public TextFieldKeyTypedController(){}


    public void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        if(!isNumber(evt.getKeyChar())) {
            evt.consume();
        }
    }

    private boolean isNumber(char c) {
        if(c >= '0' && c <= '9') {
            return true;
        }

        return false;
    }
}
