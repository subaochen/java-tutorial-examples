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

package cn.edu.sdut.softlab.lambda;

import java.util.function.Consumer;

/**
 * 本类演示了Lambda的作用域 .
 *
 * @author Su Baochen
 */
public class LambdaScopeTest {

  public int x = 0;

  class FirstLevel {

    public int x = 1;

    void methodInFirstLevel(int x) {

      // The following statement causes the compiler to generate
      // the error "local variables referenced from a lambda expression
      // must be final or effectively final" in statement A:
      //
      // x = 99;
      Consumer<Integer> myConsumer = (y)
              -> {
        System.out.println("x = " + x); // Statement A
        System.out.println("y = " + y);
        System.out.println("this.x = " + this.x);
        System.out.println("LambdaScopeTest.this.x = "
                + LambdaScopeTest.this.x);
      };

      myConsumer.accept(x);

    }
  }

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    LambdaScopeTest st = new LambdaScopeTest();
    LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(23);

  }

}
