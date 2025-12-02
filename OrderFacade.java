public class OrderFacade {
    public void placeOrder(Produto product) {
        System.out.println("Iniciando processo de pedido para: " + product.name);
        
        if (ServicoEstoque.isAvailable(product)) {
            System.out.println("Produto disponível no estoque.");
            
            if (ServicoPagamento.makePayment()) {
                System.out.println("Pagamento realizado com sucesso.");
                ServicoRemessa.shipProduct(product);
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