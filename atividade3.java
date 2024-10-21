package lista3;
import java.util.Scanner;

public class atividade3 {
    public static void removeItem(String[] array, int posicao) {
        // Verificar se a posição é inválida (fora dos limites do array)
        if (posicao < 0 || posicao >= array.length) {
            System.out.println("Índice fora do limite, não removeu nada.");
            return;
        }

        // Verificar se a posição já está vazia (null)
        if (array[posicao] == null) {
            System.out.println("Nenhum valor foi removido, pois o local já está vazio.");
            return;
        }

        // Remover o item e reposicionar os subsequentes
        for (int i = posicao; i < array.length - 1; i++) {
            array[i] = array[i + 1];  // Puxa o próximo item para a posição atual
        }

        // Definir o último item como null, já que ele foi movido para a esquerda
        array[array.length - 1] = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoArray = 5;  // Definido o tamanho do array como 5

        // Criar o array e perguntar os valores ao usuário
        String[] array = new String[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Digite o valor para a posição " + i + ":");
            array[i] = sc.nextLine();
        }

        // Perguntar qual posição o usuário deseja remover
        System.out.println("Digite a posição que deseja remover (0 a " + (tamanhoArray - 1) + "): ");
        int posicao = sc.nextInt();

        // Remover o item da posição especificada
        removeItem(array, posicao);

        // Exibir o array após a remoção
        System.out.println("Array após a remoção:");
        printArray(array);
    }

    // Função auxiliar para imprimir o array
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
