package KumpulanContoh;

public class DeretAngkaDenganPola6 {
    
    public static void main(String[] args) {
//      Variabel utama
        int ut = 60;
        while(ut<=70)
        {
//          Variabel riset
            int br = 700;
            while(br<=720)
            {
                System.out.println(br+" "+ut);
                br = br + 10;
            }
            ut = ut + 10;
        }
    }
}
