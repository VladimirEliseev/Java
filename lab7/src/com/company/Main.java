package com.company;
import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException {
        ArrayList<Services> array = new ArrayList<Services>();
        array.add(new Wash("Стандартная мойка",300,1,"Автоматичсекая",true,false));
        array.add(new Diagnostic("Диагностика двигателя",2000,10,"Диагностика","Простая",false,"Полная",false,false));
        array.add(new Maintenance("Тех обслуживание",5000,48,"Полная","Средняя",true,"Стандартная",true,5));
        array.add(new Maintenance("Тех обслуживание",2000,48,"Полная","Средняя",true,"Стандартная",true,5));
        FileReader fr = new FileReader("IN.txt");
        Scanner s = new Scanner(fr);

        while (s.hasNextLine())
        {
            String[] str = s.nextLine().split("\t");

            if (str[0].equals("Мойка")){
                array.add(new Wash( str[1],Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4], Boolean.parseBoolean(str[5]), Boolean.parseBoolean(str[6])));
            }

            if (str[0].equals("Диагностика")){
                array.add(new Diagnostic(str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4], str[5],Boolean.parseBoolean(str[6]),str[7], Boolean.parseBoolean(str[8]), Boolean.parseBoolean(str[9])));
            }

            if (str[0].equals("Обслуживание")){
                array.add(new Maintenance(str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4], str[5],Boolean.parseBoolean(str[6]),str[7], Boolean.parseBoolean(str[8]), Integer.parseInt(str[9])));
            }
        }
        fr.close();

        for (int i=0; i<array.size(); i++)
        {
            System.out.print(array.get(i).toString());
            System.out.println(". Зарплата: " + array.get(i).getTotalCast());
        }

        FileWriter fw = new FileWriter("OUT.txt");
        for (int i=0; i<array.size(); i++)
        {
            String str = array.get(i).addTabStr();
            fw.write(str + "\n");
        }
        fw.close();

        System.out.println("Тип Услуги:");
        DynamicArray<String> typeServices = new DynamicArray<String>();
        for (int i=0; i<array.size(); i++) typeServices.Add(array.get(i).getTypeServices());
        System.out.println(typeServices.DifferentItemsWithCount());

        System.out.println("Наименование:");
        DynamicArray<String> name = new DynamicArray<String>();
        for (int i=0; i<array.size(); i++) name.Add(array.get(i).getName());
        System.out.println(name.DifferentItemsWithCount());

        System.out.println("Цена:");
        DynamicArray<Integer> price = new DynamicArray<Integer>();
        for (int i=0; i<array.size(); i++) price.Add(array.get(i).getPrice());
        System.out.println(price.DifferentItemsWithCount());

        System.out.println("Время работы:");
        DynamicArray<Integer> time = new DynamicArray<Integer>();
        for (int i=0; i<array.size(); i++) time.Add(array.get(i).getTime());
        System.out.println(time.DifferentItemsWithCount());
    }
}