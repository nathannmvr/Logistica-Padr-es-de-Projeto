public class OrderFacade {
    private ServicoEstoque servicoEstoque;
    private ServicoPagamento servicoPagamento;
    private ServicoRemessa servicoRemessa;

    public OrderFacade() {
        this.servicoEstoque = new ServicoEstoque();
        this.servicoPagamento = new ServicoPagamento();
        this.servicoRemessa = new ServicoRemessa();
    }

    public void placeOrder(Produto product) {
        System.out.println("Iniciando processo de pedido para: " + product.name);
        
        if (servicoEstoque.isAvailable(product)) {
            System.out.println("Produto disponível no estoque.");
            
            if (servicoPagamento.makePayment()) {
                System.out.println("Pagamento realizado com sucesso.");
                servicoRemessa.shipProduct(product);
                System.out.println("Produto enviado.");
                System.out.println("Pedido finalizado com sucesso!");
            } else {
                System.out.println("Falha no pagamento. Pedido não finalizado.");
            }
        } else {
            System.out.println("Produto indisponível no estoque. Pedido não finalizado.");
        }
    }
}