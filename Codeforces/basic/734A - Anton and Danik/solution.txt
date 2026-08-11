import java.util.*;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int Anton = 0;
        int Danik = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'D') {
                Danik++;
            } else {
                Anton++;
            }
        }

        if (Anton > Danik) {
            System.out.println("Anton");
        } else if (Anton < Danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        sc.close();
    }
}