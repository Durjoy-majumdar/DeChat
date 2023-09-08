package com.tencent.tav.codec;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface IMediaCodec {
    void bindSurfaceTexture(SurfaceTexture surfaceTexture);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    Surface createInputSurface();

    int dequeueInputBuffer(long j);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j);

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    boolean isSoft();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void reset();

    void setDataSource(String str);

    void signalEndOfInputStream();

    void start();

    void stop();
}
