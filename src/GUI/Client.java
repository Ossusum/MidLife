package GUI;

import Logic.BattleManager;
import Logic.Entity;
import Logic.Player;

import java.util.ArrayList;

/**
 * Created by Benny on 11/21/2016.
 */
public class Client {
    public static void main(String[] args){
        test();
        //StartGame();
    }
    public static void test(){
        Player player = new Player("ossusum");
        System.out.println(player);

        Entity monster = new Entity("Goblin");
        monster.setHealth(10);
        System.out.println(monster);

        ArrayList<Entity> test = new ArrayList<>();
        test.add(player);
        test.add(monster);

        BattleManager battleManager = new BattleManager(test);
        System.out.println(battleManager);
        battleManager.attack(monster);
        System.out.println(battleManager);
    }
}
