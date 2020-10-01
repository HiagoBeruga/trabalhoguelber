package trabalhoguelber;


public class Trabalhoguelber {

    public static void main(String[] args) {

        FactoryAnimal factory = new FactoryAnimal();
		String nome = "Cavalo";
		boolean botaOvo = false;
		factory.getAnimal(nome, botaOvo);
	}
    }
    
}
