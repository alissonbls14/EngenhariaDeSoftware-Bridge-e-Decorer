package Bridge.Abstraction;

import Bridge.Interfaces.CanalNotificacao;

public class NotificacaoCobranca extends Notificacao {
    public NotificacaoCobranca(CanalNotificacao canalNotificacao) {
        super(canalNotificacao);
    }

    @Override
    public void enviar(String mensagem) {
        canalNotificacao.enviar("[NOTIFICAÇÃO DE COBRANÇA] " + mensagem);
    }
}