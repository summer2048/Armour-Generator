public class Strength extends ArmourDecorator{
    private String name;
    private int value;
    public Strength(ArmourEquipment armourEquipment){
        super(armourEquipment);
        this.name = "Strength";
        this.value = 5;
    }

    public String getDescription(){
        return armourEquipment.getDescription() + this.name + " " + this.value + "\n";
    }
}
