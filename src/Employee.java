public abstract class Employee {

    long id;
    String nume;
    long salariu;
    int vechime;
    String functie;
    Project[] proiecte;

    public Employee(long id, String nume, long salariu) {
        this.id = id;
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getSalariu() {
        return salariu;
    }

    public void setSalariu(long salariu) {
        this.salariu = salariu;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public Project[] getProiecte() {
        return proiecte;
    }

    public void setProiecte(Project[] proiecte) {
        this.proiecte = proiecte;
    }

    public abstract void print();

    public String getDepartment(){
        String departament = "";
        for(int i = 0; i < proiecte.length; i++){
            if (!departament.contains(proiecte[i].getDepartment().getNume())){
                departament = departament + " " +proiecte[i].getDepartment().getNume();
            }
        }
        return departament;
    }
    /*
    Adaugati urmatoarele campuri cu tipurile aferente:
        - id -> identificator UNIC pentru fiecare angajat
        - nume -> numele si prenumele angajatului
        - salariu -> venitul angajatului
        - vechime -> numarul cu ani de cand este in firma
        - functie -> ce functie are (ex: programator ajutor)
        - proiecte -> array cu proiectele in care este alocat
     */

    /*
    Adaugati Constructor care seteaza campurile id, nume, salariu, vechime si functie
    Adaugati metode de setare informatii pentru toate, mai putin ID
     */

    /*
    Adaugati metodele urmatoarele:
    - getDepartment(){
        - intoarce un string cu numele departamentului din care face parte angajatul
        - in cazul in care face parte din proiecte din mai multe departamente => intoarce un string cu toate numele de departamente
        }

    -print(){
     - nu primeste nimic si afiseaza informatiile despre angajat
     - ATENTIE: metoda trebuie suprascrisa in fiecare tip de angajat
    }
     */
}
