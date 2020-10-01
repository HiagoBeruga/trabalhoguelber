package factory;

public abstract class AnimalF {
    public String nome;
    public boolean botaOvo;
}
    class Ave extends AnimalF {

        public void Ave(String nome) {
            this.nome = nome;
            System.out.print("O animal " + this.nome + " é uma ave!\n");
        }
    }
    
    class Mamifero extends AnimalF {
    
        public void Mamifero(String nome) {
            this.nome = nome;
            System.out.print("O animal " + this.nome + " é um mamífero!\n");
        }
    
}