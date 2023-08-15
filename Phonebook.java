package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Map<Integer, String> my_phone = new HashMap<>();
        Boolean flag_0 = true;
        while (flag_0) {            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Меню: ");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Вывести всех");
            System.out.println("3. Выход");
            System.out.println("");
            System.out.println("Выберите пункт: ");
            Integer sc = scanner.nextInt();            
            Boolean flag = true;
            if (sc == 1){
                while (flag) {
                    System.out.println("Введите имя контакта: ");
                    String name = scanner.next();                
                    System.out.println("Введите номер контакта: ");
                    Integer number = scanner.nextInt();                    
                    my_phone.put(number, name);
                    System.out.println("Добавить еще контакт? (1 - ДА, 2- НЕТ.ВЕРНУТЬСЯ В ОСНОВНОЕ МЕНЮ) ");
                    Integer answer = scanner.nextInt();
                    if (answer != 1){
                        flag = false;
                    }
                }               
            }
            if (sc == 2){
                HashMap<String, String> str_1 = new HashMap<>();
                System.out.println("Список всех контактов:");                
                for (var item : my_phone.entrySet()) {
                    if (str_1.containsKey(item.getValue())){
                        str_1.put(item.getValue(), str_1.get(item.getValue()) + ", " + item.getKey());
                    }
                    else{
                        str_1.put(item.getValue(), item.getKey().toString());
                    }                            
                }                
                for (var item : str_1.entrySet()) {
                    System.out.printf("%s [%s]\n", item.getKey(), item.getValue());              
                }
                System.out.println("Вернуться в основное меню? (1 - ДА, 2- НЕТ.ЗАВЕРШИТЬ ПРОГРАММУ) ");
                Integer answer_2 = scanner.nextInt();
                if (answer_2 == 1){
                        flag = false;
                } else {
                    System.out.println("Работа программы завершена.");
                    flag_0 = false;
                }
            }
            if (sc == 3){                
                System.out.println("Вы уверены, что хотите выйти из программы? (1 - ДА, 2- НЕТ.ПРОДОЛЖИТЬ РАБОТУ) ");
                Integer answer_3 = scanner.nextInt();
                if (answer_3 != 1){
                        flag = false;
                } else {
                    flag_0 = false;
                    System.out.println("Работа программы завершена.");
                }
            }
        }
    
    }
}    

