/*
 * Copyright 2016 subaochen.
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

package cn.edu.sdut.softlab.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author subaochen
 */
public class Student {

  private int age;
  private String username;
  private String email;

  public static List<Student> testData;

  static {
    testData = new ArrayList<>(0);
    testData.add(new Student("zhangsan", 18, "zhangsan@126.com"));
    testData.add(new Student("lisi", 20, "lisi@163.com"));
    testData.add(new Student("wangwu", 21, "wangwu@sohu.com"));
    testData.add(new Student("zhaoliu", 23, "zhaoliu@126.com"));
    testData.add(new Student("tianqi", 21, "tianqi@126.com"));
    testData.add(new Student("wangba", 18, "wangba@126.com"));
    testData.add(new Student("laojiu", 23, "laojiu@126.com"));
  }

  public Student(String username, int age, String email) {
    this.age = age;
    this.username = username;
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Student{" + "age=" + age + ", username=" + username + ", email=" + email + '}';
  }
  
  
  public void print() {
    System.out.println(toString());
  }

}
