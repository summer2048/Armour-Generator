public class Boots extends ArmourEquipment {
    public Boots() {
        super();
        this.name = "Boots";
    }

    public String getDescription(){
        return rarity.getDescription() + " " + this.name + ":\n";
    }
}
