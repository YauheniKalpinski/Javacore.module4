//Игрушки
//
//  Создайте класс Toy с полями: название игрушки, с какого возраста, цена
//  Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
//  Перебрать и распечатать пары значений - entrySet()
//  Перебрать и распечатать набор из имен продуктов  - keySet()
//  Перебрать и распечатать значения продуктов - values()


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Toy legoToy = new Toy("lego", 12, new BigDecimal("19.99"));
        Toy bburagoToy = new Toy("bburago", 6, new BigDecimal("9.99"));
        Toy waterGunToy = new Toy("waterGun", 4, new BigDecimal("5"));
        Toy trainToy = new Toy("train", 7, new BigDecimal("3"));
        Toy petardsToy = new Toy("petards", 16, new BigDecimal("21.99"));

        Map<String, Toy> toysMap = new HashMap<>();
        toysMap.put("Lego", legoToy);
        toysMap.put("Bburago", bburagoToy);
        toysMap.put("WaterGun", waterGunToy);
        toysMap.put("Train", trainToy);
        toysMap.put("Petards", petardsToy);

        for (Map.Entry<String, Toy> item : toysMap.entrySet()) {
            System.out.println("Key is: " + item.getKey() + " Value is: " + item.getValue());
        }
        System.out.println("_______");

        for (String item : toysMap.keySet()) {
            System.out.println(item);
        }
        System.out.println("_______");

        for (Toy item : toysMap.values()) {
            System.out.println(item);
        }
    }
}