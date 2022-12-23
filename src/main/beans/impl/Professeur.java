package beans.impl;

import beans.impl.Element;
import beans.impl.Employe;

import java.util.List;

public class Professeur extends Employe {
    private String specialite ;
    private int id_compte ;
    private List<Element> elements ;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }
}
