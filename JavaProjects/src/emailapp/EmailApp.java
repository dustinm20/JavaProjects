package emailapp;

/**
 * Created by Dustin on 3/19/18.
 */
public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Dustin", "Moore");
        System.out.println(em1.showInfo());
    }
}
