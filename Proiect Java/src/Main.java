import Animale_Magice.*;
import Contracte.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service serviciu = new Service();

        Scanner in = new Scanner(System.in);
        Meniu();
        int comanda = in.nextInt();
        while(true)
        {
            switch (comanda)
            {
                case 0: return;
                case 1: Dragon d = serviciu.citireDragon(); serviciu.adaugareAnimal(d); serviciu.adaugareDragon(d); break;
                case 2: Phoenix p = serviciu.citirePhoenix(); serviciu.adaugareAnimal(p); serviciu.adaugarePhoenix(p); break;
                case 3: Trol t = serviciu.citireTrol(); serviciu.adaugareAnimal(t); serviciu.adaugareTrol(t); break;
                case 4: Zana z = serviciu.citireZana(); serviciu.adaugareAnimal(z); serviciu.adaugareZana(z); break;
                case 5: serviciu.afisareAnimale(); break;
                case 6: serviciu.afisareDragoni(); break;
                case 7: serviciu.afisarePhoenixex(); break;
                case 8: serviciu.afisareTroli(); break;
                case 9: serviciu.afisareZane(); break;
                case 10:
                    Cumparator c = serviciu.citireCumparator();
                    if(c != null) serviciu.adaugareCumparator(c); break;
                case 11:
                    Vanzator v = serviciu.citireVanzator();
                    if(v != null) serviciu.adaugareVanzator(v); break;
                case 12:
                    Adoptator a = serviciu.citireAdoptator();
                    if(a != null) serviciu.adaugareAdoptator(a); break;
                case 13: serviciu.afisareCumparatori(); break;
                case 14: serviciu.afisareAdoptatori(); break;
                case 15: serviciu.afisareVanzatori(); break;
                case 16: serviciu.afisareAnimaleBatrane(); break;
                case 17: serviciu.afisareBani(); break;
                default: System.out.println("Eroare la Introducerea unei Comenzi! Try Again!");
            }

            Meniu();
            comanda = in.nextInt();
        }
    }

    public static void Meniu()
    {
        System.out.println("Meniu:\n0) Exit\n1) Adaugare Dragon\n2) Adaugare Phoenix\n3) Adaugare Trol\n" +
                "4) Adaugare Zana\n5) Afisare Animale\n6) Afisare Dragoni\n7) Afisare Phoenixes\n" +
                "8) Afisare Troli\n9) Afisare Zane\n10) Tranzactie Cumparator\n11) Tranzactie Vanzator\n" +
                "12) Tranzactie Adoptator\n13) Istoric Cumparatori \n14) Istoric Adoptii \n15) Istoric Vanzatori \n16) Afisare Animale Batrane\n" +
                "17) Afisare Bani Magazin\n");
    }

}
