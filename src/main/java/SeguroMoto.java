public class SeguroMoto implements Seguro {
    public String emitirApolice() {
        return "Apólice de seguro de moto emitida.";
    }

    public double calcularPremio() {
        return 500.0;
    }
}
