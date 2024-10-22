public class Dancer extends Person {
private String groupName;//уникалдуу полеси.

public Dancer( String name , String designation,String groupName){
    super(name,designation);
    this.groupName = groupName;
}

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    //уникалдуу методу.
public  void dancingMethod(){
    System.out.println(" name is dancing");

}

    @Override
    public String toString() {
        return
                "PersonName: " + super.getName() + "\n" +
                "Designation: " + super.getDesignation() + "\n" +
                "GroupName: " + groupName ;

    }
}

