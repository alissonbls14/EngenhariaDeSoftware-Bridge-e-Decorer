package Adapter;

public class Main {
    public static void main(String[] args) {
        VendaService service = new VendaService();
        PagamentoExterno externo = new PagamentoExterno();
        
        PagamentoAdapter adapter = new PagamentoAdapter(externo);
        service.realizarVenda(adapter, 10);
        
        PagamentoAVista avista = new PagamentoAVista();
        service.realizarVenda(avista, 10);
    }
}
