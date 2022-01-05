public class Helm extends ArmourEquipment {
    public Helm() {
        super();
        this.name = "Helm";
    }

    public String getDescription(){
        return rarity.getDescription() + " " + this.name + ":\n";
    }
}
