package Adapter;

public class AmericanMetric implements AmericanMeasurementSystem{
    public double lenght, volume, weight, temp;
    public AmericanMetric(double lenght,double volume, double weight, double temp)
    {
        this.lenght=lenght;
        this.volume=volume;
        this.weight=weight;
        this.temp=temp;
    }


    @Override
    public double getLenght() {
        System.out.print(" in fut: "+ lenght);
        return lenght;
    }

    @Override
    public double getVolume() {
        System.out.print(" in pint: "+volume);
        return volume;
    }

    @Override
    public double getWeight() {
        System.out.print(" in funt: "+weight);
        return weight;
    }

    @Override
    public double getTemperature() {
        System.out.print(" in : °F"+temp);
        return temp;
    }
}
