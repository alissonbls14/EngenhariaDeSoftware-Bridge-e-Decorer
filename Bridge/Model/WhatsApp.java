package Bridge.Model;

import Bridge.Interfaces.CanalNotificacao;
import Bridge.Services.WhatsAppService;

public class WhatsApp implements CanalNotificacao {
    private WhatsAppService whatsAppService;

    public WhatsApp() {
        this.whatsAppService = new WhatsAppService();
    }

    @Override
    public void enviar(String mensagem) {
        whatsAppService.enviarWhatsApp(mensagem);
    }
}
