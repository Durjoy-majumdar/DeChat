package com.tencent.thumbplayer.core.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.thumbplayer.core.common.TPCodecUtils;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tmediacodec.TCodecManager;
import com.tencent.thumbplayer.tmediacodec.TMediaCodec;
import com.tencent.thumbplayer.tmediacodec.callback.SimpleCodecCallback;
import com.tencent.thumbplayer.tmediacodec.util.ILogProxy;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class TPBaseMediaCodecDecoder implements ITPMediaCodecDecoder {
    private static final int DUMP_BYTE_BUFFER_BYTES = 100;
    private static final int DUMP_ONE_LINE_BYTES = 20;
    private static final int MEDIA_CODEC_ERROR_INDEX = -1000;
    private static long MEDIA_CODEC_INPUT_TIMEOUT_US = 2000;
    private static long MEDIA_CODEC_OUTPUT_TIMEOUT_US = 2000;
    private static final int MSG_FLUSH = 1002;
    private static final int MSG_RELEASE = 1003;
    private static final int MSG_RELEASE_OUTPUT_BUFFER = 1000;
    private static final String MSG_RELEASE_OUTPUT_BUFFER_INDEX_KEY = "index";
    private static final String MSG_RELEASE_OUTPUT_BUFFER_RENDER_KEY = "render";
    private static final String MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY = "renderTimestampNs";
    private static final int MSG_SET_OUTPUT_SURFACE = 1001;
    private static boolean sTMediaCodecInited;
    private TMediaCodec mCodec = null;
    public int mCodecId;
    private MediaCodec.CryptoInfo mCryptoInfo = null;
    private HandlerThread mDecodeThread = null;
    private AsyncDecodeHandler mDecoderHandler = null;
    public int mDrmType = -1;
    public boolean mEnableAsyncMode = false;
    private boolean mEnableAudioPassThrough = false;
    public boolean mEnableDefaultCodecForDolby = false;
    public boolean mEnableMediaCodecReuse = false;
    private boolean mEnableReleaseOutputBufferWithTimestamp = false;
    public int mEnableRendererSharpen = 0;
    private boolean mEnableSetOutputSurfaceApi = false;
    private TPFrameInfo mFrameInfo = new TPFrameInfo();
    private int mHandlerResult = 0;
    /* access modifiers changed from: private */
    public BlockingQueue<Integer> mInputQueue = new LinkedBlockingQueue();
    public boolean mIsDolbyCodecFallback = false;
    public MediaCrypto mMediaCrypto = null;
    /* access modifiers changed from: private */
    public BlockingQueue<TPFrameInfo> mOutputQueue = new LinkedBlockingQueue();
    private boolean mRestartCodecOnException = false;
    public String mSharpenShaderPath = "assets/shaders";
    public boolean mStarted = false;
    public Surface mSurface = null;
    public boolean mSwitchEnableRendererSharpen = true;
    /* access modifiers changed from: private */
    public final Object mThreadLock = new Object();

    public class AsyncDecodeHandler extends Handler {
        public AsyncDecodeHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i;
            synchronized (TPBaseMediaCodecDecoder.this.mThreadLock) {
                switch (message.what) {
                    case 1000:
                        i = TPBaseMediaCodecDecoder.this.onReleaseOutputBuffer(message.getData());
                        break;
                    case 1001:
                        i = TPBaseMediaCodecDecoder.this.onSetOutputSurface((Surface) message.obj);
                        break;
                    case 1002:
                        i = TPBaseMediaCodecDecoder.this.onFlush();
                        break;
                    case 1003:
                        i = TPBaseMediaCodecDecoder.this.onRelease();
                        break;
                    default:
                        i = 0;
                        break;
                }
                TPBaseMediaCodecDecoder.this.handleMessageComplete(i);
            }
        }
    }

    public class BufferCallback extends TMediaCodec.Callback {
        private BufferCallback() {
        }

        public void onError(TMediaCodec tMediaCodec, MediaCodec.CodecException codecException) {
            String logTag = TPBaseMediaCodecDecoder.this.getLogTag();
            TPNativeLog.printLog(4, logTag, "onError: " + TPBaseMediaCodecDecoder.this.getStackTrace(codecException));
            int unused = TPBaseMediaCodecDecoder.this.handleRelease();
        }

        public void onInputBufferAvailable(TMediaCodec tMediaCodec, int i) {
            try {
                TPBaseMediaCodecDecoder.this.mInputQueue.put(Integer.valueOf(i));
            } catch (Exception e) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e));
            }
        }

        public void onOutputBufferAvailable(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            try {
                TPFrameInfo tPFrameInfo = new TPFrameInfo();
                tPFrameInfo.errCode = 0;
                tPFrameInfo.bufferIndex = i;
                tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                TPBaseMediaCodecDecoder.this.processOutputBuffer(tMediaCodec, i, bufferInfo, tPFrameInfo);
                TPBaseMediaCodecDecoder.this.mOutputQueue.put(tPFrameInfo);
            } catch (Exception e) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e));
            }
        }

        public void onOutputFormatChanged(TMediaCodec tMediaCodec, MediaFormat mediaFormat) {
            TPBaseMediaCodecDecoder.this.processOutputFormatChanged(mediaFormat);
        }
    }

    public TPBaseMediaCodecDecoder(int i) {
        this.mCodecId = i;
        initTMediaCodec();
    }

    private void bufferSizeCheck(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < bArr.length) {
            String logTag = getLogTag();
            TPNativeLog.printLog(4, logTag, "decodeAsync, not enough space, byteBuffer.remaining:" + byteBuffer.remaining() + ", buffer size:" + bArr.length);
            try {
                dumpByteArray(bArr, 0, 100, 20);
            } catch (Exception e) {
                TPNativeLog.printLog(4, getLogTag(), e.toString());
            }
        }
    }

    private int decodeAsync(byte[] bArr, boolean z, long j, boolean z2) {
        Integer poll = this.mInputQueue.poll();
        if (poll == null) {
            return 1;
        }
        try {
            ByteBuffer inputBuffer = this.mCodec.getInputBuffer(poll.intValue());
            if (inputBuffer != null) {
                bufferSizeCheck(inputBuffer, bArr);
                inputBuffer.put(bArr);
            }
            if (!z2 || this.mCryptoInfo == null) {
                this.mCodec.queueInputBuffer(poll.intValue(), 0, bArr.length, j, z ? 1 : 0);
            } else {
                this.mCodec.queueSecureInputBuffer(poll.intValue(), 0, this.mCryptoInfo, j, z ? 1 : 0);
            }
            return 0;
        } catch (Exception e) {
            return onMediaCodecException(e);
        }
    }

    private TPFrameInfo dequeueOutputBufferAsync() {
        this.mFrameInfo.errCode = 1;
        TPFrameInfo poll = this.mOutputQueue.poll();
        return poll == null ? this.mFrameInfo : poll;
    }

    private void dumpByteArray(byte[] bArr, int i, int i2, int i3) {
        if (bArr == null || i < 0 || i2 <= 0 || i >= bArr.length || i >= i2 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        if (bArr.length <= i2) {
            i2 = bArr.length;
        }
        int min = Math.min(i2 - i, 100) + i;
        StringBuilder sb = new StringBuilder();
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray begin:");
        int i4 = 0;
        while (i < min) {
            String hexString = Integer.toHexString(bArr[i] & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString.toUpperCase());
            i4++;
            if (i4 % i3 == 0) {
                TPNativeLog.printLog(2, getLogTag(), sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
            i++;
        }
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray end.");
    }

    private void exitDecodeThread() {
        HandlerThread handlerThread = this.mDecodeThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.mDecodeThread.join();
            } catch (InterruptedException unused) {
            }
        }
    }

    private int flushAsync() {
        TPNativeLog.printLog(2, getLogTag(), "flushAsync: ");
        Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1002;
        return waitingForHandleMessage(obtainMessage);
    }

    private int handleFlush() {
        TPNativeLog.printLog(2, getLogTag(), "handleFlush: ");
        TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 104;
        }
        try {
            tMediaCodec.flush();
            return 0;
        } catch (Exception e) {
            return onMediaCodecException(e);
        }
    }

    /* access modifiers changed from: private */
    public void handleMessageComplete(int i) {
        this.mHandlerResult = i;
        this.mThreadLock.notify();
    }

    /* access modifiers changed from: private */
    public int handleRelease() {
        TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 101;
        }
        this.mStarted = false;
        try {
            tMediaCodec.stop();
            return 0;
        } catch (Exception e) {
            String logTag = getLogTag();
            TPNativeLog.printLog(4, logTag, "stop: failed!" + getStackTrace(e));
            return 3;
        } finally {
            this.mCodec.release();
            this.mCodec = null;
        }
    }

    private int handleReleaseOutputBuffer(int i, boolean z, long j) {
        TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null || i < 0) {
            return 3;
        }
        try {
            if (!this.mEnableReleaseOutputBufferWithTimestamp || !z || Build.VERSION.SDK_INT <= 21) {
                tMediaCodec.releaseOutputBuffer(i, z);
                return 0;
            }
            tMediaCodec.releaseOutputBuffer(i, j);
            return 0;
        } catch (Exception e) {
            return onMediaCodecException(e);
        }
    }

    private int handleSetOutputSurface(Surface surface) {
        String logTag = getLogTag();
        TPNativeLog.printLog(2, logTag, "setOutputSurface: " + surface);
        Surface surface2 = this.mSurface;
        int i = 3;
        if (surface2 == surface) {
            TPNativeLog.printLog(3, getLogTag(), "setOutputSurface: set the same surface.");
            return 0;
        }
        this.mSurface = surface;
        if (this.mCodec == null) {
            return 0;
        }
        if (!(surface2 == null || surface == null)) {
            try {
                if (surface.isValid() && Build.VERSION.SDK_INT >= 23 && this.mEnableSetOutputSurfaceApi) {
                    this.mCodec.setOutputSurface(surface);
                    i = 0;
                }
            } catch (Exception e) {
                String logTag2 = getLogTag();
                TPNativeLog.printLog(4, logTag2, "setOutputSurface onMediaCodecException:\n" + getStackTrace(e));
                return 3;
            }
        }
        return i;
    }

    private int handleSignalEndOfStream(int i) {
        try {
            this.mCodec.queueInputBuffer(i, 0, 0, 0, 4);
            return 0;
        } catch (Exception e) {
            String logTag = getLogTag();
            TPNativeLog.printLog(4, logTag, "handleSignalEndOfStream: failed!" + getStackTrace(e));
            return 3;
        }
    }

    private boolean initMediaCodecInternal() {
        try {
            List<String> mimeCandidates = getMimeCandidates();
            String str = null;
            String str2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= mimeCandidates.size()) {
                    break;
                } else if (str != null) {
                    break;
                } else {
                    str2 = mimeCandidates.get(i);
                    TPNativeLog.printLog(2, getLogTag(), "initMediaCodec with mime:" + str2 + " mDrmType:" + this.mDrmType);
                    MediaCrypto mediaCrypto = this.mMediaCrypto;
                    boolean requiresSecureDecoderComponent = mediaCrypto != null ? mediaCrypto.requiresSecureDecoderComponent(str2) : false;
                    if (!requiresSecureDecoderComponent || !TPCodecUtils.isInDRMLevel1Blacklist(this.mDrmType)) {
                        z = requiresSecureDecoderComponent;
                    } else {
                        TPNativeLog.printLog(2, getLogTag(), "Device " + TPSystemInfo.getDeviceName() + " DrmType " + this.mDrmType + " fallback to L3.");
                        z = false;
                    }
                    str = getCodecName(str2, z);
                    TPNativeLog.printLog(2, getLogTag(), "initMediaCodec got codecName:" + str + " secureComponent " + z);
                    i++;
                }
            }
            if (str == null) {
                TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, codecName is null.");
                if (this.mEnableDefaultCodecForDolby) {
                    if ("video/dolby-vision".equalsIgnoreCase(str2)) {
                        TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, try use mime type:video/hevc");
                        str = TPCodecUtils.getDecoderName("video/hevc", z);
                        TPNativeLog.printLog(2, getLogTag(), "retry initMediaCodec codecName:" + str);
                        if (str == null) {
                            TPNativeLog.printLog(2, getLogTag(), "retry initMediaCodec failed codecName is null");
                            return false;
                        }
                        this.mIsDolbyCodecFallback = true;
                        str2 = "video/hevc";
                    }
                }
                return false;
            }
            if (MimeTypes.AUDIO_DTS.equals(str2)) {
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec current mime type:" + str2 + " is audio dts, need set input timeout to 0!");
                MEDIA_CODEC_INPUT_TIMEOUT_US = 0;
                MEDIA_CODEC_OUTPUT_TIMEOUT_US = 0;
            }
            TMediaCodec createByCodecName = TMediaCodec.createByCodecName(str);
            this.mCodec = createByCodecName;
            createByCodecName.setReuseEnable(this.mEnableMediaCodecReuse && !this.mEnableAsyncMode);
            this.mCodec.setCodecCallback(new SimpleCodecCallback() {
                public void onReuseCodecAPIException(String str, Throwable th) {
                    super.onReuseCodecAPIException(str, th);
                    TPMediaCodecManager.onMediaCodecException(TPBaseMediaCodecDecoder.this.mCodecId, str);
                }

                public void onStarted(Boolean bool, String str) {
                    super.onStarted(bool, str);
                    TPMediaCodecManager.onMediaCodecReady(TPBaseMediaCodecDecoder.this.mCodecId, str);
                }
            });
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec codec name: " + str);
            if (this.mEnableAsyncMode && Build.VERSION.SDK_INT >= 23) {
                TPNativeLog.printLog(2, getLogTag(), "MediaCodec EnableAsyncMode！");
                HandlerThread handlerThread = new HandlerThread("MediaCodecThread");
                this.mDecodeThread = handlerThread;
                handlerThread.start();
                this.mDecoderHandler = new AsyncDecodeHandler(this.mDecodeThread.getLooper());
                this.mCodec.setCallback(new BufferCallback(), this.mDecoderHandler);
            }
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 1);
            configCodec(this.mCodec, str2);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 2);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 3);
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec start");
            this.mCodec.start();
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec finished");
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            this.mStarted = true;
            if (this.mDrmType != -1) {
                boolean z2 = TPCodecUtils.getDecoderName(str2, true) != null;
                TPMediaDrmInfo tPMediaDrmInfo = new TPMediaDrmInfo();
                tPMediaDrmInfo.supportSecureDecoder = z2;
                tPMediaDrmInfo.supportSecureDecrypt = z;
                tPMediaDrmInfo.componentName = str;
                tPMediaDrmInfo.drmType = this.mDrmType;
                TPNativeLog.printLog(2, getLogTag(), "DRM Info: supportSecureDecoder: " + tPMediaDrmInfo.supportSecureDecoder + " supportSecureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName: " + tPMediaDrmInfo.componentName + " drmType: " + tPMediaDrmInfo.drmType);
                TPMediaCodecManager.onMediaDrmInfo(this.mCodecId, tPMediaDrmInfo);
            }
            return true;
        } catch (Exception e) {
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            TPNativeLog.printLog(4, getLogTag(), getStackTrace(e));
            return false;
        }
    }

    private static synchronized void initTMediaCodec() {
        synchronized (TPBaseMediaCodecDecoder.class) {
            if (!sTMediaCodecInited) {
                TCodecManager.init();
                TCodecManager.getInstance().setLogEnable(true);
                TCodecManager.getInstance().setLogProxy(new ILogProxy() {
                    /* renamed from: d */
                    public void mo28802d(String str, String str2) {
                        TPNativeLog.printLog(1, str, str2);
                    }

                    /* renamed from: e */
                    public void mo28803e(String str, String str2, Throwable th) {
                        TPNativeLog.printLog(4, str, str2);
                    }

                    /* renamed from: i */
                    public void mo28804i(String str, String str2) {
                        TPNativeLog.printLog(2, str, str2);
                    }

                    /* renamed from: v */
                    public void mo28805v(String str, String str2) {
                        TPNativeLog.printLog(0, str, str2);
                    }

                    /* renamed from: w */
                    public void mo28806w(String str, String str2, Throwable th) {
                        TPNativeLog.printLog(3, str, str2);
                    }
                });
                sTMediaCodecInited = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public int onFlush() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        int handleFlush = handleFlush();
        this.mCodec.start();
        return handleFlush;
    }

    private int onMediaCodecException(Exception exc) {
        String logTag = getLogTag();
        TPNativeLog.printLog(4, logTag, "onMediaCodecException!\n" + getStackTrace(exc));
        resetFrameInfo();
        processMediaCodecException(exc);
        if (this.mRestartCodecOnException) {
            initMediaCodecInternal();
            return 4;
        }
        handleRelease();
        return 103;
    }

    /* access modifiers changed from: private */
    public int onRelease() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        return handleRelease();
    }

    /* access modifiers changed from: private */
    public int onReleaseOutputBuffer(Bundle bundle) {
        if (bundle == null) {
            return 3;
        }
        return handleReleaseOutputBuffer(bundle.getInt("index"), bundle.getBoolean("render"), bundle.getLong(MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY));
    }

    /* access modifiers changed from: private */
    public int onSetOutputSurface(Surface surface) {
        return handleSetOutputSurface(surface);
    }

    private int queueInputBuffer(byte[] bArr, long j, boolean z) {
        MediaCodec.CryptoInfo cryptoInfo;
        try {
            ByteBuffer[] inputBuffers = this.mCodec.getInputBuffers();
            int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(MEDIA_CODEC_INPUT_TIMEOUT_US);
            if (dequeueInputBuffer < 0) {
                return dequeueInputBuffer == -1 ? 1 : 103;
            }
            ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
            bufferSizeCheck(byteBuffer, bArr);
            byteBuffer.put(bArr);
            if (!z || (cryptoInfo = this.mCryptoInfo) == null) {
                this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, j, 0);
            } else {
                this.mCodec.queueSecureInputBuffer(dequeueInputBuffer, 0, cryptoInfo, j, 0);
            }
            return 0;
        } catch (Exception e) {
            return onMediaCodecException(e);
        }
    }

    private int releaseAsync() {
        TPNativeLog.printLog(2, getLogTag(), "releaseAsync: ");
        Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1003;
        int waitingForHandleMessage = waitingForHandleMessage(obtainMessage);
        exitDecodeThread();
        return waitingForHandleMessage;
    }

    private int releaseOutputBufferAsync(int i, boolean z, long j) {
        Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1000;
        Bundle bundle = new Bundle();
        bundle.putInt("index", i);
        bundle.putBoolean("render", z);
        bundle.putLong(MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY, j);
        obtainMessage.setData(bundle);
        return waitingForHandleMessage(obtainMessage);
    }

    private void resetFrameInfo() {
        TPFrameInfo tPFrameInfo = this.mFrameInfo;
        tPFrameInfo.bufferIndex = -1000;
        tPFrameInfo.ptsUs = -1;
        tPFrameInfo.renderTimestampNs = -1;
        tPFrameInfo.data = null;
        tPFrameInfo.errCode = 103;
    }

    private MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String equalsIgnoreCase : codecInfoAt.getSupportedTypes()) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private int setOutputSurfaceAsync(Surface surface) {
        String logTag = getLogTag();
        TPNativeLog.printLog(2, logTag, "setOutputSurfaceAsync: " + surface);
        Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1001;
        obtainMessage.obj = surface;
        return waitingForHandleMessage(obtainMessage);
    }

    private int signalEndOfStreamAsync() {
        Integer poll = this.mInputQueue.poll();
        if (poll == null) {
            return 1;
        }
        return handleSignalEndOfStream(poll.intValue());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|4|5|6|7) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int waitingForHandleMessage(android.os.Message r2) {
        /*
            r1 = this;
            java.lang.Object r0 = r1.mThreadLock
            monitor-enter(r0)
            r2.sendToTarget()     // Catch:{ all -> 0x000f }
            java.lang.Object r2 = r1.mThreadLock     // Catch:{ InterruptedException -> 0x000b }
            r2.wait()     // Catch:{ InterruptedException -> 0x000b }
        L_0x000b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            int r2 = r1.mHandlerResult
            return r2
        L_0x000f:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.waitingForHandleMessage(android.os.Message):int");
    }

    public abstract void configCodec(TMediaCodec tMediaCodec, String str);

    public int decode(byte[] bArr, boolean z, long j, boolean z2) {
        if (!this.mStarted || this.mCodec == null) {
            return 101;
        }
        return (!this.mEnableAsyncMode || Build.VERSION.SDK_INT < 23) ? queueInputBuffer(bArr, j, z2) : decodeAsync(bArr, z, j, z2);
    }

    public TPFrameInfo dequeueOutputBuffer() {
        if (this.mCodec == null) {
            return this.mFrameInfo;
        }
        resetFrameInfo();
        if (this.mEnableAsyncMode) {
            return dequeueOutputBufferAsync();
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, MEDIA_CODEC_OUTPUT_TIMEOUT_US);
            if (dequeueOutputBuffer >= 0) {
                int i = bufferInfo.flags;
                if (i == 4) {
                    TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM");
                    this.mFrameInfo.errCode = 2;
                } else if (i != 2 || !this.mEnableAudioPassThrough) {
                    TPFrameInfo tPFrameInfo = this.mFrameInfo;
                    tPFrameInfo.bufferIndex = dequeueOutputBuffer;
                    tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                    tPFrameInfo.renderTimestampNs = System.nanoTime();
                    TPFrameInfo tPFrameInfo2 = this.mFrameInfo;
                    tPFrameInfo2.errCode = 0;
                    processOutputBuffer(this.mCodec, dequeueOutputBuffer, bufferInfo, tPFrameInfo2);
                } else {
                    TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_CODEC_CONFIG, AudioPassThrough");
                    TPFrameInfo tPFrameInfo3 = this.mFrameInfo;
                    tPFrameInfo3.bufferIndex = dequeueOutputBuffer;
                    tPFrameInfo3.ptsUs = bufferInfo.presentationTimeUs;
                    processOutputConfigData(this.mCodec, dequeueOutputBuffer, bufferInfo, tPFrameInfo3);
                }
            } else if (dequeueOutputBuffer == -2) {
                processOutputFormatChanged(this.mCodec.getOutputFormat());
                this.mFrameInfo.errCode = 1;
            } else if (dequeueOutputBuffer == -1) {
                this.mFrameInfo.errCode = 1;
            } else if (dequeueOutputBuffer == -3) {
                TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: INFO_OUTPUT_BUFFERS_CHANGED!");
                this.mFrameInfo.errCode = 1;
            } else if (bufferInfo.flags == 4) {
                TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM!");
                this.mFrameInfo.errCode = 2;
            } else {
                String logTag = getLogTag();
                TPNativeLog.printLog(4, logTag, "dequeueOutputBuffer: TP_ERROR_DECODE_FAILED! index = " + dequeueOutputBuffer);
                this.mFrameInfo.errCode = 103;
            }
            return this.mFrameInfo;
        } catch (Exception e) {
            this.mFrameInfo.errCode = onMediaCodecException(e);
            return this.mFrameInfo;
        }
    }

    public int flush() {
        TPNativeLog.printLog(2, getLogTag(), "flush: ");
        if (this.mCodec == null) {
            return 104;
        }
        return this.mEnableAsyncMode ? flushAsync() : handleFlush();
    }

    public abstract String getCodecName(String str, boolean z);

    public abstract String getLogTag();

    public abstract List<String> getMimeCandidates();

    public String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public abstract void processMediaCodecException(Exception exc);

    public abstract void processOutputBuffer(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    public abstract void processOutputConfigData(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    public abstract void processOutputFormatChanged(MediaFormat mediaFormat);

    public int release() {
        return this.mEnableAsyncMode ? releaseAsync() : handleRelease();
    }

    public int releaseOutputBuffer(int i, boolean z, long j) {
        if (this.mCodec == null || i < 0) {
            return 3;
        }
        return this.mEnableAsyncMode ? releaseOutputBufferAsync(i, z, j) : handleReleaseOutputBuffer(i, z, j);
    }

    public void setCryptoInfo(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        if (this.mCryptoInfo == null) {
            this.mCryptoInfo = new MediaCodec.CryptoInfo();
        }
        this.mCryptoInfo.set(i, iArr, iArr2, bArr, bArr2, i2);
    }

    public int setOperateRate(float f) {
        if (this.mCodec != null) {
            try {
                String logTag = getLogTag();
                TPNativeLog.printLog(2, logTag, "setOperateRate: " + f);
                Bundle bundle = new Bundle();
                bundle.putShort(DownloadInfo.PRIORITY, 0);
                bundle.putFloat("operating-rate", f);
                this.mCodec.setParameters(bundle);
            } catch (Exception unused) {
                String logTag2 = getLogTag();
                TPNativeLog.printLog(3, logTag2, "setOperateRate: " + f + " failed.");
            }
        }
        return 0;
    }

    public int setOutputSurface(Surface surface) {
        return this.mEnableAsyncMode ? setOutputSurfaceAsync(surface) : handleSetOutputSurface(surface);
    }

    public boolean setParamBool(int i, boolean z) {
        if (i == 0) {
            this.mEnableSetOutputSurfaceApi = z;
        } else if (i != 1) {
            if (i == 3) {
                this.mEnableAudioPassThrough = z;
                String logTag = getLogTag();
                TPNativeLog.printLog(2, logTag, "BOOL_SET_IS_AUDIO_PASSTHROUGH mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
            } else if (i == 4) {
                this.mEnableMediaCodecReuse = z;
            } else if (i == 7) {
                this.mEnableReleaseOutputBufferWithTimestamp = z;
            } else if (i != 299) {
                String logTag2 = getLogTag();
                TPNativeLog.printLog(3, logTag2, "Unknown paramKey: " + i);
                return false;
            } else {
                this.mEnableDefaultCodecForDolby = z;
                String logTag3 = getLogTag();
                TPNativeLog.printLog(2, logTag3, "BOOL_SET mEnableDefaultCodecForDolby:" + this.mEnableDefaultCodecForDolby);
            }
        } else if (!this.mStarted) {
            this.mEnableAsyncMode = z;
        } else {
            TPNativeLog.printLog(3, getLogTag(), "BOOL_ENABLE_ASYNC_MODE must setup before started!");
        }
        return true;
    }

    public boolean setParamBytes(int i, byte[] bArr) {
        return false;
    }

    public boolean setParamInt(int i, int i2) {
        if (i != 100) {
            String logTag = getLogTag();
            TPNativeLog.printLog(3, logTag, "Unknown paramKey: " + i);
            return false;
        }
        this.mEnableRendererSharpen = i2;
        return true;
    }

    public boolean setParamLong(int i, long j) {
        return false;
    }

    public boolean setParamObject(int i, Object obj) {
        if (i != 300) {
            return false;
        }
        this.mMediaCrypto = (MediaCrypto) obj;
        return true;
    }

    public boolean setParamString(int i, String str) {
        if (i != 101) {
            String logTag = getLogTag();
            TPNativeLog.printLog(3, logTag, "Unknown paramKey: " + i);
            return false;
        }
        this.mSharpenShaderPath = str;
        return true;
    }

    public int setSharpenSwitch() {
        this.mSwitchEnableRendererSharpen = !this.mSwitchEnableRendererSharpen;
        return 0;
    }

    public int signalEndOfStream() {
        TPNativeLog.printLog(2, getLogTag(), "signalEndOfStream: ");
        TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 3;
        }
        if (this.mEnableAsyncMode) {
            return signalEndOfStreamAsync();
        }
        int dequeueInputBuffer = tMediaCodec.dequeueInputBuffer(MEDIA_CODEC_INPUT_TIMEOUT_US);
        return dequeueInputBuffer >= 0 ? handleSignalEndOfStream(dequeueInputBuffer) : dequeueInputBuffer == -1 ? 1 : 3;
    }

    public boolean startDecoder() {
        return initMediaCodecInternal();
    }
}
