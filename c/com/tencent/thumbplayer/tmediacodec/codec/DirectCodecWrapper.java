package com.tencent.thumbplayer.tmediacodec.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.callback.CodecCallback;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import java.util.concurrent.atomic.AtomicInteger;

public final class DirectCodecWrapper implements CodecWrapper {
    public static final String TAG = "DirectCodecWrapper";
    private static AtomicInteger sCodecNum = new AtomicInteger(0);
    private final MediaCodec mCodec;

    public DirectCodecWrapper(MediaCodec mediaCodec) {
        this.mCodec = mediaCodec;
        LogUtils.m21884i(TAG, "DirectCodecWrapper sCodecNum:" + sCodecNum.incrementAndGet());
    }

    public void attachThread() {
    }

    public ReuseHelper.ReuseType canReuseType(FormatWrapper formatWrapper) {
        LogUtils.m21886w(TAG, "setCanReuseType setCodecCallback ignore...");
        return ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.mCodec.configure(mediaFormat, surface, mediaCrypto, i);
    }

    public int dequeueInputBuffer(long j) {
        return this.mCodec.dequeueInputBuffer(j);
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        return this.mCodec.dequeueOutputBuffer(bufferInfo, j);
    }

    public void flush() {
        LogUtils.m21884i(TAG, "DirectCodecWrapper flush start ...");
        this.mCodec.flush();
        LogUtils.m21884i(TAG, "DirectCodecWrapper flush end ...");
    }

    public final MediaCodec getCodec() {
        return this.mCodec;
    }

    public MediaCodec getMediaCodec() {
        return this.mCodec;
    }

    public void prepareToReUse() {
        LogUtils.m21886w(TAG, "DirectCodecWrapper prepareToReUse ignore...");
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.mCodec.queueInputBuffer(i, i2, i3, j, i4);
    }

    public void release() {
        LogUtils.m21884i(TAG, "DirectCodecWrapper release start ...");
        this.mCodec.release();
        LogUtils.m21884i(TAG, "DirectCodecWrapper release end ... sCodecNum:" + sCodecNum.decrementAndGet());
    }

    public void releaseOutputBuffer(int i, boolean z) {
        this.mCodec.releaseOutputBuffer(i, z);
    }

    public void reset() {
        LogUtils.m21884i(TAG, "DirectCodecWrapper reset start ...");
        this.mCodec.reset();
        LogUtils.m21884i(TAG, "DirectCodecWrapper reset end ...");
    }

    public void setCodecCallback(CodecCallback codecCallback) {
        LogUtils.m21886w(TAG, "DirectCodecWrapper setCodecCallback ignore...");
    }

    public void setOutputSurface(Surface surface) {
        LogUtils.m21884i(TAG, "DirectCodecWrapper setOutputSurface start, surface:" + surface);
        this.mCodec.setOutputSurface(surface);
        LogUtils.m21884i(TAG, "DirectCodecWrapper setOutputSurface end ...");
    }

    public void start() {
        LogUtils.m21884i(TAG, "DirectCodecWrapper start ...");
        this.mCodec.start();
        LogUtils.m21884i(TAG, "DirectCodecWrapper start end...");
    }

    public void stop() {
        LogUtils.m21884i(TAG, "DirectCodecWrapper stop before ...");
        this.mCodec.stop();
        LogUtils.m21884i(TAG, "DirectCodecWrapper stop end ...");
    }

    public void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler) {
        this.mCodec.configure(mediaFormat, surface, i, mediaDescrambler);
    }

    public void releaseOutputBuffer(int i, long j) {
        this.mCodec.releaseOutputBuffer(i, j);
    }
}
