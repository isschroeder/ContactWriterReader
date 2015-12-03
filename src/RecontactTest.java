import java.util.Scanner;

public class RecontactTest {

	public static void main(String[] args) {
        Contact testContact = new Contact(); // doing contact information
        String input = null; // holds seriously everything
        Scanner keyboard = new Scanner(System.in); // for inputting
       
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );        
        
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName( input );
        
        System.out.print( "Enter prefix: " );
        input = keyboard.nextLine();
        testContact.setPrefix( input );
        
        System.out.print( "Enter phone number: " );
        input = keyboard.nextLine();
        testContact.setPhone( input );
        
        System.out.print( "Enter email: " );
        input = keyboard.nextLine();
        testContact.setEmail( input );
        
        System.out.print( "Enter street address: " );
        input = keyboard.nextLine();
        testContact.setStreet( input );
        
        System.out.print( "Enter city: " );
        input = keyboard.nextLine();
        testContact.setCity( input );
        
        System.out.print( "Enter state: " );
        input = keyboard.nextLine();
        testContact.setState( input );
        
        System.out.print( "Enter ZIP code: " );
        input = keyboard.nextLine();
        testContact.setZip( input );
        
        System.out.print( "Enter occupation: " );
        input = keyboard.nextLine();
        testContact.setOccupation( input );
        
        // printing everything out
        System.out.println( "Last name: " + testContact.getLastName() );
        System.out.println( "First name: " + testContact.getFirstName() );
        System.out.println( "Middle name: " + testContact.getMiddleName() );
        System.out.println( "Prefix: " + testContact.getPrefix() );
        System.out.println( "Phone number: " + testContact.getPhone() );
        System.out.println( "Email: " + testContact.getEmail() );
        System.out.println( "Street: " + testContact.getStreet() );
        System.out.println( "City: " + testContact.getCity() );
        System.out.println( "State: " + testContact.getState() ); 
        System.out.println( "ZIP: " + testContact.getZip() );
        System.out.println( "Occupation: " + testContact.getOccupation() );
       
    }
    
    public static class Contact {
        Contact() {
        }
        /**
         * 
         * @param n the args for methods
         */
        public void setLastName( String n ) {
         
        	
        // regulates the acceptable characters in last name
        	if( !n.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        public String getLastName() {
            return lName;
        }
        
        
        public void setFirstName( String n ) {
        // included - and ' here and in middle name because some people have really weird names	
        	if( !n.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in first name" );
            } else {
                fName = n;
            }
        }
        public String getFirstName() {
            return fName;
        }
        
        
        public void setMiddleName( String n ) {
        	if( !n.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in middle name" );
            } else {
                mName = n;
            }
        }
        public String getMiddleName() {
            return mName;
        }
        
        
        public void setPrefix( String n ){
        	//prefixes shouldn't have more than 4 characters as far as I'm concerned
        	if( !n.matches("^[A-Za-z .]{1,4}$") ) {
                System.out.println( "Invalid characters in prefix" );
            } else {
                prefix = n;
            }
        }
        public String getPrefix(){
        	return prefix;
        }
        
        
        public void setPhone( String n ){
        	/** finally got this to work so I decided not to anger the beast
        	* by splitting the number up in 3 parts, so now it just works for 
        	* hyphens or no hyphens and you're on your own with where those go
        	*/
        	if( !n.matches("^[0-9 -]{10,13}$") ) {
                System.out.println( "Invalid characters in phone number" );
            } else {
            	phone = n;
            }
        }
        public String getPhone(){
        	return phone;
        }
        
        
        public void setEmail( String n ){
        	// not sure what other symbols one might have in their email address
        	if( !n.matches("^[A-Za-z_@0-9.]+$") ) {
                System.out.println( "Invalid characters in email" );
            } else {
                email = n;
            }       
        }
        public String getEmail(){
        	return email;
        }
        
        
        public void setStreet( String n ){
        	// user can put in house number with street name
        	if( !n.matches("^[A-Za-z 0-9 .]+$") ) {
                System.out.println( "Invalid characters in street address" );
            } else {
                street = n;
            }
        }
        public String getStreet(){
        	return street;
        }
        
        
        public void setCity( String n ){
        	if( !n.matches("^[A-Za-z]+$") ) {
                System.out.println( "Invalid characters in city" );
            } else {
                city = n;
            }
        }
        public String getCity(){
        	return city;
        }
        
        
        public void setState( String n ){
        	// works for both abbreviations and full names!
        	if( !n.matches("^[A-Za-z .]+$") ) {
                System.out.println( "Invalid characters in state" );
            } else {
                state = n;
            }
        }
        public String getState(){
        	return state;
        }
        
        
        public void setZip( String n ){
        	// Foreigners..
        	if( !n.matches("^[A-Za-z - 0-9]+$") ) {
                System.out.println( "Invalid characters in zip code" );
            } else {
                zip = n;
            }
        }
        public String getZip(){
        	return zip;
        }
        
        
        public void setOccupation( String n ){
        	// included / for multiple jobs/descriptions
        	if( !n.matches("^[A-Za-z / ]+$") ) {
                System.out.println( "Invalid characters in occupation" );
            } else {
                occupation = n;
            }
        }
        public String getOccupation(){
        	return occupation;
        }
        /*
         * Name (first, last, middle)
         * Prefix
         * Phone number
         * email
         * address (street, city, state, zip)
         * occupation
        */
        
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
	}

}
