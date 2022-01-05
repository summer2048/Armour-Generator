public class Gloves extends ArmourEquipment {
    public Gloves() {
        super();
        this.name = "Gloves";
    }

    public String getDescription(){
        return rarity.getDescription() + " " + this.name + ":\n";
    }
}
