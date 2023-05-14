public class Project {

    private long id;
    private long alteCosturi;
    private String descriere;
    private String nume;
    private Employee[] angajati = new Employee[0];
    private Department department;
    private String[] skills;

    public Project(long alteCosturi, String descriere, String nume) {
        this.alteCosturi = alteCosturi;
        this.descriere = descriere;
        this.nume = nume;
    }

    /*
    Adaugati urmatoarele atribute cu tipurile corespunzatoare
    - id -> identificator UNIC pentru fiecare proiect
    - alteCosturi -> costul proiectului, mai putin salariu angajatilor
    - nume -> denumirea proiectului
    - descriere -> mai multe informatii despre proiect
    - angajati -> un array cu angajatii implicati in proiect
    - departament -> departamentul din care face parte
    - skills -> array de skilluri necesare pe proiect
     */

        /*
    Adaugati Constructor care seteaza campurile id, nume, alteCosturi, descriere
    Adaugati metode de setare informatii pentru toate, mai putin ID
    Adaugati metode de preluare(get) de informatii
     */


    /*
    Adaugati urmatoarele metode:
    - addEmployee(){
        - primeste un angajat si il adauga pe proiect
        - adauga proiectul la arrayul de proiecte al angajatului
        }

    - calcCostTotal(){
        - metoda care calculeaza si intoarce cost total
        cost total = alteCosturi + salarii lunare angajati
        ATENTIE: daca un angajat lucreaza pe mai multe proiecte se va presupune ca si cost per proiect doar partea corespunzatoare a salariului:
            ex: 12000 salariu si lucreaza pe 3 proiecte => cost proiect cu angajatul = 4000 ron
     }

     - print(){
        - afiseaza informatiile despre proiect
     }

     -checkSkills(){
      - returneaza un boolean care spune daca inginerii care lucreaza la proiect au skillurile necesare impreuna
     */

    public long getAlteCosturi() {
        return alteCosturi;
    }

    public void setAlteCosturi(long alteCosturi) {
        this.alteCosturi = alteCosturi;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Employee[] getAngajati() {
        return angajati;
    }

    public void setAngajati(Employee[] angajati) {
        this.angajati = angajati;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void addEmployee(Employee e){

        Employee[] angj = new Employee[angajati.length +1];
        for(int i = 0; i< angajati.length; i++){
            angj[i] = angajati[i];
        }
        angj[angajati.length] = e;
        angajati = angj;
    }

    public void print(){

        System.out.println("Proiectul cu numele: " + this.nume + " are urmatorii angajati: ");
        for(Employee employee: angajati){
            employee.print();
        }
    }

    public boolean checkSkills(){
        int skilluriAcoperite = 0;
        for(int i = 0; i < skills.length; i++){
            for(int j = 0; j < angajati.length; j++){
                if(angajati[i] instanceof Engineer){
                    String[] skilluriAngajat = ((Engineer) angajati[i]).getSkills();
                    for (String s : skilluriAngajat) {
                        if (s.equals(skills[i])) {
                            skilluriAcoperite++;
                        }
                    }
                }
            }
        }
        return skilluriAcoperite == skills.length;
    }

    public long calcCostTotal(){
        long total = alteCosturi;
        for(Employee e: angajati){
            total += e.getSalariu()/e.proiecte.length;
        }
        return total;
    }
}
