// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Human hum = new Human("Hassan","black","5.7f");
        System.out.println(hum.getName());
        System.out.println(hum.getHeight());
        Baby by = new Baby("Salam","black","1.6f",1,1);
        Human byIn = new Baby("wajiu","black","5.8",24,65);
        //System.out.println(by);
        System.out.println("This is my invention : "+ byIn);
        //System.out.println("This is initial class: "+hum);
        System.out.println(hum.move());
    }
}