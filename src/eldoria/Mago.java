package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {

    // ============================
    // Construtor
    // ============================
    /**
     * Construtor para criar um Mago.
     *
     * @param nome Nome do mago
     * @param nivel Nível de experiência
     * @param pontosDeVida Pontos de vida (HP)
     * @param poderBase Poder base do mago
     */
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    // ============================
    // Sobrescrita de método abstrato
    // ============================
    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " conjura uma poderosa bola de fogo!");
    }
}
