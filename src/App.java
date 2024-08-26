import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        Window wind = new Window(new JFrame("Mensagem"));
        JTextField campoMsg = wind.CampoTexto();
        wind.Botao(campoMsg);
        wind.frame.setVisible(true);
    }
}
