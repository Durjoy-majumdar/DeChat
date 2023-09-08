package com.tencent.tav.decoder;

import android.view.Surface;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.List;

public interface IDecoderTrack {

    public interface SurfaceCreator {
        Surface createOutputSurface(int i, int i2, int i3);

        void free(Surface surface);

        void release();

        VideoTexture videoTextureForSurface(Surface surface);
    }

    void asyncReadNextSample(CMTime cMTime);

    void clipRangeAndClearRange(CMTimeRange cMTimeRange);

    CMTime getCurrentSampleTime();

    AverageTimeReporter getDecodePerformance();

    CMTime getDuration();

    CMTime getFrameDuration();

    int getFrameRate();

    long getLaggingTime();

    int getTrackId();

    CMSampleBuffer readSample();

    CMSampleBuffer readSample(CMTime cMTime);

    void release();

    CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2);

    void setDecodeType(IDecoder.DecodeType decodeType);

    void setFrameRate(int i);

    void setTrackSegments(List<DecoderTrackSegment> list);

    void setVolume(float f);

    void start();

    void start(SurfaceCreator surfaceCreator);

    void start(SurfaceCreator surfaceCreator, CMTimeRange cMTimeRange);
}
