public class Rarity {
    private String name;
    private int modNumber;

    public Rarity(String name, int modNumber){
        this.name = name;
        this.modNumber = modNumber;
    }

    public int getModNumber(){
        return this.modNumber;
    }

    public String getDescription(){
        return this.name;
    }
}
