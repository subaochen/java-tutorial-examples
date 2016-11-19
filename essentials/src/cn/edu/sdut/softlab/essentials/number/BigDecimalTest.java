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

import java.math.BigDecimal;

/**
 * 本类演示了BigDecimal的构造方法的用法 .
 * @author Su Baochen
 */
public class BigDecimalTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(new BigDecimal("123").toBigInteger());
    System.out.println(new BigDecimal("-123").toBigInteger());
    System.out.println(new BigDecimal("1.23E3").toBigInteger());
    System.out.println(new BigDecimal("1.23E+3").toBigInteger());
    System.out.println(new BigDecimal("1.23E-3").toBigInteger());
    System.out.println(new BigDecimal("12.3E7").toBigInteger());
    System.out.println(new BigDecimal("0.00123").toBigInteger());
    System.out.println(new BigDecimal("-1.23E-3").toBigInteger());
    System.out.println(new BigDecimal("1234.5E-4").toBigInteger());
    System.out.println(new BigDecimal("0E+7").toBigInteger());
    System.out.println(new BigDecimal("-0").toBigInteger());
    char[] in = {'1','2'};
    System.out.println(new BigDecimal(in));
      
  }

}
