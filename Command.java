/**
 * Created by Nick on 6/30/2017.
 */
import java.util.ArrayList;

public class Command
{
  protected String command; /*Holds the actual text command. NECESSARY because
  of the hash table, since there needs to be a way to compare commands-strings 
  beyond their hash values due to possible collisions. Example: if the command-
  string "go left" has the same hash as the command-string "look at table",
  then a collision occurs. To get the respective resulting-texts from each
  command, we insert the hash to the hash-map, then verify that the Command
  object is of the command we are looking for. To do this, we need to compare
  command-texts.*/
  //protected ArrayList<String> messages;
  protected String message; //message that is printed when player types command
  
  public Command(String command)
  {
    ;
  }
}
