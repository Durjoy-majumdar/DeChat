package com.tencent.tav.report;

public final class PreviewReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final String TAG = "PreviewReportSession";
    private long beginTimeMs = 0;
    private int frameCount = 0;
    private long totalReadCostUs = 0;
    private long totalRenderCount = 0;

    private void commit() {
    }

    private void reset() {
        this.beginTimeMs = 0;
        this.totalReadCostUs = 0;
        this.totalRenderCount = 0;
        this.frameCount = 0;
    }

    public final void flush() {
        if (this.beginTimeMs != 0) {
            if (this.frameCount >= 10) {
                commit();
            }
            reset();
        }
    }

    public final void tickPreview(long j, long j2) {
        if (this.beginTimeMs == 0) {
            this.beginTimeMs = System.currentTimeMillis() - ((j / 1000) / 1000);
        }
        this.frameCount++;
        this.totalReadCostUs += j / 1000;
        this.totalRenderCount += j2 / 1000;
    }
}
