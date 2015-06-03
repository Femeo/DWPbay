package dwpbay;

public class User {

	private int userID ;
	private String firstName ;
	private String lastName ;
	private String email ;
	private String address ;
	private String postcode ;
	
	public User(int userID, String firstName, String lastName, String email, String address, String postcode) {
		this.userID = userID ;
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.email = email ;
		this.address = address ; 
		this.postcode = postcode ;
	}
}
