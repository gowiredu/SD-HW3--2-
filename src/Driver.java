/**
 * This class runs the main program.
 * 
 * @author group 3b
 * 
		 * You walk into classroom where you pick up your Java textbook and the pencil. 
		 * If you find the camera you can take a picture of the map.
		 * Wander north and then find the secretary and the leggo structure, push said structure to the 
		 * art room which will get you entrance and get you mistaken for custodian. 
		 * Once in room find paint brush, paint and canvas.
		 * MUST: take paint brush dip in paint and cover the canvas in white
		 *  Go back the way you came and give the secretary the canvas, retrieve the key 
		 *  Go south and enter the Peeler auditorium, hand the java book to the teacher, sit down take 
		 *  out your pencil and win the game! 
		 *  
		 *  LOSE 
		 *  If you return to test room w/o book or pencil 
		 *  If you try to enter the room w/o the leggo structure - get arrested 
		 *  If you give the secretary the unpainted canvas 
		 *  
		
/**
 * This class runs the main program.
 * 
 * @author group 3b
*/
public class Driver 
{

	public static void main( String[] args )
	{
		GameState state = new GameState ();
		state.run();
	}

}