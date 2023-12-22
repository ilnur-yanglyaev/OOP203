package Adapter;

public class AmericanMeasurementSystemAdapter implements InternationalMeasurementSystem {
    private AmericanMeasurementSystem USAmetric;
    public AmericanMeasurementSystemAdapter(AmericanMeasurementSystem USAmetric)
    {
        this.USAmetric=USAmetric;
    }

    @Override
    public double getLenght() {
        return USAmetric.getLenght()*0.3;               // 1 фут = 30 сантиметров
    }

    @Override
    public double getVolume() {
        return USAmetric.getVolume()*0.473;             // 1 пинта=0.473литра

    }

    @Override
    public double getWeight() {
        return USAmetric.getWeight()*0.453;           //международный фунт (символ lb) равен 0,45359237 кг
    }

    @Override
    public double getTemperature() {
        return USAmetric.getTemperature()*5/9;             //градус Фаренгейта равен 5/9 градуса Цельсия
    }
}
