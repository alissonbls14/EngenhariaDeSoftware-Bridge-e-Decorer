package Bridge.Abstraction;

import Bridge.Interfaces.CanalNotificacao;

public class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(CanalNotificacao canalNotificacao) {
        super(canalNotificacao);
    }

    @Override
    public void enviar(String mensagem) {
        canalNotificacao.enviar("[NOTIFICAÇÃO URGENTE] " + mensagem);
    }
}
