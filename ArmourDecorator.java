public abstract class ArmourDecorator extends ArmourEquipment {
    protected ArmourEquipment armourEquipment;

    public ArmourDecorator(ArmourEquipment armourEquipment) {
        super();
        this.armourEquipment = armourEquipment;
    }  

    public abstract String getDescription();
}
