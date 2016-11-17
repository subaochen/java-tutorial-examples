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

package cn.edu.sdut.softlab.essentials.number;

/**
 * 本类以Integer为例，演示了数字之间的相互转换 .
 * @author Su Baochen
 */
public class NumberTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(Integer.decode("10")); // 10进制
    System.out.println(Integer.decode("0x10")); // 16进制
    System.out.println(Integer.decode("010")); // 8进制
    System.out.println(Integer.parseInt("123"));
    //System.out.println(Integer.parseInt("123.4")); // 格式错误
    Integer num = 123;
    System.out.println("num=" + num);
    System.out.println("num=" + num.toString());
    System.out.println(Integer.parseInt("10",8));
    System.out.println(Integer.valueOf(123)); // |\longremark{注意这里实际上分两步走：第一步根据数字123获得了一个Integer类型的对象，第二步调用了Integer类型对象的toString方法输出了“123”字符串}|
    System.out.println(Integer.valueOf("123"));
    //System.out.println(Integer.valueOf("123.4")); // 格式错误
    System.out.println(Integer.valueOf("10",2)); // |\longremark{根据2进制的“10”创建Integer类型的对象，整数值为2}|      
  }

}
// |\showremarks|
