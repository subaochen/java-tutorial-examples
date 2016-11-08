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

package cn.edu.sdut.softlab.chap03.nestedclass;

/**
 * 本类演示了静态内部类.
 *
 * @author Su Baochen
 */
public class Book {

  private int id;
  private String title;
  private float price;
  private static final int VERSION = 1;
  
  public Book(String title) {
    this.title = title;
  }

  public void publish() {
    new Editor("someone").edit(); // |\longremark{在外部包围类中可以调用静态内部类中的任何方法，包括private方法}|
    System.out.println("publish the book[" + title + "]");
  }

  static class Editor {

    private String editor;

    public Editor(String name) {
      this.editor = name;
    }

    // @TODO 尝试修改edit方法的访问控制修饰符看看？
    // private的内部类方法不能在Client中创建的Editor对象调用，
    // 但是可以在外部包围类中调用
    private void edit() {
      //System.out.println(title); // |\longremark{不允许访问包围类的非静态属性}|
      System.out.println("edit the book[version=" + VERSION + "] by " + editor); // |\longremark{VERSION在外部包围类中是静态属性，因此在静态内部类中可见}|
    }
    
    public void usage(){
      System.out.println("Book.Editor.usage() called");
    }

  }

}
// |\showremarks|
