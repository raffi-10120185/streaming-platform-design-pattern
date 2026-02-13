package facade;

public class UserService {

    public boolean login(String username, String password) {
        System.out.println("User " + username + " berhasil login.");
        return true;
    }
}
