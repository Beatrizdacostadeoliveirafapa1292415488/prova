import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char continuar;
        do {
            System.out.println("digite o numero:");
            int num= scanner.nextInt();
            System.out.println("o fatorial de "+num+" é "+fatorial(num));
            System.out.print("digite o proximo fatorial:");
            continuar= scanner.next().charAt(0);
        }
        while (continuar == 'E' || continuar == 'e');
        System.out.println("Fim do programa.");

    }
    public static long fatorial(int num){
        long fato=1;
        for (int i=1;i<=num;i++){
            fato*=i;
        }
        return fato;
    }
}
