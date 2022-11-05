import java.util.PriorityQueue;
import java.util.Queue;

public class principalPriorityQueue {

    public static void main(String[] args){

        Queue<Object> numeros = new PriorityQueue<>();

        //numeros.offer(9);
        numeros.offer("Hamilton");
        numeros.offer("Gustavo");
        numeros.offer("Ariane");
        numeros.offer("Mariana");
        numeros.offer("Brendo");
        numeros.offer("Gustavo");

        //Imprimir a Fila Atual
        System.out.println("\nFila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        //Remover Elemnto da Fila
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");

        System.out.println("\nFila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        /* 

        System.out.println("Acesso a elemento da Fila Atual: " + numeros.peek() + "\n");

        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        

        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        //Remover Elemnto da Fila
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        //Remover Elemnto da Fila
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        //Remover Elemnto da Fila
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");

        //Remover Elemnto da Fila
        System.out.println("Remove a elemento da Fila Atual: " + numeros.poll() + "\n");
        System.out.println("Fila Atual: INICIO <- " + numeros + " <- FIM" + "\n");
        */

    }




    
}
