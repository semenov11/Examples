/**
 * Created by Серёжа on 29.07.2017.
 */
public class Tcikli {
    public static void main(String[] args) {
        int x = 99;
        String s = " бутылки";
        while (x>0) {
            if (x == 1) {
                s = " бутылка";
            }
            System.out.println(x + s + " пива на стене");
            System.out.println(x + s + " пива.");
            x--;
        }
            if (x>0) {
                System.out.println(x + s + " пива на стене");
            } else {
                System.out.println("больше нет пива");
            }

    }
}
