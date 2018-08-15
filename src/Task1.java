/**
 *Вывод на экран целых чисел от first до last.
 void printRange(int first, int last)
 Входные аргументы	Тип результата
 int first, int last	Вывод на экран
 Пример
 Входные аргументы	Результат
 1, 5	             1 2 3 4 5
 5, 1	              5 4 3 2 1
 1, 1	              1

 */
public class Task1 {
    void printRange(int first, int last){
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");

            }
        } else if (first == last) {
            System.out.print(first);
        } else {
            for (int i = first; i >= last; i--) {
                System.out.print(i + " ");

            }
    }
}
}