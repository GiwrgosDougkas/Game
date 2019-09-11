/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author george
 */
public class Game {
    private ArrayList map;
    private Actor player;

    


public Game(){

this.map=new ArrayList();                                                  //North   South           West    East
map.add(new Room("You are out","There are two house and one garage",Direction.NOEXIT,1,Direction.NOEXIT,Direction.NOEXIT));
map.add(new Room("You are in south house","The house has 2 rooms",0,2,Direction.NOEXIT,3));
map.add(new Room("You are in room 1","you are in gold room",1,Direction.NOEXIT,Direction.NOEXIT,Direction.NOEXIT));
map.add(new Room("You are in room 2","you are in blue room",Direction.NOEXIT,Direction.NOEXIT,1,Direction.NOEXIT));
map.add(new Room("room4","You are in red room",2,Direction.NOEXIT,Direction.NOEXIT,5));


player=new Actor("player","a game player",(Room) map.get(0));


}

ArrayList getMap(){
return map;

}


void setMap(ArrayList aMap){

map= aMap;

}

public Actor getPlayer(){

return player;

}

public void setPlayer(Actor aPlayer){

player=aPlayer;

}

void moveActorTo(Actor p,Room aRoom){

p.setRoom(aRoom);


}
int moveTO(Actor anActor,Direction dir){
    Room r= anActor.getRoom();
    int exit;
     switch(dir){
        
        case NORTH:
            exit=r.getN();
                break;
        case SOUTH:
              exit=r.getS();
                break;   
                
        case EAST:
                exit=r.getE();
                break;
        case  WEST:
                exit=r.getW();
                break;
        default :
                exit=Direction.NOEXIT;
                    break;
        }


if (exit!= Direction.NOEXIT){
moveActorTo(anActor, (Room) map.get(exit));

}
return exit;

}


public int movePlayerTo(Direction dir){

return moveTO(player, dir);


}


}



