import javax.swing.*;
import java.awt.*;

public class MensagemEnviada extends Mensagem {

  public MensagemEnviada(String msg, JFrame frame, int lastMsg) {
    super(msg, frame, lastMsg);
  }

  void BalaoMsg() {
    JPanel balaoMsg = new JPanel();
    balaoMsg.setBounds(100, lastMsg, 300, 100);
    Window.lastMsg += 105;
    balaoMsg.setLayout(new BorderLayout());
    balaoMsg.setBackground(new Color(170, 212, 148));
    frame.add(balaoMsg);
    JLabel labelMsg = new JLabel("", SwingConstants.CENTER);
    balaoMsg.add(labelMsg, BorderLayout.CENTER);
    labelMsg.setText(msg);
  }

}