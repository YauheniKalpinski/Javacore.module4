//Оценки
//
//        Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//
//        Удалить неудовлетворительные оценки из списка.
//
//        Выведите на консоль коллекцию.
//
//        Найти самую высокую оценку с использованием итератора.
//
//        Выведите на консоль оценку.



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int studentCount = 30;
        Random random = new Random();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
            marks.add(random.nextInt(11));
        }
        System.out.println(marks);

        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 6) {
                iterator.remove();
            }
        }
        System.out.println("Коллекция после удаления неудолетворительных оценок : " + marks);

        Iterator<Integer> maxMarkIterator  = marks.iterator();
        int maximum = 0;
        while (maxMarkIterator.hasNext()) {
            int current = maxMarkIterator.next();
            if (current > maximum) {
                maximum = current;
            }
        }
        if (marks.isEmpty()) {
            System.out.println("Нету оценок в классе выше 5");
        } else {
            System.out.println("Самая высокая оценка равна: " + maximum);
        }
    }
}