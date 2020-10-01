
package strategy;

public class PetShopStrategy implements AnimalStrategy{
    private final String zootecnico;

    public PetShopStrategy(final String nomeReponsavel){
        this.zootecnico = nomeReponsavel;
    }

    public void consulta(final String nomeAnimal){
        System.out.println("O animal" + nomeAnimal + "foi atendido pelo zootécnico" + zootecnico);
    }

}
    
}
