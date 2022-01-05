import java.util.Random;
import java.util.ArrayList;

public class DefaultRaritySpawner implements RarityFactory{

    ArrayList<Rarity> rarities = new ArrayList<Rarity>();
    public Rarity spawnRarity(){
		int i = new Random().nextInt(rarities.size());
		return rarities.get(i);
    }
    public void addRarity(Rarity rarity){
        rarities.add(rarity);
    }

    public DefaultRaritySpawner(){
        addRarity(new Rarity("Common", 0));
        addRarity(new Rarity("Uncommon", 1));
        addRarity(new Rarity("Rare", 2));
        addRarity(new Rarity("Epic", 3));
    }
}