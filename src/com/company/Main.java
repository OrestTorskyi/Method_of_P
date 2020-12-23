package com.company;

import java.util.Scanner;

import tools.CountFunctionValue;
import tools.PrintValues;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------Вхідні дані----------------------------- ");
        System.out.print("Початкове значення інтервалу: ");
        double x_start = sc.nextDouble();
        System.out.print("Кінцеве значення інтервалу: ");
        double x_end = sc.nextDouble();
        System.out.print("Крок: ");
        double h = sc.nextDouble();
        System.out.print("Значення y(x0): ");
        double y_x_start = sc.nextDouble();
        double x[] = new double[(int)(((Math.abs(x_start) + Math.abs(x_end)) / h) + 1)];
        double y[] = new double[x.length];
        double delta_y = 0;
        CountFunctionValue find_delta = new CountFunctionValue();
        PrintValues print = new PrintValues();
        x[0] = x_start;
        y[0] = y_x_start;

        for(int i = 0; i < x.length; i++)
        {
            if(i+1 == x.length)
            {
                break;
            }
            x[i+1] = x[i] + h;
        }

        for(int i = 0; i < y.length; i++)
        {
            if (i+1 == y.length)
            {
                break;
            }
            delta_y = find_delta.countOuterValue(h,x[i],y[i]);
            y[i+1] = y[i] + delta_y;
        }
        System.out.println("Інтервал: [" + x_start + "; " + x_end + "]");
        System.out.println("Y(x0): " + y_x_start);
        System.out.println("Крок: " + h);
        System.out.println("-----------------------------------Results----------------------------------");
        print.printresults(x, "X");
        print.printresults(y,"Y");

    }
}
