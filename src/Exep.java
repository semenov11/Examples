/**
 * Created by Серёжа on 28.08.2017.
 */
public class Exep {
    public static void main(String[] args) {

        public static int area ( int width, int height){
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
            }
            return width * height;
        }
    }
}