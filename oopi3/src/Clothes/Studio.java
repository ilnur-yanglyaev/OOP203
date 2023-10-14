package Clothes;

import Clothes.Types.Clothes;

import java.util.List;

public class Studio {
    //todo  методы одетьЖенщину, одетьМужчину, на вход
    //которых будет поступать массив, содержащий все типы одежды.

    public double dressMan(List<Clothes> clothesList)
    {
        for(int i=0; i<clothesList.size();i++)
        {
            System.out.println(clothesList.get(i).size+" "+clothesList.get(i).color+" "+clothesList.get(i).cost);
        }
    }

    public double dressWoman(List<Clothes> clothesList)
    {
        for(int i=0; i<clothesList.size();i++)
        {
            System.out.println(clothesList.get(i).size+" "+clothesList.get(i).color+" "+clothesList.get(i).cost);
        }
    }


}
