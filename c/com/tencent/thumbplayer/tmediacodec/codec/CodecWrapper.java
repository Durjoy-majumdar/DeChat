package com.tencent.thumbplayer.tmediacodec.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.callback.CodecCallback;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;

public interface CodecWrapper {
    void attachThread();

    ReuseHelper.ReuseType canReuseType(FormatWrapper formatWrapper);

    void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    int dequeueInputBuffer(long j);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j);

    void flush();

    MediaCodec getMediaCodec();

    void prepareToReUse();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void reset();

    void setCodecCallback(CodecCallback codecCallback);

    void setOutputSurface(Surface surface);

    void start();

    void stop();
}
