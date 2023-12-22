package Adapter;

public class InternationalMeasurementSystemAdapter implements AmericanMeasurementSystem{
   private InternationalMeasurementSystem INTmetric;

    public InternationalMeasurementSystemAdapter (InternationalMeasurementSystem INTmetric) {
        this.INTmetric=INTmetric;
    }

    @Override
    public double getLenght() {
        return INTmetric.getLenght()/0.3;
    }

    @Override
    public double getVolume() {
        return INTmetric.getVolume()/0.473;
    }

    @Override
    public double getWeight() {
        return INTmetric.getWeight()/0.453;
    }

    @Override
    public double getTemperature() {
        return INTmetric.getTemperature()*9/5;
    }
}
