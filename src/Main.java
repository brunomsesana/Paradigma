import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        JButton botaoMensagem = new JButton("Mensagem");
        botaoMensagem.setBounds(50, 55, 100, 30);
        frame.add(botaoMensagem);
        botaoMensagem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Window wind = new Window(new JFrame("Mensagem"));
                JTextField campoMsg = wind.CampoTexto();
                wind.Botao(campoMsg);
                wind.frame.setVisible(true);
            }
        });
        JButton botaoExpressao = new JButton("Expressão");
        botaoExpressao.setBounds(250, 55, 100, 30);
        frame.add(botaoExpressao);
        botaoExpressao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Parser();
            }
        });
        frame.setVisible(true);
    }
}