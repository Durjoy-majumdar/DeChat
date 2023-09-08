package com.tencent.tavkit.report;

import com.tencent.tavkit.report.FilterChainReportSession;
import java.util.HashMap;
import java.util.Map;

public final class CompositingReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final String REPORT_EVENT = "android_tavkit_compositing";
    public static final String REPORT_KEY_AVG_RENDER_TIME_US = "avg_render_time_us";
    private static final String REPORT_SERVICE = "TAVKit_Android";
    private static final String REPORT_VERSION = "1.3.5.6";
    private static final String TAG = "CompositingReportSessio";
    private static IReporter reporter;
    private long beginTimeMs = 0;
    private int failureCount = 0;
    private final FilterChainReporter filterChainReporter;
    private float renderHeight;
    private float renderWidth;
    private int successCount = 0;
    private long totalCostUs = 0;

    public static class FilterChainReporter implements FilterChainReportSession.IReporter {
        private Map<String, Long> values;

        private FilterChainReporter() {
            this.values = new HashMap();
        }

        public void onCommit(Map<String, Long> map) {
            map.putAll(map);
        }
    }

    public interface IReporter {
        void onCommit(Map<String, Long> map, Map<String, Long> map2);
    }

    public CompositingReportSession(float f, float f2) {
        this.renderWidth = f;
        this.renderHeight = f2;
        FilterChainReporter filterChainReporter2 = new FilterChainReporter();
        this.filterChainReporter = filterChainReporter2;
        FilterChainReportSession.setReporter(filterChainReporter2);
    }

    private void commit() {
    }

    private void reset() {
        this.beginTimeMs = 0;
        this.totalCostUs = 0;
        this.successCount = 0;
    }

    public static synchronized void setReporter(IReporter iReporter) {
        synchronized (CompositingReportSession.class) {
            reporter = iReporter;
        }
    }

    public final void flush() {
        if (this.beginTimeMs != 0) {
            if (this.successCount >= 10) {
                commit();
            }
            reset();
        }
    }

    public void tickFailed() {
        this.failureCount++;
    }

    public final void tickSuccess(long j) {
        if (this.beginTimeMs == 0) {
            this.beginTimeMs = System.currentTimeMillis() - ((j / 1000) / 1000);
        }
        this.successCount++;
        this.totalCostUs += j / 1000;
    }
}
