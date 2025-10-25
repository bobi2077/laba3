package main;

import java.util.Arrays;
import java.util.Comparator;

public class NpcManager {
    public static void main(String[] args) {

        Npc[] npcs = {
                new Npc("Грорг", 150, 8, "Коваль", false),
                new Npc("Елара", 60, 10, "Маг", false),
                new Npc("Зорг", 100, 7, "Бандит", true),
                new Npc("Фіп", 30, 2, "Торговець", false),
                new Npc("Валеріус", 120, 7, "Охоронець", false)
        };

        System.out.println("--- Початковий масив NPC ---");
        printNpcArray(npcs);

        Arrays.sort(npcs, Comparator.comparingInt(Npc::getLevel));

        System.out.println("\n--- Масив, відсортований за РІВНЕМ (за зростанням) ---");
        printNpcArray(npcs);

        Comparator<Npc> healthComparator = Comparator.comparingInt(Npc::getHealth);
        Arrays.sort(npcs, healthComparator.reversed());

        System.out.println("\n--- Масив, відсортований за ЗДОРОВ'ЯМ (за спаданням) ---");
        printNpcArray(npcs);

        Npc targetNpc = new Npc("Зорг", 100, 7, "Бандит", true);

        System.out.println("\n--- Пошук ідентичного об'єкта: " + targetNpc + " ---");

        boolean isFound = false;
        int foundIndex = -1;

        for (int i = 0; i < npcs.length; i++) {
            if (npcs[i].equals(targetNpc)) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }


        if (isFound) {
            System.out.println("Результат: Об'єкт знайдено в масиві на позиції (індекс): " + foundIndex);
        } else {
            System.out.println("Результат: Заданий об'єкт в масиві не знайдено.");
        }
    }


    private static void printNpcArray(Npc[] array) {
        for (Npc npc : array) {
            System.out.println(npc);
        }
    }
}
