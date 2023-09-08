package com.tencent.mars.xlog;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class WindowCounter implements Runnable {
    private static final String TAG = "WindowCounter";
    private final int baseThreshold;
    private TriggeredCallBack callBack;
    private final boolean clusterByTag;
    private volatile int currentThreshold;
    private boolean enableFilter;
    private int lastIndex = 0;
    private long lastTriggerTime;
    private ConcurrentHashMap<String, TagInfo> mapCounter;
    private long monitorStartTime;
    private final int thresholdIncrement;
    private final long timeSpan;
    private final int windowCount;
    private int[] windowCounter;

    public static class TagInfo {
        public long lastVisitTime;
        public LogLengthFilter lengthFilter;
        public int[] statsWindow;

        public TagInfo(int[] iArr, long j) {
            this.statsWindow = iArr;
            this.lastVisitTime = j;
        }
    }

    public interface TriggeredCallBack {
        void onThresholdTriggered(String str, String str2, int i);
    }

    public WindowCounter(long j, int i, int i2, int i3, boolean z) {
        this.timeSpan = j;
        this.windowCount = i;
        this.baseThreshold = i2;
        this.thresholdIncrement = i3;
        this.clusterByTag = z;
        this.currentThreshold = i2;
        long currentTimeMillis = System.currentTimeMillis();
        this.lastTriggerTime = currentTimeMillis;
        this.monitorStartTime = currentTimeMillis;
        if (z) {
            this.mapCounter = new ConcurrentHashMap<>();
            new Thread(this).start();
            return;
        }
        this.windowCounter = new int[i];
    }

    public boolean addLog2Monitor(String str, String str2) {
        TriggeredCallBack triggeredCallBack;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.monitorStartTime > currentTimeMillis) {
            this.monitorStartTime = currentTimeMillis;
            return true;
        }
        int[] iArr = this.windowCounter;
        TagInfo tagInfo = null;
        if (this.clusterByTag) {
            String str3 = str.startsWith("FTPP.") ? "FTPP." : str;
            tagInfo = this.mapCounter.get(str3);
            if (tagInfo == null) {
                tagInfo = new TagInfo(new int[this.windowCount], currentTimeMillis);
                this.mapCounter.put(str3, tagInfo);
            }
            tagInfo.lastVisitTime = currentTimeMillis;
            iArr = tagInfo.statsWindow;
        }
        int i = (int) (((currentTimeMillis - this.monitorStartTime) / this.timeSpan) % ((long) this.windowCount));
        boolean z = false;
        if (i != this.lastIndex) {
            iArr[i] = 0;
            this.lastIndex = i;
        }
        iArr[i] = iArr[i] + 1;
        if (currentTimeMillis - this.lastTriggerTime > 120000) {
            synchronized (this) {
                if (currentTimeMillis - this.lastTriggerTime > 120000) {
                    this.lastTriggerTime = currentTimeMillis;
                    this.currentThreshold = this.baseThreshold;
                }
            }
        }
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        if (i2 > this.currentThreshold) {
            synchronized (this) {
                if (i2 > this.currentThreshold) {
                    this.currentThreshold += this.thresholdIncrement;
                    this.lastTriggerTime = currentTimeMillis;
                    z = true;
                }
            }
            if (z && (triggeredCallBack = this.callBack) != null) {
                triggeredCallBack.onThresholdTriggered(str, str2, i2);
            }
        }
        if (i2 <= this.baseThreshold || !this.clusterByTag || !this.enableFilter) {
            return true;
        }
        if (tagInfo.lengthFilter == null) {
            synchronized (tagInfo) {
                tagInfo.lengthFilter = new LogLengthFilter();
            }
        }
        return !tagInfo.lengthFilter.add(str2.length());
    }

    public void run() {
        while (true) {
            try {
                TimeUnit.MINUTES.sleep(2);
            } catch (InterruptedException unused) {
            }
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(3);
            if (this.clusterByTag) {
                for (Map.Entry next : this.mapCounter.entrySet()) {
                    if (((TagInfo) next.getValue()).lastVisitTime < currentTimeMillis) {
                        this.mapCounter.remove(next.getKey());
                    }
                    LogLengthFilter logLengthFilter = ((TagInfo) next.getValue()).lengthFilter;
                    if (logLengthFilter != null) {
                        long andSet = logLengthFilter.getAndSet(0);
                        if (andSet > 0) {
                            Log.m105925i(TAG, "%d log with tag[%s] has been filtered.", Long.valueOf(andSet), next.getKey());
                        }
                    }
                }
            }
        }
    }

    public void setEnableFilter() {
        this.enableFilter = true;
    }

    public void setThresholdTriggeredCallBack(TriggeredCallBack triggeredCallBack) {
        this.callBack = triggeredCallBack;
    }
}
