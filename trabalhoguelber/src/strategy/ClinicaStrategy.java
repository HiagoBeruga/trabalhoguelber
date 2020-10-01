
package strategy;

public class ClinicaStrategy implements AnimalStrategy{
    private String medicoVeterinario;

    public ClinicaStrategy(String nomeReponsavel){
        this.medicoVeterinario = nomeReponsavel;
    }

    public void consulta(String nomeAnimal){
        System.out.println("O animal" + nomeAnimal + "foi atendido pelo médico veterinario" + medicoVeterinario);
    }

}
