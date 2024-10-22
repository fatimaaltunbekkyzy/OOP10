//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Объект класса Dancer
Dancer dancer = new Dancer("Aruke","Ballet Dancer","Swans");
System.out.println(dancer);
dancer.walkMethod();
dancer.dancingMethod();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Объект класса Programmer
Programmer programmer = new Programmer("Melis","Software","Google company");
System.out.println(programmer);
programmer.codingMethod();
dancer.learnMethod();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Объект класса Singer
Singer singer = new Singer("Nurlan Nasip","Lead Singer","Eclipse");
System.out.println(singer);
singer.singingMethod();
singer.eatMethod();
singer.playGuitarMethod();
}}