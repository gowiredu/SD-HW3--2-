

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	Location loc;
	Item it1;
	Item it2;
	
	public LocationTest( )
	{
		loc = new Location( "Beach", "This is a beach." );
		it1 = new Item( "sword", "A sharp sword", "weapon" );
		it2 = new Item( "sandwich", "A PB&J", "food" );
		loc.addItem( it1 );
		loc.addItem( it2 );
	}
	
	@Test
	public void testGetName() 
	{
		assertEquals( "Beach", loc.getName() );
	}

	@Test
	public void testGetDescription() 
	{
		assertEquals( "This is a beach.", loc.getDescription() );
	}
		
	@Test
	public void testRetrieveItem1() 
	{
		assertEquals( it1, loc.retrieveItem( "sword" ) );
	}

	@Test
	public void testRetrieveItem2() 
	{
		assertEquals( null, loc.retrieveItem( "pineapple" ) );
	}
	
	@Test
	public void testRetrieveItem3() 
	{
		assertEquals( it2, loc.retrieveItem( 1 ) );
	}
	
	@Test
	public void testRetrieveItem4() 
	{
		assertEquals( null, loc.retrieveItem( 5 ) );
	}

	@Test
	public void testCountItems() 
	{
		assertEquals( 2, loc.countItems() );
	}

	@Test
	public void testAddItem() 
	{
		loc.addItem( new Item() );
		assertEquals( 3, loc.countItems() );
	}

}
