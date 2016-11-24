/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais;

import java.util.LinkedList;

/**
 *
 * @author vitormelon
 */
public class No {
    
    public String animalCaracteristica;

    public No(String animalCaracteristica, String animalNome) {
        this.animalCaracteristica = animalCaracteristica;
        this.animalNome = animalNome;
        this.filhos = new LinkedList<>();
    }
    public String animalNome;
    public LinkedList<No> filhos;
    
}
