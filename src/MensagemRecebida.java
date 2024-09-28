import javax.swing.*;
import java.awt.*;

public class MensagemRecebida extends Mensagem {

  public MensagemRecebida(String msg, JFrame frame, int lastMsg) {
    super(msg, frame, lastMsg);
  }

  void BalaoMsg() {
    JPanel balaoMsg = new JPanel();
    balaoMsg.setBounds(0, lastMsg, 300, 100);
    Window.lastMsg += 105;
    balaoMsg.setLayout(new BorderLayout());
    balaoMsg.setBackground(new Color(214, 214, 214));
    balaoMsg.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    frame.add(balaoMsg);
    JLabel labelMsg = new JLabel("", SwingConstants.CENTER);
    balaoMsg.add(labelMsg, BorderLayout.CENTER);
    labelMsg.setText(msg);
  }
}