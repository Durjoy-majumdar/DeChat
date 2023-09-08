package com.tencent.thumbplayer.tmediacodec;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.callback.CodecCallback;
import com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper;
import com.tencent.thumbplayer.tmediacodec.statistics.MediaCodecStatistics;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import com.tencent.thumbplayer.tmediacodec.util.ThreadManager;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class TMediaCodec implements IMediaCodec {
    public static final String TAG = "TMediaCodec";
    /* access modifiers changed from: private */
    public CodecCallback codecCallback;
    public boolean codecFinalReuseEnable;
    /* access modifiers changed from: private */
    public CodecWrapper codecWrapper;
    private CreateBy createBy;
    public boolean isReUsed;
    /* access modifiers changed from: private */
    public final MediaCodecStatistics mCodecStatistics;
    private boolean mConfigureCalled;
    private final String nameOrType;
    private boolean reUseEnable = true;

    public static abstract class Callback {
        public abstract void onError(TMediaCodec tMediaCodec, MediaCodec.CodecException codecException);

        public abstract void onInputBufferAvailable(TMediaCodec tMediaCodec, int i);

        public abstract void onOutputBufferAvailable(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo);

        public abstract void onOutputFormatChanged(TMediaCodec tMediaCodec, MediaFormat mediaFormat);
    }

    public enum CreateBy {
        CreateByName,
        CreateByType
    }

    public static final class HookCallback extends MediaCodec.Callback {
        private final Callback callback;
        private final TMediaCodec tMediaCodec;

        public HookCallback(TMediaCodec tMediaCodec2, Callback callback2) {
            this.tMediaCodec = tMediaCodec2;
            this.callback = callback2;
        }

        public final Callback getCallback() {
            return this.callback;
        }

        public final TMediaCodec getTMediaCodec() {
            return this.tMediaCodec;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.onError(this.tMediaCodec, codecException);
            }
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.onInputBufferAvailable(this.tMediaCodec, i);
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.onOutputBufferAvailable(this.tMediaCodec, i, bufferInfo);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.onOutputFormatChanged(this.tMediaCodec, mediaFormat);
            }
        }
    }

    private TMediaCodec(String str, CreateBy createBy2) {
        this.nameOrType = str;
        this.createBy = createBy2;
        this.mCodecStatistics = new MediaCodecStatistics(isVideo());
    }

    public static TMediaCodec createByCodecName(String str) {
        return new TMediaCodec(str, CreateBy.CreateByName);
    }

    public static TMediaCodec createDecoderByType(String str) {
        return new TMediaCodec(str, CreateBy.CreateByType);
    }

    private void onAfterConfigure() {
        this.mCodecStatistics.configCodecEnd(this.isReUsed);
        ThreadManager.postOnSubThread(new Runnable() {
            public void run() {
                if (TMediaCodec.this.codecWrapper != null) {
                    TMediaCodec.this.codecWrapper.setCodecCallback(TMediaCodec.this.codecCallback);
                }
                if (TMediaCodec.this.codecCallback != null) {
                    TMediaCodec.this.codecCallback.onCreate(Boolean.valueOf(TMediaCodec.this.isReUsed));
                }
            }
        });
    }

    private void onAfterStart() {
        this.mCodecStatistics.startCodecEnd();
        ThreadManager.postOnSubThread(new Runnable() {
            public void run() {
                if (TMediaCodec.this.codecCallback != null) {
                    TMediaCodec.this.codecCallback.onStarted(Boolean.valueOf(TMediaCodec.this.isReUsed), TMediaCodec.this.mCodecStatistics.getData());
                }
            }
        });
    }

    private void onBeforeConfigure(Surface surface) {
        this.codecFinalReuseEnable = TCodecManager.getInstance().reuseEnable(this, surface);
        this.mCodecStatistics.createByCodecStart();
        this.mCodecStatistics.createByCodecEnd();
        this.mCodecStatistics.configCodecStart(this.codecFinalReuseEnable);
    }

    private void onBeforeStart() {
        this.mCodecStatistics.startCodecStart();
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        if (this.mConfigureCalled) {
            LogUtils.m21886w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i + " stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        this.mConfigureCalled = true;
        onBeforeConfigure(surface);
        try {
            this.codecWrapper = TCodecManager.getInstance().configure(mediaFormat, surface, mediaCrypto, i, this);
        } catch (IOException e) {
            LogUtils.m21883e(TAG, "createCodec mediaFormat:" + mediaFormat, e);
        }
        onAfterConfigure();
    }

    public final int dequeueInputBuffer(long j) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            return codecWrapper2.dequeueInputBuffer(j);
        }
        return -1000;
    }

    public final int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            return codecWrapper2.dequeueOutputBuffer(bufferInfo, j);
        }
        return -1000;
    }

    public final void flush() {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.flush();
        }
    }

    public final CodecCallback getCodecCallback() {
        return this.codecCallback;
    }

    public final CodecWrapper getCodecWrapper() {
        return this.codecWrapper;
    }

    public CreateBy getCreateBy() {
        return this.createBy;
    }

    public final ByteBuffer getInputBuffer(int i) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            return codecWrapper2.getMediaCodec().getInputBuffer(i);
        }
        return null;
    }

    public final ByteBuffer[] getInputBuffers() {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 == null || (mediaCodec = codecWrapper2.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getInputBuffers();
    }

    public final String getNameOrType() {
        return this.nameOrType;
    }

    public final ByteBuffer getOutputBuffer(int i) {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 == null || (mediaCodec = codecWrapper2.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputBuffer(i);
    }

    public final ByteBuffer[] getOutputBuffers() {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 == null || (mediaCodec = codecWrapper2.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputBuffers();
    }

    public final MediaFormat getOutputFormat() {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 == null || (mediaCodec = codecWrapper2.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputFormat();
    }

    public final Image getOutputImage(int i) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            return codecWrapper2.getMediaCodec().getOutputImage(i);
        }
        return null;
    }

    public final boolean isReuseEnable() {
        return this.reUseEnable;
    }

    public final boolean isVideo() {
        return TUtils.isVideo(this.nameOrType);
    }

    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.queueInputBuffer(i, i2, i3, j, i4);
        }
    }

    public final void queueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null && (mediaCodec = codecWrapper2.getMediaCodec()) != null) {
            mediaCodec.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
        }
    }

    public void release() {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.release();
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.releaseOutputBuffer(i, z);
        }
    }

    public void reset() {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.reset();
        }
    }

    public final void setCallback(Callback callback) {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null && (mediaCodec = codecWrapper2.getMediaCodec()) != null) {
            mediaCodec.setCallback(new HookCallback(this, callback));
        }
    }

    public final void setCodecCallback(CodecCallback codecCallback2) {
        this.codecCallback = codecCallback2;
    }

    public final void setOutputSurface(Surface surface) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.setOutputSurface(surface);
        }
    }

    public void setParameters(Bundle bundle) {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null && (mediaCodec = codecWrapper2.getMediaCodec()) != null) {
            mediaCodec.setParameters(bundle);
        }
    }

    public final void setReuseEnable(boolean z) {
        this.reUseEnable = z;
    }

    public final void setVideoScalingMode(int i) {
        MediaCodec mediaCodec;
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null && (mediaCodec = codecWrapper2.getMediaCodec()) != null) {
            mediaCodec.setVideoScalingMode(i);
        }
    }

    public void start() {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "start codecWrapper:" + this.codecWrapper);
        }
        onBeforeStart();
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.start();
        }
        onAfterStart();
    }

    public void stop() {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.stop();
        }
    }

    public void releaseOutputBuffer(int i, long j) {
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null) {
            codecWrapper2.releaseOutputBuffer(i, j);
        }
    }

    public final void setCallback(Callback callback, Handler handler) {
        MediaCodec mediaCodec;
        if (Build.VERSION.SDK_INT < 23) {
            LogUtils.m21886w(TAG, "ignore method setCallback for API lower than 23");
            return;
        }
        CodecWrapper codecWrapper2 = this.codecWrapper;
        if (codecWrapper2 != null && (mediaCodec = codecWrapper2.getMediaCodec()) != null) {
            mediaCodec.setCallback(new HookCallback(this, callback), handler);
        }
    }

    public void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler) {
        if (this.mConfigureCalled) {
            LogUtils.m21886w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i + " descrambler:" + mediaDescrambler + " stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        this.mConfigureCalled = true;
        onBeforeConfigure(surface);
        try {
            this.codecWrapper = TCodecManager.getInstance().configure(mediaFormat, surface, i, mediaDescrambler, this);
        } catch (IOException e) {
            LogUtils.m21883e(TAG, "createCodec mediaFormat:" + mediaFormat, e);
        }
        onAfterConfigure();
    }
}
