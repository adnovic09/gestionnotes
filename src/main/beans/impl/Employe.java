package beans.impl;

import beans.ICompte;
import beans.IEmploye;

public class Employe implements IEmploye {
    private int id_emp ;
    private String prenom_employee ;
    private String nom_employee ;
    private ICompte compte ;

    public ICompte getCompte() {
        return compte;
    }

    public void setCompte(ICompte compte) {
        this.compte = compte;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }


    public String getPrenom_employee() {
        return prenom_employee;
    }

    public void setPrenom_employee(String prenom_employee) {
        this.prenom_employee = prenom_employee;
    }

    public String getNom_employee() {
        return nom_employee;
    }

    public void setNom_employee(String nom_employee) {
        this.nom_employee = nom_employee;
    }
}
