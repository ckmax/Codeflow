package application;

import model.User;

import java.util.HashMap;

public final class UserManager {

	private static HashMap<String, User> userHashMap = null;

	/**
	 * Create new User
	 * return 0 if successful, 1 if there's already a user with the same username, -1 otherwise
	 * @param username
	 * @param password
	 * @param email
	 * @param userType
	 * @return
	 */
	public static int createUser(String username, String password, String email, String userType){
        if (userHashMap == null) {
            userHashMap = new HashMap<>();
        }

        if (userHashMap.containsKey(username)) {
            return 1;
        }

        if (isIllegalPassword(password)) {
            return -1;
        }

        User newUser = new User();
        userHashMap.put(username, newUser);
        return 0;
	}
	
	/**
	 * Remove user
	 * return 0 if successful, 1 if no user has the provided username, -1 otherwise
	 * @param username
	 * @return
	 */
	public static int removeUser(String username){
		if (userHashMap == null) {
            return -1;
        }

        if (!userHashMap.containsKey(username)) {
            return 1;
        }

        userHashMap.remove(username);
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
	public static int editUser(String username, String password, String email, String userType){
		if (userHashMap == null) {
            return -1;
        }

        if (!userHashMap.containsKey(username)) {
			return 1;
		}

		User user = new User();
        userHashMap.remove(username);
        userHashMap.put(username, user);
        return 0;
	}
	
	/**
	 * Return true if login is successful, false otherwise
	 * we assume that the username is an email
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password){
		User user = userHashMap.get(username);
        if (!user.getPassword().equals(password)) {
            return false;
        }
        if (user.isLoggedIn()) {
            return false;
        }

        user.login();
        return true;
	}
	
	/**
	 * Return true if successful, false if the user is not logged in
	 * @param username
	 * @return
	 */
	public static boolean logout(String username){
		if (user.isLoggedIn()) {
            user.logout();
            return true;
        }
        return false;
	}

    /**
     * Check whether the password is a legal password or not.
     * @param password: the password to check
     * @return true: the given password is legal
     *         false: the given password is illegal
     */
	private static boolean isIllegalPassword(String password) {
        return false;
    }

    /**
     * Delete all user data
     */
    protected static void clearUserData() {
        userHashMap = null;
    }
}
