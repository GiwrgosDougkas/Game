/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;

/**
 *
 * @author george
 */
public class Actor extends Thing{
private Room room;
    public Actor(String aName, String aDescription,Room aRoom) {
        super(aName, aDescription);
        this.room=aRoom;
    }
    
   
    public void setRoom(Room aRoom){
    this.room=aRoom;
    }
    
    public Room getRoom(){
    
    return this.room;
    }
}
