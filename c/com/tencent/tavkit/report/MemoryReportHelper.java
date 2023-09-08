package com.tencent.tavkit.report;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryReportHelper {
    public static final int MIN_TICK_INTERVAL_MS = 1000;
    private static final String TAG = "MemoryReportHelper";
    private static long lastTickTime;
    private Map<String, Consumer> consumerHashMap;
    private Context context;

    public static class Consumer {
        private long count = 0;
        /* access modifiers changed from: private */
        public final String key;
        private long maxM = 0;
        private long totalM = 0;

        public Consumer(String str) {
            this.key = str;
        }

        /* access modifiers changed from: private */
        public long getAvgMB() {
            long j = this.count;
            if (j == 0) {
                return 0;
            }
            return this.totalM / j;
        }

        /* access modifiers changed from: private */
        public void tick(long j) {
            this.totalM += j;
            this.count++;
            if (j > this.maxM) {
                this.maxM = j;
            }
        }

        public long getMaxM() {
            return this.maxM;
        }
    }

    public static class Instance {
        /* access modifiers changed from: private */
        public static final MemoryReportHelper INSTANCE = new MemoryReportHelper();

        private Instance() {
        }
    }

    public static String appendKeys(Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        for (String next : collection) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    public static String appendReportKey(Collection<?> collection) {
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (next instanceof IReportable) {
                arrayList.add(((IReportable) next).getReportKey());
            }
        }
        return appendKeys(arrayList);
    }

    public static MemoryReportHelper getInstance() {
        return Instance.INSTANCE;
    }

    public static boolean isInIntervalTime() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastTickTime < 1000) {
            return true;
        }
        lastTickTime = currentTimeMillis;
        return false;
    }

    public void clear() {
        this.consumerHashMap.clear();
    }

    public Map<String, Long> getAvgMBValues() {
        HashMap hashMap = new HashMap();
        for (Consumer next : this.consumerHashMap.values()) {
            if (next != null) {
                hashMap.put(next.key, Long.valueOf(next.getAvgMB()));
            }
        }
        return hashMap;
    }

    public Map<String, Long> getMaxMBValues() {
        HashMap hashMap = new HashMap();
        for (Consumer next : this.consumerHashMap.values()) {
            if (next != null) {
                hashMap.put(next.key, Long.valueOf(next.getMaxM()));
            }
        }
        return hashMap;
    }

    public int getPidMemorySize(int i, Context context2) {
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{i});
        processMemoryInfo[0].getTotalSharedDirty();
        return processMemoryInfo[0].getTotalPss();
    }

    public void init(Context context2) {
        this.context = context2;
    }

    public void tick(String str) {
        if (this.context != null) {
            tick(str, (long) (getPidMemorySize(Process.myPid(), this.context) / 1024));
        }
    }

    private MemoryReportHelper() {
        this.consumerHashMap = new HashMap();
    }

    public void tick(String str, long j) {
        Consumer consumer = this.consumerHashMap.get(str);
        if (consumer == null) {
            consumer = new Consumer(str);
            this.consumerHashMap.put(consumer.key, consumer);
        }
        consumer.tick(j);
    }
}
