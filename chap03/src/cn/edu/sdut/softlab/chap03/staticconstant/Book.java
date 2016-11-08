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

package cn.edu.sdut.softlab.chap03.staticconstant;

/**
 * 本类示例静态常量的惯用定义方式.
 * @author Su Baochen
 */
public class Book {
  public static final String CHAPTER_ONE = "第一章";
  public static final String CHAPTER_TWO = "第二章";
  
  String title;
  String author;
  float price;

  @Override
  public String toString() {
    return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
  }
 
}
