//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;



public class Main {
    /**
     * Cette fonction affiche un tableau
     * @param tab qui est un tableau
    */
    public static void affichage_tableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int plusgrandnbr(int[] tableau) {
        int grand = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (grand < tableau[i]) {
                grand = tableau[i];
            }
        }
        return grand;
    }
    public static boolean inferieura10(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i]<10){
                return true;
            }
        }
        return false;
    }

    public static void trieordrecroissant(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i]>tableau[i+1]) {

            }
        }
    }

    public static void main(String[] args) {
        int[] score = new int[7];
        for (int i = 0; i < score.length; i++) {
            Random random = new Random();
            score[i] = (random.nextInt(100));
        }
        affichage_tableau(score);
        System.out.println("___________");
        System.out.println(plusgrandnbr(score));
        System.out.println(inferieura10(score));
        float moyenne =0;
        for (int i = 0; i < 7; i++) {
            moyenne += score[i];
        }
        moyenne /= 7;
        System.out.println(moyenne);
    }
}