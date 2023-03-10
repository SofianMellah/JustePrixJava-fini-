package com.afpa.www.main;

import com.afpa.www.bean.JustePrix;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random Aleatoire = new Random();
        int nombreAleatoire = Aleatoire.nextInt(100) + 1;
        System.out.println(nombreAleatoire);
        int sommeUtilisateur = 0;
        System.out.println("Renseignez votre nombre");
        sommeUtilisateur = sc.nextInt();

        JustePrix maVar = new JustePrix(sommeUtilisateur, nombreAleatoire);
        maVar.calcul();
    }
}