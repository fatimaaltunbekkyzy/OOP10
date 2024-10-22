public class Programmer extends Person {
    private String companyName;//уникалдуу полеси

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void setCompanyName(String companyName) {//Маанини беруучу метод.
        this.companyName = companyName;
    }
    public String getCompanyName() {//Маанини алып беруучу метод.
        return companyName;
    }
    //уникалдуу методу
    public void codingMethod() {
        System.out.println( " name is coding.");
    }

    @Override
    public String toString() {
        return
                "PersonName: " + super.getName() + "\n" +
                "Designation: " + super.getDesignation() + "\n" +
                "CompanyName: " + companyName;

    }
}
