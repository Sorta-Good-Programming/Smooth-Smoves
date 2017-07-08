/*  Created by: all
 *  Created on: 2017-06-30   
 *  
*/  

import java.util.Scanner;

//Where the main game functionality takes place.
public class MainClass
{
  public static void main(String args[])
  {
    Player player = new Player();           //The player
    Map map = new Map();                    //The map
    Scanner scan = new Scanner(System.in);  //Input
    String command;                         //Holds player's command
    
    //Game loop
    //Continues until player is dead
    while(player.getPlayerStatus()) 
    {
     command = scan.nextLine();
     
     switch(map.getCurrentRoom()){
       case "Forest":
         //System.out.println("You are in a forest.");
         
         switch(command){
           case "look":
             System.out.println("You are surrounded by trees.");
             break;
           case "move up":
             map.moveUp();
             break;
           case "do nothing":
             System.out.println("You did nothing. Congrats.");
             break;
         }
       
         break;
       case "Clearing":
         System.out.println("There is nothing here.");
         break;
       case "Bear":
         break;
       case "Cave":
         break;
       case "Sword":
         break;
       default:
         break;
     }
     
     
    }
  }
}
