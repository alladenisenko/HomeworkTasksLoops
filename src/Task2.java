/**
 * Вывод на экран целых чисел от first до last c шагом step. Если вывод может привести к зацикливанию, бросить исключение IllegalArgumentException.
 void printRange(int first, int last, int step)
 Входные аргументы	Тип результата
 int first, int last, int step	Вывод на экран
 Пример
 Входные аргументы	Результат
 1, 8, 2	         1 3 5 7
 8, 1, -2	          8 6 4 2
 1, 8, -2	          IllegalArgumentException

 */
public class Task2 {

    void printRange(int first, int last, int step){
        if ( step > 0) {
            if (first > last) {
                for (int i = first; i >= last; i -= step) {
                    System.out.print(" " + i);
                }
            } else if (last > first) {
                for (int i = first; i <= last; i += step) {
                    System.out.print(" " + i);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
