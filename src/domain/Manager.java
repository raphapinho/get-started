package domain;
public non-sealed class Manager extends Employee {
    private String login;
    private String password;
    private double commision;

    public Manager() {
    }

    public Manager(String code, String name, String adress, String age, double salary, String login,
            String password,
            double commision) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.commision = commision;
    }

    @Override
    public String getCode() {
        return "MN" + this.code;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.commision;
    }

    

}
