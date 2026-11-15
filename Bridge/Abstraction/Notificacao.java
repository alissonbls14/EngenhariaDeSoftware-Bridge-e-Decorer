package Bridge.Abstraction;

import Bridge.Interfaces.CanalNotificacao;

public abstract class Notificacao {
    protected CanalNotificacao canalNotificacao;

    public Notificacao(CanalNotificacao canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public abstract void enviar(String mensagem);
}