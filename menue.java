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
            final int DARTH_PLAGUEIS_THE_WISE = -1;
            final int PROGRAMMENDE=0;
            final int MICHAEL_SAUER=1;
            final int MIKE_SOUR=2;
            final int THEGREENKEY=3;
            final int BAERMITUMLAUT=4;
            final int NICE=5;
            final int BAUM=68179831;
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
                            case DARTH_PLAGUEIS_THE_WISE:
                                System.out.println(
                                    "Did you ever hear the tragedy of Darth Plagueis The Wise? I"
                                  + "thought not. It’s not a story the Jedi would tell you. It’s a"
                                  + "Sith legend. Darth Plagueis was a Dark Lord of the Sith, so"
                                  + "powerful and so wise he could use the Force to influence the"
                                  + "midichlorians to create life… He had such a knowledge of the"
                                  + "dark side that he could even keep the ones he cared about from"
                                  + "dying. The dark side of the Force is a pathway to many"
                                  + "abilities some consider to be unnatural. He became so powerful…"
                                  + "the only thing he was afraid of was losing his power, which"
                                  + "eventually, of course, he did. Unfortunately, he taught his"
                                  + "apprentice everything he knew, then his apprentice killed him"
                                  + "in his sleep. Ironic. He could save others from death, but not"
                                  + "himself."
                                );
                                break;
                            default:
                                    System.out.println("Fehler: Kenne ich nicht!");
                            }
                    }
            }
    }
