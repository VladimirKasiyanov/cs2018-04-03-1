package by.it.KasiyanovVladimir.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("DEC:" + number1 + "+" + number2 + "=" + (number1 + number2));

        String BIN1 = Integer.toBinaryString(number1);
        String BIN2 = Integer.toBinaryString(number2);
        String BIN = Integer.toBinaryString(number1 + number2);
        System.out.println("BIN:" + BIN1 + "+" + BIN2 + "=" + BIN);

        String HEX1 = Integer.toHexString(number1);
        String HEX2 = Integer.toHexString(number2);
        String HEX = Integer.toHexString(number1 + number2);
        System.out.println("HEX:" + HEX1 + "+" + HEX2 + "=" + HEX);

        String Octal1 = Integer.toOctalString(number1);
        String Octal2 = Integer.toOctalString(number2);
        String Octal = Integer.toOctalString(number1 + number2);
        System.out.println("OCT:" + Octal1 + "+" + Octal2 + "=" + Octal);


    }

}
