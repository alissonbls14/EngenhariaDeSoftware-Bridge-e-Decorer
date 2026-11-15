package Bridge;

import Bridge.Abstraction.Notificacao;
import Bridge.Abstraction.NotificacaoCobranca;
import Bridge.Abstraction.NotificacaoSimples;
import Bridge.Abstraction.NotificacaoUrgente;
import Bridge.Model.Email;
import Bridge.Model.SMS;
import Bridge.Model.WhatsApp;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacaoSimples = new NotificacaoSimples(new Email());
        notificacaoSimples.enviar("Esta é uma notificação simples.");

        Notificacao notificacaoUrgente = new NotificacaoUrgente(new SMS());
        notificacaoUrgente.enviar("Esta é uma notificação urgente.");

        Notificacao notificacaoCobranca = new NotificacaoCobranca(new WhatsApp());
        notificacaoCobranca.enviar("Esta é uma notificação de cobrança.");
    }
}
