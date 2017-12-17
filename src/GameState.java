import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class runs the main program.
 * 
 * @author group 3b
 * 
		 * You start in the classroom.
		 * Wander north into the lobby and take the mop to the 
		 * art room to the east (you will be confused as the custodian). 
		 * In the art room, there is a knife.
		 * Use paint brush and paint, then use paint brush and canvas.
		 * Go back to the lobby and go north from there to the sitting area.
		 * Use canvas on man and get key. 
		 * Go south back to the lobby, then west to exit, using the key.
		 * ALTERNATELY:
		 * In the art room, go north to the art gallery.
		 * Use the knife on a painting and receive a key.
		 * Go south to art room, west to lobby and west again to use key and exit.
		 * 
		 *  
		 * LOSE
		 * If you try to enter the art room w/o the mop
		 *  	
*/
public class GameState
{
	private Location loc; //classroom
	private Location loc2; //lobby
	private Location loc3; //art room
	private Location loc4; //gallery
	private Location loc5; //art closet
	private Location loc6; //sitting area
	private Location loc7; //doorway
	private Location loc8; //hallway

	private ContainerItem inventory;
	private LockedItem painting;
	
	private Item it1; //mop
	private Item it2; //knife
	private Item it3; //paint brush
	private Item it4; //paint
	private LockedItem it5; //canvas
	private Item it6; //key behind canvas
	private LockedItem it7; //key from professor
	
	private Map map1;
	
	public GameState( )
	{
		loc = new Location( "classroom 104", "A standard, desolate Peeler classroom. The door is open and there is a hallway leading to the lobby to the north." );
		loc2 = new Location( "lobby", "The lobby of Peeler. The exit is to the west, there is a sitting area to the north and a long hallway to the east.");
		loc3 = new Location( "art room", "A standard art studio. Someone left an x-acto knife out on the table. There is a gallery to the north and a closet to the south." ); // Contains x-acto knife
		loc4 = new Location( "gallery", "Beautiful pieces of student-created art surround you. One painting has a slight bulge in the middle. The Art Room is to the south." ); // Contains key
		loc5 = new Location( "art closet", "A small closet chaulk full of art supplies. There's a paint brush, paint, and a canvas. The Art Room is to the north." ); // Contains the brush, paint, and canvas.
		loc6 = new Location( "sitting area", "An artistic arrangement of strangely shaped furniture. An old art professor sits on a couch in the corner. The lobby is to the south." ); // Contains the Leggo Structure
		loc7 = new LockedLocation( "doorway", "The entrance to Peeler. The door is locked. The lobby is to the east.", true);
		loc8 = new Location( "hallway", "A long hallway decorated with student artwork on the walls. There is an art room to the east and the lobby is back to the west." +
				"\nAngie Nally is up ahead and will not let you pass.");

		it1 = new Item( "mop", "A janitor's staple.", "Custodian supplies" );
		it2 = new Item( "knife", "A small sharp blade, stained with paint.", "Art supplies" );
		it3 = new Item( "brush", "A large brush caked with dry paint.", "Art supplies" );
		it4 = new Item( "paint", "Color: #FFFFFF", "Art supplies" );
		it5 = new LockedItem( "canvas", "A 3'x3' blank, white canvas.", "Art supplies", true);
		it6 = new Item( "key", "A key for the doors of Peeler", "key" );
		it7 = new LockedItem( "key", "A master key for anywhere on campus.", "key", true);
		
		inventory = new ContainerItem("satchel", "A place to carry all your supplies.", new ArrayList<Item>() );
		painting = new LockedItem("painting", "A student painting on the wall.", "art", true );
		
		loc2.addItem( it1 );
		loc3.addItem( it2 );
		loc4.addItem( painting ); //key hidden behind canvas
		loc4.addItem( it6 );
		loc5.addItem( it3 );
		loc5.addItem( it4 );
		loc5.addItem( it5 );
		loc6.addItem( it7 ); //key hidden in professor
		
		map1 = new Map( "Peeler", "The art building on campus.", loc);
		
		map1.addLocation(loc, 2, 2);
		map1.addLocation(loc2, 1, 2);
		map1.addLocation(loc3, 1, 4);
		map1.addLocation(loc4, 0, 4);
		map1.addLocation(loc5, 2, 4);
		map1.addLocation(loc6, 0, 2);
		map1.addLocation(loc7, 1, 1);
		map1.addLocation(loc8, 1, 3);
	}

