import javax.swing.*;

public abstract class Mensagem {
  String msg;
  int lastMsg;
  JFrame frame;

  public Mensagem(String msg, JFrame frame, int lastMsg) {
    this.msg = msg;
    this.frame = frame;
    this.lastMsg = lastMsg;
    BalaoMsg();
  };

  abstract void BalaoMsg();
}