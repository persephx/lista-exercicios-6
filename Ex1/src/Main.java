import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = receber(); // Recebe o valor de x
        int y = receber(); // Recebe o valor de y
        System.out.println("Resultado = " + potenciacao(x, y));
    }

    // FUNÇÕES AQUI:
    static int receber() {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Digite um numero inteiro para 'x':");
        x = in.nextInt();
        do {
            System.out.println("Digite um numero inteiro >= 0 para 'y':");
            y = in.nextInt();
        } while (y < 0);
        return x;
    }

    public static double potenciacao(double base, int expoente) {
        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    }

