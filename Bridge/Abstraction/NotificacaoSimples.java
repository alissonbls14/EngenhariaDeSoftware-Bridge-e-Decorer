package Bridge.Abstraction;

import Bridge.Interfaces.CanalNotificacao;

public class NotificacaoSimples extends Notificacao {
    public NotificacaoSimples(CanalNotificacao canalNotificacao) {
        super(canalNotificacao);
    }

    @Override
    public void enviar(String mensagem) {
        canalNotificacao.enviar("[NOTIFICAÇÃO SIMPLES] " + mensagem);
    }
}
