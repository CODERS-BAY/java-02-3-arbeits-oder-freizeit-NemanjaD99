public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("gib eine Zeit aus:");
        double zahl = sc.nextInt();
        double[] Zeit = {8.00, 11.59, 12.00, 13.00, 16.00};

        if (zahl < Zeit[0]) {
            System.out.println("Es ist " + zahl + " du bist zu früh,der Kurs hat nicht offen");
        }

        if (zahl >= Zeit[0] && zahl <= Zeit[1]) {
            System.out.println("Es ist " + zahl + " du Bist im Kurs");
        }

        if (zahl >= Zeit[2] && zahl <= Zeit[3]) {
            System.out.println("Es ist " + zahl + " und du hast Mittags Pause");
        }

        if (zahl >= Zeit[3] && zahl <= Zeit[4]) {
            System.out.println("Es ist " + zahl + " und du bist im Kurs");
        }

        if (zahl >= Zeit[4]) {
            System.out.println("Es ist " + zahl + " und du bist nicht mehr im Kurs");
        }
    }
