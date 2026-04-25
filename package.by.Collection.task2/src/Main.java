//Удалить дубли
//
//        Создать коллекцию, заполнить ее случайными целыми числами.
//
//        Удалить повторяющиеся числа.
//
//        Выведите на консоль коллекцию.

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List <Integer> numbersCollection = new LinkedList <>();
        Random random = new Random();

        for (int i = 0 ; i < 1000; i++) {
            numbersCollection.add(random.nextInt(30));
        }
        System.out.println(numbersCollection);
        System.out.println("_______");

        Set<Integer> collection = new LinkedHashSet<>(numbersCollection);
        numbersCollection.clear();
        numbersCollection.addAll(collection);
        System.out.println(numbersCollection);


        for (int i = 0; i < numbersCollection.size(); i++) {
            for (int j = i + 1; j < numbersCollection.size(); j++) {
                if (numbersCollection.get(i).equals(numbersCollection.get(j))) {
                    numbersCollection.remove(j);
                    j--;
                }
            }
        }
    }
}