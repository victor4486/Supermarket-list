package src;

import src.animais.Cachorro;

public class Main {
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
        System.out.println("Au Au!!!!");
    }

    public String pegar() {
        return "Bolinha";
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

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Puppy");
        cachorro1.setCor("Marron");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

        cachorro1.soar();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está: " + cachorro1.interagir("nada"));
    }
}
