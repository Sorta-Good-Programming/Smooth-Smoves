/*
 * Created By: Nick
 * Last Edited By: Nick
 * Created On: 2017-06-30
 * Edited On: 2017-06-30
 *
 * This class is a linked list that serves as the Player's inventory. Each item the player acquires is added to the list.
 *
 */

public class Inventory
{
  private Node list; // start of the linked list

  public Inventory()
  {
    list = null;
  }

  // adds a node to the front of the linked list
  public void addFront(String item)
  {
    Node newNode = new Node(item);
    newNode.next = list;
    list = newNode;
  }

  public boolean findItem(String item)
  {
    Node current = list;
    boolean found = false;

    while (current.next != null && !found)
    {
      if (current.data.equals(item))
        found = true;
      else
        current = current.next;
    }
    return found;
  }

  private class Node
  {
    public Node next;
    public String data;

    public Node(String data)
    {
      this.next = null;
      this.data = data;
    }
  }
}
