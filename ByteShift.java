// Сдвиг влево значения byte
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a<<2;
        b = (byte) (a<<2);
        System.out.println("Первоначальное значение: " +  a);
        System.out.println("Сдвиг на 2 бита влево числа byte с повышением типа до int: " + i);
        System.out.println("Сдвиг на 2 бита влево числа byte c приведением типа к byte: " + b);
    }
}
