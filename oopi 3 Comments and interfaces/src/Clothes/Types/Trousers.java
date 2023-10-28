package Clothes.Types;

import Clothes.Size;
import Clothes.Color;

import Clothes.MenClothes;
import Clothes.WomenClothes;

public class Trousers extends Clothes implements MenClothes, WomenClothes {
    public Trousers(Size sizeClothing, double priceClothing, Color colorClothing){
        this.size=sizeClothing;
        this.cost=priceClothing;
        this.color=colorClothing;}
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел брюки "+this.color+" цвета, размера - "+ this.size+", цена: "+this.cost);

    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела брюки "+this.color+" цвета, размера - "+ this.size+", цена: "+this.cost);


    }
}
