public class Item {

		private boolean type; //Is this Item consumable (T) or not (F)
		private String shortName; 
		private String description;
		private String type;

		
		public void setshortName( String n )
		{
			shortName = n;
		}
		
		public void setType( String t )
		{
			type = t;
		}
		
		public void setDescription ( String d )
		{
			description = d;
		}

		// The ToString method which returns the output of the name, type and description of the Item
		
		public String toString() 
		{
			String output = new String();

			output = "shortName" + " : " +  "" + shortName +"\n";  
			output += "type" + " : " + "" + type + "\n";
			output += "description" + " : " + "" + description + "\n"; 

			return output; 
		}

		public static void main (Strings [] args) 
		{

		}


}
