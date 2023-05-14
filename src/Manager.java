public class Manager extends Employee {

    private Employee[] subordonati = new Employee[0];

    public Manager(long id, String nume, long salariu) {
        super(id, nume, salariu);
    }

    @Override
    public void print() {
        System.out.println("Managerul " + nume + " si salariu: " + salariu);
        System.out.println(" SI are urmatoara echipa: ");
        for (Employee employee : subordonati) {
            System.out.println("SUBORDONAT ");
            employee.print();
        }
    }

    /*
    Aceasta clasa trebuie sa fie un tip specific de angajat
    Pe langa campurile mostenite de la parinte, aceasta clasa va avea si:
    - subordonati -> un array de angajati pe care ii are in echipa sa
     */

  /*
    Adaugati urmatoarele metode:

    - addEmployee(){
        - adauga subordonat si seteaza managerul pentru acesta
    }
     */

    public void addEmployee(Employee employee) {

        Employee[] employees = new Employee[subordonati.length + 1];
        for (int i = 0; i < subordonati.length; i++) {
            employees[i] = subordonati[i];
        }
        employees[subordonati.length] = employee;
        this.subordonati = employees;
    }

}
