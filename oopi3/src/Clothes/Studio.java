package Clothes;
import Clothes.Types.Clothes;

public class Studio {
    public void dressMan(Clothes[] clothesList)
    {
        System.out.println("Одежда для женщин:");
        for(int i=0; i<clothesList.length;i++)
        {
            if (clothesList[i] instanceof WomenClothes) {
               ((WomenClothes) clothesList[i]).dressWoman();
              }
        } System.out.println();
    }

    public void dressWoman(Clothes[] clothesList)
    {
        System.out.println("Одежда для мужчин:");
        for(int i=0; i<clothesList.length;i++)
        {
            if (clothesList[i] instanceof MenClothes) {
               ((MenClothes) clothesList[i]).dressMan();
            }
        }System.out.println();
    }


}
