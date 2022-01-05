import java.util.Random;

public class DefaultDecorator implements Decorator{
    public ArmourDecorator decorate(ArmourEquipment armourEquipment){
        int rand = new Random().nextInt(3);
        switch (rand){
            case 0: return new Strength(armourEquipment);
            case 1: return new Intelligence(armourEquipment);
            case 2: return new Dexterity(armourEquipment);
            default: return null;
        }
    }
}
