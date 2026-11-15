package Bridge.Model;

import Bridge.Interfaces.CanalNotificacao;
import Bridge.Services.EmailService;

public class Email implements CanalNotificacao {
    private EmailService emailService;

    public Email() {
        this.emailService = new EmailService();
    }

    @Override
    public void enviar(String mensagem) {
        emailService.enviarEmail(mensagem);
    }
}