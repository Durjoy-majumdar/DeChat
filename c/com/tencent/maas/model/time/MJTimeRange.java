package com.tencent.maas.model.time;

public class MJTimeRange implements Cloneable {
    public static final MJTimeRange InvalidTimeRange;
    public static final MJTimeRange PositiveInfiniteTimeRange;
    public static final MJTimeRange ZeroTimeRange;
    private final MJTime duration;
    private final MJTime startTime;

    static {
        MJTime mJTime = MJTime.ZeroTime;
        ZeroTimeRange = new MJTimeRange(mJTime, mJTime);
        MJTime mJTime2 = MJTime.InvalidTime;
        InvalidTimeRange = new MJTimeRange(mJTime2, mJTime2);
        PositiveInfiniteTimeRange = new MJTimeRange(mJTime, MJTime.PositiveInfinityTime);
    }

    public MJTimeRange(MJTime mJTime, MJTime mJTime2) {
        this.startTime = mJTime;
        this.duration = mJTime2;
    }

    public static MJTimeRange fromSecondsStartTimeDuration(double d, double d2) {
        return new MJTimeRange(MJTime.fromSeconds(d), MJTime.fromSeconds(d2));
    }

    public static MJTimeRange fromSecondsStartTimeEndTime(double d, double d2) {
        return new MJTimeRange(MJTime.fromSeconds(d), MJTime.fromSeconds(d2 - d));
    }

    public static MJTimeRange fromStartEnd(MJTime mJTime, MJTime mJTime2) {
        return new MJTimeRange(mJTime, mJTime2.sub(mJTime));
    }

    public MJTimeRange calcIntersection(MJTimeRange mJTimeRange) {
        if (!isValid() || !mJTimeRange.isValid()) {
            MJTime mJTime = MJTime.InvalidTime;
            return new MJTimeRange(mJTime, mJTime);
        }
        MJTime mJTime2 = this.startTime;
        MJTime endTime = getEndTime();
        MJTime mJTime3 = mJTimeRange.startTime;
        MJTime endTime2 = mJTimeRange.getEndTime();
        MJTime mJTime4 = mJTime2.smallThan(mJTime3) ? mJTime3 : mJTime2;
        if (endTime.smallThan(endTime2)) {
            endTime2 = endTime;
        }
        return endTime2.smallThan(mJTime4) ? (mJTime3.bigThan(endTime) || mJTime3.equalsTo(endTime)) ? new MJTimeRange(endTime, MJTime.ZeroTime) : new MJTimeRange(mJTime2, MJTime.ZeroTime) : new MJTimeRange(mJTime4, endTime2.sub(mJTime4));
    }

    public MJTimeRange calcMergedTimeRangeWith(MJTimeRange mJTimeRange) {
        if (!isValid()) {
            return mJTimeRange;
        }
        if (!mJTimeRange.isValid()) {
            return this;
        }
        if (mJTimeRange.getStartTime().smallThan(this.startTime)) {
            mJTimeRange.getStartTime();
        }
        return fromStartEnd(this.startTime, mJTimeRange.getEndTime().bigThan(getEndTime()) ? mJTimeRange.getEndTime() : getEndTime());
    }

    public boolean containsTime(MJTime mJTime) {
        if (!isValid() || !mJTime.isValid()) {
            return false;
        }
        return (mJTime.bigThan(this.startTime) || mJTime.equalsTo(this.startTime)) && mJTime.smallThan(getEndTime());
    }

    public boolean containsTimeRange(MJTimeRange mJTimeRange) {
        return (mJTimeRange.getStartTime().bigThan(getStartTime()) || mJTimeRange.getStartTime().equalsTo(getStartTime())) && mJTimeRange.getStartTime().smallThan(getEndTime()) && mJTimeRange.getEndTime().bigThan(getStartTime()) && (mJTimeRange.getEndTime().smallThan(getEndTime()) || mJTimeRange.getEndTime().equalsTo(getEndTime()));
    }

    public MJTime getDuration() {
        return this.duration;
    }

    public long getDurationFlicks() {
        return this.duration.getFlicks();
    }

    public MJTime getEndTime() {
        return this.startTime.add(this.duration);
    }

    public long getStartFlicks() {
        return this.startTime.getFlicks();
    }

    public MJTime getStartTime() {
        return this.startTime;
    }

    public boolean isValid() {
        return this.startTime.isNumeric() && this.duration.isValid() && !this.duration.isNegative();
    }
}
