public class Baby extends Human{
    private Integer age;
    private Integer weight;

    public Baby(String name, String color, String height, Integer age, Integer weight) {
        super(name, color, height);
        this.age = age;
        this.weight = weight;
    }
}
