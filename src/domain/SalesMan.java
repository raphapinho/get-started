package domain;
public final class SalesMan extends Employee {
    
    private double percentPerSold;
    private double soldAmount;
    
    public SalesMan() {
    }

    public SalesMan(String code, String name, String adress, String age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }


    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold) / 100;
    }

    

}
