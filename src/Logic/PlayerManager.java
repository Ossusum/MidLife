package Logic;

/**
 * Created by Benny on 11/20/2016.
 */
public class PlayerManager {
    private Player player;

    public PlayerManager(Player player){
        this.player = player;
    }
    //is opponent dead?
    public void attack(Entity entity){
        double attack = player.getAttack();
        int oppHealth = entity.getHealth();
        //Temp algorthim, basic for now
        entity.setHealth(oppHealth - (int) attack);
        if (entity.getHealth() <= 0 )
            player.setDead(true);
    }
}
