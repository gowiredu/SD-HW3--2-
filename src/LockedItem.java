import java.util.ArrayList;


public class LockedItem extends Item 
{
	
	private boolean locked;
	private String lockedDescription; 
	
	public LockedItem() 
	{
		super();
		locked = true;
	}
	
	public LockedItem( String n, String d, String t, boolean l )
	{
		super(n, d, t);
		lockedDescription = d; 
		locked = l;
	}
	
	public String getDescription()
	{
		if( isLocked() )
			return lockedDescription;
		else
			return super.getDescription();
	}
	
	public boolean isLocked()
	{
	    return locked;
	}
	
	public boolean getLocked(boolean lock)
	{
		if(lock = true)
			return true;
		else
			return false;
	}
	 
	 /**
	    Locks or unlocks the item.
	    @param locked whether or not the item is locked
	 */
	public void setLocked(boolean locked)
	{
	    this.locked = locked;
	}
}
	
	// within LockedItem and LockedLocation
			// starts out at false
			// if set to locked
			// if that is true, return true
			// else return false
