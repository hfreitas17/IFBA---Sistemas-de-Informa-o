import java.util.PriorityQueue;
import java.util.Queue;

public class principalPriorityQueue {

    public static void main(String[] args){
        //Queue<Integer> numeros = new PriorityQueue<>(new CustomComparator());
        Queue<Object> numeros = new PriorityQueue<>();

        //numeros.offer(9);
        numeros.offer("Hamilton");
        numeros.offer("Gustavo");
        numeros.offer("Ariane");
        numeros.offer("Mariana");
        numeros.offer("Brendo");
        numeros.offer("Gustavo");
        
        /*
        numeros.offer(9);
        numeros.offer(8);
        numeros.offer(7);
        numeros.offer(10);
        numeros.offer(22);
        numeros.offer(16);
        numeros.offer(0);
        numeros.offer(1);
        numeros.offer(2);
        numeros.offer(3);
        numeros.offer(4);
        numeros.offer(5);
        numeros.offer(6);       
        */
        

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

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // os elementos são ordenados na ordem inversa
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
