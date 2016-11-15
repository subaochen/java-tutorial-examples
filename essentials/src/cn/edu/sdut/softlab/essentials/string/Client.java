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

package cn.edu.sdut.softlab.essentials.string;

/**
 * 本类演示了String类的常见用法 .
 *
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    String hello = "Hello World!";
    print(hello);
    print("Hello Java!");
    
    char[] data = {'a','b','c'};
    String str = new String(data);
    print(str);
    
    byte[] bytes = {97,98,99}; // ascii码表可查阅http://www.asciitable.com/
    String byteStr = new String(bytes);
    print(byteStr);
  }

  /**
   * 打印字符串内容.
   *
   * @TODO 如何演示hello字符串是不变长度的？
   * @param str 字符串类型的输入参数
   */
  public static void print(String str) {
    System.out.println(str);
  }

}
