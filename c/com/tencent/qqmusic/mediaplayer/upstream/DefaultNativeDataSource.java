package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;

public class DefaultNativeDataSource implements INativeDataSource {
    private final AudioFormat.AudioType audioType;
    private final long nativeInstance;

    public DefaultNativeDataSource(long j, AudioFormat.AudioType audioType2) {
        this.nativeInstance = j;
        this.audioType = audioType2;
    }

    public AudioFormat.AudioType getAudioType() {
        return this.audioType;
    }

    public long getNativeInstance() {
        return this.nativeInstance;
    }

    public String toString() {
        return "DefaultNativeDataSource";
    }
}
