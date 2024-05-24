public class Cachorro {
    // Atributos
    private int patas;
    private String corPelo;
    private double peso;

    // Construtor
    public Cachorro(int patas, String corPelo, double peso) {
        this.patas = patas;
        this.corPelo = corPelo;
        this.peso = peso;
    }

    // Getters e Setters
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para comer
    public void comer(double quantidadeRacao) {
        this.peso += (quantidadeRacao / 500) * 250;
    }

    // Método para impressão dos dados
    public void imprimirDados() {
        System.out.println("Patas: " + patas);
        System.out.println("Cor do Pelo: " + corPelo);
        System.out.println("Peso: " + peso + " kg");
    }
}
