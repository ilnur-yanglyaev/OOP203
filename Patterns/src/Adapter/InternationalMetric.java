package Adapter;

public class InternationalMetric implements InternationalMeasurementSystem{
    public double lenght, volume, weight, temp;
    public InternationalMetric(double lenght,double volume, double weight, double temp)
    {
        this.lenght=lenght;
        this.volume=volume;
        this.weight=weight;
        this.temp=temp;
    }


    @Override
    public double getLenght() {
        System.out.print(" in km: "+lenght);
        return lenght;
    }

    @Override
    public double getVolume() {
        System.out.print(" in l: "+volume);
        return volume;
    }

    @Override
    public double getWeight() {
        System.out.print(" in kg: "+weight);
        return weight;
    }

    @Override
    public double getTemperature() {
        System.out.print(" in : °C"+temp);
        return temp;
    }
}
