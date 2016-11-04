package cn.edu.sdut.softlab.chap03.inherit.step4;

/**
 *
 * @author SuBaochen:subaochen@126.com
 */
public class Card {

  String cardNo;

  Card() {
    System.out.println("Card constructor called");
  }
  
  public Card(String cardNo) {
    this.cardNo = cardNo;
    System.out.println("Card constructor called,cardNo=" + cardNo);
  }
}
