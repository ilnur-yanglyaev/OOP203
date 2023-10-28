package Clothes.Types;

import Clothes.Size;
import Clothes.Color;

import Clothes.MenClothes;

public class Tie extends Clothes implements MenClothes  {
    public Tie(Size sizeClothing, double priceClothing, Color colorClothing){
        this.size=sizeClothing;
        this.cost=priceClothing;
        this.color=colorClothing;}

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук "+this.color+" цвета, размера - "+ this.size+", цена: "+this.cost);

    }

}
