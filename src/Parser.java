import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Parser {
    public Parser(){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocation((int) GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getBounds().getMaxX() - frame.getWidth(), 0);;
        JTextField campoMsg = new JTextField();
        campoMsg.setBounds(50, 250, 300, 30);
        frame.add(campoMsg);
        frame.setVisible(true);
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(150, 300, 100, 30);
        frame.add(botaoEnviar);
        JPanel resultado = new JPanel();
        resultado.setBounds(50, 50, 300, 100);
        resultado.setBackground(new Color(170, 212, 148));
        JLabel textoResultado = new JLabel("", SwingConstants.CENTER);
        resultado.add(textoResultado, BorderLayout.CENTER);
        frame.add(resultado);
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoResultado.setText(Parse(campoMsg.getText()));
            }
        });
    }
    String Parse(String exp){
        index = 0;
        input = exp.replaceAll("\\s+", "");
        return String.valueOf(parseAddSub());
    }

    String input;
    int index;

    float parseAddSub() {
        float value = parseMulDiv();
        while (index < input.length() && (input.charAt(index) == '+' || input.charAt(index) == '-')) {
            char operator = input.charAt(index++);
            float nextValue = parseMulDiv();
            if (operator == '+') {
                value += nextValue;
            } else {
                value -= nextValue;
            }
        }
        return value;
    }

    float parseMulDiv() {
        float value = parsePrimary();
        while (index < input.length() && (input.charAt(index) == '*' || input.charAt(index) == '/')) {
            char operator = input.charAt(index++);
            float nextValue = parsePrimary();
            if (operator == '*') {
                value *= nextValue;
            } else {
                value /= nextValue;
            }
        }
        return value;
    }

    float parsePrimary() {
        if (input.charAt(index) == '(') {
            index++; // Consumir '('
            float value = parseAddSub();
            if (input.charAt(index) == ')') {
                index++; // Consumir ')'
            }
            return value;
        } else {
            return parseNumber();
        }
    }

    float parseNumber() {
        int start = index;
        while (index < input.length() && (Character.isDigit(input.charAt(index)) || input.charAt(index) == '.')) {
            index++;
        }
        return Float.parseFloat(input.substring(start, index));
    }
}
