public class FabricaCarro implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return new SeguroCarro();
    }
}
