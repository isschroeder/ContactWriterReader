 public class Contact {
        Contact() {
        }
        /**
         * 
         * @param n the args for methods
         */
        public void setLastName( String input ) {
         
        	
        // regulates the acceptable characters in last name
        	if( !input.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = input;
            }
        }
        public String getLastName() {
            return lName;
        }
        
        
        public void setFirstName( String input ) {
        // included - and ' here and in middle name because some people have really weird names	
        	if( !input.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in first name" );
            } else {
                fName = input;
            }
        }
        public String getFirstName() {
            return fName;
        }
        
        
        public void setMiddleName( String input ) {
        	if( !input.matches("^[A-Za-z - ']+$") ) {
                System.out.println( "Invalid characters in middle name" );
            } else {
                mName = input;
            }
        }
        public String getMiddleName() {
            return mName;
        }
        
        
        public void setPrefix( String input ){
        	//prefixes shouldn't have more than 4 characters as far as I'm concerned
        	if( !input.matches("^[A-Za-z .]{1,4}$") ) {
                System.out.println( "Invalid characters in prefix" );
            } else {
                prefix = input;
            }
        }
        public String getPrefix(){
        	return prefix;
        }
        
        
        public void setPhone( String input ){
        	/** finally got this to work so I decided not to anger the beast
        	* by splitting the number up in 3 parts, so now it just works for 
        	* hyphens or no hyphens and you're on your own with where those go
        	*/
        	if( !input.matches("^[0-9 -]{10,13}$") ) {
                System.out.println( "Invalid characters in phone number" );
            } else {
            	phone = input;
            }
        }
        public String getPhone(){
        	return phone;
        }
        
        
        public void setEmail( String input ){
        	// not sure what other symbols one might have in their email address
        	if( !input.matches("^[A-Za-z_@0-9.]+$") ) {
                System.out.println( "Invalid characters in email" );
            } else {
                email = input;
            }       
        }
        public String getEmail(){
        	return email;
        }
        
        
        public void setStreet( String input ){
        	// user can put in house number with street name
        	if( !input.matches("^[A-Za-z 0-9 .]+$") ) {
                System.out.println( "Invalid characters in street address" );
            } else {
                street = input;
            }
        }
        public String getStreet(){
        	return street;
        }
        
        
        public void setCity( String input ){
        	if( !input.matches("^[A-Za-z]+$") ) {
                System.out.println( "Invalid characters in city" );
            } else {
                city = input;
            }
        }
        public String getCity(){
        	return city;
        }
        
        
        public void setState( String input ){
        	// works for both abbreviations and full names!
        	if( !input.matches("^[A-Za-z .]+$") ) {
                System.out.println( "Invalid characters in state" );
            } else {
                state = input;
            }
        }
        public String getState(){
        	return state;
        }
        
        
        public void setZip( String input ){
        	// Foreigners..
        	if( !input.matches("^[A-Za-z - 0-9]+$") ) {
                System.out.println( "Invalid characters in zip code" );
            } else {
                zip = input;
            }
        }
        public String getZip(){
        	return zip;
        }
        
        
        public void setOccupation( String input ){
        	// included / for multiple jobs/descriptions
        	if( !input.matches("^[A-Za-z / ]+$") ) {
                System.out.println( "Invalid characters in occupation" );
            } else {
                occupation = input;
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

