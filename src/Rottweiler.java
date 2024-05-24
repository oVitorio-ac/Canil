public class Rottweiler extends Cachorro {
    // Construtor
    public Rottweiler(int patas, String corPelo, double peso) {
        super(patas, corPelo, peso);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Rottweiler:");
        super.imprimirDados();
    }
}
