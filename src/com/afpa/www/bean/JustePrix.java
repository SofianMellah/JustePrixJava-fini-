package com.afpa.www.bean;

import java.util.Scanner;

public class JustePrix {
    private int sommeUtilisateur;
    private int nombreAleatoire;
    private int limiteTentative;
    private int compteurTentative;

    public JustePrix(int sommeUtilisateur, int nombreAleatoire){
        this.sommeUtilisateur = sommeUtilisateur;
        this.nombreAleatoire = nombreAleatoire;
    }

    public int getNombreAleatoire() {
        return nombreAleatoire;
    }

    public void setNombreAleatoire(int nombreAleatoire) {
        this.nombreAleatoire = nombreAleatoire;
    }


    public int getsommeUtilisateur() {
        return sommeUtilisateur;
    }

    public void setsommeUtilisateur(int sommeUtilisateur) {
        this.sommeUtilisateur = sommeUtilisateur;
    }

    public void calcul() {
        while (limiteTentative < 10) {

            /* Début choisir un nombre plus élevé */
            if (sommeUtilisateur < nombreAleatoire) {
                ++limiteTentative;
                ++compteurTentative;
                System.out.println("Choisissez un nombre plus haut et vous êtes à " + compteurTentative + " tentatives sur 10");
            }
            /* Fin choisir un nombre plus élevé */

            /* Début choisir un nombre moins élevé */
            else if (sommeUtilisateur > nombreAleatoire) {
                ++limiteTentative;
                ++compteurTentative;
                System.out.println("Choisissez un nombre plus bas et vous êtes à " + compteurTentative + " tentatives sur 10");
            }
            /* Fin choisir un nombre moins élevé */

            /* Début nombre exact */
            else if (sommeUtilisateur == nombreAleatoire) {
                ++compteurTentative;
                System.out.println("Bien jouer ! Vous avez trouvé en " + compteurTentative + " tentative(s)");
                break;
            }
            /* Fin nombre exact */

            /* Début échec au bout de 10 tentatives */
            if (limiteTentative > 9) {
                System.out.println("Vous avez perdu");
            }
            /* Fin échec au bout de 10 tentatives */
            Scanner sc = new Scanner(System.in);
            sommeUtilisateur = sc.nextInt();
        }
    }
}
