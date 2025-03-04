package M1S3;

import java.util.Arrays;
import java.util.Scanner;

public class VerificationSpecies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String species = Arrays.toString(new String[]{"jaguatirica", "onça pintada", "tamanduá", "macaco-prego", "lobo-guará"});

        System.out.println("Digite um espécie em risco de extinção no sul do Brasil:");
        String strAnimalUsuario = input.nextLine();

        if (species.contains(strAnimalUsuario)) {
            System.out.println("Sim, essa espécie está em extinção.");
        } else {
            System.out.println("Não está em extinção.");
        }
    }
}


