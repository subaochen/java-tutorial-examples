package cn.edu.sdut.softlab.chap03.inherit.step3;

import java.util.Date;

public class CreditCard extends BankCard {

  Date expired;

  CreditCard() {
    System.out.println("CreditCard constructor called");
  }

  void overdraw() {
    // 透支消费
  }

}
