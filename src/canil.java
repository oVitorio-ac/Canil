public class canil {
    public static void main(String[] args) {
        // Criando um Rottweiler
        Rottweiler rottweiler = new Rottweiler(4, "Preto e Marrom", 30.0);
        rottweiler.imprimirDados();
        rottweiler.comer(1000); // Comendo 1kg de ração
        rottweiler.imprimirDados();

        // Criando um Pitbull
        Pitbull pitbull = new Pitbull(4, "Branco", 25.0);
        pitbull.imprimirDados();
        pitbull.comer(500); // Comendo 500g de ração
        pitbull.imprimirDados();
    }
}
