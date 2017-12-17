

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	Item item1 = new Item( "sword", "A sharp pointy sword", "weapon" );
	Item item2 = new Item( );
	
	@Test
	public void testGetName( ) {
		assertEquals( "sword", item1.getName() );
	}

	@Test
	public void testGetDescription( ) {
		assertEquals( "A sharp pointy sword", item1.getDescription() );
	}

	@Test
	public void testGetType( ) {
		assertEquals( "weapon", item1.getType() );
	}

	@Test
	public void testSetName( ) {
		item2.setName( "book" );
		assertEquals( "book", item2.getName() );
	}

	@Test
	public void testSetDescription( ) {
		item2.setDescription( "A worn paperback book" );
		assertEquals( "A worn paperback book", item2.getDescription() );
	}

	@Test
	public void testSetType( ) {
		item2.setType( "book" );
		assertEquals( "book", item2.getType() );
	}
	
	@Test
	public void testToString( ) {
		assertEquals( "sword", item1.toString() );
	}
}
