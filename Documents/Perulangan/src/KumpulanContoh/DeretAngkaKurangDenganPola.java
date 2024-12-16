package KumpulanContoh;

public class DeretAngkaKurangDenganPola {
    
    public static void main(String[] args) {
        int A = 32, R = 5;
            while(R>=0)
        {
            System.out.print(A + " ");
            A = A - R;
            R = R - 1;
        }
        System.out.println("");
    }
}
