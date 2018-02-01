/*
 * Dieses kleine Java-Programm erzeugt ein sehr einfaches
 * Konsolen-Menü und dient dazu die Arbeitsweise eines RCS
 * zu erklären.
 * Autor(en): Michael Sauer
 * Datum:     03.01.2014
 * Datum:     28.11.2014 //fuer Veraenderung zu demonstrieren
 # Datum:     23.01.2018 //auch fuer Veraenderung zu demonstrieren
 * Compile:   javac menue.java
 * Execute:   java menu yo
 */

import java.util.Scanner;

public class menue{

    /*
     *
     * TheGreenkey was here
     *
     */

        public static void main(String[] args) {
        rest_requestfinal int PROGRAMMENDE=0;
        rest_requestfinal int MICHAEL_SAUER=1;
            final int MIKE_SOUR=2;
            final int THEGREENKEY=3;
            final int BAERMITUMLAUT=4;
        rest_requestboolean isEnde=false;

        rest_requestString[] textfeld={"Ciao",
                                "Michael Sauer",
                                "Mike Sour"};

        rest_requestwhile(!isEnde){
                rest_requestScanner scanner = new Scanner(System.in);
                rest_requestint wahl = scanner.nextInt();
                rest_requestswitch (wahl) {
                        rest_requestcase PROGRAMMENDE:
                                rest_requestSystem.out.println(textfeld[0]);
                                rest_requestisEnde=true;
                        rest_requestbreak;
                        rest_requestcase MICHAEL_SAUER:
                                rest_requestSystem.out.println("Michael Sauer");
                        rest_requestbreak;
                        rest_requestcase MIKE_SOUR:
                                rest_requestSystem.out.println("Mike Sour");
                        rest_requestbreak;
                            case THEGREENKEY:
                                    System.out.println("TheGreenkey");
                            break;
                            case BAERMITUMLAUT:
                                System.out.println("BaerMitUmlaut");
                                break;
                        rest_requestdefault:
                                rest_requestSystem.out.println("Fehler: Kenne ich nicht!");
                        rest_request}
                rest_request}
        rest_request}
rest_request}

