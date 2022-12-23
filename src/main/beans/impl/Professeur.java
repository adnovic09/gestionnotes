package beans.impl;

import beans.impl.Element;
import beans.impl.Employe;

import java.util.List;

public class Professeur extends Employe implements IProfesseur  {
    private String specialite ;
    private List<Element> elements ;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
