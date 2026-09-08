package Jobsheet3.praktikum03;

public class User {
    public String username;
    public String password;
    public String nama;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "Polinema123";
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
