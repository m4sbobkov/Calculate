package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {
    private final JTextField textField;

    public CalcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textField.getText();

        if (str.contains("+")) {
            String[] operands = textField.getText().split("\\+");
            int sum = 0;
            for (int i = 0; i < operands.length; i++) {
                sum += Integer.parseInt(operands[i]);
            }
            textField.setText(String.valueOf(sum));
        } else if (str.contains("-")) {
            String[] operands = textField.getText().split("\\-");
            int diff = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                diff -= Integer.parseInt(operands[i]);
            }
            textField.setText(String.valueOf(diff));
        }
        else if (str.contains("*")) {
            String[] operands = textField.getText().split("\\*");
            int mult = Integer.parseInt(operands[0]);
            for (int i = 0; i < operands.length; i++) {
                mult *= Integer.parseInt(operands[i]);
            }
            textField.setText(String.valueOf(mult));
        }
        else if (str.contains("/")) {
            String[] operands = textField.getText().split("\\/");
            int div = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                div /= Integer.parseInt(operands[i]);
            }
            textField.setText(String.valueOf(div));
        }
    }
}
