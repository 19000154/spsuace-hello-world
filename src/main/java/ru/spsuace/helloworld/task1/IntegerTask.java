package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum = sum + i + 1;
        return sum;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int snake = 1;
        if (top > bottom) {
            for (int i = top; i < height; i = i + top) {
                snake++;
                if (i < height) {
                    i = i - bottom;
                } else {
                    return snake;
                }
            }
        }
        if (top >= height) {
            return 1;
        }
        if (top <= bottom && top < height) {
            return (Integer.MAX_VALUE);
        }
        return snake;
    }


    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        if (n < 0) {
            n = n * (-1);
        }
        int kDecimal;
        kDecimal = (int) ((n % Math.pow(10, order) - n % Math.pow(10, order - 1)) / Math.pow(10, order - 1));
        return kDecimal;
    }

    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial = factorial * i;
        return factorial;
    }
}
