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

package cn.edu.sdut.softlab.oopbasic.localinnerclass;

/**
 * 本类演示了局部内部类的用法.
 *
 * @author Su Baochen
 */
public class Book {

  int version = 1;
  static int nextId;

  /**
   * 发布图书.
   */
  public void publish() {

    class Publisher {
      private void edit() {
        System.out.println("edit the book before publish");
      }

      public void publish() {
        edit();
        System.out.println("publish book[version=" + version + ",id=" + nextId++);
      }
    }

    new Publisher().publish();
  }

}
