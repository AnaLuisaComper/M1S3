package M1S3;

public class TempMedFlorest {
    public static void main(String[] args) {
        int[] temperaturas = {29, 28, 30, 32, 27, 30, 25};
        int somaTemp = 0;

        int resultado = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            somaTemp += temperaturas[i];
            int result = somaTemp;
            resultado = somaTemp / 7;
        }
        System.out.println(resultado);
    }}
