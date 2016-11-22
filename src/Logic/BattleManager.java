package Logic;

import java.util.ArrayList;

/**
 * Created by Benny on 11/21/2016.
 */
public class BattleManager {
    private ArrayList<Entity> entities;
    private Entity currentEntity;

    public BattleManager(ArrayList<Entity> entities){
        this.entities = entities;
        //TODO if you want can add a speed variable for sorting of turn
        //currentEntity = entities.get(new Random().nextInt(entities.size()));
        currentEntity = entities.get(0);
    }

    //for Test purposes only
    public BattleManager(){
        this.entities = new ArrayList<>();
        entities.add(new Player("Jeff"));
        entities.add(new Player("Ben"));
        currentEntity = entities.get(0);
    }
    //TODO case of a player killing another entity
    public void attack(Entity chosenEntity){
        if (!chosenEntity.isDead()) {
            chosenEntity.setHealth(chosenEntity.getHealth() - currentEntity.getAttack());
            if (chosenEntity.getHealth() <= 0) {
                chosenEntity.setDead(true);
            }
            findNextCurrent();
        }else{
            //make it notify that the player has chosen a dead player
        }
    }

    private boolean findNextCurrent(){

        int index = entities.indexOf(currentEntity);
        for(int i = 0; i < entities.size(); i++){
            if(!entities.get(index + i).isDead()) {
                currentEntity = entities.get(i + index);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String currentState = "";
        currentState += "Current Player: " + currentEntity.getName() + "\nDead Players:\n";
        for (int i = 0; i <entities.size();++i){
            if (entities.get(i).isDead())
                currentState += entities.get(i).getName() + " HP: "+entities.get(i).getHealth()  +"\n";
        }
        currentState += "\nAlive Players:\n";
        for (int i = 0; i <entities.size();++i){
            if (!entities.get(i).isDead())
                currentState += entities.get(i).getName()  + " HP: "+entities.get(i).getHealth()  +"\n";
        }
        return currentState;
    }






}
