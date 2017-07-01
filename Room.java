/**
 * Created by Nick on 6/30/2017.
 */
public class Room
{
  static protected Map map;
  static protected Player player;
  static final protected short DICTIONARY_SIZE = 113; /*Some prime number
  prime numbers are inherently better as hash-map sizes since they lead to 
  less collisions*/
  
  /*Following variable:
  Contains all 'Commands' for the room, meaning it contains all the text 
  commands that apply and can be used by the room. This is a Hash map that 
  takes the hash of the command string as the index and maps that index to the 
  proper command. */
  protected Command commandList[] = new Command[DICTIONARY_SIZE]; 
  
  public Room()
  {
    ;
  }
  
  
  /*
  *Methods used for creating the Rooms. For development phase/loading.
  */
  
  //Add command to room's command list.
  public void addCommand()
  {
    
  }      
}
