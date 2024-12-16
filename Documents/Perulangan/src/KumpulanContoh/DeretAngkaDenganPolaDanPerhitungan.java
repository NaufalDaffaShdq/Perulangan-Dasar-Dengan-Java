package KumpulanContoh;

public class DeretAngkaDenganPolaDanPerhitungan {

    public static void main(String[] args) {
    int a = 17, b = 11, c = 0, d = 2, e = 0;
    while (b>=8)
      { 
        c = a + b;
        e = c * d;
    System.out.println(a+ "\t + " +b+ "\t = " +c+ "\t * " +d+ "\t = " +e);
        a = a + 1;
        b = b - 1;
        d = d + 2;
      }
    }
}