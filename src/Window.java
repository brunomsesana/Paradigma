import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Window {
    JFrame frame;
    int lastMsg;
    int quantMsg;
    Window(JFrame frame){
        this.frame = frame;
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    JTextField CampoTexto(){
        JTextField campoMsg = new JTextField();
        campoMsg.setBounds(50, 650, 300, 30);
        frame.add(campoMsg);
        return campoMsg;
    }

    void BalaoMsg(String msg, int user){
        JPanel balaoMsg = new JPanel();
        int pos;
        Color cor;
        if (user == 0){
            pos = 100;
            cor = new Color(170, 212, 148);
        } else {
            pos = 0;
            cor = new Color(214, 214, 214);
        }
        balaoMsg.setBounds(pos, lastMsg, 300, 100);
        lastMsg += 105;
        balaoMsg.setLayout(new BorderLayout());
        balaoMsg.setBackground(cor);
        balaoMsg.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        frame.add(balaoMsg);
        JLabel labelMsg = new JLabel("", SwingConstants.CENTER);
        balaoMsg.add(labelMsg, BorderLayout.CENTER);
        labelMsg.setText(msg);
    }

    void Botao(JTextField campoMsg){
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(150, 700, 100, 30);
        frame.add(botaoEnviar);
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagem = campoMsg.getText();
                BalaoMsg(mensagem, 0);
                campoMsg.setText("");
                try{
                    File soundFile = new File("enviada.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ev){
                    ev.printStackTrace();
                }
                ReceberMsg();
            }
        });
    }

    void ReceberMsg(){
        String msg;
        if (quantMsg == 0){
            msg = "Olá, tudo bem?";
        } else if (quantMsg == 1) {
            msg = "Que bom, também estou bem!";
        } else {
            msg = "Entendi, conte me mais";
        }
        quantMsg++;
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                BalaoMsg(msg, 1);    
                try{
                    File soundFile = new File("notificacao.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ev){
                    ev.printStackTrace();
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}
