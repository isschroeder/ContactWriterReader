import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

//import java.util.*;

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
		
		File myFile = new File("myOutputFile.txt");
		Contact[] myContacts;
		myContacts = new Contact[25]; // initialize to 25 elements
		PrintWriter outputFile;
		BufferedReader inputFile;
		Scanner keyboard = new Scanner(System.in);
		String inputString;
		int inputInt;
		int c = 1;

		
		
		
		
		
		
		
		
		
		
		/* File myFile = new File( "my-contacts.txt");
//		Contact[] myContacts;
//		myContacts = new Contact[25]; // initialize to 25 elements
		BufferedReader inputFile;
		String input;
		int numContacts = 0;
		Scanner keyboard = new Scanner( System.in );
		
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
		
		
		
		
		
		
		
		
		
		
		
		/*File myFile = new File("myOutputFile.txt");
		//PrintWriter outputFile;
		BufferedReader inputFile;
		Scanner keyboard = new Scanner(System.in);
		String inputString;
		int inputInt;
		int c = 1;

		while( !myFile.exists() ){
			System.out.print(myFile.getName() + " does not exist. New name: ");
			inputString = keyboard.nextLine();
			myFile = new File(inputString);
		}
		
		inputFile= new BufferedReader( new FileReader(myFile) );
		/*
		while(myFile.exists()){
			System.out.print(myFile.getName() + " exists. New name: ");
			inputString = keybd.nextLine();
			myFile = new File(inputString);
		}
		
		outputFile=new PrintWriter(myFile);
		*/
		
		/*inputFile.mark(256);
		//do something silly
		while( inputFile.ready() ){
			inputString = inputFile.readLine();
			System.out.println( "line [" + c++ + "] = " + inputString );
		}
		
		inputFile.reset();
		
		Stream<String> newStream;
		newStream = inputFile.lines();

		newStream.forEach( s -> System.out.println(s) );
		
	inputFile.close();
	*/
	}

}
