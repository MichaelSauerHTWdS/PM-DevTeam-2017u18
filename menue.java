/*
 * Dieses kleine Java-Programm erzeugt ein sehr einfaches
 * Konsolen-Menü und dient dazu die Arbeitsweise eines RCS
 * zu erklären.
 * Autor(en): Michael Sauer
 * Datum:     01.02.2018
 * Datum:     28.11.2014 //fuer Veraenderung zu demonstrieren zu tun
 # Datum:     23.01.2018 //auch fuer Veraenderung zu demonstrieren zu tun
 * Compile:   javac menue.java
 * Execute:   java menu yo
 */

import java.util.Scanner;

public class menue{


        public static void main(String[] args) {
            final int DARTH_PLAGUEIS_THE_WISE = -1;
            final int PROGRAMMENDE=0;
            final int MICHAEL_SAUER=1;
            final int MIKE_SOUR=2;
            final int THEGREENKEY=3;
            final int BAERMITUMLAUT=4;
            final int NICE=5;
	    final int KODI=6;
            final int BAUM=68179831;
            final int IRONIC=7;
	    final int STEVEN_UND_SCOTT=88;

            final int SICHAEL_MAUER = 8;

            final int PNIEDERMEYER=42;

         

            final String HEYMANN="Hey Mann wo ist mein Auto?";
            final int TG=47;
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
			     
							case IRONIC:
								System.out.println("Ironic.");
                                break;
				    case STEVEN_UND_SCOTT:
                                System.out.println("Steven und Scott");
                                break;
                      case SICHAEL_MAUER:
                      System.out.println("Sichael Mauer");
                      break;
				    
			case PNIEDERMEYER:
				    System.out.println("Java = JavaScript");
						     break; 
				    
                            default:
                                    System.out.println("Fehler: Kenne ich nicht!");
                            }
                    }
            }
    }
