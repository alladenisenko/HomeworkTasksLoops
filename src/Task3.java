/**
 Вывод на экран чётных чисел от first до last. Если first > last, ничего не выводить.
 */
public class Task3 {
    void printEvenRange(int first, int last){
        if (first < last) {
            for (int i = first; i < last; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
    }
}
}