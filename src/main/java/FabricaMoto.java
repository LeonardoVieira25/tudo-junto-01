public class FabricaMoto implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return new SeguroMoto();
    }
}
