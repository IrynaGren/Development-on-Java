package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Equipment[] equipments = new Equipment[]{
                new Equipment("Football", 35, 378, "Shields", 20),
                new Equipment("Swimming", 20, 198, "Flippers", 9),
                new Equipment("Basketball", 1500, 20, "Hoop", 35),
                new Equipment("Football", 250, 576, "Boots", 3),
                new Equipment("Powerlifting", 40, 224, "Belt", 10)
        };

        System.out.println("Sport equipment:");
        int parameters_len = equipments.length;

        int variable;
        Equipment equipment;
        for (variable = 0; variable < parameters_len; ++variable) {
            equipment = equipments[variable];
            System.out.println(equipment);
        }

        System.out.println("\n===========================================================================================================\n");
        System.out.println("Sorting by quantity of equipment in the stock:");
        Arrays.sort(equipments, Comparator.comparingInt(Equipment::getStockQuantity));

        for (variable = 0; variable < parameters_len; ++variable) {
            equipment = equipments[variable];
            System.out.println(equipment);
        }

        System.out.println("\n===========================================================================================================\n");
        System.out.println("Reverse sorting by types of sport:");
        Arrays.sort(equipments, (new PurposeComparator()).reversed());

        for (Equipment value : equipments) {
            System.out.println(value);
        }

    }
}
