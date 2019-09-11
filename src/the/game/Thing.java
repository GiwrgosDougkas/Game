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
public class Thing {
    
    
    private String name;
    private String description;
    
    
    public Thing (String aName, String aDescription){
    
        this.name=aName;
        this.description=aDescription;
    
    }
    
    public String getName(){
        return name;
    
    }
    
    public void setName(String aName){
    
    this.name=aName;
    }
    
    public String getDescription(){
    
    return description;
    
    }
    public void setDescription(String aDescription){
    this.description=aDescription;
    
    }
    
}
