package mensagem;

import javax.swing.*;

public class MensagemEmail implements Mensagem {

    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null,"E-mail: socorro");

    }
}
