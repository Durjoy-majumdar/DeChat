package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class TracerDataSource implements IDataSource {
    private static final String TAG = "TracerDataSource";
    private final IDataSource impl;

    public TracerDataSource(IDataSource iDataSource) {
        this.impl = iDataSource;
    }

    public void close() {
        try {
            this.impl.close();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[close] failed!", th);
            throw th;
        }
    }

    public boolean equals(Object obj) {
        return this.impl.equals(obj);
    }

    public AudioFormat.AudioType getAudioType() {
        try {
            return this.impl.getAudioType();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[getAudioType] failed!", th);
            throw th;
        }
    }

    public long getSize() {
        try {
            return this.impl.getSize();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[getSize] failed!", th);
            throw th;
        }
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public void open() {
        try {
            this.impl.open();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[open] failed!", th);
            throw th;
        }
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        try {
            return this.impl.readAt(j, bArr, i, i2);
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[readAt] failed! pos = " + j + ", offset = " + i + ", size = " + i2, th);
            throw th;
        }
    }

    public String toString() {
        return this.impl.toString();
    }
}
