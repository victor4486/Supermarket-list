package src.animais;

public class gato {
    // atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return this.estadoDeEspirito;
    }

    // métodos
    public void comer() {
        // Implementação do método comer
    }

    public void soar() {
        System.out.println("MIAUUUUUUUUUUU!!!!");
    }

    public String pegar() {
        return "peixe";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carrinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "chutar":
                this.estadoDeEspirito = "puto";
                break;
            case "nada":
                this.estadoDeEspirito = "mlk neutro";
                break;
            default:
                this.estadoDeEspirito = "to de boa";
                break;
        }
        return estadoDeEspirito;
    }
}
