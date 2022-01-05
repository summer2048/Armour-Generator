public class ChestPiece extends ArmourEquipment {
    public ChestPiece() {
        super();
        this.name = "ChestPiece";
    }

    public String getDescription(){
        return rarity.getDescription() + " " + this.name + ":\n";
    }
}
