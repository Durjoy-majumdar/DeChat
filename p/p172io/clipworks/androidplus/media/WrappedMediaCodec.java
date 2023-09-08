package p172io.clipworks.androidplus.media;

import android.media.AudioPresentation;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.clipworks.androidplus.media.WrappedMediaCodec */
public class WrappedMediaCodec {
    private static final String TAG = "WrappedMediaCodec";
    private static final AtomicInteger kHandlerThreadIndexCounter = new AtomicInteger();
    private final MediaCodec _backingMediaCodec;
    private HandlerThread _handlerThread;

    private WrappedMediaCodec(MediaCodec mediaCodec) {
        this._backingMediaCodec = mediaCodec;
    }

    public static WrappedMediaCodec createByCodecName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new WrappedMediaCodec(MediaCodec.createByCodecName(str));
        } catch (IOException | IllegalStateException unused) {
            return null;
        }
    }

    public static WrappedMediaCodec createDecoderByType(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new WrappedMediaCodec(MediaCodec.createDecoderByType(str));
        } catch (IOException | IllegalStateException unused) {
            return null;
        }
    }

    public static WrappedMediaCodec createEncoderByType(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new WrappedMediaCodec(MediaCodec.createEncoderByType(str));
        } catch (IOException | IllegalStateException unused) {
            return null;
        }
    }

    public static Surface createPersistentInputSurface() {
        return MediaCodec.createPersistentInputSurface();
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this._backingMediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
    }

    public Surface createInputSurface() {
        return this._backingMediaCodec.createInputSurface();
    }

    public int dequeueInputBuffer(long j) {
        return this._backingMediaCodec.dequeueInputBuffer(j);
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        return this._backingMediaCodec.dequeueOutputBuffer(bufferInfo, j);
    }

    public void flush() {
        this._backingMediaCodec.flush();
    }

    public String getCanonicalName() {
        return this._backingMediaCodec.getCanonicalName();
    }

    public MediaCodecInfo getCodecInfo() {
        return this._backingMediaCodec.getCodecInfo();
    }

    public ByteBuffer getInputBuffer(int i) {
        try {
            return this._backingMediaCodec.getInputBuffer(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public MediaFormat getInputFormat() {
        return this._backingMediaCodec.getInputFormat();
    }

    public Image getInputImage(int i) {
        return this._backingMediaCodec.getInputImage(i);
    }

    public PersistableBundle getMetrics() {
        return this._backingMediaCodec.getMetrics();
    }

    public String getName() {
        return this._backingMediaCodec.getName();
    }

    public ByteBuffer getOutputBuffer(int i) {
        return this._backingMediaCodec.getOutputBuffer(i);
    }

    public MediaFormat getOutputFormat() {
        return this._backingMediaCodec.getOutputFormat();
    }

    public Image getOutputImage(int i) {
        return this._backingMediaCodec.getOutputImage(i);
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this._backingMediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        } catch (Exception e) {
            throw e;
        }
    }

    public void queueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        this._backingMediaCodec.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
    }

    public void release() {
        this._handlerThread.quitSafely();
        this._handlerThread = null;
        this._backingMediaCodec.release();
    }

    public void releaseOutputBuffer(int i, boolean z) {
        this._backingMediaCodec.releaseOutputBuffer(i, z);
    }

    public void reset() {
        this._backingMediaCodec.reset();
    }

    public void setAudioPresentation(AudioPresentation audioPresentation) {
        this._backingMediaCodec.setAudioPresentation(audioPresentation);
    }

    public void setCallback(MediaCodec.Callback callback, Handler handler) {
        this._backingMediaCodec.setCallback(callback, handler);
    }

    public void setCallbackOnHandlerThread(MediaCodec.Callback callback) {
        if (this._handlerThread == null) {
            int andAdd = kHandlerThreadIndexCounter.getAndAdd(1);
            HandlerThread handlerThread = new HandlerThread("AMC_HTCB_" + andAdd);
            this._handlerThread = handlerThread;
            handlerThread.start();
        }
        this._backingMediaCodec.setCallback(callback, new Handler(this._handlerThread.getLooper()));
    }

    public void setInputSurface(Surface surface) {
        this._backingMediaCodec.setInputSurface(surface);
    }

    public void setOnFrameRenderedListener(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this._backingMediaCodec.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    public void setOutputSurface(Surface surface) {
        this._backingMediaCodec.setOutputSurface(surface);
    }

    public void setParameters(Bundle bundle) {
        this._backingMediaCodec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i) {
        this._backingMediaCodec.setVideoScalingMode(i);
    }

    public void signalEndOfInputStream() {
        this._backingMediaCodec.signalEndOfInputStream();
    }

    public void start() {
        try {
            this._backingMediaCodec.start();
        } catch (Exception e) {
            throw e;
        }
    }

    public void stop() {
        this._backingMediaCodec.stop();
    }

    public void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler) {
        this._backingMediaCodec.configure(mediaFormat, surface, i, mediaDescrambler);
    }

    public MediaFormat getOutputFormat(int i) {
        return this._backingMediaCodec.getOutputFormat(i);
    }

    public void releaseOutputBuffer(int i, long j) {
        this._backingMediaCodec.releaseOutputBuffer(i, j);
    }

    public void setCallback(MediaCodec.Callback callback) {
        try {
            this._backingMediaCodec.setCallback(callback);
        } catch (Exception e) {
            throw e;
        }
    }
}
