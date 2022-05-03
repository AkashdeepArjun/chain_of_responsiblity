package home;

public class Test {
    public static void main(String[] args){

        Currency salery = new Currency(5521);
        Dispencer100  dispencer100 = new Dispencer100();
        Dispencer50 dispencer50=new Dispencer50();
        Dispencer10 dispencer10 = new Dispencer10();
        dispencer100.setNextChain(dispencer50);
        dispencer50.setNextChain(dispencer10);
        dispencer10.setNextChain(null);
        dispencer100.dispense(salery);



    }
    
}
