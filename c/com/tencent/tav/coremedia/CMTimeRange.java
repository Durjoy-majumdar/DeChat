package com.tencent.tav.coremedia;

public class CMTimeRange implements Cloneable {
    public static CMTimeRange CMTimeRangeInvalid;
    private CMTime duration;
    private CMTime end;
    private CMTime start;

    static {
        CMTime cMTime = CMTime.CMTimeZero;
        CMTimeRangeInvalid = new CMTimeRange(cMTime, cMTime);
    }

    public CMTimeRange(CMTime cMTime, CMTime cMTime2) {
        this.start = cMTime;
        this.duration = cMTime2;
        this.end = cMTime.add(cMTime2);
    }

    public static CMTimeRange fromMs(long j, long j2) {
        return new CMTimeRange(CMTime.fromMs(j), CMTime.fromMs(j2));
    }

    public static CMTimeRange fromSeconds(float f, float f2) {
        return new CMTimeRange(CMTime.fromSeconds(f), CMTime.fromSeconds(f2));
    }

    public static CMTimeRange fromUs(long j, long j2) {
        return new CMTimeRange(CMTime.fromUs(j), CMTime.fromUs(j2));
    }

    public static CMTimeRange getIntersection(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        if (cMTimeRange == null || cMTimeRange2 == null) {
            return CMTimeRangeInvalid;
        }
        CMTimeRange clone = cMTimeRange.clone();
        CMTimeRange clone2 = cMTimeRange2.clone();
        if (clone.getStartUs() > clone2.getStartUs()) {
            CMTimeRange cMTimeRange3 = clone2;
            clone2 = clone;
            clone = cMTimeRange3;
        }
        return (clone.getEndUs() <= clone2.getStartUs() || clone.getEndUs() >= clone2.getEndUs()) ? clone.getEndUs() >= clone2.getEndUs() ? clone2 : clone.getEndUs() < clone2.getStartUs() ? CMTimeRangeInvalid : CMTimeRangeInvalid : new CMTimeRange(clone2.getStart(), clone.getEnd().sub(clone2.getStart()));
    }

    public static CMTimeRange[] getUnions(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        CMTimeRange[] cMTimeRangeArr = new CMTimeRange[2];
        if (cMTimeRange == null) {
            cMTimeRangeArr[0] = cMTimeRange2;
        } else if (cMTimeRange2 == null) {
            cMTimeRangeArr[0] = cMTimeRange;
        } else {
            CMTimeRange clone = cMTimeRange.clone();
            CMTimeRange clone2 = cMTimeRange2.clone();
            if (clone.getStartUs() > clone2.getStartUs()) {
                CMTimeRange cMTimeRange3 = clone2;
                clone2 = clone;
                clone = cMTimeRange3;
            }
            cMTimeRangeArr[0] = clone;
            if (clone.getEndUs() >= clone2.getStartUs() && clone.getEndUs() < clone2.getEndUs()) {
                cMTimeRangeArr[1] = new CMTimeRange(clone.getEnd(), clone2.getEnd().sub(clone.getEnd()));
            } else if (clone.getEndUs() >= clone2.getEndUs()) {
                cMTimeRangeArr[1] = null;
            } else if (clone.getEndUs() < clone2.getStartUs()) {
                cMTimeRangeArr[1] = clone2;
            }
        }
        return cMTimeRangeArr;
    }

    public boolean containsTime(CMTime cMTime) {
        return getStartUs() <= cMTime.getTimeUs() && getEndUs() > cMTime.getTimeUs();
    }

    public boolean containsTimeRange(CMTimeRange cMTimeRange) {
        return getStartUs() <= cMTimeRange.getStartUs() && getEndUs() >= cMTimeRange.getEndUs();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CMTimeRange)) {
            return false;
        }
        CMTimeRange cMTimeRange = (CMTimeRange) obj;
        return this.start.equals(cMTimeRange.start) && this.duration.equals(cMTimeRange.duration);
    }

    public CMTime getDuration() {
        return this.duration;
    }

    public long getDurationUs() {
        return this.duration.getTimeUs();
    }

    public CMTime getEnd() {
        return this.end;
    }

    public long getEndUs() {
        return getStartUs() + getDurationUs();
    }

    public CMTime getStart() {
        return this.start;
    }

    public long getStartUs() {
        return this.start.getTimeUs();
    }

    public boolean isLegal() {
        return getStartUs() >= 0 && getDurationUs() > 0;
    }

    public void setDuration(CMTime cMTime) {
        this.duration = cMTime;
        this.end = this.start.add(cMTime);
    }

    public void setStart(CMTime cMTime) {
        this.start = cMTime;
        this.end = cMTime.add(this.duration);
    }

    public CMTimeRange[] split(float f) {
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        CMTimeRange cMTimeRange = new CMTimeRange(this.start, getDuration().multi(f));
        return new CMTimeRange[]{cMTimeRange, new CMTimeRange(cMTimeRange.getEnd(), getDuration().multi(1.0f - f))};
    }

    public String toSimpleString() {
        return "CMTimeRange{startUs=" + this.start.getTimeUs() + ", durationUs=" + this.duration.getTimeUs() + '}';
    }

    public String toString() {
        return "CMTimeRange{start=" + this.start + ", duration=" + this.duration + ", end=" + this.end + '}';
    }

    public CMTimeRange clone() {
        return new CMTimeRange(this.start, this.duration);
    }
}
