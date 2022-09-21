import java.util.Scanner;

class Mainclass {
    Manager mc = new Manager();

    public static void main(String[] args) {

        Mainclass morseCode = new Mainclass();
        morseCode.run();
    }

    public void run() {

        menu();
        int select = getSelect();
        try {
            if (select == 1){
                System.out.println("Fyll i text på Engelska");
                String engString = getScanner().nextLine();
                String result = mc.englishToMorse(engString);
                System.out.println("Engelska: " + engString + "Morse kod: " + result);
            }
            else if (select == 2) {
                System.out.println("Fyll i morse kod, med ett kommatecken: ");
                String Sselect = "";
                try {
                    Sselect = getScanner().nextLine();
                }
                catch (Exception d) {
                    System.out.println("Endast morsekod tillåten, vänligen börja om.");
                    System.exit(0);
                }
                String result = mc.morseToEnglish(Sselect);
                System.out.println("Morse " + Sselect + " Engelska: " + result);
             }
            else {
                System.out.println("Ett error har uppkommit, vänligen starta om programmet");
            }

    } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
}

private int getSelect () {
    int select = 0;
    try {
    select = getScanner().nextInt();
    }
    catch (Exception e){
        System.out.println("Error");
    }
    return select;
}
private void menu () {
        mc.mapManager();
        System.out.println("Morsekod översättare");
        System.out.println("1. Engelska till Morsekod");
        System.out.println("2. Morsekod till Engelska");
}
private static Scanner getScanner () {
        return new Scanner(System.in);
    }
}
