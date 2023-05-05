public class Human {
    private String name;
    private String color;
    private String height;

    public Human(String name, String color, String height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
    public static String move(){
        return "move";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
