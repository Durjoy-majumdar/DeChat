package com.tencent.youtu.ytagreflectlivecheck.worker;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import java.util.HashMap;

public class TimeCounter {
    private static String TAG = "TimeCounter";
    private static HashMap<String, TimeCounter> allMap;
    private float average = 0.0f;
    private long beginTime = 0;
    private int count = 0;
    private float last = 0.0f;
    private float max = 0.0f;
    private float min = 0.0f;
    private String name;
    private float sum = 0.0f;

    public TimeCounter(String str) {
        this.name = str;
    }

    public static void clearIns() {
        allMap.clear();
        allMap = null;
    }

    private static long getCurrentTime() {
        return System.currentTimeMillis() * 1000;
    }

    public static TimeCounter ins(String str) {
        if (allMap == null) {
            allMap = new HashMap<>();
        }
        if (allMap.get(str) == null) {
            allMap.put(str, new TimeCounter(str));
        }
        return allMap.get(str);
    }

    public static String printAll() {
        String str = "";
        for (String str2 : allMap.keySet()) {
            str = str + "\n" + allMap.get(str2).print();
        }
        return str;
    }

    public void begin() {
        this.beginTime = getCurrentTime();
    }

    public void end() {
        end(true);
    }

    public String print() {
        return this.name + " count:" + this.count + " avg:" + this.average + "ms max:" + this.max + "ms min:" + this.min + "ms last:" + this.last + LocaleUtil.MALAY;
    }

    public void reset() {
        this.sum = 0.0f;
        this.average = 0.0f;
        this.min = 0.0f;
        this.max = 0.0f;
        this.last = 0.0f;
        this.beginTime = 0;
    }

    public void end(boolean z) {
        float currentTime = ((float) (getCurrentTime() - this.beginTime)) / 1000.0f;
        float f = this.sum + currentTime;
        this.sum = f;
        int i = this.count + 1;
        this.count = i;
        this.average = f / ((float) i);
        if (i == 1) {
            this.min = currentTime;
            this.max = currentTime;
        } else {
            if (currentTime < this.min) {
                this.min = currentTime;
            }
            if (currentTime > this.max) {
                this.max = currentTime;
            }
        }
        this.last = currentTime;
        if (z) {
            print();
        }
    }
}
