/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author Hiagones
 */
public abstract class Animal{
    private String nome = "";
    
    private void comer(){
        System.out.print(nome + " está comendo...\n");
    }
    private void cagar(){
        System.out.print(nome + " está cagando...\n");
    }
    protected abstract void reproduzir(String a);
    
    public void criar(String a){
        this.nome = a;
        comer();
        cagar();
        reproduzir(nome);
    }
}
