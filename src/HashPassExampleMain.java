import java.security.NoSuchAlgorithmException;

public class HashPassExampleMain {
	public static void main(String[] args){
		try {
			String pwd = "Pa55w0rd";
			String salt = PasswordUtil.getSalt();
					
			String hashedPassword = PasswordUtil.hashPasswordPlusSalt(pwd,salt);
			System.out.print("Store the hashed password in the database: ");
			System.out.println(hashedPassword);
			System.out.print("Store the salt in the database: ");
			System.out.println(salt);
			
			System.out.println(PasswordUtil.compareSaltedHashWithUserEnteredPwd(salt, "Pa55w0rd", hashedPassword));
			
		}catch (NoSuchAlgorithmException e){
			System.out.println(e);
		}
	}

}
