package com.tencent.thumbplayer.tmediacodec.reuse;

public final class ReusePolicy {
    public static final ReusePolicy DEFAULT = new ReusePolicy(1920, 1920);
    public static final int DEFAULT_INIT_HEIGHT = 1920;
    public static final int DEFAULT_INIT_WIDTH = 1920;
    public EraseType eraseType = EraseType.First;
    public int initHeight;
    public int initWidth;
    public boolean reConfigByRealFormat = true;

    public enum EraseType {
        First,
        SAME
    }

    public ReusePolicy(int i, int i2) {
        this.initWidth = i;
        this.initHeight = i2;
    }

    public String toString() {
        return "[initWidth:" + this.initWidth + ", initHeight:" + this.initHeight + ", reConfigByRealFormat:" + this.reConfigByRealFormat + ']';
    }
}
