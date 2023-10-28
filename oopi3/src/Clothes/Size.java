package Clothes;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if(this.euroSize==32)
            return "Детский размер";
        return "Взрослый размер";
    }

}
