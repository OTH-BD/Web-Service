package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import proxy.ListComptes;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(proxy.conversionEuroToDh(4500));
        System.out.println("--------------- Compte code = 2 -------------------- ");
        Compte cp = proxy.getCompte(2);
        System.out.println("Code "+cp.getCode());
        System.out.println("montant "+cp.getMontant());
        System.out.println("Date Creation Compte  "+cp.getDateCreationCompte());

        System.out.println("-------------------- Voici la liste des comptes -------------------------");
        List<Compte> LisCompte = proxy.listComptes();
        int i= 1;
        for (Compte c : LisCompte) {

            System.out.println("------------------Le compte N'"+i+++"-----------------------------");
            System.out.println();
            System.out.println("Code "+c.getCode());
            System.out.println("Montant "+c.getMontant());
            System.out.println("Date Creation Compte  "+c.getDateCreationCompte());
        }


    }




}
