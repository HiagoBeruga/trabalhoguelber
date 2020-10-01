package factory;
import factory.AnimalF;

public class FactoryAnimal {
    
        public void getAnimal(String nome, boolean botaOvo) {
            if (botaOvo == true){
                Ave a = new Ave();
                a.Ave(nome);}
            else{
                Mamifero m = new Mamifero();
                m.Mamifero(nome);
            }
        }
    
    
}