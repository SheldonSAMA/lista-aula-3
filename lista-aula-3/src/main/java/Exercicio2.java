import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] paises = {"Brasil","Russia", "India", "China"};

        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch (paises, "Brasil");
        System.out.println(posicao);
        
        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));
    }
}
