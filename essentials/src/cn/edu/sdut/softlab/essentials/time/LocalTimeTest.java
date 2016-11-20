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

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 本类演示了LocalTime类的常见用法 .
 *
 * @author Su Baochen
 */
public class LocalTimeTest {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {

    LocalTime time = LocalTime.now();// |\longremark{获取当前时间}|
    System.out.println("Current Time=" + time);

    LocalTime specificTime = LocalTime.of(12, 20, 25, 40); // |\longremark{根据给定时间创建时间对象}|
    System.out.println("Specific Time of Day=" + specificTime);

    LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata")); // |\longremark{根据给定时区创建时间对象}|
    System.out.println("Current Time in IST=" + timeKolkata);

    //Getting date from the base date i.e 01/01/1970
    LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);// |\longremark{获得从1970-1-1开始计算的时间}|
    System.out.println("10000th second time= " + specificSecondTime);
    
    LocalTime one = LocalTime.parse("12:30:55"); //|\longremark{将字符串解析为LocalTime对象}|
    LocalTime two = LocalTime.parse("13:02:15");
    System.out.println("12:30:55 parsed to LocalDate = " + one);
    System.out.println("12:30:55 < 13:02:15 ? " + one.isBefore(two));
    System.out.println("12:30:55 < 12:30:55 ? " + one.isBefore(one));
    System.out.println("13:02:15 > 12:30:55 ? " + two.isAfter(one));
  }
}
// |\showremarks|
