/**
   CSC232A - Spring 2015
   
   @author group 3b
*/ 

import java.io.Serializable;

/**
   The <code>Map</code> class represents a map in a basic
   adventure game. It contains fields for the most common attributes of
   maps (i.e. a short name, description, and collection of locations).
*/
public class Map implements Serializable
{
   /**
      Construct a Map object given a short name, description, and
      collection of objects.
   
      @param shortName The short name of the map
      @param description The description of the map
      @param location The starting location
   */
   public Map(String shortName, String description, Location location)
   {
      this.shortName = shortName;
      this.description = description;
      this.locations = new Location[5][5];
      this.location = location;
      this.x = 2; //starting location is the middle of the map
      this.y = 2;
   }
   
   /**
      Override the default <code>toString</code> method to return the
      Map formatted into three lines.
   */
   public String toString()
   {
      return "Map:\n"
               + " shortName: " + shortName + "\n"
               + " description: " + description;
   }
   
   /**
      Get the short name of the map.
      @return the shortName
   */
   public String getShortName()
   {
      return shortName;
   }
   
   /**
      Get the description of the map.
      @return the description
   */
   public String getDescription()
   {
      return description;
   }
   
   /**
      Add a location to the map.
      @param location the location to add
      @param x the x coordinate
      @param y the y coordinate
   */
   public void addLocation(Location location, int x, int y)
   {
      locations[x][y] = location;
   }
   
   /**
      Remove a location from the map.
      @param location the location to remove
   */
   public void removeLocation(Location location)
   {
      for (int i = 0; i < 5; i++)
         for (int j = 0; j < 5; j++)
            if (locations[i][j] != null && locations[i][j].getName().equals(location.getName()))
               locations[i][j] = null;            
   }
   
   /**
      Returns the location to the north.
      @return the location, or null if no location to the north
   */
   public Location goNorth()
   {
      if ((x - 1 >= 0) && locations[x - 1][y] != null)
      {
         x -= 1;
         setLocation(locations[x][y]);
         return getLocation();
      }
      else 
         return null;
   }
   
   /**
      Returns the location to the south.
      @return the location, or null if no location to the south
   */
   public Location goSouth()
   {
      if ((x + 1 < 5) && locations[x + 1][y] != null)
      {
         x += 1;
         setLocation(locations[x][y]);
         return getLocation();
      }
      else 
         return null;      
   }
   
   /**
      Returns the location to the east.
      @return the location, or null if no location to the east
   */
   public Location goEast()
   {
      if ((y + 1 < 5) && locations[x][y + 1] != null)
      {
         y += 1;
         setLocation(locations[x][y]);
         return getLocation();
      }
      else 
         return null;
   }
   
   /**
      Returns the location to the west.
      @return the location, or null if no location to the west
   */
   public Location goWest()
   {
      if ((y - 1 >= 0) && locations[x][y - 1] != null)
      {
         y -= 1;
         setLocation(locations[x][y]);
         return getLocation();
      }
      else 
         return null;
   }
   
   /**
      Returns the current location.
      @return the current location
   */
   public Location getLocation()
   {
      return location;
   }
   
   /**
      Sets the location.
      @param location the new location
   */
   private void setLocation(Location location)
   {
      this.location = location;
   }
    
   private String shortName;
   private String description;
   private Location[][] locations;
   private Location location;
   private int x;
   private int y;
}