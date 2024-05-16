public class User {
    private String username;
    private String sex;
    private String address;
    private String name;
    private String email;
    private String birthday;

    public User() {}

    public User(String username, String sex, String address, String name, String email, String birthday) {
        this.username = username;
        this.sex = sex;
        this.address = address;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }
}
