package Entities;
public class PessoaJuridica extends Contribuinte{
    private Integer employes;
    public PessoaJuridica(String name, Double anualIncome, Integer employes) {
        super(name, anualIncome);
        this.employes = employes;
    }
    public Integer getEmployes() {
        return employes;
    }
    public void setEmployes(Integer employes) {
        this.employes = employes;
    }
    @Override
    public Double tax() {
        if(getEmployes()<10){
            return (getAnualIncome()*16/100);
        }else {
            return (getAnualIncome()*14/100);
        }
    }
}