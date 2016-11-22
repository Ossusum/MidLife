package GUI;

import Logic.BattleManager;
import Logic.Entity;
import Logic.Player;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Benny on 11/21/2016.
 */
public class Client {

    public static void main(String[] args){
        test();
        //StartGame();
    }
    public static void test(){
        Scanner scan = new Scanner(System.in);
        Player player = new Player("Ossusum");
        System.out.println(player);

        Entity monster = new Entity("Goblin");
        monster.setHealth(250);
        System.out.println(monster);

        Entity second = new Entity("Ogre");
        second.setHealth(250);
        System.out.println(second);

        ArrayList<Entity> test = new ArrayList<>();
        test.add(player);
        test.add(monster);
        test.add(second);

        BattleManager battleManager = new BattleManager(test);
        while(!player.isDead() && !battleManager.isLastAlive()) {
            System.out.println("\nChoose an enemy\n");
            for (int i = 1; i < test.size();++i){
                if (!test.get(i).isDead())
                    System.out.println(i+" "+ test.get(i).getName());
            }

            int index = scan.nextInt();
            battleManager.auto(test.get(index));

        }
        if (battleManager.isLastAlive()){
            System.out.println("you won");
        }
    }
}
