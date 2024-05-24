public class Pitbull extends Cachorro {
    // Construtor
    public Pitbull(int patas, String corPelo, double peso) {
        super(patas, corPelo, peso);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Pitbull:");
        super.imprimirDados();
    }
}
