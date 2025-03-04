package M1S3;

import java.util.ArrayList;

public class ControlEnergyConsumption {
    public static void main(String[] args) {
        ArrayList<Integer> consumption = new ArrayList<>();

        consumption.add(0, 180);
        consumption.add(1, 200);
        consumption.add(2, 220);
        consumption.add(3, 190 );
        consumption.add(4, 230);
        consumption.add(5, 190);
        consumption.add(6, 220);
        consumption.add(7, 160);
        consumption.add(8, 250);
        consumption.add(9, 170);
        consumption.add(10, 175);
        consumption.add(11, 160);
        consumption.add(12, 190);

        int somaConsumption = 0;
        int resultado = 0;

        int i;
        for (i = 0; i <= 12; i++) {
            somaConsumption += consumption.get(i);
        }
        resultado = somaConsumption / 12;

        System.out.println("O consumo considerado sustentável é 200 kWh por mês. " +
                "A média de consumo da sua casa é de " + resultado + "kWh por mês.");
    }
}
