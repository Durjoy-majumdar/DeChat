package com.tencent.tav.coremedia;

public class CMSampleState {
    private int exportCode;
    private boolean isNewFrame;
    private String msg;
    public CMPerformance performance;
    private long stateCode;
    private Throwable throwable;
    private final CMTime time;

    public CMSampleState() {
        this(CMTime.CMTimeInvalid);
    }

    public static CMSampleState fromError(long j) {
        return fromError(j, "state:" + j);
    }

    public static CMSampleState fromExportError(long j, int i, String str, Throwable th) {
        CMSampleState cMSampleState = new CMSampleState(j, str, th);
        cMSampleState.exportCode = i;
        return cMSampleState;
    }

    public int getExportCode() {
        return this.exportCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public long getStateCode() {
        return this.stateCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public CMTime getTime() {
        return this.time;
    }

    public CMSampleState inherit(CMSampleState cMSampleState) {
        this.performance = cMSampleState.performance;
        cMSampleState.performance = null;
        return this;
    }

    public boolean isInvalid() {
        return this.time == CMTime.CMTimeInvalid;
    }

    public boolean isNewFrame() {
        return this.isNewFrame;
    }

    public void joinNode(CMSampleState cMSampleState) {
        CMPerformance cMPerformance = cMSampleState.performance;
        if (cMPerformance != null) {
            this.performance.preNodes.add(cMPerformance);
            cMSampleState.performance = null;
        }
    }

    public void setNewFrame(boolean z) {
        this.isNewFrame = z;
    }

    public boolean stateMatchingTo(long... jArr) {
        for (long j : jArr) {
            if (this.stateCode == j) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "CMSampleState{time=" + this.time + ", isNewFrame=" + this.isNewFrame + ", stateCode=" + this.stateCode + ", throwable=" + this.throwable + ", msg='" + this.msg + '\'' + '}';
    }

    public void updatePerformance() {
        while (this.performance.getNextNode() != null) {
            this.performance = this.performance.getNextNode();
        }
    }

    public CMSampleState(CMTime cMTime) {
        this.performance = new CMPerformance();
        this.isNewFrame = true;
        this.stateCode = 0;
        this.exportCode = 0;
        this.time = cMTime;
        long j = cMTime.value;
        if (j < 0) {
            this.stateCode = j;
        }
    }

    public static CMSampleState fromError(long j, String str) {
        return fromError(j, str, new RuntimeException(str));
    }

    public static CMSampleState fromError(long j, String str, Throwable th) {
        return new CMSampleState(j, str, th);
    }

    public CMSampleState(CMTime cMTime, CMPerformance cMPerformance) {
        this(cMTime);
        this.performance = cMPerformance;
    }

    public CMSampleState(long j, String str, Throwable th) {
        this.performance = new CMPerformance();
        this.isNewFrame = true;
        this.stateCode = 0;
        this.exportCode = 0;
        this.time = new CMTime(j);
        this.stateCode = j;
        this.msg = str;
        this.throwable = th;
    }
}
