public class Singer extends Person {
    private String bandName;//Singer class тын бир уникалдуу полеси
    public Singer( String name, String designation,String bandName){
        super(name,designation);
        this.bandName = bandName;
    }

    public void setBandName(String bandName) {//Манини беруучу мутодую
        this.bandName = bandName;
    }

    public String getBandName() {//Манини алып беруучу методу.
        return bandName;
    }

    //Singer class тын уникалдуу методдору
    public void singingMethod(){
        System.out.println( " name is singing.");
    }
    public  void playGuitarMethod(){
        System.out.println(" name is playing guitar");
    }
   public  String toString(){
        return "PersonName: " + super.getName() + "\n" +
        "Designation: " + super.getDesignation() + "\n" +
                "BandName: " + bandName;
   }
}
