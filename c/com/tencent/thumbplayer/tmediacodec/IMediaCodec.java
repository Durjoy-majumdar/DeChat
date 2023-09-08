package com.tencent.thumbplayer.tmediacodec;

import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;

public interface IMediaCodec {
    void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void reset();

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
