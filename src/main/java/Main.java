
public class Main {
    public static void main(String[] args) {
        Contrato contratoCarro = new Contrato(new FabricaCarro());
        System.out.println(contratoCarro.emitirApolice());
        
        Contrato contratoMoto = new Contrato(new FabricaMoto());
        System.out.println(contratoMoto.emitirApolice());
    }
}
