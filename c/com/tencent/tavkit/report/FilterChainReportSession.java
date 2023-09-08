package com.tencent.tavkit.report;

import java.util.HashMap;
import java.util.Map;

public class FilterChainReportSession {
    private static IReporter reporter;
    private Map<String, TimeConsumer> timeConsumerMap = new HashMap();

    public interface IReporter {
        void onCommit(Map<String, Long> map);
    }

    public static class TimeConsumer {
        private long count = 0;
        /* access modifiers changed from: private */
        public final String key;
        private long totalUs = 0;

        public TimeConsumer(String str) {
            this.key = str;
        }

        /* access modifiers changed from: private */
        public long getAvgTimeUs() {
            long j = this.count;
            if (j == 0) {
                return 0;
            }
            return this.totalUs / j;
        }

        /* access modifiers changed from: private */
        public void tick(long j) {
            this.totalUs += j;
            this.count++;
        }
    }

    public static synchronized void setReporter(IReporter iReporter) {
        synchronized (FilterChainReportSession.class) {
            reporter = iReporter;
        }
    }

    public void commit() {
        HashMap hashMap = new HashMap();
        for (TimeConsumer next : this.timeConsumerMap.values()) {
            if (next != null) {
                hashMap.put(next.key, Long.valueOf(next.getAvgTimeUs()));
            }
        }
        synchronized (FilterChainReportSession.class) {
            IReporter iReporter = reporter;
            if (iReporter != null) {
                iReporter.onCommit(hashMap);
            }
        }
    }

    public void tick(String str, long j) {
        TimeConsumer timeConsumer = this.timeConsumerMap.get(str);
        if (timeConsumer == null) {
            timeConsumer = new TimeConsumer(str);
            this.timeConsumerMap.put(timeConsumer.key, timeConsumer);
        }
        timeConsumer.tick(j / 1000);
    }
}
