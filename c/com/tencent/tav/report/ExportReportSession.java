package com.tencent.tav.report;

import com.tencent.tav.decoder.logger.Logger;

public final class ExportReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final String TAG = "ExportReportSession";
    private long beginTimeMs = 0;
    private long compositeTimeUs = 0;
    private long exportStartTimeNs = 0;
    private long fileDurationUs = 0;
    private long framePerSecond = 0;
    private boolean success = false;
    private int successCount = 0;
    private long totalCostUs = 0;
    private long totalDecodeUs = 0;
    private long totalEncodeUs = 0;
    private long totalRealDecodeUs = 0;
    private long totalRenderUs = 0;

    private void commit() {
        if (this.beginTimeMs == 0 || this.exportStartTimeNs == 0) {
            Logger.m144643e(TAG, "commit: 数据错误，beginTimeMs = " + this.beginTimeMs + "， exportStartTimeNs = " + this.exportStartTimeNs);
        } else if (this.successCount >= 10) {
            doCommit();
        }
    }

    private void doCommit() {
        int i = this.successCount;
        double d = ((double) this.totalCostUs) / ((double) i);
        double d2 = ((double) this.totalDecodeUs) / ((double) i);
        Logger.m144646i(TAG, "report export performance, compositeTimeUs:" + this.compositeTimeUs + ", totalCostUs:" + this.totalCostUs + ", totalDecodeUs:" + this.totalDecodeUs + ", successCount:" + this.successCount + ", avg_decode_time:" + d2 + ", avg_render_time:" + d);
    }

    public long getAverageDecodeUs() {
        if (this.successCount != 0) {
            return getTotalDecodeUs() / ((long) this.successCount);
        }
        return 0;
    }

    public long getAverageEncodeUs() {
        int i = this.successCount;
        if (i != 0) {
            return this.totalEncodeUs / ((long) i);
        }
        return 0;
    }

    public long getAverageRenderUs() {
        int i = this.successCount;
        if (i != 0) {
            return this.totalRenderUs / ((long) i);
        }
        return 0;
    }

    public long getCompositeTimeUs() {
        return this.compositeTimeUs;
    }

    public int getSuccessCount() {
        return this.successCount;
    }

    public long getTotalCostUs() {
        return this.totalCostUs;
    }

    public long getTotalDecodeUs() {
        return this.totalRealDecodeUs;
    }

    public long getTotalEncodeUs() {
        return this.totalEncodeUs;
    }

    public long getTotalRenderUs() {
        return this.totalRenderUs;
    }

    public void onExportError() {
        this.success = false;
        commit();
    }

    public void onExportStart(long j) {
        this.exportStartTimeNs = j;
        this.beginTimeMs = System.currentTimeMillis();
    }

    public void onExportSuccess() {
        if (this.exportStartTimeNs <= 0) {
            Logger.m144643e(TAG, "onExportSuccess: 数据错误，exportStartTimeNs = " + this.exportStartTimeNs);
            return;
        }
        this.success = true;
        this.compositeTimeUs = (System.nanoTime() - this.exportStartTimeNs) / 1000;
        commit();
    }

    public void reset() {
        Logger.m144641d(TAG, "reset() called");
        this.compositeTimeUs = 0;
        this.success = false;
        this.totalCostUs = 0;
        this.successCount = 0;
        this.fileDurationUs = 0;
        this.framePerSecond = 0;
    }

    public void setFileDurationUs(long j) {
        this.fileDurationUs = j;
    }

    public void setFramePerSecond(int i) {
        this.framePerSecond = (long) i;
    }

    public void setTotalEncodeUs(long j) {
        this.totalEncodeUs = j;
    }

    public void setTotalRealDecodeUs(long j) {
        this.totalRealDecodeUs = j;
    }

    public void setTotalRenderUs(long j) {
        this.totalRenderUs = j;
    }

    public final void tickDecode(long j) {
        this.totalDecodeUs += j / 1000;
    }

    public final void tickExport(long j) {
        this.successCount++;
        this.totalCostUs += j / 1000;
    }

    public String toString() {
        return "ExportReportSession{success=" + this.success + ", successCount=" + this.successCount + ", compositeTimeUs=" + this.compositeTimeUs + ", totalCostUs=" + getTotalCostUs() + ", totalDecodeUs=" + getTotalDecodeUs() + ", totalEncodeUs=" + getTotalEncodeUs() + ", totalRenderUs=" + getTotalRenderUs() + ", averageDecodeUs=" + getAverageDecodeUs() + ", averageEncodeUs=" + getAverageEncodeUs() + ", averageRenderUs=" + getAverageRenderUs() + '}';
    }
}
