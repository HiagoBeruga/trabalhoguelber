package trabalhoguelber.Factory;

class FactoryAnimal {
    
        public Animal getAnimal(String nome, boolean botaOvo) {
            if (botaOvo == true)
                return new Ave(nome);
            else if (botaOvo == false)
                return new Mamifero(nome);
        }
    
    
}