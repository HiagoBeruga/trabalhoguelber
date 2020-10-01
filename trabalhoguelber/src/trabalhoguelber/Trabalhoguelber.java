package trabalhoguelber;

import template.AnimalT;
import template.Ave;
import template.Mamifero;

import factory.AnimalF;
import factory.FactoryAnimal;

import strategy.*;

public class Trabalhoguelber {

    public static void main(String[] args) {
        
        //---------------------- Template
        
        System.out.print("Template:\n\n");
        AnimalT porco = new Mamifero();
        porco.criar("sua mãe");
        
        //---------------------- Factory
        
        System.out.print("\n\nFactory:\n\n");
        FactoryAnimal factory = new FactoryAnimal();
	    String nomef = "Periquito";
	    boolean botaOvo = true;
	    factory.getAnimal(nomef, botaOvo);
	
    

    //------------------------ Template
        System.out.print("\n\nStrategy:");
        AnimalStrategy animal = new AnimalStrategy()
            
        
    }
}
