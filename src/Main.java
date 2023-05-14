public class Main {

    /*
    Aceasta clasa va reprezenta "Compania" noastra
     */
    public static void main(String[] args) {
        Department it = new Department(1, "IT");
        Department industrial = new Department(2, "industrial");

        //proiecte
        Project p1 = new Project(1000, "descriere proiect 1", "nume 1");
        Project p2 = new Project(2000, "Descriere proiect 2", "nume 2");

        Engineer e1 = new Engineer(1, "Andrei", 2000);
        String[] skillsE1 = {"java"};
        e1.setSkills(skillsE1);
        Engineer e2 = new Engineer(2, "Mihai", 3000);
        e2.setSkills(skillsE1);
        Manager manager = new Manager(3, "Grigore", 6000);


        Project[] proiectE1 = {p1};
        e1.setProiecte(proiectE1);
        adaugaAngajatInProiect(e1, proiectE1);

        Project[] proiectE2 = {p1,p2};
        e2.setProiecte(proiectE2);
        adaugaAngajatInProiect(e2, proiectE2);

        Project[] proiectE3 = {p2};
        manager.setProiecte(proiectE3);
        manager.addEmployee(e2);
        adaugaAngajatInProiect(manager, proiectE3);

        Project[] proiecteIt = {p1,p2};
        it.setProiecte(proiecteIt);
        p1.setDepartment(it);
        p2.setDepartment(it);

        System.out.println(it.calcTotal());
        for(int i =0; i< it.getProiecte().length; i++){
            it.getProiecte()[i].print();
            System.out.println("-----------------------");
        }

        System.out.println("Managerul se afla in departamentul: " + manager.getDepartment());
	/*
	- Creati doua noi departamente (ex: IT si INDUSTRIAL)
    - Creati cativa angajati de ambele tipuri
    - Creati cateva proiecte
    - Adaugati angajati in fiecare proiect
    - Adaugati proiectele in departamente
    - Calculati costul total pentru fiecare departament
    - Sterge un angajat din toate departamentele
    - Afiseaza lista de skilluri ale fiecarui angajat
    - verifica daca toate skillurile necesare de pe un proiect sunt acoperite

    - folositi metodele de get si set pentru salarii, proiecte etc si recalculati cost
	 */
    }

    private static void adaugaAngajatInProiect(Employee e1, Project[] proiectE1) {
        for(int i = 0; i < proiectE1.length; i++){
            proiectE1[i].addEmployee(e1);
        }
    }
}
