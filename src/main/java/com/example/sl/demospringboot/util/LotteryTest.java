package com.example.sl.demospringboot.util;

import com.example.sl.demospringboot.model.Gift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LotteryTest {

    public static void main(String[] args) {

        List<Gift> gifts = new ArrayList<Gift>();
        // 序号==物品Id==物品名称==概率
        gifts.add(new Gift(1, "P1", "合成成功", 0.65d));
        gifts.add(new Gift(2, "P2", "合成失败", 0.35d));
//        gifts.add(new Gift(3, "P3", "物品3", 0.2d));
//        gifts.add(new Gift(4, "P4", "物品4", 0.2d));
//        gifts.add(new Gift(5, "P5", "物品5", 0.2d));
//        gifts.add(new Gift(6, "P6", "物品6", 0.1d));
//        gifts.add(new Gift(7, "P7", "物品7", 0.3d));

        List<Double> orignalRates = new ArrayList<Double>(gifts.size());
        for (Gift gift : gifts) {
            double probability = gift.getProbability();
            if (probability < 0) {
                probability = 0;
            }
            orignalRates.add(probability);
        }
//        System.out.println(orignalRates.get(5));
        // statistics
//        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        double num = 10;  //设置次数
        for (int i = 0; i < num; i++) {
            int orignalIndex = LotteryUtil.lottery(orignalRates);

//            Integer value = count.get(orignalIndex);
            System.out.println(gifts.get(orignalIndex));
//            count.put(orignalIndex, value == null ? 1 : value + 1);
        }

//        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
//            System.out.println(gifts.get(entry.getKey()) + ", count=" + entry.getValue() + ", probability="
//                    + entry.getValue() / num);
//        }
    }

}
