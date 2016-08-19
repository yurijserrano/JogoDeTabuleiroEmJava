/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author Yuri Serrano
 */
import java.util.Random;

public class Dado 
{
    private int lados;
    
    public int getLados() 
    {
        return lados;
    }

        
    /**
     * Construtor da Classe Dado,que inicializa a váriavel private inteira lados
     * com o conteúdo recebido pelo parâmetro    
     */
    public Dado(int l)
    {
        this.lados=l;
    }
    
    
    /**
     * O método sortear ,faz o sorteoi de um número aleatório na faixa de números
     * que correspondem aos lados do dado.
     * Retorna o valor sorteado.
     */
    public int sortear()
    {
        Random gerador = new Random();
        int numDado=gerador.nextInt(this.lados)+1;
        return numDado;
    }
    
    /**
     * Muda o valor corrente daquele dado.
     */
    public void setLados(int l)
    {
        this.lados=l;
    }
    
    
    /**
     * Função específica para aumentar os lados de um lado.
     */
    public void aumentaNLados(int l)
    {
        this.lados+=l;
    }
    
    /**
     * Função específica para diminuir os lados de um dado.
     */
    public void diminuiNLados(int l)
    {
        this.lados-=l;
    }
    
    
}
