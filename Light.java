// Рассчитать расстояние, проходимое светом,
// с применением переменных типа loпg.
public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.println("За " + days);
        System.out.println(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
