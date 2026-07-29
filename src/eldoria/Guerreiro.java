package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {

    // ============================
    // Construtor
    // ============================
    /**
     * Construtor para criar um Guerreiro.
     *
     * @param nome Nome do guerreiro
     * @param nivel Nível de experiência
     * @param pontosDeVida Pontos de vida (HP)
     * @param poderBase Poder base do guerreiro
     */
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // ============================
    // Sobrescrita de método abstrato
    // ============================
    /**
     * Sobrescrita do método usarHabilidade() específica para Guerreiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " desfere um golpe poderoso com a espada!");
    }
}
