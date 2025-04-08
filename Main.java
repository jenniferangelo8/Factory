import javax.swing.*;
import mensagem.Mensagem;
import mensagem.MensagemFactory;


public class Main {
    public static void main(String[] args) {
    String texto= JOptionPane.showInputDialog(null, "JENNIFER ANGELO");
    int i = Integer.parseInt(texto);
    Mensagem mf = new MensagemFactory().getMensagem(i);
   mf.enviar(texto);
    }
}