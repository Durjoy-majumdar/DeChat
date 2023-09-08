package com.tencent.maas.model.composing;

import com.tencent.maas.model.time.MJTimeRange;

public class MJAudioClip {
    private final String filePath;
    private final boolean isLooping;
    private final MJTimeRange timeRangeInAsset;
    private final float volume;

    public MJAudioClip(String str) {
        this.filePath = str;
        this.timeRangeInAsset = MJTimeRange.InvalidTimeRange;
        this.volume = 1.0f;
        this.isLooping = true;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public MJTimeRange getTimeRangeInAsset() {
        return this.timeRangeInAsset;
    }

    public float getVolume() {
        return this.volume;
    }

    public boolean isLooping() {
        return this.isLooping;
    }

    public MJAudioClip(String str, MJTimeRange mJTimeRange, float f, boolean z) {
        this.filePath = str;
        this.timeRangeInAsset = mJTimeRange;
        this.volume = f;
        this.isLooping = z;
    }
}
