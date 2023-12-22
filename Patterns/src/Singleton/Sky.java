package Singleton;

public class Sky {
    private static Sky instance;
    private Sky()
    {
    }
    public static Sky getInstance()
    {
        if (instance == null)
            instance = new Sky();
        return instance;
    }

}
