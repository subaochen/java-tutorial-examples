/*
 * Copyright 2016 Su Baochen and individual contributors by the 
 * @authors tag. See the copyright.txt in the distribution for
 * a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了多个catch块的情形 .
 * @author 《疯狂Java讲义（第二版）》P350
 */
public class DivTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = a / b;
      System.out.println("您输入的两个数相除的结果是： " + c);
      
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("数组越界，运行程序时输入的参数个数不对。应该输入2个参数，您输入的参数个数是：" + args.length);      
      e.printStackTrace();
    } catch (NumberFormatException e) {
      System.out.println("数字格式异常，程序只能接受整数形式的参数");
      e.printStackTrace();
    } catch (ArithmeticException e) {
      System.out.println("算数异常，除数不能为0");
      e.printStackTrace();      
    } catch (Exception e) {
      System.out.println("我不知道发生了什么，总是情况不对");      
      e.printStackTrace();
    }
  }
}
