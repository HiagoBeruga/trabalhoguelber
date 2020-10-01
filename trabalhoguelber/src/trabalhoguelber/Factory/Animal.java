package trabalhoguelber.Factory;

public abstract class Animal {
    public String nome;
    public boolean botaOvo;
}
    class Ave extends Animal {

        public Ave(String nome) {
            this.nome = nome;
            System.out.println("O animal" + this.nome + "é uma ave!");
        }
    }
    
    class Mamifero extends Animal {
    
        public Mamifero(String nome) {
            this.nome = nome;
            System.out.println("O animal" + this.nome + "é um mamífero!");
        }
    
}