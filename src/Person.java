public class Person {
    private String name;//поле
    private  String designation;//поле
public  Person (String name,String designation){
    this.name = name;
    this.designation = designation;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    // Parent class тын методдору
public void learnMethod(){
    System.out.println(name + "is learning.");
}
public void walkMethod(){
    System.out.println( name + "is walking.");
}
    public void eatMethod(){
    System.out.println(name + "is eating");
}

    @Override
    public String toString() {
        return
                "Name: " + name + "\n" +
                "Designation: " + designation ;

    }
}