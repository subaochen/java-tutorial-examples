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

package cn.edu.sdut.softlab.oopbasic.staticvariable;

/**
 * 本类示例静态属性的定义方式.
 *
 * @author Su Baochen
 */
public class Book {

  int id;
  String title;
  String author;
  float price;
  static int nextId; //|\longremark{类属性，在所有独享之间共享的变量}|
  
  // 初始化静态属性，这里设置id的起点值
  static { // |\longremark{初始化类属性，在整个应用程序运行期间只会调用一次}|
    nextId = 100;
  }

  @Override
  public String toString() {
    return "Book{" + "id=" + id + ", title=" + title + ", author=" + author
            + ", price=" + price + '}';
  }

}
// |\showremarks|
