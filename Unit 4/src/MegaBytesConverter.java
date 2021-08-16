public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            final int kiloBytesPerMegaByte = 1_024;
            System.out.println(kiloBytes + " KB = " + kiloBytes / kiloBytesPerMegaByte + " MB and "
                    + kiloBytes % kiloBytesPerMegaByte + " KB");
        }
    }
}
