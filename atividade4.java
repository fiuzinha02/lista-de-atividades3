package lista3;

public class atividade4 {
    public static void removeVazios(String[] array) {
        int posicao = 0; // Posição para inserir o próximo valor não nulo

        // Primeiro loop para mover os valores não nulos para a esquerda
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[posicao] = array[i]; // Coloca o valor na posição correta
                posicao++;
            }
        }

        // Preencher o restante do array com null
        for (int i = posicao; i < array.length; i++) {
            array[i] = null;
        }
    }

    public static void main(String[] args) {
        // Casos de teste
        String[] array1 = {"1", null, "3", "4", "5"};
        String[] array2 = {null, null, null, null, null};
        String[] array3 = {"1", "2", "3", "4", null};
        String[] array4 = {"1", "2", "3", "4", "5"};

        System.out.println("Teste 1: [1, null, 3, 4, 5]");
        removeVazios(array1);
        printArray(array1);

        System.out.println("\nTeste 2: [null, null, null, null, null]");
        removeVazios(array2);
        printArray(array2);

        System.out.println("\nTeste 3: [1, 2, 3, 4, null]");
        removeVazios(array3);
        printArray(array3);

        System.out.println("\nTeste 4: [1, 2, 3, 4, 5]");
        removeVazios(array4);
        printArray(array4);
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

