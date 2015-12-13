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
		PrintWriter outputFile;
		BufferedReader inputFile;
		int numContacts = 1;
		Scanner keyboard = new Scanner(System.in);
		String input;
		//int inputInt;
		int ctr = 1;
		
		BufferedReader reader = new BufferedReader( new FileReader(fileStuff) );
		while(reader.ready() ){
			// create new contact objects
			myContacts[numContacts] = new Contact();
			
			System.out.println( "Contact" + numContacts );
			
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
		}
		reader.close();
		
		for( ctr = 1; ctr < numContacts; ctr++ ){
			System.out.println( "Contact " + ctr );
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
		
		do { System.out.println(fileStuff.getName() + 
			" does not exist. Enter new contact information.");
			do{ fileStuff.createNewFile();
				
				PrintWriter writer = new PrintWriter(fileStuff);
				outputFile = new PrintWriter(fileStuff);
				myContacts[numContacts] = new Contact();
			
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
			
				}	while( input.equals("y") );
				//writer = new PrinterWriter(fileStuff);
				// loop through array and print
			outputFile.close();
			
		} while( !fileStuff.exists() );
			input = keyboard.nextLine();
			fileStuff = new File(input);
		
		//outputFile.close();
		
		inputFile = new BufferedReader( new FileReader(fileStuff) );
		
		//outputFile = new PrintWriter(fileStuff);
		
		inputFile.mark(256);
		
		while( inputFile.ready() ){
			input = inputFile.readLine();
			System.out.println( "Contact + c++ = " + input );
		}
		
		inputFile.reset();
		
		Stream<String> newStream;
		newStream = inputFile.lines();

		newStream.forEach( s -> System.out.println(s) );
		
		inputFile.close();
		
		
		/*
       
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setLastName( input );
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setFirstName( input );        
        
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
       	myContacts[numContacts].setMiddleName( input );
        
        System.out.print( "Enter prefix: " );
        input = keyboard.nextLine();
        myContacts[numContacts]t.setPrefix( input );
        
        System.out.print( "Enter phone number: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setPhone( input );
        
        System.out.print( "Enter email: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setEmail( input );
        
        System.out.print( "Enter street address: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setStreet( input );
        
        System.out.print( "Enter city: " );
        input = keyboard.nextLine();
       	myContacts[numContacts].setCity( input );
        
        System.out.print( "Enter state: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setState( input );
        
        System.out.print( "Enter ZIP code: " );
        input = keyboard.nextLine();
       	myContacts[numContacts].setZip( input );
        
        System.out.print( "Enter occupation: " );
        input = keyboard.nextLine();
        myContacts[numContacts].setOccupation( input );
        
        
		
		//loop of contact objects
		// new loop to write each object from contact class object with stuff
		// second time through recreate array
		
		/* Choose file and check to see if file exists */
		/*if( myContacts.exists() ){
			/* if file exists, read the contacts into Contact objects
			 * and display them to user
			 */
		/*	reader = new BufferedReader( new FileReader(myFile) );
			while(reader.ready() ){
				// create new contact objects
				myContacts[numCOntacts] = new Contact();
				
				input = reader.readLine();
				myContacts[numContacts].setLastNAme( input );
				
				input = reader.readeLine();
				myContacts[numContacts].setFirstName( input );
				
				// increment counter
				numContacts++;
			}
			reader.close();
			
			for( int ctr = 0; ctr < numContacts; ctr++ ){
				System.out.println( "Last name: " + myContacts[ctr].getLastName() );
				System.out.println( "First name: " + myContacts[ctr].getFirstName() );
				System.out.printf("%s %s\n", myContacts[ctr].getFirstName(), myContacts[ctr].getFirstName());
				System.out.println( "------" );
			}
			
			
		} else {
			
		}
		
		/* if file doesn't exist, create an array of COntact
		 * objects and then write them to disk and exit the program
		 */
		
		
		/*do{ 
			// create new contact object in the array
			myContacts[numContacts] = new Contact();
			
			System.out.print( "Last name: ");
			input = keyboard.nextLine();
			myContacts[numCOntacts].setLastName( input );
			
			System.out.print( "First name: ");
			input = keyboard.nextLine();
			myContacts[numContacts].setFirstName( input );
			
			System.out.println( "Would you like to enter another(y/n)?" );
			input keyboard.nextLine().toLowerCase();
			
			// increment our counter so we make a new object
			numContacts++;
			
		}	while( input.equals("y") );
		writer = new PrinterWriter(myFile);
		// loop through array and print
		
		for( int = 0; ctr < numContacts; ctr++ ){
			writer.println( myContacts[ctr].getLastName() );
			writer.println( myContacts[ctr].getFirstName() );
		}
		
	//		System.out.print(stuff.getName() + " does not exist. Enter new contact information." );
		*/
	}

}
