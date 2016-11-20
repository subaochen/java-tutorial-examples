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

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * 本类演示了日期时间类的调整计算方法 .
 *
 * @author Su Baochen
 */
public class DateTimeAPITest {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {

    LocalDate today = LocalDate.now();

    //Get the Year, check if it's leap year
    System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

    //Compare two LocalDate for before and after
    System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

    //Create LocalDateTime from LocalDate
    System.out.println("Current Time=" + today.atTime(LocalTime.now()));

    //plus and minus operations
    System.out.println("10 days after today will be " + today.plusDays(10));
    System.out.println("3 weeks after today will be " + today.plusWeeks(3));
    System.out.println("20 months after today will be " + today.plusMonths(20));

    System.out.println("10 days before today will be " + today.minusDays(10));
    System.out.println("3 weeks before today will be " + today.minusWeeks(3));
    System.out.println("20 months before today will be " + today.minusMonths(20));

    //Temporal adjusters for adjusting the dates
    System.out.println("First date of this month= " + today.with(TemporalAdjusters.firstDayOfMonth()));
    LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
    System.out.println("Last date of this year= " + lastDayOfYear);

    Period period = today.until(lastDayOfYear);
    System.out.println("Period Format= " + period);
    System.out.println("Months remaining in the year= " + period.getMonths());
  }

}
