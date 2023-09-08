package com.tencent.tav.extractor;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.tav.decoder.logger.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ApiExtractorDelegate implements IExtractorDelegate {
    private static final String TAG = "ApiAssetExtractorDelegate";
    private MediaExtractor mediaExtractor = new MediaExtractor();
    private boolean released = false;

    public synchronized boolean advance() {
        if (!this.released) {
            this.mediaExtractor.advance();
        }
        return false;
    }

    public synchronized long getSampleTime() {
        if (this.released) {
            return -1;
        }
        return this.mediaExtractor.getSampleTime();
    }

    public synchronized int getSampleTrackIndex() {
        if (this.released) {
            return -1;
        }
        return this.mediaExtractor.getSampleTrackIndex();
    }

    public final synchronized int getTrackCount() {
        if (this.released) {
            return 0;
        }
        return this.mediaExtractor.getTrackCount();
    }

    public synchronized MediaFormat getTrackFormat(int i) {
        return this.mediaExtractor.getTrackFormat(i);
    }

    public boolean needMirror() {
        return true;
    }

    public synchronized int readSampleData(ByteBuffer byteBuffer, int i) {
        if (this.released) {
            return -1;
        }
        return this.mediaExtractor.readSampleData(byteBuffer, i);
    }

    public final synchronized void release() {
        this.mediaExtractor.release();
    }

    public synchronized void seekTo(long j, int i) {
        if (!this.released) {
            this.mediaExtractor.seekTo(j, i);
        }
    }

    public synchronized void selectTrack(int i) {
        if (!this.released) {
            this.mediaExtractor.selectTrack(i);
        }
    }

    public final synchronized void setDataSource(String str) {
        try {
            this.mediaExtractor.setDataSource(str);
        } catch (IOException e) {
            Logger.m144644e(TAG, "setDataSource", (Throwable) e);
        }
        return;
    }

    public void setIsSoft(boolean z) {
    }

    public synchronized void unselectTrack(int i) {
        if (!this.released) {
            this.mediaExtractor.unselectTrack(i);
        }
    }
}
