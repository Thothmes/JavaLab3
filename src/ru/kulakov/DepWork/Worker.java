package ru.kulakov.DepWork;

public class Worker {

    private String Name;
    private Departament Dep;
    private boolean DepLead;

    public Worker(String Name, Departament Dep) {
        this.Name = Name;
        this.Dep = Dep;
        this.DepLead = false;
    }

    public Worker(String Name, Departament Dep, boolean DepLead){
        this.Name = Name;
        this.Dep = Dep;
        if (DepLead == false) {
            this.DepLead = false;
        }
        else if (DepLead == true) {
            setDepLead(true);
        }
    }

    public String toString() {
        StringBuilder answer = new StringBuilder();
        if (this.DepLead == true & this.Dep.getDepLead() == this.Name) {
            answer.append(this.Name + " начальник отдела " + this.Dep.getDepName() + "\n");
            return answer.toString();
        }
        else if (this.DepLead == false) {
            answer.append(this.Name + " работает в отделе " + this.Dep.getDepName() + ", начальник которого " + this.Dep.getDepLead() + "\n");
            return answer.toString();
        }
        else {
            answer.append(this.Name + " не может работать в этом отделе, но руководить другим");
            return answer.toString();
        }
    }

    public void setName(String NameWorker) {
        this.Name = NameWorker;
    }

    public void setDep(Departament Departament) {
        this.Dep = Departament;
    }

    public void setDepLead(boolean LeadTrue) {
        this.DepLead = LeadTrue;
        this.Dep.setDepLead(this.Name);
    }

    public String getName() {
        return Name;
    }

    public Departament getDep() {
        return Dep;
    }

    public boolean getDepLead() {
        return DepLead;
    }
}