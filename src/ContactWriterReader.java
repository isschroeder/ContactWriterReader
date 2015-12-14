import java.io.*;
import java.util.Scanner;

/**
 * @author woytek
 * @author Isabelle Schroeder
 * This program saves and reads a file of contacts maybe.
 */
public class ContactWriterReader {

	/**
	 * @param args main arguments for ContactWriterReader program
	 */
	public static void main(String[] args) throws IOException {
		
		File fileStuff = new File("myContacts.txt"); // new file created!!
		Contact[] myContacts; // array!
		myContacts = new Contact[20]; // initialize to 20 contacts
		int numContacts = 0; // number of contacts
		Scanner keyboard = new Scanner(System.in); // for user's inputting needs
		String input; // to hold user's inputting needs
		int ctr = 0; // counter
		
		// When the file already exists, read all the contents!
		if( fileStuff.exists() ){
			BufferedReader reader = new BufferedReader( new FileReader(fileStuff) ); // for reading the file!
			
			while(reader.ready() ){
				// create new contact objects for future reading
				myContacts[numContacts] = new Contact();
			
				input = reader.readLine();
				myContacts[numContacts].setLastName( input );
			
				input = reader.readLine();
				myContacts[numContacts].setFirstName( input );
			
				input = reader.readLine();
				myContacts[numContacts].setMiddleName( input );
			
				input = reader.readLine();
				myContacts[numContacts].setPrefix( input );
			
				input = reader.readLine();
				myContacts[numContacts].setPhone( input );
			
				input = reader.readLine();
				myContacts[numContacts].setEmail( input );
			
				input = reader.readLine();
				myContacts[numContacts].setStreet( input );
			
				input = reader.readLine();
				myContacts[numContacts].setCity( input );
			
				input = reader.readLine();
				myContacts[numContacts].setState( input );
			
				input = reader.readLine();
				myContacts[numContacts].setZip( input );
			
				input = reader.readLine();
				myContacts[numContacts].setOccupation( input );
		
				numContacts++; // increment counter
			}
			reader.close(); // must close reader!
		
			// printint out all those wonderful contacts
			for ( ctr = 0; ctr < numContacts; ctr++ ){
				System.out.println( "Last name: " + myContacts[ctr].getLastName() );
				System.out.println( "First name: " + myContacts[ctr].getFirstName() );
				System.out.println( "Middle name: " + myContacts[ctr].getMiddleName() );
				System.out.println( "Prefix: " + myContacts[ctr].getPrefix() );
				System.out.println( "Phone: " + myContacts[ctr].getPhone() );
				System.out.println( "Email: " + myContacts[ctr].getEmail() );
				System.out.println( "Street: " + myContacts[ctr].getStreet() );
				System.out.println( "City: " + myContacts[ctr].getCity() );
				System.out.println( "State: " + myContacts[ctr].getState() );
				System.out.println( "ZIP: " + myContacts[ctr].getZip() );
				System.out.println( "Occupation: " + myContacts[ctr].getOccupation() );
				System.out.println( "------" );
			}
			
		} else { // When the file doesn't exist...
			do{ myContacts[numContacts] = new Contact(); // make a new file!!
			
				// Setting all the contact info you would ever need to avoid someone!
				System.out.print( "Last name: ");
				input = keyboard.nextLine();
				myContacts[numContacts].setLastName( input );
			
				System.out.print( "First name: ");
				input = keyboard.nextLine();
				myContacts[numContacts].setFirstName( input );
	   
				System.out.print( "Middle name: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setMiddleName( input );
	        
				System.out.print( "Prefix: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setPrefix( input );
	        
				System.out.print( "Phone number: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setPhone( input );
	        
				System.out.print( "Email: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setEmail( input );
	        
				System.out.print( "Street address: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setStreet( input );

				System.out.print( "City: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setCity( input );
	        
				System.out.print( "State: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setState( input );
	        
				System.out.print( "ZIP code: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setZip( input );
	        
				System.out.print( "Occupation: " );
				input = keyboard.nextLine();
				myContacts[numContacts].setOccupation( input );
				
				System.out.println( "Would you like to enter another(y/n)?" );
				input = keyboard.nextLine().toLowerCase();
			
				// increment our counter so we make a new object without getting rid of the old one
				numContacts++;
			
				} while( input.equalsIgnoreCase("y") ); // keep making contacts until the user is done
				
		}	
		
		PrintWriter writer = new PrintWriter( fileStuff ); // for writing info to disk!!
		
		for ( ctr = 1; ctr < numContacts; ctr++ ){ 
			// printing, printing, printing
			writer.println( myContacts[ctr].getLastName() );
			writer.println( myContacts[ctr].getFirstName() );
			writer.println( myContacts[ctr].getMiddleName() );
			writer.println( myContacts[ctr].getPrefix() );
			writer.println( myContacts[ctr].getPhone() );
			writer.println( myContacts[ctr].getEmail() );
			writer.println( myContacts[ctr].getStreet() );
			writer.println( myContacts[ctr].getCity() );
			writer.println( myContacts[ctr].getState() );
			writer.println( myContacts[ctr].getZip() );
			writer.println( myContacts[ctr].getOccupation() );
			System.out.println( "------" );
		}
		
		writer.close(); // always close your stuff!
	}

}
