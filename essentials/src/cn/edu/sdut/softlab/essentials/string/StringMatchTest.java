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
 * 本类演示了String类的字符串匹配相关方法 .
 * @author Su Baochen
 */
public class StringMatchTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    String str = "Java programming language";
    System.out.println(str.startsWith("Java")); //true
    System.out.println(str.endsWith("language"));//true
    System.out.println(str.contains("prog"));//true   
    System.out.println(str.matches("[Jj]ava.*")); //true，也能匹配java programming language     
  }

}
