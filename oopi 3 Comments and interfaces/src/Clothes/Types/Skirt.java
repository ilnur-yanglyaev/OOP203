package Clothes.Types;

import Clothes.Size;
import Clothes.Color;

import Clothes.WomenClothes;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size sizeClothing, double priceClothing, Color colorClothing){
        this.size=sizeClothing;
        this.cost=priceClothing;
        this.color=colorClothing;}

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку "+this.color+" цвета, размера - "+ this.size+", цена: "+this.cost);

    }
}
