/**
 * Created by Серёжа on 20.08.2017.
 */
public class Generator_Fraz {
    public static void main(String[] args) {
        String [] word1 = {"Я", "Ты", "Он", "Она", "Мы", "Вы"};
        String [] word2 = {"Хотим", "Будем", "Мечтает"};
        String [] word3 = {"Конфета", "Хот-дог", "Пицца", "Коктейль"};

        int one = word1.length;
        int two = word2.length;
        int three = word3.length;

        int rand1 = (int) (Math.random()*one);
        int rand2 = (int) (Math.random()*two);
        int rand3 = (int) (Math.random()*three);

        String vivod = word1[rand1] + " " + word2[rand2] + " " + word3[rand3];

        System.out.println("Всё что получилось - это " + vivod);


    }
}
