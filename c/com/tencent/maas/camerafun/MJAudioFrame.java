package com.tencent.maas.camerafun;

import com.tencent.maas.model.time.MJTimeRange;
import java.nio.ByteBuffer;

public class MJAudioFrame {
    private final ByteBuffer audioData;
    private final int channelCount;
    private final int sampleCountPerChannel;
    private final int sampleFormat;
    private final int sampleRate;
    private final MJTimeRange timeRange;

    public enum MJAudioFrameChannelLayout {
        None(-1),
        Mono(0),
        Stereo(1);
        
        /* access modifiers changed from: private */
        public final int orientationVal;

        private MJAudioFrameChannelLayout(int i) {
            this.orientationVal = i;
        }

        public static MJAudioFrameChannelLayout fromInt(int i) {
            for (MJAudioFrameChannelLayout mJAudioFrameChannelLayout : values()) {
                if (mJAudioFrameChannelLayout.getOrientationVal() == i) {
                    return mJAudioFrameChannelLayout;
                }
            }
            return None;
        }

        public int getOrientationVal() {
            return this.orientationVal;
        }
    }

    public enum MJAudioFrameSampleFormat {
        None(-1),
        I16(0),
        I32(1),
        F32(2);
        
        /* access modifiers changed from: private */
        public final int orientationVal;

        private MJAudioFrameSampleFormat(int i) {
            this.orientationVal = i;
        }

        public static MJAudioFrameSampleFormat fromInt(int i) {
            for (MJAudioFrameSampleFormat mJAudioFrameSampleFormat : values()) {
                if (mJAudioFrameSampleFormat.getOrientationVal() == i) {
                    return mJAudioFrameSampleFormat;
                }
            }
            return None;
        }

        public int getOrientationVal() {
            return this.orientationVal;
        }
    }

    public MJAudioFrame(MJAudioFrameSampleFormat mJAudioFrameSampleFormat, int i, MJAudioFrameChannelLayout mJAudioFrameChannelLayout, int i2, MJTimeRange mJTimeRange, ByteBuffer byteBuffer) {
        this.sampleFormat = mJAudioFrameSampleFormat.orientationVal;
        this.sampleRate = i;
        this.channelCount = mJAudioFrameChannelLayout.orientationVal;
        this.sampleCountPerChannel = i2;
        this.timeRange = mJTimeRange;
        this.audioData = byteBuffer;
    }

    public ByteBuffer getAudioData() {
        return this.audioData;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleCountPerChannel() {
        return this.sampleCountPerChannel;
    }

    public int getSampleFormat() {
        return this.sampleFormat;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public MJTimeRange getTimeRange() {
        return this.timeRange;
    }
}
