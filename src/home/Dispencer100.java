package home;

public class Dispencer100 implements AtmDispenceChain{

    AtmDispenceChain chain;
@Override
public void dispense(Currency currency) {

    int amount=currency.getAmount();
    if(amount >=100){
        int num_of_notes=amount/100;
        int baki_paise=amount%100;
        MyUtils.log("100 RS NOTES DISPENSED",String.valueOf(num_of_notes));
        if(baki_paise!=0 ) this.chain.dispense(new Currency(baki_paise));
    }else{
        this.chain.dispense(currency);
    }
    
}
@Override
public void setNextChain(AtmDispenceChain nextChain) {
   this.chain=nextChain;
    
}

}