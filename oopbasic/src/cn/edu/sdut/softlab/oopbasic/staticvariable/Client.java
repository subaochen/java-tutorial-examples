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
 * 演示如何使用静态属性.
 *
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.title = "Thinking in Java";
    // 建议的静态属性使用方法
    book1.id = Book.nextId++;
    // 不建议的使用静态属性的方法
    //book1.id = book1.nextId++;
    System.out.println(book1);
    
    Book book2 = new Book();
    book2.title = "Design Patterns";
    book2.id = Book.nextId++;
    System.out.println(book2);
  }

}
