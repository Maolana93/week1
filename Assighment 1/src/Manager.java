public class Manager extends Staff{
    private String hiring;

    public Manager(String hiring) {
        this.hiring = hiring;
    }

    public Manager(String name, String email, String id, String gender, String hiring) {
        super(name, email, id, gender);
        this.hiring = hiring;
    }
}
