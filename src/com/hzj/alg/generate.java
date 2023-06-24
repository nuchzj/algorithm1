package com.hzj.alg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class generate {
    public static void main(String[] args) {
        List<List<Integer>> generate = new generate().generate(3);
        System.out.println(generate);
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i) {
                    row.add(1);
                }else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
     }
}
