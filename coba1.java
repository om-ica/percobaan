import java.util.Scanner;
public class coba1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,r2,r3,r4,v1;
        float i1;
        System.out.print("Masukkan Hambatan 1 (R1): ");
        r1 = sc.nextInt();
        System.out.print("Masukkan Hambatan 2 (R2): ");
        r2 = sc.nextInt();
        System.out.print("Masukkan Hambatan 3 (R3): ");
        r3 = sc.nextInt();
        System.out.print("Masukkan Hambatan 4 (R4): ");
        r4 = sc.nextInt();
        System.out.print("Masukkan Tegangan 1 (V1): ");
        v1 = sc.nextInt();
        i1 = v1/(1/(1/r1 + 1/r2 + 1/r3) + r4);
        System.out.print("Arus Listrik: " + i1);
        
    }
}