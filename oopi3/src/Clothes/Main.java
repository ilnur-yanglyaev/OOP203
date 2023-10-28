package Clothes;

import Clothes.*;
import Clothes.Types.*;

public class Main {
    public static void main(String[] args) {
        //List<Clothes> clothes =new ArrayList<>();
        Clothes[] clothes =new Clothes[5];
        clothes[0] = new TShirt(Size.M, 2990, Color.BLACK);
        clothes[1] = new Trousers(Size.L, 4999,Color.BLACK);
        clothes[2] = new Skirt(Size.S, 13790, Color.BROWN);
        clothes[3] = new Tie(Size.XXS, 600,Color.PURPLE);
        clothes[4] = new TShirt(Size.L, 500,Color.PURPLE);

        Studio atelier = new Studio();
        atelier.dressWoman(clothes);
        atelier.dressMan(clothes);


    }
}