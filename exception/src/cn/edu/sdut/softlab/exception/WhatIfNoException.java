package cn.edu.sdut.softlab.exception;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 本类演示了Java的异常处理机制 .
 *
 * @author Su Baochen
 */
public class WhatIfNoException {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please input date:");
    String str = console.nextLine();

    while (!str.equalsIgnoreCase("*")) { // 输入*表示结束
      System.out.println(LocalDate.parse(str));
      System.out.print("Please input date:");
      str = console.nextLine();
    }
  }
}
