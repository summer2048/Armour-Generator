import java.util.Random;

public class DefaultSlotSpawner implements SlotFactory{
    public ArmourEquipment spawnSlot(){
        int i = new Random().nextInt(4);
		switch (i){
            case 0:
                return new Helm();
            case 1:
                return new ChestPiece();
            case 2:
                return new Boots();
            case 3:
                return new Gloves();
            default:
                return null;
        }
    }
}
