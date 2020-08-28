package ru.spb.ilyha.algo;

import java.util.Arrays;

/**
 * Класс со вспомогательными методами, которые можно переиспользовать при выполнении заданий на алгоритмы
 **/
public class Helper {

    /**
     * @param array массив для печати
     * @return строковое представление массива с любым разделителем между цифрами
     */
    public static String intArrayToString(int[] array) {
        String arr = Arrays.toString(array);
        return arr;
    }
}