/*
 * Created By: Nick
 * Created On: 2017-06-30
 *
 * This class is a linked list that serves as the player's inventory. The class provides methods that add items to the
 * the player's inventory and searches the player's inventory for a specific item.
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

  // returns true if an item is found in the player's inventory
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
    public Node next; // next node in the list
    public String data; // item in the player's inventory

    public Node(String data)
    {
      this.next = null;
      this.data = data;
    }
  }
}
