
package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double montant;
    private Date dateCreationCompte;

    public Compte() {
    }

    public Compte(int code, double montant, Date dateCreationCompte) {
        this.code = code;
        this.montant = montant;
        this.dateCreationCompte = dateCreationCompte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }


}
