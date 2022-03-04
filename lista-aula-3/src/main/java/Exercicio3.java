import java.util.Scanner;
        
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NPA = entrada.nextInt();
        int NP3 = 0;
        int NFA = 0;

        if (NPA >= 60)
            System.out.println("Aprovado");
        else if (NPA >= 30 && NPA < 60) {
            System.out.println("Precisa fazer NP3");
            NP3 = entrada.nextInt();
            NFA = (NPA + NP3)/2;
            if(NFA >=50)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        } else if(NFA < 30)
            System.out.println("Reprovado");
    }
}
