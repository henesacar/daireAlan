import java.util.Scanner;

public class DaireAlan {
   static final double PI = 3.14;
    public static void main(String[] args) {
        double yariCap,merkezAci;
        Scanner scn = new Scanner(System.in);
        System.out.println("Daire yarı çapını girin: ");
        yariCap=scn.nextInt();
        System.out.println("Daire merkez açısını girin: ");
        merkezAci = scn.nextInt();
        double formul = (PI*(yariCap*yariCap)*merkezAci)/360;
        System.out.println("Daire diliminizin alanı: "+formul);
    }
}
