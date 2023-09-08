package com.tencent.tav.coremedia;

import java.util.concurrent.TimeUnit;

public class CMTime implements Cloneable {
    public static final CMTime CMTimeInvalid = new CMTime(Long.MIN_VALUE, 600, -1.0f, -1);
    public static final CMTime CMTimeOne = new CMTime(600, 600);
    public static final CMTime CMTimeZero = new CMTime(0, 600);
    public static final int DEFAULT_TIME_SCALE = 600;
    private static final long SECONDS_MS = 1000;
    private static final long SECONDS_US = 1000000;
    private final float time;
    public final int timeScale;
    private final long timeUs;
    public final long value;

    public CMTime() {
        this(0, 600);
    }

    public static int GCD(int i, int i2) {
        return i == 0 ? i2 : GCD(i2 % i, i);
    }

    public static int LCM(int i, int i2) {
        return (i / GCD(i, i2)) * i2;
    }

    public static CMTime add(CMTime cMTime, CMTime cMTime2) {
        CMTime cMTime3 = CMTimeInvalid;
        if (cMTime == cMTime3) {
            return cMTime2.clone();
        }
        if (cMTime2 == cMTime3) {
            return cMTime.clone();
        }
        int LCM = LCM(cMTime.timeScale, cMTime2.timeScale);
        CMTime convertTimeScale = convertTimeScale(cMTime, LCM);
        return new CMTime(convertTimeScale.getValue() + convertTimeScale(cMTime2, LCM).getValue(), convertTimeScale.timeScale);
    }

    public static CMTime convertTimeScale(CMTime cMTime, int i) {
        CMTime cMTime2 = CMTimeInvalid;
        return cMTime == cMTime2 ? cMTime2 : cMTime == CMTimeZero ? new CMTime(0, i) : new CMTime((cMTime.getValue() * ((long) i)) / ((long) cMTime.getTimeScale()), i);
    }

    public static CMTime fromMs(long j) {
        return new CMTime((((float) j) * 1.0f) / 1000.0f);
    }

    public static CMTime fromSeconds(float f) {
        return new CMTime(f);
    }

    public static CMTime fromUs(long j) {
        return new CMTime((((float) j) * 1.0f) / 1000000.0f);
    }

    public static CMTime max(CMTime cMTime, CMTime cMTime2) {
        return cMTime.bigThan(cMTime2) ? cMTime : cMTime2;
    }

    public static CMTime min(CMTime cMTime, CMTime cMTime2) {
        return cMTime.smallThan(cMTime2) ? cMTime : cMTime2;
    }

    public static CMTime sub(CMTime cMTime, CMTime cMTime2) {
        CMTime cMTime3 = CMTimeInvalid;
        if (cMTime == cMTime3) {
            return new CMTime(-cMTime2.getValue());
        }
        if (cMTime2 == cMTime3) {
            return cMTime.clone();
        }
        int LCM = LCM(cMTime.timeScale, cMTime2.timeScale);
        CMTime convertTimeScale = convertTimeScale(cMTime, LCM);
        return new CMTime(convertTimeScale.getValue() - convertTimeScale(cMTime2, LCM).getValue(), convertTimeScale.timeScale);
    }

    public boolean bigThan(CMTime cMTime) {
        return getTimeUs() > cMTime.getTimeUs();
    }

    public int compare(CMTime cMTime) {
        int i = ((getTimeUs() - cMTime.getTimeUs()) > 0 ? 1 : ((getTimeUs() - cMTime.getTimeUs()) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    public CMTime divide(float f) {
        CMTime cMTime = CMTimeInvalid;
        if (this == cMTime) {
            return cMTime;
        }
        return new CMTime((long) (((float) getValue()) / f), this.timeScale);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CMTime)) {
            return false;
        }
        CMTime cMTime = (CMTime) obj;
        return this.value == cMTime.value && this.timeScale == cMTime.timeScale;
    }

    public boolean equalsTo(CMTime cMTime) {
        return getTimeUs() == cMTime.getTimeUs();
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public float getTimeSeconds() {
        return this.time;
    }

    public long getTimeUs() {
        return this.timeUs;
    }

    public long getValue() {
        return this.value;
    }

    public CMTime limitMax(CMTime cMTime) {
        return bigThan(cMTime) ? cMTime : this;
    }

    public CMTime limitMin(CMTime cMTime) {
        return smallThan(cMTime) ? cMTime : this;
    }

    public CMTime multi(float f) {
        CMTime cMTime = CMTimeInvalid;
        if (this == cMTime) {
            return cMTime;
        }
        return new CMTime((long) (((float) getValue()) * f), this.timeScale);
    }

    public boolean smallThan(CMTime cMTime) {
        return getTimeUs() < cMTime.getTimeUs();
    }

    public String toString() {
        return "[value = " + this.value + " timeScale = " + this.timeScale + " timeUs = " + this.timeUs + "]";
    }

    public CMTime(long j) {
        this(j, 600);
    }

    public CMTime clone() {
        return new CMTime(this.value, this.timeScale, this.time, this.timeUs);
    }

    public CMTime(float f) {
        this((long) (f * 600.0f), 600);
    }

    public CMTime divide(CMTime cMTime) {
        int LCM = LCM(this.timeScale, cMTime.timeScale);
        return new CMTime(convertTimeScale(this, LCM).value / convertTimeScale(cMTime, LCM).value, LCM);
    }

    public CMTime multi(CMTime cMTime) {
        int LCM = LCM(this.timeScale, cMTime.timeScale);
        return new CMTime(convertTimeScale(this, LCM).value * convertTimeScale(cMTime, LCM).value, LCM);
    }

    public CMTime(long j, int i) {
        this.value = j;
        this.timeScale = i;
        this.time = (((float) j) * 1.0f) / ((float) i);
        this.timeUs = (j * 1000000) / ((long) i);
    }

    public CMTime add(long j) {
        if (this == CMTimeInvalid) {
            return clone();
        }
        return new CMTime(getValue() + ((j * ((long) this.timeScale)) / TimeUnit.SECONDS.toMicros(1)), this.timeScale);
    }

    public CMTime sub(CMTime cMTime) {
        return sub(this, cMTime);
    }

    private CMTime(long j, int i, float f, long j2) {
        this.value = j;
        this.timeUs = j2;
        this.time = f;
        this.timeScale = i;
    }

    public CMTime add(CMTime cMTime) {
        return add(this, cMTime);
    }
}
