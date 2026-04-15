package Lista4_revisão;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia e mês de seu nascimento e informaremos se seu signo é Áries");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a>=21 && a<=31 && b ==3 || a<= 19 && a >=1 && b == 4){
            System.out.println("Seu signo é Áries");
        }
        else {
            System.out.println("Seu signo não é Áries");
        }
    }
}
