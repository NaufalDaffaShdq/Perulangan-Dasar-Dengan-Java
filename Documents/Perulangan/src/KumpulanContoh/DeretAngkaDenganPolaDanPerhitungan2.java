package KumpulanContoh;

public class DeretAngkaDenganPolaDanPerhitungan2 {

    public static void main(String[] args) {
    int a = 12, b = 4, c = 1, d = 0, e = 6, f = 2, g = 0, r = 1;
    while (b<=14)
      {
        d = a * b * c;
        g = d + e - f;
    System.out.println(a+ "\t * " +b+ "\t * " +c+ "\t = " +d+ "\t + " +e+ "\t - " +f+ "\t = " +g);
        b = b + r;
        r = r + 1;
        a = a + 0;
        c = c + 1;
        e = e * 2;
        f = f + 1;
      }
    }
}