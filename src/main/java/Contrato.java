public class Contrato {
    private Seguro seguro;

    public Contrato(FabricaAbstrata fabricaAbstrata) {
        this.seguro = fabricaAbstrata.criarSeguro();
    }

    public String emitirApolice() {
        return seguro.emitirApolice();
    }

}
