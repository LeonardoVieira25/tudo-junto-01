public class SeguroCarro implements Seguro {
    public String emitirApolice() {
        return "Apólice de seguro de carro emitida.";
    }

    public double calcularPremio() {
        return 1000.0;
    }
}
