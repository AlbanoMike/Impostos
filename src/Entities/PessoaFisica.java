package Entities;

public class PessoaFisica extends Contribuinte{

    private Double healthExpenduture;
        public PessoaFisica(String name, Double anualIncome, Double healthExpenduture) {
        super(name, anualIncome);
        this.healthExpenduture = healthExpenduture;
    }
    public Double getHealthExpenduture() {
        return healthExpenduture;
    }
    public void setHealthExpenduture(Double healthExpenduture) {
        this.healthExpenduture = healthExpenduture;
    }
    @Override
    public Double tax() {
        if(getAnualIncome()<20000.00){
            return (getAnualIncome()*15/100)-(getHealthExpenduture()/2);
        } else {
            return (getAnualIncome()*25/100)-(getHealthExpenduture()/2);
        }
    }
}