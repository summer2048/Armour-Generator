public class Dexterity extends ArmourDecorator{
    private String name;
    private int value;
    public Dexterity(ArmourEquipment armourEquipment){
        super(armourEquipment);
        this.name = "Dexterity";
        this.value = 5;
    }

    public String getDescription(){
        return armourEquipment.getDescription() + this.name + " " + this.value + "\n";
    }
}
