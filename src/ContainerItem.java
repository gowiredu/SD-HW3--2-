
import java.util.ArrayList;

/**
   The <code>cotainerItem</code> class represents a container in a basic
   adventure game. It contains fields for the most common attributes of
   container items (i.e. a short name, description, and collection of items).
*/
public class ContainerItem extends Item
{
   /**
      Construct a container object given a short name, description, and
      collection of objects.
   
      @param shortName The short name of the location
      @param description The description of the location
      @param items The collection of items in the location
      
   */
   public ContainerItem(String shortName, String description, ArrayList<Item> items)
   {
      super(shortName, "container", description);
      this.items = items;
   }  
    
   /**
      Get the description of the container Item.
      @return the description
   */
   @Override
   public String getDescription()
   {
      return super.getDescription() + "\n"
      		+ " contents: " + getItemList();
   }
   
   /**
      Get the number of items in the container.
      @return the number of items
   */
   public int getItemCount()
   {
      return items.size();
   }
   
   /**
      Add an item to the container.
      @param item the item to add
   */
   public void addItem(Item item)
   {
      items.add(item);
   }
   
   /**
      Remove an item from the container.
      @param item the item to remove
   */
   public void removeItem(Item item)
   {
      items.remove(item);
   }
   
   /**
      Get the short names of the items in the container.
      @return the list of items 
   */
   public String getItemList()
   {
      String list = "";
      for (Item item: items)
      {
         //Add commas between items in the list
         if(!list.equals(""))
            list = list + ", ";
            
         list = list + item.getName();
      }
      return list;
   }
   
   /**
      Return an item from the container, given its index.
      @param index the index of the item to return
      @return the item, or null if index is out of bounds
   */
   public Item returnItem(int index)
   {
      if (0 <= index && index < items.size())
         return items.get(index);
      else
         return null;
   }
   /**
      Return an item from the container, given its short name.
      @param shortName the shortName of the item to return
      @return the item, or null if not found
   */
   public Item returnItem(String shortName)
   {
      for (Item item: items)
      {
         if (item.getName().equalsIgnoreCase(shortName))
         {
            return item;
         }
      }
      //Not found
      return null;
   }
   
   /**
      Returns whether or not a container is locked.
      @return false, by default; true, if locked
   */
   public boolean isLocked()
   {
      return false;
   }
   
   /**
      Locks or unlocks the container.
      @param locked whether or not the container is locked
   */
   public void setLocked(boolean locked)
   {
      
   }
         
   private ArrayList<Item> items;
}