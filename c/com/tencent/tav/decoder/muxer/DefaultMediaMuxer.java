package com.tencent.tav.decoder.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.ByteBuffer;

public class DefaultMediaMuxer implements IMediaMuxer {
    private final String TAG = "DefaultMediaMuxer";
    private int audioTrackIndex = -1;
    private boolean isStarted = false;
    private MediaMuxer muxer;
    private int videoTrackIndex = -1;

    public DefaultMediaMuxer(String str, int i) {
        this.muxer = new MediaMuxer(str, i);
    }

    public int addTrack(MediaFormat mediaFormat) {
        int addTrack = this.muxer.addTrack(mediaFormat);
        if (mediaFormat.containsKey("mime")) {
            String string = mediaFormat.getString("mime");
            Logger.m144646i("DefaultMediaMuxer", "add track mime:" + string);
            if (string.contains("video")) {
                this.videoTrackIndex = addTrack;
            } else if (string.contains("audio")) {
                this.audioTrackIndex = addTrack;
            }
        }
        return addTrack;
    }

    public int audioTrackIndex() {
        return this.audioTrackIndex;
    }

    public void clearResource() {
    }

    public ExportConfig getExportConfig() {
        return null;
    }

    public boolean ignoreHeader() {
        return true;
    }

    public boolean isMuxerStarted() {
        return this.isStarted;
    }

    public void prepareParallelSegmentInfo(int i, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
    }

    public void release() {
        this.muxer.release();
        this.isStarted = false;
        Logger.m144646i("DefaultMediaMuxer", "release muxer");
    }

    public void setExportConfig(ExportConfig exportConfig) {
    }

    public void start() {
        this.muxer.start();
        this.isStarted = true;
    }

    public boolean stop(boolean z) {
        this.muxer.stop();
        this.isStarted = false;
        Logger.m144646i("DefaultMediaMuxer", "stop muxer");
        return true;
    }

    public int videoTrackIndex() {
        return this.videoTrackIndex;
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.muxer.writeSampleData(i, byteBuffer, bufferInfo);
    }

    public void writeSampleDataTime(boolean z, CMTime cMTime) {
    }
}
