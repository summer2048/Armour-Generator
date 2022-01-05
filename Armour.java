public class Armour {
    private ArmourEquipment armour;
    private RarityFactory rarityFactory;
    private SlotFactory slotFactory;
    private Decorator decorator;

    public Armour(){
        rarityFactory = new DefaultRaritySpawner();
        slotFactory = new DefaultSlotSpawner();
        decorator = new DefaultDecorator();
        this.armour = slotFactory.spawnSlot();
        armour.rarity = rarityFactory.spawnRarity();
    }


    private void setMod(){
        int j = armour.rarity.getModNumber();
        for (int i = 0; i < j; i++){
            this.armour = decorator.decorate(armour);
        }
    }

    public void resetRarityFactory(RarityFactory rarityFactory){
        this.rarityFactory = rarityFactory;
        armour.rarity = rarityFactory.spawnRarity();
    }

    public void resetSlotFactory(SlotFactory slotFactory){
        this.slotFactory = slotFactory;
        this.armour = slotFactory.spawnSlot();
    }

    public void resetDecorator(Decorator decorator){
        this.decorator = decorator;
    }

    public String getDescription(){
        setMod();
        return armour.getDescription();
    }
}
