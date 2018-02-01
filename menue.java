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
            final int PROGRAMMENDE=0;
            final int MICHAEL_SAUER=1;
            final int MIKE_SOUR=2;
            final int THEGREENKEY=3;
            final int BAERMITUMLAUT=4;
            final int ZSISAMCI=5;
            final int AUDE_NANA=6;
            
            boolean isEnde=false;

            String[] textfeld={"Ciao",
                                "Michael Sauer",
                                "Mike Sour"};

            while(!isEnde){
                    Scanner scanner = new Scanner(System.in);
                    int wahl = scanner.nextInt();
                    switch (wahl) {
                            case PROGRAMMENDE:
                                    System.out.println(textfeld[0]);
                                    isEnde=true;
                            break;
                            case MICHAEL_SAUER:
                                    System.out.println("Michael Sauer");
                            break;
                            case MIKE_SOUR:
                                    System.out.println("Mike Sour");
                            break;
                            case THEGREENKEY:
                                    System.out.println("TheGreenkey");
                            break;
                            case BAERMITUMLAUT:
                                System.out.println("BaerMitUmlaut");
                                break;
                            case ZSISAMCI:
                                System.out.println("zsisamci");
                                break;
                     case AUDE_NANA:
                      System.out.println("Anana");
                            default:
                                    System.out.println("Fehler: Kenn ich nicht!");
                            }
                    }
            }
    }

