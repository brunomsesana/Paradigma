import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Window {
    JFrame frame;
    static int lastMsg;
    private int quantMsg;

    Window(JFrame frame) {
        this.frame = frame;
        frame.setSize(400, 800);
        frame.setLayout(null);
    }

    JTextField CampoTexto() {
        JTextField campoMsg = new JTextField();
        campoMsg.setBounds(50, 650, 300, 30);
        frame.add(campoMsg);
        return campoMsg;
    }

    void Botao(JTextField campoMsg) {
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(150, 700, 100, 30);
        frame.add(botaoEnviar);
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagem = campoMsg.getText();
                new MensagemEnviada(mensagem, frame, lastMsg);
                campoMsg.setText("");
                try {
                    File soundFile = new File("enviada.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ev) {
                    ev.printStackTrace();
                }
                ReceberMsg(frame);
            }
        });
    }

    String gerarMensagem(int quantMsg) {
        if (quantMsg == 0) {
            return "Olá, tudo bem?";
        } else if (quantMsg == 1) {
            return "Que bom, também estou bem!";
        } else {
            return "Entendi, conte me mais";
        }
    }

    void ReceberMsg(JFrame frame) {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MensagemRecebida(gerarMensagem(quantMsg), frame, lastMsg);
                quantMsg++;
                try {
                    File soundFile = new File("notificacao.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ev) {
                    ev.printStackTrace();
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}