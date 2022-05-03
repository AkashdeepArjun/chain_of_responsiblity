package home;

interface AtmDispenceChain{
    void setNextChain(AtmDispenceChain nextChain);
    void dispense(Currency currency);
}