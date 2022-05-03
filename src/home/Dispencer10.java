package home;

public class Dispencer10 implements AtmDispenceChain {

    AtmDispenceChain chain;
@Override
public void dispense(Currency currency) {

    int amount=currency.getAmount();
    if(amount >=10){
        int num_of_notes=amount/10;
        int baki_paise=amount%10;
        MyUtils.log("10 RS NOTES DISPENSED",String.valueOf(num_of_notes));

        if(baki_paise!=0) this.dispense(new Currency(baki_paise));
        
    }
    else{
        MyUtils.log("10 RS ERROR", "your balance "+String.valueOf(amount)+" is not withdrawable");

    }
    
}
@Override
public void setNextChain(AtmDispenceChain nextChain) {
   this.chain=nextChain;
    
}
    
}
