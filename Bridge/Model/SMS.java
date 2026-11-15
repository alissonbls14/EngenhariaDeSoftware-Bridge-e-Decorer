package Bridge.Model;

import Bridge.Interfaces.CanalNotificacao;
import Bridge.Services.SMSService;

public class SMS implements CanalNotificacao {
    private SMSService smsService;

    public SMS() {
        this.smsService = new SMSService();
    }

    @Override
    public void enviar(String mensagem) {
        smsService.enviarSMS(mensagem);
    }
}
