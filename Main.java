import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String eNaslov = sc.nextLine();
        String ime = sc.nextLine();
        Paketor p = new Paketor(eNaslov, ime);
        p.izpis();
    }
}