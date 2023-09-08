package com.tencent.tav.decoder;

import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.report.AverageTimeReporter;
import java.nio.ByteBuffer;

public interface IDecoder {
    public static final long SAMPLE_STATE_ERROR = -3;
    public static final long SAMPLE_STATE_FAILED = -2;
    public static final long SAMPLE_STATE_FINISH = -1;
    public static final long SAMPLE_STATE_TIMEOUT = -4;
    public static final long SAMPLE_STATE_UN_START = -100;

    public enum DecodeType {
        Video,
        Audio
    }

    AverageTimeReporter getDecodePerformance();

    String getSourcePath();

    boolean hasTrack();

    ByteBuffer outputBuffer();

    CMSampleState readSample();

    CMSampleState readSample(CMTime cMTime);

    void release();

    void seekTo(CMTime cMTime);

    void start(CMTimeRange cMTimeRange);

    void start(CMTimeRange cMTimeRange, CMTime cMTime);
}
