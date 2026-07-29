package eldoria;

/**
 * Classe abstrata que representa um Personagem no reino de Eldoria.
 * Serve como base para classes específicas como Mago e Guerreiro.
 * Demonstra conceitos de herança, encapsulamento e polimorfismo.
 */
public abstract class Personagem {

    // ============================
    // Atributos privados (encapsulados)
    // ============================
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // ============================
    // Construtor
    // ============================
    /**
     * Construtor para inicializar os atributos de um personagem.
     *
     * @param nome Nome do personagem
     * @param classe Classe do personagem (ex: Mago, Guerreiro)
     * @param nivel Nível de experiência
     * @param pontosDeVida Pontos de vida (HP)
     * @param poderBase Poder base do personagem
     */
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // ============================
    // Getters e Setters
    // ============================
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPontosDeVida() { return pontosDeVida; }
    public void setPontosDeVida(int pontosDeVida) { this.pontosDeVida = pontosDeVida; }

    public double getPoderBase() { return poderBase; }
    public void setPoderBase(double poderBase) { this.poderBase = poderBase; }

    // ============================
    // Método abstrato
    // ============================
    /**
     * Método abstrato que será implementado pelas subclasses.
     * Cada personagem terá sua própria habilidade especial.
     */
    public abstract void usarHabilidade();

    // ============================
    // Sobrescrita de métodos da classe Object
    // ============================
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "Nível: " + nivel + "\n" +
               "Pontos de Vida: " + pontosDeVida + "\n" +
               "Poder Base: " + poderBase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mesmo objeto
        if (!(obj instanceof Personagem)) return false; // não é um Personagem
        Personagem outro = (Personagem) obj;
        return nome.equals(outro.nome) && classe.equals(outro.classe);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + classe.hashCode();
    }
}
