package ru.kulakov.DepWork;

public class Departament {

    private String DepName;
    String DepLead;
    private Worker[] Workers;

    public Departament(String DepName){
        setDepName(DepName);
    }

    public String getDepName(){
        return DepName;
    }

    public String getDepLead(){
        return DepLead;
    }

    public Worker[] getWorkers(){
        return Workers;
    }

    public void setDepName(String DepName){
        this.DepName = DepName;
    }

    public void setDepLead(String NameLead){
        this.DepLead = NameLead;
    }

    public void setWorkers(Worker[] List){
        this.Workers = List;
    }

}