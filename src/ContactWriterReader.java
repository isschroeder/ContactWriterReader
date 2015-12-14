//import Contact.Contact;
import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author woytek
 * @author Isabelle Schroeder
 * This program saves and reads a file of contacts.
 */
public class ContactWriterReader {

	/**
	 * @param args main arguments for ContactWriterReader program
	 */
	public static void main(String[] args) throws IOException {
		
		File fileStuff = new File("myContacts.txt");
		Contact[] myContacts;
		myContacts = new Contact[110]; // initialize to 110 elements (enough for 10 contacts)
		//PrintWriter outputFile;
	//	BufferedReader inputFile;
		int numContacts = 0;
		Scanner keyboard = new Scanner(System.in);
		String input;
		int ctr = 1;
	//	inputFile = new BufferedReader( new FileReader(fileStuff) );
	//	outputFile = new PrintWriter(fileStuff);
		
		if( fileStuff.exists() ){
			BufferedReader reader = new BufferedReader( new FileReader(fileStuff) );
			
			while(reader.ready() );
				// create new contact objects
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
				// increment counter
				numContacts++;
			
			reader.close();
		
			for ( ctr = 1; ctr < numContacts; ctr++ ){
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
			
		} else { 
			//do { System.out.println(fileStuff.getName() + 
			//" does not exist. Enter new contact information.");
			//fileStuff.createNewFile();
			
			do{ myContacts[numContacts] = new Contact();
			
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
			
				// increment our counter so we make a new object
				numContacts++;
			
				} while( input.equalsIgnoreCase("y") );
				// loop through array and print
		}	
		
		PrintWriter writer = new PrintWriter( fileStuff );
		
		for ( ctr = 1; ctr < numContacts; ctr++ ){
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
		
		writer.close();
		
		
		
		
		
		
		//outputFile.close();
		
		
		
		/* while( !fileStuff.exists() );
			input = keyboard.nextLine();
		
		inputFile.mark(256);
		
		while( inputFile.ready() ){
			input = inputFile.readLine();
			System.out.println( input );
		}
		
		inputFile.reset();
		
		Stream<String> newStream;
		newStream = inputFile.lines();

		newStream.forEach( s -> System.out.println(s) );
		
		inputFile.close();
		*/
		
	}

}
