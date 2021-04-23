import java.util.Scanner;

public class loto
{
    public static void main(String[] args) {

        System.out.println ("Поучаствуйте в лотерее!");
        System.out.println ("Введите целое число от 0 до 100");


        int     x   =  0;
        Scanner myscan = new Scanner (System.in);

        x = myscan.nextInt ();

// Если х  меньше 0 ИЛИ x больше 100, то завершаем программу
        if (x < 0 || x > 100)
        {
            System.out.println ("Вы ввели число вне заданных границ!");
        } else if (x == 4)
        {      // иначе если x == 4, это Главный Приз
            System.out.println ("Да, ДЖЭКПОТ, вы выиграли ГЛАВНЫЙ ПРИЗ 1000000 $!.. ");
        } else if (x == 10)
        {      // иначе если x == 10, это просто приз
            System.out.println ("Вам повезло! 100 рублей ваши!");
        } else if (x == 40)
        {     // иначе если x == 40, это просто приз
            System.out.println ("В этот раз мы дадим вам 10 рублей!");
        } else if (x == 89)
        {
            System.out.println ("Ваш приз 1000 рублей!.. ");
        } else
            {
            System.out.println ("Попробуй еще");
        }
    }
}

