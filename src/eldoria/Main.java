package eldoria;

/**
 * Classe principal que inicia a aplicação.
 * Demonstra a criação de personagens e o uso de polimorfismo.
 */
public class Main {

    /**
     * Método main - ponto de entrada da aplicação.
     * Aqui criamos personagens e mostramos suas habilidades.
     */
    public static void main(String[] args) {

        // Criação de um Mago
        Mago mago = new Mago("Arcanis", 5, 100, 75.5);

        // Criação de um Guerreiro
        Guerreiro guerreiro = new Guerreiro("Thorgar", 7, 150, 90.0);

        // Mensagens iniciais
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");

        // Exibição do Mago e sua habilidade
        System.out.println(mago);
        mago.usarHabilidade();

        // Exibição do Guerreiro e sua habilidade
        System.out.println("\n" + guerreiro);
        guerreiro.usarHabilidade();
    }
}
