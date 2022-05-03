package home;

public class Dispencer50 implements AtmDispenceChain {
    AtmDispenceChain chain;
@Override
public void dispense(Currency currency) {

    int amount=currency.getAmount();
    if(amount >=50){
        int num_of_notes=amount/50;
        int baki_paise=amount%50;
        MyUtils.log("50 RS NOTES DISPENSED",String.valueOf(num_of_notes));
        if(baki_paise!=0) this.chain.dispense(new Currency(baki_paise));
    }
    else{
        this.chain.dispense(currency);
    }
    
}
@Override
public void setNextChain(AtmDispenceChain nextChain) {
   this.chain=nextChain;
    
}


}
