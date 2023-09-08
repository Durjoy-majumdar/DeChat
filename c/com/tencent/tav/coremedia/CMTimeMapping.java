package com.tencent.tav.coremedia;

public class CMTimeMapping {
    private CMTimeRange source;
    private CMTimeRange target;

    public CMTimeMapping(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        this.source = cMTimeRange.clone();
        this.target = cMTimeRange2.clone();
    }

    public CMTimeRange getSource() {
        return this.source;
    }

    public CMTimeRange getTarget() {
        return this.target;
    }

    public void setSource(CMTimeRange cMTimeRange) {
        this.source = cMTimeRange.clone();
    }

    public void setTarget(CMTimeRange cMTimeRange) {
        this.target = cMTimeRange.clone();
    }

    public String toString() {
        return "CMTimeMapping{source=" + this.source.toSimpleString() + ", target=" + this.target.toSimpleString() + '}';
    }
}
