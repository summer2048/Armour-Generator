public class Intelligence extends ArmourDecorator{
    private String name;
    private int value;
    public Intelligence(ArmourEquipment armourEquipment){
        super(armourEquipment);
        this.name = "Intelligence";
        this.value = 5;
    }

    public String getDescription(){
        return armourEquipment.getDescription() + this.name + " " + this.value + "\n";
    }
}
