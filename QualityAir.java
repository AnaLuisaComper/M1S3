package M1S3;

public class QualityAir {
    public static void main(String[] args) {
        Object[][] qualityAir = {
                {"Joinville", 100},
                {"Botuverá", 50},
                {"Curitiba", 110},
                {"São Paulo", 150},
                {"Florianópolis", 99}
        };

        for (Object[] cidade : qualityAir) {
           if (( Integer) cidade[1] > 100){
               System.out.println(cidade[0] + " : " +  cidade[1]);
           }
        }
    }
}
