package lista3;
import java.util.Scanner;

public class atividade2 {
    public static void tiraoPrimeiro(String[] array) {
        array[0] = null;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5;

        String[] array = new String[n];

        for (int i = 0; i < n ; i++ ) {
            System.out.println("Digite o nome do aluno "+ (i+1)+": ");
            array [i] = sc.nextLine();
        }
        System.out.println("Antes de tirar");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println(" ");

        tiraoPrimeiro(array);
        System.out.println("Depois de tirar");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
