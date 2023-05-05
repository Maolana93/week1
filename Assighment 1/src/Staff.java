public class Staff {
    private String name;
    private String email;
    private String id;
    private String gender;

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Staff(String name, String email, String id, String gender) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.gender = gender;

    }
}
