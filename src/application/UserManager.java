package application;

public class UserManager {

	/**
	 * Create new User
	 * return 0 if successful, 1 if there��s already a user with the same username, -1 otherwise
	 * @param username
	 * @param password
	 * @param email
	 * @param userType
	 * @return
	 */
	public int createUser(String username, String password, String email, String userType){
		return 0;
	}
	
	/**
	 * Remove user
	 * return 0 if successful, 1 if no user has the provided username, -1 otherwise
	 * @param username
	 * @return
	 */
	public int removeUser(String username){
		return 0;
	}
	
	/**
	 * Edit a current user
	 * return 0 if successful, 1 if no user has the provided username, -1 otherwise
	 * @param username
	 * @param password
	 * @param email
	 * @param userType
	 * @return
	 */
	public int editUser(String username, String password, String email, String userType){
		return 0;
	}
	
	/**
	 * Return true if login is successful, false otherwise
	 * we assume that the username is an email
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean login(String username, String password){
		return false;
	}
	
	/**
	 * Return true if successful, false if the user is not logged in
	 * @param username
	 * @return
	 */
	public boolean logout(String username){
		return false;
	}	
}
