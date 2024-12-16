package KumpulanContoh;

public class DeretAngkaDenganPola {

    public static void main(String[] args) {
        int AK = 15, R = 2;
        while(AK<=29)
        {
            System.out.print(AK+" ");
            AK = AK + R;
            R = R + 1;
        }
        System.out.println("");
    }
    
}