/**
 * Java-Code-Lösungen für die Übungsaufgaben des Java-Trainers der Mischok Academy
 *
 * Die Aufgaben beziehen sich nur auf das Modul II (Java II), gemischt aus allen 5 Level.
 * Am besten nach den Aufgabentext im Code suchen.
 *
 * Den Methodenaufruf findet man am besten in dem man nach den Namen der dazugehörigen Methode sucht.
 *
 * Methoden wurden teilweise umbenannt, da im Trainer diese teilweise gleich benannt wurden (meineMethode z.B.)
 *
 * @author Patrick
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static String baueWortPyramide(String str){

        String returnWert = "";

        for (int i = 1; i <= str.length(); i++){
            returnWert += str.substring(0, i) + "\n";
        }

        return returnWert;
    }

    /*
    Es wurde bereits ein zweidimensionales String-Array meinArray deklariert und initialisiert.
    Ändere den Wert des 1. Elements des 2. inneren Arrays auf abc.
     */
    public static String[][] meineMethode(String[][] meinArray){
        //Konsolenausgaben sind optional, werden in Lösung nicht benötigt
        System.out.println(meinArray[1][0]);
        meinArray[1][0] = "abc";
        System.out.println(meinArray[1][0]);
        return meinArray;
    }

    /*
     Sorge dafür, dass alle Ganzzahlen von 1 bis 5 auf der Kommandozeile ausgegeben werden.
     */
    public static void methode1bis5(){
        for (int i = 1; i <= 5; i++ ){
            System.out.println(i);
        }
    }

    /*
    Das unten stehende Muster ist gegeben. Dieses Beispielmuster besteht aus fünf Zeilen.
    Überlege dir eine oder mehrere Schleifen, um ein solches Muster zu erstellen, das aus
    beliebig vielen Zeilen bestehen und sich beliebig weit nach oben fortsetzen kann.
    Nutze für die Anzahl der Zeilen die bereits initialisierte Variable anzahlZeilen.
        ***
         ***
          ***
           ***
            ***
     */
    public static void methodeRechtSeitigePyramide(int anzahlZeilen){
        for (int i = 0; i < anzahlZeilen; i++){
            String muster = "";
            for (int j = 0; j < i; j++){
                muster += " ";
            }
            muster += "***";
            System.out.println(muster);
        }
    }

    /*
    Entferne das erste Element aus der String-Liste koffer.
     */
    public static List<String> ersteElementEntfernen(List<String> koffer){
        System.out.println(koffer.get(0));
        koffer.remove(0);
        System.out.println(koffer.get(0));
        return koffer;
    }

    /*
    Das unten stehende Muster ist gegeben. Dieses Beispielmuster besteht aus fünf Zeilen. Überlege dir
    eine oder mehrere Schleifen, um ein solches Muster zu erstellen, das aus beliebig vielen Zeilen
    bestehen und sich beliebig weit nach oben fortsetzen kann. Nutze für die Anzahl der Zeilen die
    bereits initialisierte Variable anzahlZeilen.
    1
    22
    333
    4444
    55555
     */
    public static void zahlenPyramide(int anzahlZeilen){
        for (int i = 1; i <= anzahlZeilen; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    /*
    Ergänze die folgende Methode mit gegebenem Methodenkopf um den passenden Methodenrumpf, damit die
    Methode für die übergebene int-Variable zahl zurückgibt, ob sie eine Primzahl ist.
     */
    public static boolean isPrimzahl(int zahl){
        for (int i = 2; i <= zahl / 2; i++ ){
            if (zahl % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
    Deklariere eine Methode printHallo, die Hallo auf der Kommandozeile ausgibt.
     */
    public static void printHallo(){
        System.out.println("Hallo");
    }

    /*
    Das unten stehende Muster ist gegeben. Dieses Beispielmuster besteht aus fünf Zeilen. Überlege dir
    eine oder mehrere Schleifen, um ein solches Muster zu erstellen, das aus beliebig vielen Zeilen
    bestehen und sich beliebig weit nach oben fortsetzen kann. Nutze für die Anzahl der Zeilen die
    bereits initialisierte Variable anzahlZeilen.
    *
    **
    ***
    ****
    *****
     */
    public static void sternenPyramide(int anzahlZeilen){
        for (int i = 0; i < anzahlZeilen; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /*
    Weise der bereits deklarierten int-Variable zahl den Wert des ersten Elements der Integer-Liste zahlen zu.
     */
    public static int integerListe(List<Integer> zahlen){
        int zahl;
        zahl = zahlen.get(0);
        return zahl;
    }

    /*
    Finde die kleinste Ganzzahl über 100 und unter 10000, die sowohl durch a als auch b teilbar ist
    und gib sie auf der Kommandozeile aus.
     */
    public static void ganzzahlTeilbar(int a, int b){
        for (int i = 101; i < 10000; i++){
            if (i % a == 0 && i % b == 0){
                System.out.println(i);
                break;
            }
        }
    }

    /*
    Ergänze die folgende Methode mit gegebenem Methodenkopf um den passenden Methodenrumpf, damit
    die Methode den übergebenen String umdreht und zurückgibt.
     */
    public static String kehreStringUm(String str){
        String umgedreht = "";
        for (int i = str.length(); i > 0; i--){
            umgedreht += str.charAt(i-1);
        }
        return umgedreht;
    }

    /*
    Ändere den Wert des vierten Elements des int-Arrays niederschlagsmenge auf den Wert 3.
     */
    public static int[] niederschlagsmengeArray(int[] niederschlagsmenge){
        //Konsolenausgaben sind optional, werden in Lösung nicht benötigt
        System.out.println("Wert davor: " + niederschlagsmenge[3]);
        niederschlagsmenge[3] = 3;
        System.out.println("Wert danach: " + niederschlagsmenge[3]);
        return niederschlagsmenge;
    }

    /*
    Wandle das String-Array saengerArray in eine String-Liste um und weise die Liste der
    bereits deklarierten Variable saengerList zu.
     */
    public static List<String> saengerList(String[] saengerArray){
        //Konsolenausgaben sind optional, werden in Lösung nicht benötigt
        System.out.println("Array - Erwartet wird: Rihanna || " + saengerArray[0]);
        List<String> saengerList;
        saengerList = new ArrayList<>();
        for (int i = 0; i < saengerArray.length; i++){
            saengerList.add(saengerArray[i]);
        }

        System.out.println("List - Erwartet wird: Rihanna || " +  saengerList.get(0));
        return saengerList;
    }

    /*
    Gib mittels einer (oder mehrerer) beliebigen Schleife(n) folgende Zahlenreihe auf der
    Kommandozeile aus: 4 7 10 13 16
     */
    public static void zahlenreiheKommandoZeile(){
        for (int i = 4; i <= 16; i += 3){
            System.out.print(i + " ");
        }
    }

    /*
    Deklariere ein Array meinArray um später dort solche Werte wie Elefant speichern zu können.
     */
    public static String[] arrayDeklarieren() {
        //Deklaration (= Lösung) siehe unten, ist in der Aufgabe anders gestellt
        String[] meinArray; // <- diese Zeile ist die Lösung! Rest ist nur zum testen da

        meinArray = new String[]{"Test", "Noch ein Test", "Und noch ein Test"};

        return meinArray;
    }

    /*
    Sorge dafür, dass alle geraden (!) Ganzzahlen von 1 bis 10 mithilfe einer while-Schleife in
    aufsteigender Reihenfolge auf der Kommandozeile ausgegeben werden.
     */
    public static void ganzzahlenEinsBisZehn(){
        int i = 1;
        while(i < 11){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /*
    Gib mittels einer while-Schleife die ersten 3 Elemente des bereits initialisierten String-Arrays
    tiere auf der Kommandozeile aus.
     */
    public static void tiereWhileSchleife(String[] tiere){
        int i = 0;
        while(i < 3){
            System.out.println(tiere[i]);
            i++;
        }
    }

    /*
    Ergänze die folgende Methode mit gegebenem Methodenkopf um den passenden Methodenrumpf, damit die Methode
    Minuten in Sekunden umwandelt.
     */
    public static int minutenNachSekunden(int minuten){
        int sekunden;
        sekunden = minuten * 60;
        return sekunden;
    }

    /*
    Schreibe eine while-Schleife, die alle Elemente der Integer-Liste primzahlen auf der Kommandozeile ausgibt.
     */
    public static void primZahlen(List<Integer> primzahlen){
        int i = 0;
        while(i < primzahlen.size()){
            System.out.println(primzahlen.get(i));
            i++;
        }
    }

    /*
    Schreibe eine Methode isOldEnough mit einem int Übergabeparameter alterInJahren und einem boolean
    Rückgabewert, die bei Personen unter 18 Jahren falsch und sonst wahr zurückgibt.
     */
    public static boolean isOldEnough(int alterInJahren){
        if (alterInJahren < 18){
            return false;
        }
        else{
            return true;
        }
    }

    /*
    Deklariere ein zweidimensionales int-Array meineZahlen, mit 3 inneren Arrays. Initialisiere das erste
    innere Array mit den Werten 1 und 2, das zweite innere Array mit den Werten 3 und 4 und das
    dritte innere Array mit den Werten 5 und 6.
     */
    public static int[][] doppeltesArray(){
        int[][] meineZahlen;
        meineZahlen = new int[][]{{1, 2}, {3,4}, {5,6}};
        //Test:
        System.out.println(meineZahlen[0][1]); //erwartet: 2
        System.out.println(meineZahlen[2][1]); //erwartet: 6
        return meineZahlen;
    }

    /*
    Gib die Ganzzahlen von 1 bis 5 in aufsteigender Reihenfolge auf der Kommandozeile aus. //Anmerkung: Mit While
     */
    public static void ganzzahlenWhile(){
        int i = 0;
        while (i < 5){
            System.out.println(i + 1);
            i++; // -> nur das fehlt im Trainer
        }
    }

    /*
    Deklariere ein zweidimensionales int-Arrays zahlen.
     */
    public static void intArrayDeklarieren(){
        int[][] zahlen; // -> nur das fehlt
    }

    /*
    Deklariere ein zweidimensionales Array meinArray, das aus 2 inneren Arrays besteht, die jeweils
    3 Zeichenketten halten können. Initialisiere alle Werte mit einer leeren Zeichenkette.
     */
    public static String[][] zweiDimStringArray(){
        String[][] meinArray;
        meinArray = new String[2][3];
        return meinArray;
    }

    /*
    Ergänze die folgende Methode mit gegebenem Methodenkopf um den passenden Methodenrumpf, damit die
    Methode die Initialien zurückgibt.
     */
    public static String berechneInitialien(String vorname, String nachname){
        String initialien = "";
        initialien += vorname.substring(0, 1) + nachname.substring(0, 1);

        return initialien;
    }

    /*
    Gib auf der Kommandozeile alle Ganzzahlen zwischen 1 und 100 aus, die durch 4 teilbar sind.
    Nutze dafür eine beliebige Schleife.
     */
    public static void ganzzahlenEinsBisHundert(){
        for (int i = 1; i <= 100; i++){
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
    }

    /*
    Deklariere eine Methode bitteVorstellen mit folgenden Übergabeparametern: ein String name und ein
    int alter. Die Methode soll beim Aufruf mit den Argumenten Max und 22 folgenden Text auf der
    Kommandozeile ausgeben: Mein Name ist Max und ich bin 22 Jahre alt. Nach meinem Geburtstag bin ich 23.
     */
    public static void bitteVorstellen(String name, int alter){
        System.out.println("Mein Name ist " + name + " und ich bin " + alter + " Jahre alt. Nach meinem Geburtstag bin ich " + (alter+1) + ".");
    }

    /*
    Deklariere eine Variable autos und initialisiere sie mit einer leeren ArrayList,
    in der Zeichenketten gespeichert werden können.
     */
    public static List<String> autosList(){
        List<String> autos = new ArrayList<>();
        return autos;
    }

    /*
    Ergänze die folgende Methode mit gegebenem Methodenkopf um den passenden
    Methodenrumpf, damit die Methode testet, ob gleich viele X und Y in einem String vorkommen.
    Anmerkung: X und x ist das gleiche. Kommen beide 0 mal vor gebe true zurück.
     */
    public static boolean gleichVieleXundY(String str){
        String tmp = str.toLowerCase();
        int countx = 0;
        int county = 0;
        for (int i = 0; i < tmp.length(); i++){
            if(tmp.charAt(i) == 'x'){
                countx += 1;
            }
            if(tmp.charAt(i) == 'y'){
                county += 1;
            }
        }

        if (countx == county){
            return true;
        } else {
            return false;
        }
    }

    /*
    Initialisiere das bereits deklarierte int-Array zahlen mit den Werten 1, 2 und 3 (in dieser Reihenfolge).
     */
    public static int[] initArray(){
        int[] zahlen;
        zahlen = new int[]{1, 2, 3};
        return zahlen;
    }

    /*
    Gib die Elemente der String-Liste essen mittels einer for-each Schleife auf der Kommandozeile aus.
     */
    public static void essenForEach(List<String> essen){
        for(String mahlzeit : essen){
            System.out.println(mahlzeit);
        }
    }

    /*
    Lege ein String-Array woerter so an, dass in diesem später genau drei Zeichenketten abgelegt werden können.
     */
    public static String[] dreiZeichen(){
        String[] woerter = new String[3];
        return woerter;
    }

    /*
    Sorge dafür, dass die Ganzzahlen von 5 bis 10 in aufsteigender Reihenfolge auf der Kommandozeile ausgeben werden.
    Anmerkung: Wird mit While vorgegeben.
     */
    public static void ganzzahlenFuenfBisZehn(){
        int i = 5; // Nur diese Zeile fehlt im Trainer
        while (i < 11){
            System.out.println(i);
            i++;
        }
    }

    /*
    Gib den Inhalt des zweidimensionalen char-Arrays spielfeld auf der Kommandozeile aus. In dieser Form
    (also das innere Array jeweils in eine eigene Zeile):
    A B C
    D E F
    G H I
     */
    public static void charArraySpielfeld(char[][] spielfeld){
        for (int i = 0; i < spielfeld.length; i++){
            for (int j = 0; j < spielfeld.length; j++){
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*
    Lass die äußere Schleife genau 2 Mal, die innere Schleife genau 3 Mal durchlaufen.
    Anmerkung: Code wurde so vorgegeben
     */
    public static void schleifenDurchlaeufe(){
        for (int i = 0; i < 2; i++){ //Hier Code ergänzen
            System.out.println("Äußere Schleife: i=" + i);
            for (int j = 0; j < 3; j++){ //Hier Code ergänzen
                System.out.println("Innere Schleife: i=" + i + ". j=" + j);
            }
        }
    }

    /*
    Gib mithilfe einer for-each Schleife die Elemente des bereits initialisierten eindimensionalen int-Arrays
    zahlen auf der Kommandozeile aus.
     */
    public static void forEachZahlen(int[] zahlen){
        for (int zahl : zahlen){
            System.out.println(zahl);
        }
    }

    /*
    Gib auf der Kommandozeile 4x den Satz Ich bin ein Java-Profi! aus. Nutze dafür eine beliebige Schleife.
     */
    public static void javaProfi(){
        for(int i = 0; i < 4; i++){
            System.out.println("Ich bin ein Java-Profi!");
        }
    }

    /*
    Füge der bereits deklarierten und initialisierten Liste autos das Element Ferrari hinzu.
     */
    public static List<String> autoListe(){
        List<String> autos = new ArrayList<>();
        autos.add("Ferrari"); //Nur das fehlt im Trainer
        return autos;
    }

    /*
    Die Tauben haben einen Fehler gemacht. Hilf Aschenputtel und ersetze das erste Element des String-Arrays
    toepfchen mit dem zweiten Element des String-Arrays kroepfchen.
     */
    public static String[] arrayToepfchen(String[] kroepfchen){
        //Kommandozeilenausgaben nur zum testen, nicht nötig im Trainer
        String[] toepfchen = new String[] {"Schlechte Linse", "Gute Linse", "Sehr gute Linse"};
        System.out.println(toepfchen[0]);
        toepfchen[0] = kroepfchen[1];
        System.out.println(toepfchen[0]);
        return toepfchen;
    }

    /*
    Entferne alle Elemente aus der String-Liste teilnehmer.
     */
    public static List<String> entfernenTeilnehmer(List<String> teilnehmer){
        //Kommandozeilenausgaben nur zum testen, nicht nötig im Trainer
        System.out.println(teilnehmer.size());
        teilnehmer.clear();
        System.out.println(teilnehmer.size());
        return teilnehmer;
    }

    //###########################################################
    //####                                                    ###
    //####  Methoden-Aufrufe (Main)                           ###
    //####  Den gewünschten Methodenaufruf auskommentieren    ###
    //####                                                    ###
    //###########################################################
    public static void main(String[] args) {

        // -> public static String baueWortPyramide(String str)
        //System.out.println(baueWortPyramide("Text"));


        // -> public String[][] meineMethode(String[][] meinArray)
        String[][] meinArray = {
                {"Element00", "Element01"},
                {"Element10", "Element11"},
                {"Element20", "Element21"}
        };
        //meineMethode(meinArray);


        // -> public static void methode1bis5()
        //methode1bis5();


        // -> public static void methodeRechtSeitigePyramide(int anzahlZeilen)
        //methodeRechtSeitigePyramide(8);


        // -> public static List<String> ersteElementEntfernen(List<String> koffer)
        List<String> koffer = new ArrayList<>();
        koffer.add("Hemd");
        koffer.add("Hose");
        koffer.add("Schuhe");
        //ersteElementEntfernen(koffer);


        // -> public static void zahlenPyramide(int anzahlZeilen)
        //zahlenPyramide(6);


        // -> public static boolean isPrimzahl(int zahl){
        //System.out.println("Ist die Zahl 2 eine Primzahl? -> " + isPrimzahl(2) + " || Erwartetes Ergebnis: true");
        //System.out.println("Ist die Zahl 15 eine Primzahl? -> " + isPrimzahl(15) + " || Erwartetes Ergebnis: false");


        // -> public static void printHallo()
        //printHallo();


        // -> public static void sternenPyramide(int anzahlZeilen)
        //sternenPyramide((6));

        // -> public static int integerListe(List<Integer> zahlen)
        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(1907);
        zahlen.add(1878);
        zahlen.add(2025);
        //System.out.println("Erwartetes Ergebnis: 1907 || Erhalten: " + integerListe(zahlen));


        // -> public static void ganzzahlTeilbar(int a, int b)
        //ganzzahlTeilbar(12, 85);


        // -> public static String kehreStringUm(String str)
        //System.out.println(kehreStringUm("Text"));


        // -> public static int[] niederschlagsmengeArray(int[] niederschlagsmenge)
        int[] niederschlagsmenge = {1, 2, 3, 4, 5, 6, 7, 8};
        //niederschlagsmengeArray(niederschlagsmenge);


        // -> public static List<String> saengerList(String[] saengerArray)
        String[] saengerArray = {"Rihanna", "Eminem", "2Pac"};
        //saengerList(saengerArray);


        // -> public static void zahlenreiheKommandoZeile()
        //zahlenreiheKommandoZeile();


        // -> public static String[] arrayDeklarieren()
        //System.out.println(arrayDeklarieren().toString());


        // -> public static void ganzzahlenEinsBisZehn()
        //ganzzahlenEinsBisZehn();


        // -> public static void tiereWhileSchleife()
        String[] tiere = new String[]{"Hund", "Katze", "Maus", "Hahn", "Bär"};
        //tiereWhileSchleife(tiere);


        // ->  public static int minutenNachSekunden(int minuten)
        int minuten = 15; //Minuten die übergeben werden sollen
        //System.out.println("Übergeben: " + minuten + " Minuten. Ergebnis bekommen: " + minutenNachSekunden(minuten));


        // -> public static void primZahlen(List<Integer> primzahlen)
        List<Integer> primzahlen = new ArrayList<>();
        primzahlen.add(2);
        primzahlen.add(3);
        primzahlen.add(5);
        primzahlen.add(7);
        primzahlen.add(11);
        primzahlen.add(13);
        //primZahlen(primzahlen);


        // -> public static boolean isOldEnough(int alterInJahren)
        int alter = 18;
        //System.out.println("Alter übergeben: " + alter + " || Älter als 17? Antwort: " + isOldEnough(alter));


        // -> public static int[][] doppeltesArray()
        //System.out.println(doppeltesArray());


        // -> public static void ganzzahlenWhile()
        //ganzzahlenWhile();


        // -> public static String[][] zweiDimStringArray()
        //System.out.println(zweiDimStringArray());


        // -> public static String berechneInitialien(String vorname, String nachname)
        String vorname = "Jakub";
        String nachname = "Waszalalowkasdaf";
        //System.out.println("Übergeben: Vorname " + vorname + ", Nachname " + nachname + " || Ergebnis: " + berechneInitialien(vorname, nachname));


        // -> public static void ganzzahlenEinsBisHundert()
        //ganzzahlenEinsBisHundert();


        // -> public static void bitteVorstellen(String name, int alter)
        String name = "Max";
        int alterVonMax = 22;
        //bitteVorstellen("Max", 22);


        // -> public static List<String> autosList()
        //System.out.println(autosList());


        // -> public static boolean gleichVieleXundY(String str)
        String testeXundYTrue = "saYfdksdafxXxasdfewyxyyweaf"; // 4 x und 4 y, also true
        String testeXundYFalse = "asdfeawfyxxXXxxxyasdfwec"; // 7 x und 2 y, also false
        //System.out.println(gleichVieleXundY(testeXundYTrue));


        // -> public int[] initArray()
        //System.out.println(initArray());


        // -> public static void essenForEach(List<String> essen)
        List<String> essen = new ArrayList<>();
        essen.add("Döner");
        essen.add("Käsespätzle");
        essen.add("Schnitzel");
        //essenForEach(essen);


        // -> public static String[] dreiZeichen()
        //System.out.println(dreiZeichen());


        // -> public static void ganzzahlenFuenfBisZehn(){
        //ganzzahlenFuenfBisZehn();


        // -> public static void charArraySpielfeld(char[][] spielfeld)
        char[][] spielfeld = new char[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        //charArraySpielfeld(spielfeld);


        // -> public static void schleifenDurchlaeufe()
        //schleifenDurchlaeufe();


        // -> public static void forEachZahlen(int[] zahlen)
        int[] zahlenForEach = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //forEachZahlen(zahlenForEach);


        // -> public static void javaProfi()
        //javaProfi();


        // -> public static List<String> autoListe()
        //System.out.println(autoListe());


        // -> public static String[] arrayToepfchen(String[] kroepfchen)
        String[] kroepfchen = new String[]{"Erstes Element", "Zweites Element", "Drittes Element"};
        //System.out.println(arrayToepfchen(kroepfchen));


        // -> public static List<String> entfernenTeilnehmer(List<String> teilnehmer)
        List<String> teilnehmer = new ArrayList<>();
        teilnehmer.add("Jakub");
        teilnehmer.add("Patrick");
        teilnehmer.add("Jasmin");
        entfernenTeilnehmer(teilnehmer);
    }
}