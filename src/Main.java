/**
 * Created by Алла on 15.08.2018.
 */
public class Main {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        task1.printRange(3,1);
        System.out.println();
        Task2 task2 = new Task2();
        task2.printRange(1,8,3);
        System.out.println();
        Task3 task3 = new Task3();
        task3.printEvenRange(1,7);
        System.out.println();
        Task4 task4 = new Task4();
        System.out.println(task4.factorial(5));
        Task5 task5 = new Task5();
        task5.printFilledMatrix(2,3,4);

    }
}
