public class Engineer extends Employee {

    private Manager manager;
    private String[] skills;

    public Engineer(long id, String nume, long salariu) {
        super(id, nume, salariu);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public void print() {
        System.out.println("INGINER cu numele: " + nume + " si setul skilluri");
        for (String skill: skills){
            System.out.println("Skill: " + skill);
        }
    }
    /*
    Aceasta clasa trebuie sa fie un tip specific de angajat (employee)
    Pe langa campurile mostenite de la parinte, aceasta clasa va avea si:
        - skills -> un array skilluri pe care le are
        - manager -> managerul sau direct (null daca nu are)
     */

    /*
    Adaugati urmatoarele metode:

    - participaTraining(){
        - primeste un array de skilluri si le adauga pe cele care nu erau deja existente in lista de skilluri ale angajatului
    }
     */

    void particilaTraining(String[] skilluriNoi){
        for(int i = 0; i < skilluriNoi.length; i++){
            boolean contine = false;
            for(int j = 0; j < skills.length; i++){
                if(skilluriNoi[i].equals(skills[j])){
                    contine = true;
                    break;
                }
                if(contine == false){
                    //adauga skill

                }
                contine = false;
            }
        }
    }

}