	public void run( )
	{
		int firstTimeInSittingArea = 0;
		int profItems = 0;
		System.out.println( "Thump thump..." );
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println( "Thump thump..." );
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println( "Thump thump..." );
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println( "*Gasp*" );
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println( "\nYou awake in confusion... 'Where am I?' You wonder aloud."
				+ "\nThe last thing you remember you were studying for your Software Development final in Julian."
				+ "\nBut this does not look like Julian, this looks like...PEELER!"
				+ "\nYou've never been here before, you're scared and confused and have no idea how to escape."
				+ "\n*Cue intro music*" );
		try {
		    Thread.sleep(7000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println( "\n-------------------------------------------------------------------------------------------"
				+ "\nWelcome to ESCAPE ARTIST (Patent Pending)"
				+ "\nIt's your decision what to do next, here are some instructions:"
				+ "\n	'Go [cardinal direction]' will take you in that direction."
				+ "\n	'Look' will tell you what is available in your current room."
				+ "\n	'Use [Item] will use an item if you have it in your inventory and it can interact in your current room."
				+ "\n	'Examine [Item]' will give you more information about an object."
				+ "\n	'Inventory displays items currently in your inventory."
				+ "\n	'Take [Item]' adds item to your inventory."
				+ "\n	'Take [Item] from [Container]' adds item from container (i.e. a backpack) to inventory."
				+ "\n	'Put [Item]' removes item from your inventory and drops it at your location."
				+ "\n	'Put [Item] in [Container]' removes item from your inventory and places it in specified container."
				+ "\n	'Help' will print this list of commands again."
				+ "\n	'Quit' exits the game. (Don't be a quitter!)"
				+ "\n" );
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		Scanner in = new Scanner( System.in );
		String command = null;
		
		while ( true )
		{
			System.out.print( "Enter a command -> " );
			command = in.nextLine().trim().toLowerCase();
			
			if ( command.equals( "quit" ) )
			{
				System.out.println( "Quitting" );
				try {
				    Thread.sleep(1000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				System.out.print( "." );
				try {
				    Thread.sleep(1000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				System.out.print( "." );
				try {
				    Thread.sleep(1000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				System.out.print( "." );
				break;
			}
//			else if ( command.equals("unlock"))
//				loc7.setLocked(false);
			else if ( command.equals( "inventory" ) )
			{
				System.out.println( "\n___Inventory___" );
				for ( int i = 0; i < inventory.getItemCount(); i++ )
					System.out.println( inventory.returnItem( i ) );
			}
			else if ( command.equals( "look" ) )
			{
				System.out.println( "\n" + loc.getName( ) );
				System.out.println( loc.getDescription( ) );
				if(loc.countItems() != 0)
				{
					System.out.println("\n___Items Here:___");
					for ( int i = 0; i < loc.countItems(); i++ )
					{
						if( loc.retrieveItem( i ).getName().equals( "key" ) )
						{
							System.out.println( "There's a hidden item here" );
						}
						else
							System.out.println( loc.retrieveItem( i ) );
					}
				}
				else
				{
					System.out.println("There are no items in this room.");
				}
			}
			else if ( command.startsWith( "help" ) )
			{
				System.out.println( "\n	'Look' will tell you what is available in your current room."
				+ "\n	'Go [cardinal direction]' will take you in that direction."
				+ "\n	'Look' will tell you what is available in your current room."
				+ "\n	'Use [Item] will use an item if you have it in your inventory and it can interact in your current room."
				+ "\n	'Examine [Item]' will give you more information about an object."
				+ "\n	'Inventory displays items currently in your inventory."
				+ "\n	'Take [Item]' adds item to your inventory."
				+ "\n	'Take [Item] from [Container]' adds item from container (i.e. a backpack) to inventory."
				+ "\n	'Put [Item]' removes item from your inventory and drops it at your location."
				+ "\n	'Put [Item] in [Container]' removes item from your inventory and places it in specified container."
				+ "\n	'Help' will print this list of commands again."
				+ "\n	'Quit' exits the game. (Don't be a quitter!)"
				+ "\n" );
			}
			else if ( command.startsWith( "examine" ) )
			{
				String itName = command.substring( 8 );
				Item it = loc.retrieveItem( itName );
				
				if ( it != null )
					System.out.println( it.getDescription() );
				else
					System.out.println( "Object not found." );
			}
			else if ( command.startsWith( "go" ) )
			{	
				if ( command.length() > 2)
				{
					String direction = command.substring( 3 );
					if (direction.equals("north") || direction.equals("south") || direction.equals("east") || direction.equals("west"))
					{
						if ( direction.equals("north") )
						{
							Location temp = map1.goNorth();
							if ( temp != null )
								loc = temp;
							else
								System.out.println( "You can't go that way, ya fool!" );
						}
						if ( direction.equals("south") )
						{
							Location temp = map1.goSouth();
							if ( temp != null )
								loc = temp;
							else
								System.out.println( "Ye may not go this way!" );
						}
						if ( direction.equals("east") )
						{
							if ( loc.getName().equals( "hallway" ) )
							{
								for ( int i = 0; i < inventory.getItemCount(); i++ )
								{
									if( inventory.getItemList().equals("mop") )
									{
										System.out.println( "\nYou get mistaken as a janitor and make it into the art room." );
										Location temp = map1.goEast();
										if ( temp != null )
											loc = temp;
										else
											System.out.println( "There's no way to go!" );
									}
								}
							}
							else
							{
							Location temp = map1.goEast();
							if ( temp != null )
								loc = temp;
							else
								System.out.println( "There's no way to go!" );
							}
						}
						if ( direction.equals("west") )
						{
							Location temp = map1.goWest();
							if ( temp != null )
								loc = temp;
							else
								System.out.println( "That's a wall you idiot!" );
						}
					System.out.println( "\n" + loc.getName( ) );
					System.out.println( loc.getDescription( ) );
					if(loc.countItems() != 0)
					{
						System.out.println("\n___Items Here:___");
						for ( int i = 0; i < loc.countItems(); i++ )
						{
							if( loc.retrieveItem( i ).getName().equals( "key" ) )
							{
								System.out.println( "There's a hidden item here" );
							}
							else
								System.out.println( loc.retrieveItem( i ) );
						}
					}
					else
					{
						System.out.println("There are no items in this room.");
					}
				}
				else
					System.out.println("That's not a direction, try again.");
					
					
				}
				else
				{
					System.out.println( "Go where? (Type GO [cardinal direction])" );
				}
			}
			else if ( command.startsWith( "take" ) )
			{
				String tokens[] = command.split(" ");
				if(tokens.length == 2)
				{
					String itName = tokens[1];
					Item it = loc.retrieveItem( itName );
					if ( it != null )
					{
						inventory.addItem( it );
						loc.removeItem( it );
						System.out.println( "You picked up the " + it + "!");
					}
					else
					{
						System.out.println( "Object not found." );
					}
				}
				else if (tokens.length == 4 && tokens[2].equals("from"))
				{
					String itName =  tokens[1];
					String containerName = tokens[3];
					//take item from container command
					ContainerItem container = (ContainerItem) loc.retrieveItem(containerName);
					if( container != null)
					{
						Item it = container.returnItem(itName);
						
						if ( it != null )
						{
							container.removeItem( it );
							inventory.addItem( it );
							System.out.println( "You have acquired " + it.getName() + "! Use it wisely." );
						}
						else
						{
							System.out.println( "Object not found." );
						}
					}
					else
						System.out.println( "Container not found." );
				}
				else
				{
					System.out.println ("invalid command");//invalid command
				}
			}
			else if ( loc.getName().equals( "sitting area" ))
			{
				if( command.startsWith( "use paint" ) )
				{
					if( inventory.getItemList().contains("paint") )
					{
						profItems++;
						if(profItems == 3)
						{
							System.out.println( "Professor: Yay! I can paint again! Take this key as a sign of my gratitude." );
							inventory.addItem( loc.retrieveItem( "key" ) );
							loc.removeItem( loc.retrieveItem( "key" ) );
						}
						else
							System.out.println( "Professor: Thanks! I needed that." );
					}
					else
						System.out.println("You don't have any paint.");
				}
				else if(command.startsWith( "use brush" ) )
				{
					if( inventory.getItemList().contains("brush") )
					{
						profItems++;
						if(profItems == 3)
						{
							System.out.println( "Professor: Yay! I can paint again! Take this key as a sign of my gratitude." );
							inventory.addItem( loc.retrieveItem( "key" ) );
							loc.removeItem( loc.retrieveItem( "key" ) );
						}
						else
							System.out.println("Professor: Hey, this brush will work nicely!" );
					}
					else
						System.out.println("You don't have a brush.");
				}
				else if(command.startsWith( "use canvas" ) )
				{
					if( inventory.getItemList().contains("canvas") )
					{
						profItems++;
						if(profItems == 3)
						{
							System.out.println( "Professor: Yay! I can paint again! Take this key as a sign of my gratitude." );
							inventory.addItem( loc.retrieveItem( "key" ) );
							loc.removeItem( loc.retrieveItem( "key" ) );
						}
						else
							System.out.println( "Professor: Ahh! Where'd you find this clean canvas? Thanks!" );
					}
					else
						System.out.println("You don't have a canvas.");	
				}
				else
					System.out.println("Professor: What can I help you with? *Mutters under breath* Man, I wish I had some art supplies.");
			}
			else if ( loc.getName().equals( "gallery" ))
			{
				if( command.startsWith( "use knife" ) )
				{
					if (inventory.getItemList().contains("knife"))
					{
						System.out.println( "You cut the painting off the frame and a key falls out!" );
						System.out.println("You picked up the key");
						inventory.addItem( loc.retrieveItem( "key" ) );
						loc.removeItem( loc.retrieveItem( "key" ) );
					}
								
					else
					{
						System.out.println("You can't cut this up");
					}
				}
			}
			else if (loc.getName().equals("doorway") )
			{
				if ( command.startsWith( "use key" ) )
				{
					if( inventory.getItemList().contains("key") )
					{
						System.out.print("You have escaped to freedom!");
						break;
					}
					else
					{
						System.out.print("You don't have a key for this door.");
					}
				}
			}
			else if ( command.startsWith( "put" ) )
			{
				String tokens[] = command.split(" ");
				if(tokens.length == 2)
				{
					String itName = tokens[1];
					Item it = inventory.returnItem ( itName );
					if ( it != null )
					{
						inventory.removeItem( it );
						loc.addItem( it );
					}
					else
					{
						System.out.println ( "Unknown command." );
					}
				}
				else if (tokens.length == 4 && tokens[2].equals("in"))
				{
					String itName = tokens[1];
					String containerName = tokens[3];
					//put name in container command 
					ContainerItem container = (ContainerItem) inventory.returnItem(containerName);
					if ( container != null )
					{
						Item it = inventory.returnItem(itName);
						
						if ( it != null )
						{
							inventory.removeItem( it );
							container.addItem( it );
						}
						else
						{
							System.out.println ("Object not found.");
						}
					}
					else
						System.out.println("Container not found.");
				}

				else
				{
					System.out.println("Invalid command.");
				}
			}
			System.out.println( );
		}
		in.close();
	}
}