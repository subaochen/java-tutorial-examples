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

package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了throw和throws的用法.
 * 本例原始版本来自：http://faculty.ycp.edu/~dhovemey/spring2007/cs201/info/exceptionsFileIO.html
 * @author subaochen
 */
public class Example {

  private int count = 0;

  public static void main(String[] argv) {
    try {
      Example ex = new Example();
      ex.f();
      System.out.println(ex.count);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void f() throws Exception {
    add(2);
    add(3);
  }

  public void add(int val) throws Exception {
    if (val == 2) {
      throw new Exception("就是这么二！");
    }
    count += val;
  }

  public void mult(int val) {
    count *= val;
  }
}
