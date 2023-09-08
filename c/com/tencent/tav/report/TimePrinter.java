package com.tencent.tav.report;

import com.tencent.tav.coremedia.CMTime;
import java.util.HashMap;
import java.util.Map;

public class TimePrinter {
    private static Map<String, TimePrinter> constMap = new HashMap();
    private static Map<String, TimePrinter> printerMap = new HashMap();
    private String TAG = "TimeDebug";
    private CMTime currentSyncTime;
    private long currentTimeUs;

    public TimePrinter(String str) {
        this.TAG += "-" + str;
    }

    public static synchronized void print(String str, CMTime cMTime) {
        synchronized (TimePrinter.class) {
            TimePrinter timePrinter = printerMap.get(str);
            if (timePrinter == null) {
                timePrinter = new TimePrinter(str);
                printerMap.put(str, timePrinter);
            }
            timePrinter.print(cMTime);
        }
    }

    public static synchronized void printCons(String str) {
        synchronized (TimePrinter.class) {
            TimePrinter timePrinter = constMap.get(str);
            if (timePrinter == null) {
                constMap.put(str, new TimePrinter(str, System.nanoTime() / 1000));
            } else {
                timePrinter.printCons();
                constMap.remove(str);
            }
        }
    }

    public TimePrinter(String str, long j) {
        this.TAG += "-" + str;
        this.currentTimeUs = j;
    }

    public void print(CMTime cMTime) {
        if (this.currentSyncTime == null) {
            this.currentSyncTime = cMTime;
            return;
        }
        cMTime.sub(this.currentSyncTime).getTimeUs();
        this.currentSyncTime = cMTime;
    }

    public void printCons() {
        long nanoTime = System.nanoTime() / 1000;
    }
}
