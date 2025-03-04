package M1S3;

import java.util.ArrayList;
import java.util.Scanner;

public class RecyclableItems {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        ArrayList<String> recyclableItems = new ArrayList<>();

        System.out.println("Digite uma categoria de itens recicláveis: ");
        String strItem1 = input.nextLine();

        System.out.println("Digite mais uma categoria de itens recicláveis: ");
        String strItem2 = input.nextLine();

        System.out.println("Digite a terceira categoria de itens recicláveis: ");
        String strItem3 = input.nextLine();

        System.out.println("Digite a penúltima categoria de itens recicláveis: ");
        String strItem4 = input.nextLine();

        System.out.println("Digite a última categoria de itens recicláveis: ");
        String strItem5 = input.nextLine();

        recyclableItems.add(strItem1);
        recyclableItems.add(strItem2);
        recyclableItems.add(strItem3);
        recyclableItems.add(strItem4);
        recyclableItems.add(strItem5);

        System.out.println(recyclableItems);
    }
}
