package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subaochen on 17-1-23.
 */
public class SubListTest {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // 注意到subList的起点是从0开始计算的，因此(1,6)
        // 应该打印出2-6
        List<Integer> subList = list.subList(1, 6);
        System.out.println(subList);

        list.add(10);
        System.out.println(subList);

        // 下面的代码抛出异常：起点不能大于终点
        System.out.println("----");
        list.subList(6, 5);
    }
}
