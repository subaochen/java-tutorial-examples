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

package cn.edu.sdut.softlab.oopbasic.annnoymousinnerclass;

/**
 * 本类演示匿名内部类的用法 .
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
    // 匿名内部类，是Book的子类
    // 这里同时使用了匿名对象
    new Book("Learning Java Based on C") {
      private void edit() {
        System.out.println("edit the book before publishing");
      }

      @Override
      public void publish() {
        edit();
        super.publish();
      }
    }.publish();

  }

}
