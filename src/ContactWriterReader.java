
import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author woytek
 * @author Isabelle Schroeder
 *
 */
public class ContactWriterReader {

	/**
	 * @param args main arguments for ContactWriterReader program
	 */
	public static void main(String[] args) throws IOException {

		
		File stuff = new File( "OutputStuff.txt");
		BufferedReader inputFile;
		String input;
		
		//loop of contact objects
		// new loop to write each object from contact class object with stuff
		// second time through recreate array
		
		while( !stuff.exists() ){
			System.out.print(stuff.getName() + " does not exist. Enter new contact information.");
		
			do( )
		}
		
		
		
		
		
		
		
		
		
		
		
		
		File myFile = new File("myOutputFile.txt");
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
		
		inputFile.mark(256);
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

	}

}
