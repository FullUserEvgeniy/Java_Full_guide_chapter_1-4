// Демонстрация времени жизни переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int y = -1;
            System.out.println("Значение Y равно " + y);
            y = 100;
            System.out.println("Теперь значение Y равно " + y);
        }
    }
}
