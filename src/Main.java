//PROVA "CARTACEA"
//[A]: considering that a=1, b=3, c=a*b, d=c: (d / c + 2) >= b || !(c + b - c / a == 3) = 3/3 +2 >= 3 (3) vero o 3==3 -> V
//[B]: considering that x=5, y=6, t=false and f=true: (x * x - y * y / 2 != 12) || !t && f = -5,5 != 12 vero o vero -> V

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;

        int c = a * b;
        int d = c;

        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;

        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3));
        System.out.println((x * x - y * y / 2 != 12) || !t && f);
    }
}