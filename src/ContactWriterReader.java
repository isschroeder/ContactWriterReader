import java.io.*;
import java.util.ArrayList;
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
		// Creates an array list so we'll never run out of room!!
		ArrayList<Contact> myContactsUnlimited = new ArrayList<Contact>(); // MAGIC array!!
		int numContacts = 0; // number of contacts
		Scanner keyboard = new Scanner(System.in); // for user's inputting needs
		String input; // to hold user's inputting needs
		int ctr = 0; // counter
		
		// When the file already exists, read all the contents!
		if( fileStuff.exists() ){
			BufferedReader reader = new BufferedReader( new FileReader(fileStuff) ); // for reading the file!
			
			while(reader.ready() ){
				// create new contact objects for future reading
				Contact contact = new Contact(); // makes code look cleaner
		
				input = reader.readLine();
				contact.setLastName( input );
			
				input = reader.readLine();
				contact.setFirstName( input );
			
				input = reader.readLine();
				contact.setMiddleName( input );
			
				input = reader.readLine();
				contact.setPrefix( input );
			
				input = reader.readLine();
				contact.setPhone( input );
			
				input = reader.readLine();
				contact.setEmail( input );
			
				input = reader.readLine();
				contact.setStreet( input );
			
				input = reader.readLine();
				contact.setCity( input );
			
				input = reader.readLine();
				contact.setState( input );
			
				input = reader.readLine();
				contact.setZip( input );
			
				input = reader.readLine();
				contact.setOccupation( input );
		
				myContactsUnlimited.add(contact); // actually writing in array list
				
				numContacts++; // increment counter
			}
			reader.close(); // must close reader!
		
			// printing out all those wonderful contacts
			for ( ctr = 0; ctr < numContacts; ctr++ ){
				Contact contact = myContactsUnlimited.get(ctr); // making code cleaner again
				
				System.out.println( "Last name: " + contact.getLastName() );
				System.out.println( "First name: " + contact.getFirstName() );
				System.out.println( "Middle name: " + contact.getMiddleName() );
				System.out.println( "Prefix: " + contact.getPrefix() );
				System.out.println( "Phone: " + contact.getPhone() );
				System.out.println( "Email: " + contact.getEmail() );
				System.out.println( "Street: " + contact.getStreet() );
				System.out.println( "City: " + contact.getCity() );
				System.out.println( "State: " + contact.getState() );
				System.out.println( "ZIP: " + contact.getZip() );
				System.out.println( "Occupation: " + contact.getOccupation() );
				System.out.println( "------" );
			}
			
		} else { // When the file doesn't exist...
			do{ Contact contact = new Contact(); // make a new file!!
			
				// Setting all the contact info you would ever need to avoid someone!
				System.out.print( "Last name: ");
				input = keyboard.nextLine();
				contact.setLastName( input );
			
				System.out.print( "First name: ");
				input = keyboard.nextLine();
				contact.setFirstName( input );
	   
				System.out.print( "Middle name: " );
				input = keyboard.nextLine();
				contact.setMiddleName( input );
	        
				System.out.print( "Prefix: " );
				input = keyboard.nextLine();
				contact.setPrefix( input );
	        
				System.out.print( "Phone number: " );
				input = keyboard.nextLine();
				contact.setPhone( input );
	        
				System.out.print( "Email: " );
				input = keyboard.nextLine();
				contact.setEmail( input );
	        
				System.out.print( "Street address: " );
				input = keyboard.nextLine();
				contact.setStreet( input );

				System.out.print( "City: " );
				input = keyboard.nextLine();
				contact.setCity( input );
	        
				System.out.print( "State: " );
				input = keyboard.nextLine();
				contact.setState( input );
	        
				System.out.print( "ZIP code: " );
				input = keyboard.nextLine();
				contact.setZip( input );
	        
				System.out.print( "Occupation: " );
				input = keyboard.nextLine();
				contact.setOccupation( input );
				
				System.out.println( "Would you like to enter another(y/n)?" );
				input = keyboard.nextLine().toLowerCase();
				
				myContactsUnlimited.add(contact); // writing to array list
				// increment our counter so we make a new object without getting rid of the old one
				numContacts++;
			
				} while( input.equalsIgnoreCase("y") ); // keep making contacts until the user is done
				
		}	
		
		PrintWriter writer = new PrintWriter( fileStuff ); // for writing info to disk!!
		
		for ( ctr = 0; ctr < numContacts; ctr++ ){ 
			Contact contact = myContactsUnlimited.get(ctr); // code cleaning stuff
			// printing, printing, printing
			writer.println( contact.getLastName() );
			writer.println( contact.getFirstName() );
			writer.println( contact.getMiddleName() );
			writer.println( contact.getPrefix() );
			writer.println( contact.getPhone() );
			writer.println( contact.getEmail() );
			writer.println( contact.getStreet() );
			writer.println( contact.getCity() );
			writer.println( contact.getState() );
			writer.println( contact.getZip() );
			writer.println( contact.getOccupation() );
			System.out.println( "------" );
		}
		
		writer.close(); // always close your stuff!
	}

}
