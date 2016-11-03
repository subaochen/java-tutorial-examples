package cn.edu.sdut.softlab.chap03.acprotected;

import cn.edu.sdut.softlab.chap03.acprotected.other.CreditCard;

public class Client {

  public static void main(String[] args) {
    CreditCard card = new CreditCard();


    card.withdraw();
    card.deposit(); 
  }

}
