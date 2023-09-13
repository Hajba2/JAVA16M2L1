import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int a;
        a = 43242;
        System.out.println(a);

        a = 8;
        System.out.println(a);

        int b = 7;
        System.out.println(b);

        long l = 2735475555555l;

        float f = 999999.9999999999999f;
        double d = 99999999.999999999999d;

        char c = 1031;
        System.out.println(c);


        String name = "Vova";

        float f1 = 0.3f;
        System.out.println(f1);
        System.out.println(0.3f);

        System.out.println(1f / 3f);

        BigDecimal bd = BigDecimal.valueOf(65456789l);

        boolean boolt = true;
        boolean boolf = false;


        int i3 = 3;
        int intPrim = 4;
        Integer intObject = Integer.valueOf(intPrim);
        //Integer intObject2 = new Integer(intPrim);

        int res = i3 + intPrim * intPrim;
        int res2 = (i3 + intPrim) * intPrim;
        System.out.println(res);
        System.out.println(res2);

        int i6;
        i6 = 9;
        System.out.println("i6 = " + i6);

        byte b1 = 127;
        b1 = (byte) (b1 + 1);
        System.out.println("b1 = " + (b1 + 1));

        int i7 = 345678;
        long l7 = i7;
        //long l7 = (long) i7;

        long l8 = 8767l;
        int i8 = (int) l8;

        float f2 = 7367.99f;
        int i10 = (int) f2;
        System.out.println("i10 = " + i10);

        System.out.println("Math.round(f2) = " + Math.round(f2));

        Integer intObject2 = null;
        //intObject2.byteValue();
        int i11 = 9;
        intObject2 = Integer.valueOf(9);

        //оператори
        //бінарні оператори
        // + - * / %
        //оператор присвоєння
        // =
        //унарні оператори
        //++ --

        int i12 = 12;
        int i13 = 12;

        int r1 = i12 * i13;
        int r2 = i12 / i13;
        int r3 = i12 - i13;
        int r4 = i12 + i13;

        System.out.println(i12);
        //i12--; // i12 = i12 + 1;
        System.out.println(i12);

        int r5 = i12++ + 1;
        int r6 = ++i13 + 1;

        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        int res7 = i3++ + ++i3;

        i12 = 12;
        i12 += 2; // i12 = i12 + 2; 14
        i12 -= 2; // i12 = i12 - 2; 10
        i12 *= 2; // i12 = i12 * 2; 24
        i12 /= 2; // i12 = i12 / 2; 6


    }
}