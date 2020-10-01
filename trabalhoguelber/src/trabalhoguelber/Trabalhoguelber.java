package trabalhoguelber;

import Template.Animal;
import Template.Ave;
import Template.Mamifero;

public class Trabalhoguelber {

    public static void main(String[] args) {
        
        
        Animal porco = new Mamifero();
        porco.criar("sua mãe");

        FactoryAnimal factory = new FactoryAnimal();
		String nome = "Cavalo";
		boolean botaOvo = false;
		factory.getAnimal(nome, botaOvo);
	}
    }
    
}
