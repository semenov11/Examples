/**
 * Created by Серёжа on 11.06.2017.
 */
public class SummaChisel {
    public static void main(String[] args) {
        int b = 555;
        int a = 0;
        while (b > 0) {
            a = a + b % 10;
            b = b / 10;
    }
        System.out.println(a);
        }
}

