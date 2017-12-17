import java.util.ArrayList;

public class LockedLocation extends Location {

	private boolean locked;
	private String lockedDescription;
	
	/**
	 * The default constructor.
	 */
	public LockedLocation( )
	{
		super( );
		locked = true;
	}
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 * @param l The locked description of the location
	 */
	public LockedLocation( String n, String d, boolean l )
	{
		super( n, d );
		lockedDescription = d;
		locked = l;
	}	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 * @param c The contents of the location
	 * @param l The description of the locked location
	 */
	public LockedLocation( String n, String d, ArrayList<Item> c, String l )
	{
		super( n, d, c );
		lockedDescription = l;
		locked = true;
	}
	
	/**
	 * Returns the description of the location.
	 * @return The description of the location.
	 */
	public String getDescription( )
	{
		if( isLocked( ) )
			return lockedDescription;
		else
			return super.getDescription( );
	}
	
	 /**
	    Returns whether or not a location is locked.
	    @return false, by default; true, if locked
	 */
	 public boolean isLocked()
	 {
	    return true;
	 }
	 
	public boolean getLocked(boolean lock)
	{
		if(lock = true)
			return true;
		else
			return false;
	}
	 
	 /**
	    Locks or unlocks the location.
	    @param locked whether or not the location is locked
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
	 
	 /*public boolean Lock()
	 {
		return false;
		if ()
	 }
	 */