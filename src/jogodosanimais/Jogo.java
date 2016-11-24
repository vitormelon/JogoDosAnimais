/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitormelon
 */
public class Jogo {

    private No noInicial;
    private No animalAtual;
    private int indice;

    public Jogo() {
        
        No tubarao = new No("vive na água", "Tubarão");
        No macaco = new No("", "Macaco");
        macaco.filhos.add(tubarao);
        this.noInicial = macaco;
    }

    public void Iniciar() {
        this.animalAtual = this.noInicial;
        this.indice = 0;
        gerarPergunta();
    }

    public void gerarPergunta() {
        if (this.animalAtual.filhos.size() == this.indice) {
            String pergunta = "O animal que você pensou é " + this.animalAtual.animalNome + "?";
            int resultadoPergunta = JOptionPane.showConfirmDialog(null, pergunta, "Confirm", JOptionPane.YES_NO_OPTION);
            if (resultadoPergunta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogodosanimais", JOptionPane.INFORMATION_MESSAGE);
            } else {
                incluirNovo();
            }
        } else {
            String pergunta = "O animal que você pensou " + this.animalAtual.filhos.get(this.indice).animalCaracteristica + "?";
            int resultadoPergunta = JOptionPane.showConfirmDialog(null, pergunta, "Confirm", JOptionPane.YES_NO_OPTION);
            if (resultadoPergunta == JOptionPane.YES_OPTION) {
                this.animalAtual = this.animalAtual.filhos.get(this.indice);
                this.indice = 0;
            } else {
                this.indice++;
            }
            gerarPergunta();
        }
    }

    public void incluirNovo() {
        String animalNome = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
        String animalCaracteristica = JOptionPane.showInputDialog(null, "Um(a) " + animalNome + "________ mas um(a) " + this.animalAtual.animalNome + " não");
        No novoAnimal = new No(animalCaracteristica, animalNome);
        this.animalAtual.filhos.add(novoAnimal);
        
    }

}
