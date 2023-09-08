package com.tencent.tav.decoder;

import android.media.MediaFormat;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import java.nio.ByteBuffer;

public interface AssetWriterAudioEncoder {
    boolean endWriteAudioSample();

    MediaFormat getEncodeFormat();

    long getEncodePresentationTimeUs();

    boolean isEncodeToEndOfStream();

    boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat);

    void release();

    void setMediaMuxer(IMediaMuxer iMediaMuxer);

    boolean start();

    void stop();

    boolean writeAudioFrame(boolean z);

    long writeAudioSample(long j, ByteBuffer byteBuffer);
}
