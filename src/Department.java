public class Department {

    private long id;
    private String nume;
    private Project[] proiecte;

    public Department(long id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Project[] getProiecte() {
        return proiecte;
    }

    public void setProiecte(Project[] proiecte) {
        this.proiecte = proiecte;
    }

    public long calcTotal(){
        long rezult = 0;
        for(Project p: proiecte){
            rezult+= p.calcCostTotal();
        }
        return rezult;
    }

    public void addProject(Project p){

       Project[] projects = new Project[proiecte.length +1];
        for(int i = 0; i< proiecte.length; i++){
            projects[i] = proiecte[i];
        }
        projects[proiecte.length] = p;
    }

    /*
    Adaugati urmatoarele atribute cu tipurile corespunzatoare
    - id -> identificator UNIC pentru fiecare departament
    - nume -> denumirea departamentului
    - proiecte ->un array cu proiectele din departament
     */

    /*
    Implementati urmatoarele metode METODE:
    - addProject(){
           - primeste un proiect si il adauga in lista de proiecte
           - ATENTIE: adauga si angajatii din acel proiect care nu sunt deja in departament
    }

    - calcTotalCost(){
        - calculeaza si returneaza costul total al departamentului
            -> acest cost reprezinta costul tuturor proiectelor din departament
    }

    - removeEmployee(){
        - sterge angajatul din toate proiectele din departament
    }

    -calAngajati(){
        - calculeaza numarul total de angajati
        - ATENTIE: un angajat care lucreaza pe mai multe proiecte nu trebuie numarat de mai multe ori
     */
}
