package com.tencent.tav.decoder;

import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.muxer.IMediaMuxer;

public interface AssetWriterVideoEncoder {
    public static final String OUTPUT_VIDEO_MIME_TYPE = "video/avc";
    public static final long WRITER_FINISH = -1;

    Surface createInputSurface();

    void flush();

    MediaFormat getEncodeFormat();

    long getEncodePresentationTimeUs();

    CGSize getEncodeSize();

    boolean isEncodeToEndOfStream();

    boolean isNeedVideoOutputTexture();

    boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat);

    void processVideoTexture(TextureInfo textureInfo, CMTime cMTime);

    void release();

    void reset();

    void setMediaMuxer(IMediaMuxer iMediaMuxer);

    void setVideoSampleRenderContext(RenderContext renderContext);

    void signalEndOfInputStream();

    boolean start();

    void stop();

    boolean writeVideoSample(CMSampleBuffer cMSampleBuffer, boolean z);
}
