
import java.util.Scanner;

public class Month {

  /**
   * 根据月份的英文缩写输出给定月份的天数.// |\longremark{注意到这一行最后的小句点：这是google编码规范要求的}|
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    int days = 0;

    Scanner console = new Scanner(System.in);
    System.out.print("请输入月份的英文缩写：");
    String month = console.next();
    switch (month) {
      case "FEB": // |\longremark{在这里故意忽略了闰年问题，你能修改一下这个程序，解决闰年问题吗？}|
        days = 28;
        break;
      case "JAN":
      case "MAR":
      case "MAY":
      case "JUL":
      case "AUG":
      case "OCT":
      case "DEC":
        days = 31;
        break;
      case "APR":
      case "JUN":
      case "SEPT":
      case "NOV":
        days = 30;
        break;
      default:
        System.out.println("输入错误，请检查月份英文缩写是否为全部大写");
    }

    System.out.println("月份" + month + "的天数为" + days);

  }

}
//|\showremarks|