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

package cn.edu.sdut.softlab.essentials.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 本类演示了DateTimeFormatter的常见用法 .
 *
 * @author Su Baochen
 */
public class DateTimeFormatterTest {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {

    //Format examples
    LocalDate date = LocalDate.now();
    //default format
    System.out.println("Default format of LocalDate=" + date);
    //specific format
    System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
    System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

    LocalDateTime dateTime = LocalDateTime.now();
    //default format
    System.out.println("Default format of LocalDateTime=" + dateTime);
    //specific format
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
    System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

    //Parse examples
    LocalDateTime dt = LocalDateTime.parse("27::04::2014 21::39::48",
            DateTimeFormatter.ofPattern("d::MM::uuuu HH::mm::ss"));
    System.out.println("Default format after parsing = " + dt);
  }
}
