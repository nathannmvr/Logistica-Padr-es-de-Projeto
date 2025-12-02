public class ServicoEstoque {
    public boolean isAvailable(Produto product) {
        System.out.println("Verificando estoque para: " + product.name);
        // Lógica de verificação de estoque simulada
        return true;
    }
}