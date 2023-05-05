public class Ceo extends Staff{
    private String fire;

    public Ceo(String fire) {
        this.fire = fire;
    }

    public Ceo(String name, String email, String id, String gender, String fire) {
        super(name, email, id, gender);
        this.fire = fire;
    }
}
