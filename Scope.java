// Демонстрация области видимости блока кода
public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и y равны " + x + " " + y); // X доступен в блоке
        } // переменная Y уничтожена
        // System.out.println(y); - ошибка, Y не в зоне видимисти, такой переменной не существует
        System.out.println("x равен " + x);
    }
}
