

import java.util.ArrayList;

/**
 * This class represents a particular location in our adventure game.
 * 
 * It contains the following data fields:
 *   name - The name of the location
 *   description - A description of the location
 *   contents - A list of Items that are in the location
 *   
 * @author STHEDE
 *
 */
public class Location 
{
	private String name;
	private String description;
	private ArrayList<Item> contents;
	
	/**
	 * The default constructor.
	 */
	public Location( )
	{
		name = "Limbo";
		description = "A featureless gray plain";
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 */
	public Location( String n, String d )
	{
		name = n;
		description = d;
		contents = new ArrayList<Item>();
	}
	

	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 * @param c The contents of the location
	 */
	public Location( String n, String d, ArrayList<Item> c )
	{
		name = n;
		description = d;
		contents = c;
	}
	
	
	/**
	 * Returns the name of the location.
	 * @return The name of the location.
	 */
	public String getName()
	{
		return name;
	}

	
	/**
	 * Returns the description of the location.
	 * @return The description of the location.
	 */
	public String getDescription( )
	{
		return description;
	}
	
	
	/**
	 * Adds the given Item to the contents list of the location.
	 * @param it The item to add to the location.
	 */
	public void addItem( Item it )
	{
		contents.add( it );
	}
	
	
	/**
	 * Returns the item with the given name in the location.
	 * @param name The name of the item to find.
	 * @return The item with the given name, or null if that item doesn't exist.
	 */
	public Item retrieveItem( String name )
	{	
		for ( Item it : contents )
		{
			if ( it.getName().equals( name ) )
				return it;
		}
		return null;
	}
	
	
	/**
	 * Returns the item in position i from the contents list of the location.
	 * @param i The position of the item
	 * @return The item from the list, or null if position does not exist.
	 */
	public Item retrieveItem( int i )
	{
		if ( ( i >= 0 ) && ( i < contents.size() ) )
			return contents.get( i );
		else
			return null;
	}
	
	
	/**
	 * Returns the number of items found in the location.
	 * @return The number of items found in the location.
	 */
	public int countItems( )
	{
		return contents.size();
	}
	
	public void removeItem( Item it )
	{
		contents.remove( it );
	}
	
	 /**
	    Returns whether or not a location is locked.
	    @return false, by default; true, if locked
	 */
	 public boolean isLocked()
	 {
	    return false;
	 }
	 
	 /**
	    Locks or unlocks the location.
	    @param locked whether or not the location is locked
	 */
	 public void setLocked(boolean locked)
	 {
	    
	 }
}