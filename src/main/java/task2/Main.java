package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько раз в неделю выпиваете?");
        int N = console.nextInt();
        System.out.println("В каких количествах (литрах) за раз");
        int Liters = console.nextInt();
        int sum=0;
        if ((N<0)||(Liters<0))
            System.out.println("Введены некорректные данные");
        else{
            //семестр состоит из 16 недель
            for(int i = 1; i < 17; i++) {
                sum+=N*Liters;
                System.out.println("К "+i+" неделе будет выпито "+sum+" литров жидкости");
            }
            if (sum>=120)
                System.out.println("Студент принят в IT-клуб");
            else
                System.out.println("К сожалению, студент не принят в клуб");
        }
    }
}
