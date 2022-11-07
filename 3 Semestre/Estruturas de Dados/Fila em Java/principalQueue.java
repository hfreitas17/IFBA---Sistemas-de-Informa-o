/*
Trabalho Em Grupo de Estrutura de Dados 1° Unidade - Grupo I
Professor: Cláudio Rodolfo Sousa de Oliveira
Alunos:
- Gabriela
- Gustavo Everton
- Ariane
- Mariana
- Brendo
- Hamilton
*/

import java.util.LinkedList;
import java.util.Queue;

public class principalQueue {

    
    public static void main(String[] args) {

        Queue<Object> filaDePessoas = new LinkedList<>();

        //---- Metodo ADD() usado para adicionar elementos na Fila ----
        filaDePessoas.add("Gabriela");
        filaDePessoas.add("Gustavo");
        filaDePessoas.add("Ariane") ;
        filaDePessoas.add("Mariana");
        filaDePessoas.add("Brendo");
        filaDePessoas.add("Hamilton");

        //Imprimir a Fila Atual
        System.out.println("\n\nFila Atual: INICIO <- " + filaDePessoas + " <- FIM" + "\n");

        //---- Metodo SIZE() usado para retornar o tamanho (Quantidade de elementos) da Fila ----
        System.out.println("Tamanho da Fila Atual: " + filaDePessoas.size() + "\n");

        //---- Metodo PEEK() usado para consulta o elemento que esta no Inicio da Fila sem remover ----
        System.out.println("Quem esta no Inicio da Fila Atual: " + filaDePessoas.peek() + "\n");

        //---- Metodo POLL() usado para remover o elemento que esta no Inicio da Fila ----
        System.out.println("Remover quem esta no Inicio da Fila: " + filaDePessoas.poll() + "\n");

        //----Imprimir a Fila e o Tamanho----
        System.out.println("Fila Após remover o primeiro elemento: " + filaDePessoas + " Tamanho: " + filaDePessoas.size() + "\n");

        //---- Metodo Buscar um Elemento na Fila ----
        System.out.println("Hamilton esta na Fila? " + filaDePessoas + " Tamanho: " + filaDePessoas.size() + "\n");

        //---- Pecorrer toda a Fila listando os elementos sem Remover ----
        for( Object nome: filaDePessoas){
            System.out.println(nome);
        }   
        
        System.out.println("Remove " + filaDePessoas.remove());
        System.out.println("\n\nFila Atual: INICIO <- " + filaDePessoas + " <- FIM" + "\n");
        
        //---- Pesquisa Elemento na Fila
        System.out.println("\n\nEsta na fila? " + filaDePessoas.contains("Jose") + "\n");

        System.out.println("\n\n");        

    }

}
