/**
 * Created by Nick on 6/30/2017.
 */
public class Map
{
  private String[][] map; // map of the playable area
  private short playerX, playerY;
  
  
  public Map()
  {
    this(10,10);
  }
  
  public Map(int xSize, int ySize)
  {
    map = new String[xSize][ySize];
    
    map[5][5] = "Forest";
    map[5][4] = "Clearing";
    map[5][3] = "Bear";
    map[5][2] = "Cave";
    map[4][4] = "Sword";
    
    playerX = 5;
    playerY = 5;
  }
  
  public String getCurrentRoom()
  {
    return map[playerX][playerY];
  }
  
  public void moveUp()
  {
    if( map[playerX][playerY-1] == null )
      return;
    else
      playerY--;
  }
  
  public void moveRight()
  {
    if( map[playerX+1][playerY] == null )
      return;
    else
      playerX++;
  }
  
  public void moveDown()
  {
    if( map[playerX][playerY+1] == null )
      return;
    else
      playerY++;
  }
  
  public void moveLeft()
  {
    if( map[playerX-1][playerY] == null )
      return;
    else
      playerX--;
  }
}
