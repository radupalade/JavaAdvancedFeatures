package EncapsulationExercise;

public final class User {

    private final String username;
    private final String firstName;
    private final String lastName;

    public String getUsername() {
        return username;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateDisplayName() {
        return "username: " + username + "\n" + "full name: " + firstName + " " + lastName;

    }

    public static void main(String[] args) {

        User user = new User("Batman", "Popescu", "Gica");
        System.out.println(user.generateDisplayName());
    }
}
