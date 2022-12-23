
package beans;
public interface IProfesseur {
    public String getSpecialite() ;
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