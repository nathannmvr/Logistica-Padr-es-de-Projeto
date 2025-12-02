public class Cliente {
    public static void main(String[] args) {
        System.out.println("--- Exemplo de uso do Facade ---");
        OrderFacade facade = new OrderFacade();
        Produto produto = new Produto("Notebook de Última Geração");

        facade.placeOrder(produto);
        System.out.println("---------------------------------");
    }
}