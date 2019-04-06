package ru.avalon.java.dev.j10.labs;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String strings[] = new String[20];

            
            for(int i=0; i<strings.length; i++){
                strings[i] = randomString();
            }
            
            for(String string: strings){
                //System.out.println(string);
            }
            Sort sort = new SortClass();
            sort.sort(strings);
            for(String string: strings){
                //System.out.println(string);
            }
            
            
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[20];
            
            for(int i=0; i<persons.length;i++){
                persons[i] = new PersonClass(randomString(), new Date((long) (75599999L + (Math.random() * 1553999999999L))));
            }
            for(Person person : persons){
                System.out.println(person.getName()+" "+ new SimpleDateFormat("yyyy-MM-dd").format(person.getBirthDate()));
            }
            

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        //Sort sort = null;

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = null;

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        //__sort.sort(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        //__sort.sort(strings);
        System.out.print(new SimpleDateFormat("yyyy-MM-dd").format(new Date((long) (75599999L + (Math.random() * 1553999999999L)))));   ///
        System.out.println();
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        //__sort.sort(strings, comparator);
    }
    
    public static String randomString(){
        String string;
        int strLen = 3 + (int)(Math.random() *7); // допустим длина строки от 3 до 10 символов
        string = "";
            for(int j = 0; j<strLen; j++){
            string += Character.toString((char) ((char) 97+(int)(Math.random()*26)));
        };
        return string;
    }
}
