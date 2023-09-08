package com.tencent.thumbplayer.tmediacodec.codec;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.TCodecManager;
import com.tencent.thumbplayer.tmediacodec.callback.CodecCallback;
import com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import com.tencent.thumbplayer.tmediacodec.util.ThreadManager;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ReuseCodecWrapper implements CodecWrapper {
    public static final int CANT_REUSE_LIMIT = 3;
    public static final int ID_HISTORY_LIMIT = 100;
    public static final int METHOD_DEQUEUE_INPUT_BUFFER = 0;
    public static final int METHOD_DEQUEUE_OUTPUT_BUFFER = 1;
    public static final int TRY_AGAIN_LATER_LIMIT = 100;
    private static final Map<Surface, ReuseCodecWrapper> mSurfaceMap = new ConcurrentHashMap();
    private final ReuseHelper.AdaptationWorkaroundMode mAdaptationMode;
    public boolean mAdaptive;
    private OutputSurface mBackupSurface;
    /* access modifiers changed from: private */
    public CodecCallback mCallback;
    private int mCantReuseCount;
    private MediaCodecInfo.CodecCapabilities mCapabilities;
    /* access modifiers changed from: private */
    public final MediaCodec mCodec;
    public final CodecMaxValues mCodecMaxValues;
    public final String mCodecName;
    public DecodeState mDecodeState = DecodeState.Started;
    private final int[] mDequeueInOutputTryAgainCount;
    private boolean mErrorHappened;
    public final FormatWrapper mFormat;
    private boolean mHasAlwaysTryAgainError;
    private boolean mHasConfigureCalled;
    private boolean mHasReused;
    private final HashSet<Integer> mHoldBufferOutIndex;
    public boolean mIsRecycled;
    private boolean mReleaseCalled;
    private ReuseHelper.ReuseType mReuseType;
    public boolean mSecure;
    private CodecState mState;
    private final Set<SurfaceTexture> mStoreToRelease;
    public Surface mSurface;
    /* access modifiers changed from: private */
    public final String mTag;
    private long mThreadId;
    private final ArrayList<Long> mThreadIdHistory;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper$2 */
    public static /* synthetic */ class C201022 {

        /* renamed from: $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType */
        public static final /* synthetic */ int[] f57000x7d50a2f;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType[] r0 = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57000x7d50a2f = r0
                com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType r1 = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57000x7d50a2f     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType r1 = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57000x7d50a2f     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType r1 = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57000x7d50a2f     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType r1 = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_FLUSH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.C201022.<clinit>():void");
        }
    }

    public enum CodecState {
        Uninitialized,
        Configured,
        Error,
        Flushed,
        Running,
        EndOfStream,
        Released
    }

    public enum DecodeState {
        Started,
        DequeueIn,
        QueueIn,
        DequeueOut,
        ReleaseOut
    }

    public ReuseCodecWrapper(MediaCodec mediaCodec, FormatWrapper formatWrapper) {
        String str = "ReuseCodecWrapper[" + hashCode() + "]";
        this.mTag = str;
        this.mHoldBufferOutIndex = new HashSet<>();
        this.mThreadIdHistory = new ArrayList<>();
        this.mStoreToRelease = new LinkedHashSet();
        this.mDequeueInOutputTryAgainCount = new int[2];
        this.mState = CodecState.Uninitialized;
        this.mReuseType = ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
        boolean z = false;
        this.mErrorHappened = false;
        this.mHasAlwaysTryAgainError = false;
        this.mCantReuseCount = 0;
        this.mCodec = mediaCodec;
        this.mFormat = formatWrapper;
        this.mCodecMaxValues = new CodecMaxValues(formatWrapper.maxWidth, formatWrapper.maxHeight, formatWrapper.maxInputSize);
        String codeName = TUtils.getCodeName(mediaCodec);
        this.mCodecName = codeName;
        this.mAdaptationMode = ReuseHelper.codecAdaptationWorkaroundMode(codeName);
        boolean z2 = Build.VERSION.SDK_INT != 29 || formatWrapper.rotationDegrees == 0;
        LogUtils.m21881d(str, "canCallGetCodecInfo:" + z2);
        if (z2) {
            this.mCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType(formatWrapper.sampleMimeType);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.mCapabilities;
        this.mAdaptive = codecCapabilities != null && TUtils.isAdaptive(codecCapabilities);
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.mCapabilities;
        if (codecCapabilities2 != null && TUtils.isSecure(codecCapabilities2)) {
            z = true;
        }
        this.mSecure = z;
    }

    private void bindingToBackupSurface() {
        if (this.mBackupSurface == null) {
            OutputSurface outputSurface = new OutputSurface(1, 1);
            this.mBackupSurface = outputSurface;
            innerSetOutputSurface(outputSurface.getSurface(), true, true);
        }
    }

    private String byte2HexString(Byte b) {
        return String.format("%02X", new Object[]{Integer.valueOf(b.intValue() & 255)});
    }

    private int checkSurfaceState(Surface surface) {
        if (surface == null) {
            return 10003;
        }
        return !surface.isValid() ? 10004 : 0;
    }

    public static CodecWrapper create(MediaCodec mediaCodec, String str, FormatWrapper formatWrapper) {
        return TUtils.isVideo(str) ? new VideoCodecWrapper(mediaCodec, formatWrapper) : new AudioCodecWrapper(mediaCodec, formatWrapper);
    }

    private void dumpInputBuffer(int i, int i2, int i3, long j, int i4) {
        if (TCodecManager.isDebug()) {
            try {
                ByteBuffer byteBuffer = this.mCodec.getInputBuffers()[i];
                StringBuilder sb = new StringBuilder("\n########################## " + this + " dumpInputBuffer ###################");
                for (int i5 = 0; i5 < 4; i5++) {
                    sb.append("\n");
                    for (int i6 = 0; i6 < 16; i6++) {
                        sb.append(" ");
                        sb.append(byte2HexString(Byte.valueOf(byteBuffer.get((i5 * 4) + i2 + i6))));
                    }
                }
                if (LogUtils.isLogEnable()) {
                    LogUtils.m21885v(this.mTag, sb.toString());
                }
            } catch (Throwable th) {
                LogUtils.m21883e(this.mTag, "dumpInputBuffer error", th);
            }
        }
    }

    private void handleCoreAPIException(int i, String str, Throwable th) {
        handleCoreAPIException(i, str, th, false, this.mSurface);
    }

    private void innerSetOutputSurface(Surface surface) {
        innerSetOutputSurface(surface, true, false);
    }

    private boolean isAlwaysTryAgain(int i, int i2) {
        if (i2 == -1) {
            int[] iArr = this.mDequeueInOutputTryAgainCount;
            int i3 = iArr[i] + 1;
            iArr[i] = i3;
            return i3 > 100;
        }
        this.mDequeueInOutputTryAgainCount[i] = 0;
        return false;
    }

    private boolean isNotMyThread() {
        return Thread.currentThread().getId() != this.mThreadId;
    }

    private void onReuseCodec() {
        int[] iArr = this.mDequeueInOutputTryAgainCount;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    private final void processInputBufferWithReConfig(int i, int i2, int i3, long j, int i4) {
        this.mCodec.queueInputBuffer(i, i2, i3, j, i4);
    }

    private final void queueInputBufferForAdaptation(int i, int i2, int i3, long j, int i4) {
        int i5 = C201022.f57000x7d50a2f[this.mReuseType.ordinal()];
        if (i5 == 1) {
            LogUtils.m21886w(this.mTag, "queueInputBufferForAdaptation error for KEEP_CODEC_RESULT_NO");
        } else if (i5 == 2) {
            processInputBufferWithReConfig(i, i2, i3, j, i4);
        } else if (i5 == 3) {
            this.mCodec.queueInputBuffer(i, i2, i3, j, i4);
        }
    }

    private void realConfigure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        try {
            if (LogUtils.isLogEnable()) {
                LogUtils.m21881d(this.mTag, this + ", realConfigure mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i + " state:" + this.mState + " mHasConfigureCalled：" + this.mHasConfigureCalled);
            }
            this.mCodec.configure(mediaFormat, surface, mediaCrypto, i);
            setSurface(surface);
            this.mState = CodecState.Configured;
        } catch (Throwable th) {
            handleCoreAPIException(!(th instanceof IllegalStateException) ? th instanceof MediaCodec.CryptoException ? 10001 : 0 : 10000, (String) null, th, true, surface);
            throw th;
        }
    }

    private void releaseCodecWhenError(int i) {
        if (i < 40000) {
            String str = this.mTag;
            LogUtils.m21882e(str, this + "    releaseCodecWhenError, errorCode:" + i);
            release();
        }
    }

    private void resetParam() {
        this.mHasAlwaysTryAgainError = false;
        this.mCantReuseCount = 0;
    }

    private void setSurface(Surface surface) {
        if (LogUtils.isLogEnable()) {
            String str = this.mTag;
            LogUtils.m21884i(str, this + ", oldSurface:" + this.mSurface + " CodecWrapperSetSurface surface:" + surface);
        }
        this.mSurface = surface;
    }

    private void trackDecodeApi(int i, int i2) {
        if (!this.mHasAlwaysTryAgainError && isAlwaysTryAgain(i, i2)) {
            this.mHasAlwaysTryAgainError = true;
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(", trackDecodeApi state:");
            sb.append(this.mState);
            sb.append("  surfaceState:");
            Surface surface = this.mSurface;
            sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
            String sb4 = sb.toString();
            if (i == 0) {
                handleCoreAPIException(CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, sb4, (Throwable) null);
            } else if (i == 1) {
                handleCoreAPIException(CodecError.DEQUEUEOUTPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, sb4, (Throwable) null);
            }
        }
    }

    private void unBindingBackupSurface() {
        if (LogUtils.isLogEnable()) {
            String str = this.mTag;
            LogUtils.m21881d(str, this + "unBindingBackupSurface");
        }
        OutputSurface outputSurface = this.mBackupSurface;
        if (outputSurface != null) {
            outputSurface.release();
        }
        this.mBackupSurface = null;
    }

    public void attachThread() {
        long id = Thread.currentThread().getId();
        if (!this.mThreadIdHistory.contains(Long.valueOf(id))) {
            this.mThreadId = id;
            this.mThreadIdHistory.add(Long.valueOf(id));
            if (this.mThreadIdHistory.size() > 100) {
                this.mThreadIdHistory.remove(0);
            }
        }
    }

    public abstract ReuseHelper.ReuseType canReuse(FormatWrapper formatWrapper);

    public ReuseHelper.ReuseType canReuseType(FormatWrapper formatWrapper) {
        ReuseHelper.ReuseType canReuse = canReuse(formatWrapper);
        this.mReuseType = canReuse;
        return canReuse;
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method configure for isNotMyThread");
            return;
        }
        this.mHasConfigureCalled = true;
        this.mReleaseCalled = false;
        if (this.mState == CodecState.Uninitialized) {
            realConfigure(mediaFormat, surface, mediaCrypto, i);
        } else if (surface != null) {
            onReuseCodec();
            innerSetOutputSurface(surface);
        }
    }

    public int dequeueInputBuffer(long j) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method dequeueInputBuffer for isNotMyThread");
            return -1;
        }
        int i = 0;
        try {
            int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(j);
            if (LogUtils.isLogEnable()) {
                LogUtils.m21885v(this.mTag, this + ", dequeueInputBuffer state:" + this.mState + " decodeState:" + this.mDecodeState + " , result=" + dequeueInputBuffer);
            }
            this.mDecodeState = DecodeState.DequeueIn;
            this.mState = CodecState.Running;
            trackDecodeApi(0, dequeueInputBuffer);
            return dequeueInputBuffer;
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                i = CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            } else if (th instanceof IllegalArgumentException) {
                i = 40001;
            }
            handleCoreAPIException(i, (String) null, th);
            throw th;
        }
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method dequeueOutputBuffer for isNotMyThread");
            return -1;
        }
        try {
            int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, j);
            if (LogUtils.isLogEnable()) {
                String str = this + ", dequeueOutputBuffer outIndex:" + dequeueOutputBuffer;
                if (this instanceof VideoCodecWrapper) {
                    LogUtils.m21885v(this.mTag, str);
                }
            }
            this.mHoldBufferOutIndex.add(Integer.valueOf(dequeueOutputBuffer));
            this.mDecodeState = DecodeState.DequeueOut;
            trackDecodeApi(1, dequeueOutputBuffer);
            return dequeueOutputBuffer;
        } catch (Throwable th) {
            int i = 0;
            if (th instanceof MediaCodec.CodecException) {
                i = CodecError.DEQUEUEOUTPUTBUFFER_CODEC_EXCEPTION;
            } else if (th instanceof IllegalStateException) {
                i = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            }
            handleCoreAPIException(i, (String) null, th);
            throw th;
        }
    }

    public void flush() {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "call method flush for isNotMyThread...");
        }
        try {
            if (LogUtils.isLogEnable()) {
                LogUtils.m21881d(this.mTag, this + ", flush state:" + this.mState);
            }
            this.mCodec.flush();
            this.mState = CodecState.Flushed;
        } catch (Throwable th) {
            int i = 0;
            if (th instanceof MediaCodec.CodecException) {
                i = 90001;
            } else if (th instanceof IllegalStateException) {
                i = CodecError.FLUSH_ILLEGAL;
            }
            handleCoreAPIException(i, (String) null, th);
            throw th;
        }
    }

    public final CodecCallback getCallback() {
        return this.mCallback;
    }

    public final MediaCodec getCodec() {
        return this.mCodec;
    }

    public String getCodecName() {
        return this.mCodecName;
    }

    public final FormatWrapper getFormat() {
        return this.mFormat;
    }

    public MediaCodec getMediaCodec() {
        return this.mCodec;
    }

    public boolean isNeedKeep() {
        return TCodecManager.isLeakFixed() ? !this.mErrorHappened && TCodecManager.getInstance().isGlobalReuseEnable() && TCodecManager.getInstance().isAllowKeepPool() : !this.mErrorHappened && TCodecManager.getInstance().isGlobalReuseEnable();
    }

    public final boolean isReleaseCalled() {
        return this.mReleaseCalled;
    }

    public boolean needToErase() {
        return this.mCantReuseCount >= 3;
    }

    public void prepareToReUse() {
        resetParam();
        if (TCodecManager.isLeakFixed()) {
            if (this.mState == CodecState.Running) {
                try {
                    flush();
                } catch (IllegalStateException e) {
                    LogUtils.m21883e(this.mTag, "flush failed in prepareToReUse", e);
                }
            }
        } else if (this.mState != CodecState.Flushed) {
            flush();
        }
        this.mHasReused = true;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method queueInputBuffer for isNotMyThread");
            return;
        }
        String str = null;
        if (LogUtils.isLogEnable()) {
            str = this + ", queueInputBuffer index:" + i + " offset:" + i2 + " size:" + i3 + " presentationTimeUs:" + j + ' ' + "flags:" + i4 + " state:" + this.mState + " decodeState:" + this.mDecodeState;
            LogUtils.m21885v(this.mTag, str);
        }
        try {
            if (this.mHasReused) {
                queueInputBufferForAdaptation(i, i2, i3, j, i4);
            } else {
                this.mCodec.queueInputBuffer(i, i2, i3, j, i4);
            }
            this.mDecodeState = DecodeState.QueueIn;
        } catch (Throwable th) {
            int i5 = 0;
            if (th instanceof MediaCodec.CodecException) {
                i5 = 50001;
            } else if (th instanceof IllegalStateException) {
                i5 = 50000;
            } else if (th instanceof MediaCodec.CryptoException) {
                i5 = 50002;
            }
            handleCoreAPIException(i5, str, th);
            throw th;
        }
    }

    public final void recycle() {
        if (LogUtils.isLogEnable()) {
            String str = this.mTag;
            LogUtils.m21881d(str, this + ", recycle isRecycled:" + this.mIsRecycled + "  mSurfaceMap.size:" + mSurfaceMap.size() + "...... stack:" + Log.getStackTraceString(new Throwable()));
        }
        if (this.mIsRecycled) {
            LogUtils.m21886w(this.mTag, "ignore recycle for has isRecycled is true.");
            return;
        }
        this.mHasConfigureCalled = false;
        this.mIsRecycled = true;
        ThreadManager.runOnSubThread(new Runnable() {
            public void run() {
                try {
                    ReuseCodecWrapper.this.mCodec.stop();
                    ReuseCodecWrapper.this.mCodec.release();
                } catch (Throwable th) {
                    LogUtils.m21887w(ReuseCodecWrapper.this.mTag, "recycle codec ignore error,", th);
                }
                if (ReuseCodecWrapper.this.mCallback != null) {
                    ReuseCodecWrapper.this.mCallback.onRealRelease();
                }
            }
        });
        this.mState = CodecState.Uninitialized;
    }

    public void release() {
        if (LogUtils.isLogEnable()) {
            String str = this.mTag;
            LogUtils.m21881d(str, this + " call release mHoldBufferOutIndex:" + this.mHoldBufferOutIndex + " mReleaseCalled:" + this.mReleaseCalled + " stack:" + Log.getStackTraceString(new Throwable()));
        }
        this.mReleaseCalled = true;
        this.mHasConfigureCalled = false;
        if (isNeedKeep()) {
            try {
                flush();
            } catch (IllegalStateException e) {
                LogUtils.m21883e(this.mTag, "flush failed for not in the Executing state.", e);
            }
            bindingToBackupSurface();
            TCodecManager.getInstance().recycleCodecFromRunning(this);
            return;
        }
        if (LogUtils.isLogEnable()) {
            String str2 = this.mTag;
            LogUtils.m21886w(str2, "Don't not keep the codec, release it ..., mErrorHappened:" + this.mErrorHappened);
        }
        TCodecManager.getInstance().removeCodecFromRunningPool(this);
        recycle();
        this.mState = CodecState.Released;
    }

    public void releaseOutputBuffer(int i, boolean z) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        String str = null;
        if (LogUtils.isLogEnable()) {
            str = this + ", releaseOutputBuffer render:" + z;
            LogUtils.m21885v(this.mTag, str);
        }
        try {
            this.mHoldBufferOutIndex.remove(Integer.valueOf(i));
            this.mCodec.releaseOutputBuffer(i, z);
        } catch (Throwable th) {
            if (this.mState != CodecState.Flushed) {
                LogUtils.m21887w(this.mTag, this + ", releaseOutputBuffer failed, ignore e:", th);
            }
            int i2 = 0;
            if (th instanceof MediaCodec.CodecException) {
                i2 = CodecError.RELEASEOUTPUTBUFFER_CODEC_EXCEPTION;
            } else if (th instanceof IllegalStateException) {
                i2 = CodecError.RELEASEOUTPUTBUFFER_ILLEGAL;
            }
            handleCoreAPIException(i2, str, th);
        }
        this.mDecodeState = DecodeState.ReleaseOut;
    }

    public void reset() {
        try {
            if (LogUtils.isLogEnable()) {
                LogUtils.m21881d(this.mTag, this + ", callMsg state:" + this.mState);
            }
            if (!isNeedKeep()) {
                this.mCodec.reset();
                this.mState = CodecState.Uninitialized;
            }
        } catch (Throwable th) {
            int i = 0;
            if (th instanceof MediaCodec.CodecException) {
                i = 80001;
            } else if (th instanceof IllegalStateException) {
                i = CodecError.RESET_ILLEGAL;
            }
            handleCoreAPIException(i, (String) null, th);
            throw th;
        }
    }

    public final void setCallback(CodecCallback codecCallback) {
        this.mCallback = codecCallback;
    }

    public void setCodecCallback(CodecCallback codecCallback) {
        this.mCallback = codecCallback;
    }

    public void setOutputSurface(Surface surface) {
        innerSetOutputSurface(surface, false, false);
    }

    public void start() {
        CodecState codecState = this.mState;
        CodecState codecState2 = CodecState.Configured;
        if (codecState != codecState2) {
            String str = this.mTag;
            LogUtils.m21881d(str, "start ignore:" + this.mState);
            return;
        }
        try {
            if (LogUtils.isLogEnable()) {
                LogUtils.m21881d(this.mTag, this + ", start state:" + this.mState);
            }
            if (this.mState == codecState2) {
                this.mCodec.start();
                this.mState = CodecState.Running;
            }
        } catch (Throwable th) {
            int i = 0;
            if (th instanceof MediaCodec.CodecException) {
                i = 20001;
            } else if (th instanceof IllegalStateException) {
                i = 20000;
            }
            handleCoreAPIException(i, (String) null, th);
            throw th;
        }
    }

    public void stop() {
        if (LogUtils.isLogEnable()) {
            String str = this.mTag;
            LogUtils.m21881d(str, this + ", stop");
        }
        if (!isNeedKeep()) {
            if (LogUtils.isLogEnable()) {
                String str2 = this.mTag;
                LogUtils.m21881d(str2, this + ", codec real stop");
            }
            try {
                this.mCodec.stop();
                this.mState = CodecState.Uninitialized;
            } catch (IllegalStateException e) {
                this.mState = CodecState.Uninitialized;
                LogUtils.m21883e(this.mTag, "stop failed", e);
                throw e;
            }
        }
    }

    public String toString() {
        return super.toString() + " mReleaseCalled:" + this.mReleaseCalled + " isRecycled:" + this.mIsRecycled;
    }

    public void trackCantReuse() {
        this.mCantReuseCount++;
    }

    private void handleCoreAPIException(int i, String str, Throwable th, boolean z, Surface surface) {
        String str2;
        int checkSurfaceState;
        this.mErrorHappened = true;
        if (th == null) {
            str2 = "";
        } else {
            str2 = th.getLocalizedMessage();
        }
        String str3 = str + " handleCoreAPIException exception:" + str2;
        if (z && (checkSurfaceState = checkSurfaceState(surface)) != 0) {
            i = checkSurfaceState;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i);
            jSONObject.put("exceptionMsg", str3);
            CodecCallback codecCallback = this.mCallback;
            if (codecCallback != null) {
                codecCallback.onReuseCodecAPIException(jSONObject.toString(), th);
            }
        } catch (JSONException unused) {
        }
        LogUtils.m21883e(this.mTag, "hasReused:" + this.mHasReused + "    errorCode:" + i + ", " + str3, th);
        releaseCodecWhenError(i);
    }

    private void innerSetOutputSurface(Surface surface, boolean z, boolean z2) {
        if (this.mSurface == surface) {
            LogUtils.m21886w(this.mTag, this + ", innerSetOutputSurface error surface:" + surface + " is same, stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        String str = null;
        if (LogUtils.isLogEnable()) {
            str = this + " configure, call innerSetOutputSurface surface:" + surface + "  decodeState:" + this.mDecodeState + " callByInner:" + z;
            LogUtils.m21881d(this.mTag, str);
        }
        String str2 = str;
        try {
            setSurface(surface);
            this.mCodec.setOutputSurface(surface);
            if (!z2) {
                unBindingBackupSurface();
            }
        } catch (Throwable th) {
            handleCoreAPIException(!(th instanceof IllegalStateException) ? th instanceof IllegalArgumentException ? 30001 : 0 : 30000, str2, th, true, surface);
            throw th;
        }
    }

    public void configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method configure for isNotMyThread");
            return;
        }
        this.mHasConfigureCalled = true;
        this.mReleaseCalled = false;
        if (this.mState == CodecState.Uninitialized) {
            realConfigure(mediaFormat, surface, i, mediaDescrambler);
        } else if (surface != null) {
            onReuseCodec();
            innerSetOutputSurface(surface);
        }
    }

    private void realConfigure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler) {
        String str;
        if (LogUtils.isLogEnable()) {
            str = this + ", configure mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i + " descrambler:" + mediaDescrambler + " state:" + this.mState + " mHasConfigureCalled：" + this.mHasConfigureCalled;
            LogUtils.m21881d(this.mTag, str);
        } else {
            str = null;
        }
        String str2 = str;
        try {
            this.mCodec.configure(mediaFormat, surface, i, mediaDescrambler);
            setSurface(surface);
            this.mState = CodecState.Configured;
        } catch (Throwable th) {
            handleCoreAPIException(!(th instanceof MediaCodec.CodecException) ? !(th instanceof IllegalStateException) ? th instanceof MediaCodec.CryptoException ? 10001 : 0 : 10000 : 10002, str2, th, true, surface);
            throw th;
        }
    }

    public void releaseOutputBuffer(int i, long j) {
        if (isNotMyThread()) {
            LogUtils.m21886w(this.mTag, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        String str = null;
        if (LogUtils.isLogEnable()) {
            str = this + ", releaseOutputBuffer API21" + i;
            if (this instanceof VideoCodecWrapper) {
                LogUtils.m21885v(this.mTag, str);
            }
        }
        this.mHoldBufferOutIndex.remove(Integer.valueOf(i));
        try {
            this.mCodec.releaseOutputBuffer(i, j);
            this.mDecodeState = DecodeState.ReleaseOut;
        } catch (Throwable th) {
            int i2 = 0;
            if (th instanceof MediaCodec.CodecException) {
                i2 = CodecError.RELEASEOUTPUTBUFFER_CODEC_EXCEPTION;
            } else if (th instanceof IllegalStateException) {
                i2 = CodecError.RELEASEOUTPUTBUFFER_ILLEGAL;
            }
            handleCoreAPIException(i2, str, th);
            throw th;
        }
    }
}
