package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.live2.impl.p312a.C17634a;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav")
public class V2TXLivePlayerJni extends V2TXLivePlayer {
    private static final String TAG = "V2TXLivePlayerJni";
    private Integer mAudioCodecType;
    private Integer mAudioRoute;
    private GLConstants.PixelBufferType mBufferType;
    private boolean mClearLastImage = true;
    private Integer mComponent;
    private DisplayTarget mDisplayTarget;
    private Boolean mEnableCustomRendering;
    private Boolean mEnableExtensionCallback;
    private Boolean mEnableHardwareDecode;
    private Boolean mEnableRTMPAcc;
    private Integer mFramework;
    private Boolean mIsPauseAudio;
    private Boolean mIsPauseVideo;
    private String mLEBEnv = "";
    private Float mMax;
    private Float mMin;
    public long mNativeV2TXLivePlayerJni = 0;
    private V2TXLivePlayerObserver mObserver;
    private GLConstants.PixelFormatType mPixelFormatType;
    private V2TXLivePlayerImpl mProxy;
    private Integer mRetryInterval;
    private Integer mRetryLimits;
    private Rotation mRotation;
    private Set<Integer> mSEIPayloadSet = new HashSet();
    private GLConstants.GLScaleType mScaleType;
    private Boolean mShowDebugView;
    private Surface mSurface;
    private V2TXLiveDefInner.SurfaceSize mSurfaceSize;
    private Integer mVolume;
    private Integer mVolumeIntervalMs;

    /* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1 */
    public static /* synthetic */ class C171651 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46353a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46354b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46355c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f46356d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f46357e;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a9 */
        static {
            /*
                com.tencent.liteav.videobase.utils.Rotation[] r0 = com.tencent.liteav.videobase.utils.Rotation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46357e = r0
                r1 = 1
                com.tencent.liteav.videobase.utils.Rotation r2 = com.tencent.liteav.videobase.utils.Rotation.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46357e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videobase.utils.Rotation r3 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46357e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videobase.utils.Rotation r4 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_180     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f46357e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videobase.utils.Rotation r4 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType[] r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46356d = r3
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r3 = f46356d     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f46356d     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType[] r3 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46355c = r3
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r3 = f46355c     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                com.tencent.live2.V2TXLiveDef$V2TXLiveFillMode[] r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46354b = r3
                com.tencent.live2.V2TXLiveDef$V2TXLiveFillMode r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f46354b     // Catch:{ NoSuchFieldError -> 0x008e }
                com.tencent.live2.V2TXLiveDef$V2TXLiveFillMode r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill     // Catch:{ NoSuchFieldError -> 0x008e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation[] r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46353a = r3
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90     // Catch:{ NoSuchFieldError -> 0x009f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r1 = f46353a     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = f46353a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r1 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePlayerJni.C171651.<clinit>():void");
        }
    }

    public V2TXLivePlayerJni(Context context, V2TXLivePlayerImpl v2TXLivePlayerImpl) {
        this.mProxy = v2TXLivePlayerImpl;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
    }

    private void enableExtensionCallback(boolean z) {
        synchronized (this) {
            this.mEnableExtensionCallback = Boolean.valueOf(z);
            if (isNativeValid()) {
                nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, z);
            }
        }
    }

    public static V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new V2TXLiveDef.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.appCpu = i;
        v2TXLivePlayerStatistics.systemCpu = i2;
        v2TXLivePlayerStatistics.width = i3;
        v2TXLivePlayerStatistics.height = i4;
        v2TXLivePlayerStatistics.fps = i5;
        v2TXLivePlayerStatistics.videoBitrate = i6;
        v2TXLivePlayerStatistics.audioBitrate = i7;
        return v2TXLivePlayerStatistics;
    }

    private boolean isNativeValid() {
        return this.mNativeV2TXLivePlayerJni != 0;
    }

    private static native long nativeCreate(WeakReference<V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j);

    private static native int nativeEnableCustomRendering(long j, boolean z, int i, int i2);

    private static native void nativeEnableExtensionCallback(long j, boolean z);

    private static native void nativeEnableHardwareDecode(long j, boolean z);

    private static native void nativeEnableRTMPAcc(long j, boolean z);

    private static native int nativeEnableReceiveSeiMessage(long j, boolean z, int i);

    private static native int nativeEnableVolumeEvaluation(long j, int i);

    private static native int nativeIsPlaying(long j);

    private static native int nativePauseAudio(long j);

    private static native int nativePauseVideo(long j);

    private static native int nativeResumeAudio(long j);

    private static native int nativeResumeVideo(long j);

    private static native void nativeSetAudioCodecType(long j, int i);

    private static native void nativeSetAudioRoute(long j, int i);

    private static native int nativeSetCacheParams(long j, float f, float f2);

    private static native void nativeSetFramework(long j, int i, int i2);

    private static native void nativeSetLEBEnv(long j, String str);

    private static native int nativeSetPlayoutVolume(long j, int i);

    private static native int nativeSetRenderFillMode(long j, int i);

    private static native int nativeSetRenderRotation(long j, int i);

    private static native int nativeSetRenderView(long j, DisplayTarget displayTarget);

    private static native void nativeSetRetryInterval(long j, int i);

    private static native void nativeSetRetryLimits(long j, int i);

    private static native void nativeShowDebugView(long j, boolean z);

    private static native int nativeSnapshot(long j);

    private static native int nativeStartPlay(long j, String str);

    private static native int nativeStopPlay(long j);

    private static native int nativeSwitchStream(long j, String str);

    public static V2TXLivePlayerJni weakToStrongReference(WeakReference<V2TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    public int enableObserveVideoFrame(boolean z, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        synchronized (this) {
            V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
            if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
                this.mPixelFormatType = GLConstants.PixelFormatType.I420;
                this.mBufferType = GLConstants.PixelBufferType.BYTE_ARRAY;
            } else if (v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
                this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
                this.mBufferType = GLConstants.PixelBufferType.TEXTURE_2D;
            } else if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                this.mPixelFormatType = GLConstants.PixelFormatType.I420;
                this.mBufferType = GLConstants.PixelBufferType.BYTE_BUFFER;
            } else {
                LiteavLog.m16898e(TAG, "Enable custom render failed, invalid params. format:" + v2TXLivePixelFormat + " type:" + v2TXLiveBufferType);
                return -4;
            }
            this.mEnableCustomRendering = Boolean.valueOf(z);
            if (!isNativeValid()) {
                return 0;
            }
            int nativeEnableCustomRendering = nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, z, this.mPixelFormatType.getValue(), this.mBufferType.ordinal());
            return nativeEnableCustomRendering;
        }
    }

    public int enableReceiveSeiMessage(boolean z, int i) {
        synchronized (this) {
            if (z) {
                this.mSEIPayloadSet.add(Integer.valueOf(i));
            } else {
                this.mSEIPayloadSet.remove(Integer.valueOf(i));
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeEnableReceiveSeiMessage = nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, z, i);
            return nativeEnableReceiveSeiMessage;
        }
    }

    public int enableVolumeEvaluation(int i) {
        synchronized (this) {
            this.mVolumeIntervalMs = Integer.valueOf(i);
            if (!isNativeValid()) {
                return 0;
            }
            int nativeEnableVolumeEvaluation = nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, i);
            return nativeEnableVolumeEvaluation;
        }
    }

    public int isPlaying() {
        synchronized (this) {
            if (!isNativeValid()) {
                return 0;
            }
            int nativeIsPlaying = nativeIsPlaying(this.mNativeV2TXLivePlayerJni);
            return nativeIsPlaying;
        }
    }

    public void onAudioLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioLoading(this.mProxy, bundle);
        }
    }

    public void onAudioPlaying(boolean z, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioPlaying(this.mProxy, z, bundle);
        }
    }

    public void onConnected(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onConnected(this.mProxy, bundle);
        }
    }

    public void onError(int i, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onError(this.mProxy, i, str, bundle);
        }
    }

    public void onNetworkQuality(int i) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null && (v2TXLivePlayerObserver instanceof C17634a)) {
            ((C17634a) v2TXLivePlayerObserver).onNetworkQuality(i);
        }
    }

    public void onPlayEvent(int i, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null && (v2TXLivePlayerObserver instanceof C17634a)) {
            ((C17634a) v2TXLivePlayerObserver).onPlayEvent(i, bundle);
        }
    }

    public void onPlayNetStatus(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null && (v2TXLivePlayerObserver instanceof C17634a)) {
            ((C17634a) v2TXLivePlayerObserver).onPlayNetStatus(bundle);
        }
    }

    public void onPlayoutVolumeUpdate(int i) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutVolumeUpdate(this.mProxy, i);
        }
    }

    public void onReceiveSeiMessage(int i, byte[] bArr) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onReceiveSeiMessage(this.mProxy, i, bArr);
        }
    }

    public void onRenderVideoFrame(PixelFrame pixelFrame) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        int i = C171651.f46355c[pixelFrame.getPixelFormatType().ordinal()];
        if (i == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i != 2) {
            LiteavLog.m16898e(TAG, "Invalid pixelFormat. pixelFormat:" + pixelFrame.getPixelFormatType() + ".");
        } else {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i2 = C171651.f46356d[pixelFrame.getPixelBufferType().ordinal()];
        if (i2 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i2 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i2 != 3) {
            LiteavLog.m16898e(TAG, "Invalid bufferType. bufferType:" + pixelFrame.getPixelBufferType() + ".");
        } else {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
        v2TXLiveTexture.textureId = pixelFrame.getTextureId();
        if (pixelFrame.getGLContext() instanceof EGLContext) {
            v2TXLiveTexture.eglContext10 = (EGLContext) pixelFrame.getGLContext();
        } else if (pixelFrame.getGLContext() instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) pixelFrame.getGLContext();
        }
        v2TXLiveVideoFrame.texture = v2TXLiveTexture;
        v2TXLiveVideoFrame.data = pixelFrame.getData();
        v2TXLiveVideoFrame.buffer = pixelFrame.getBuffer();
        v2TXLiveVideoFrame.width = pixelFrame.getWidth();
        v2TXLiveVideoFrame.height = pixelFrame.getHeight();
        int i3 = C171651.f46357e[pixelFrame.getRotation().ordinal()];
        if (i3 == 1) {
            v2TXLiveVideoFrame.rotation = 0;
        } else if (i3 == 2) {
            v2TXLiveVideoFrame.rotation = 90;
        } else if (i3 == 3) {
            v2TXLiveVideoFrame.rotation = 180;
        } else if (i3 != 4) {
            v2TXLiveVideoFrame.rotation = 0;
        } else {
            v2TXLiveVideoFrame.rotation = 270;
        }
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onRenderVideoFrame(this.mProxy, v2TXLiveVideoFrame);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onSnapshotComplete(this.mProxy, bitmap);
        }
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStatisticsUpdate(this.mProxy, v2TXLivePlayerStatistics);
        }
    }

    public void onVideoLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoLoading(this.mProxy, bundle);
        }
    }

    public void onVideoPlaying(boolean z, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoPlaying(this.mProxy, z, bundle);
        }
    }

    public void onVideoResolutionChanged(int i, int i2) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoResolutionChanged(this.mProxy, i, i2);
        }
    }

    public void onWarning(int i, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onWarning(this.mProxy, i, str, bundle);
        }
    }

    public int pauseAudio() {
        synchronized (this) {
            this.mIsPauseAudio = Boolean.TRUE;
            if (!isNativeValid()) {
                return 0;
            }
            int nativePauseAudio = nativePauseAudio(this.mNativeV2TXLivePlayerJni);
            return nativePauseAudio;
        }
    }

    public int pauseVideo() {
        synchronized (this) {
            this.mIsPauseVideo = Boolean.TRUE;
            if (!isNativeValid()) {
                return 0;
            }
            int nativePauseVideo = nativePauseVideo(this.mNativeV2TXLivePlayerJni);
            return nativePauseVideo;
        }
    }

    public int resumeAudio() {
        synchronized (this) {
            this.mIsPauseAudio = Boolean.FALSE;
            if (!isNativeValid()) {
                return 0;
            }
            int nativeResumeAudio = nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
            return nativeResumeAudio;
        }
    }

    public int resumeVideo() {
        synchronized (this) {
            this.mIsPauseVideo = Boolean.FALSE;
            if (!isNativeValid()) {
                return 0;
            }
            int nativeResumeVideo = nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
            return nativeResumeVideo;
        }
    }

    public int setCacheParams(float f, float f2) {
        synchronized (this) {
            if (f < 0.0f || f2 < 0.0f) {
                return -2;
            }
            this.mMin = Float.valueOf(f);
            this.mMax = Float.valueOf(f2);
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetCacheParams = nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f, f2);
            return nativeSetCacheParams;
        }
    }

    public void setObserver(V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mObserver = v2TXLivePlayerObserver;
        if (v2TXLivePlayerObserver != null && (v2TXLivePlayerObserver instanceof C17634a)) {
            enableExtensionCallback(true);
        }
    }

    public int setPlayoutVolume(int i) {
        synchronized (this) {
            this.mVolume = Integer.valueOf(i);
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetPlayoutVolume = nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, i);
            return nativeSetPlayoutVolume;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public int setProperty(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = -1
            int r1 = r7.hashCode()     // Catch:{ all -> 0x03a4 }
            r2 = 0
            switch(r1) {
                case -2131574212: goto L_0x0079;
                case -1551400628: goto L_0x006e;
                case -780243797: goto L_0x0064;
                case 480042124: goto L_0x0059;
                case 582452376: goto L_0x004f;
                case 1120433643: goto L_0x0044;
                case 1637676021: goto L_0x003a;
                case 1694085113: goto L_0x002f;
                case 1899639930: goto L_0x0024;
                case 2013602325: goto L_0x0018;
                case 2085561276: goto L_0x000c;
                default: goto L_0x000a;
            }     // Catch:{ all -> 0x03a4 }
        L_0x000a:
            goto L_0x0084
        L_0x000c:
            java.lang.String r1 = "setFramework"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 5
            goto L_0x0084
        L_0x0018:
            java.lang.String r1 = "setAudioRoute"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 9
            goto L_0x0084
        L_0x0024:
            java.lang.String r1 = "secondsBetweenReconnection"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 2
            goto L_0x0084
        L_0x002f:
            java.lang.String r1 = "enableRTMPAcc"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 8
            goto L_0x0084
        L_0x003a:
            java.lang.String r1 = "maxNumberOfReconnection"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 1
            goto L_0x0084
        L_0x0044:
            java.lang.String r1 = "setSurface"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 6
            goto L_0x0084
        L_0x004f:
            java.lang.String r1 = "clearLastImage"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 3
            goto L_0x0084
        L_0x0059:
            java.lang.String r1 = "setSurfaceSize"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 7
            goto L_0x0084
        L_0x0064:
            java.lang.String r1 = "enableHardwareAcceleration"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0084
        L_0x006e:
            java.lang.String r1 = "setLEBEnvironment"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 4
            goto L_0x0084
        L_0x0079:
            java.lang.String r1 = "setAudioCodecType"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03a4 }
            if (r1 == 0) goto L_0x0084
            r0 = 10
        L_0x0084:
            r1 = 0
            r3 = -2
            switch(r0) {
                case 0: goto L_0x0347;
                case 1: goto L_0x030a;
                case 2: goto L_0x02cc;
                case 3: goto L_0x029b;
                case 4: goto L_0x0275;
                case 5: goto L_0x01f6;
                case 6: goto L_0x0195;
                case 7: goto L_0x0146;
                case 8: goto L_0x0108;
                case 9: goto L_0x00ca;
                case 10: goto L_0x008b;
                default: goto L_0x0089;
            }     // Catch:{ all -> 0x03a4 }
        L_0x0089:
            goto L_0x0385
        L_0x008b:
            boolean r0 = r8 instanceof java.lang.Integer     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x00ad:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            r0 = r8
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00c7 }
            r6.mAudioCodecType = r0     // Catch:{ all -> 0x00c7 }
            boolean r0 = r6.isNativeValid()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c4
            long r0 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x00c7 }
            java.lang.Integer r2 = r6.mAudioCodecType     // Catch:{ all -> 0x00c7 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00c7 }
            nativeSetAudioCodecType(r0, r2)     // Catch:{ all -> 0x00c7 }
        L_0x00c4:
            monitor-exit(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x0385
        L_0x00c7:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c7 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x00ca:
            boolean r0 = r8 instanceof java.lang.Integer     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x00ec:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0105 }
            r6.mAudioRoute = r8     // Catch:{ all -> 0x0105 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0105 }
            if (r7 == 0) goto L_0x0102
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = r6.mAudioRoute     // Catch:{ all -> 0x0105 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0105 }
            nativeSetAudioRoute(r7, r0)     // Catch:{ all -> 0x0105 }
        L_0x0102:
            monitor-exit(r6)     // Catch:{ all -> 0x0105 }
            goto L_0x0380
        L_0x0105:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0105 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x0108:
            boolean r0 = r8 instanceof java.lang.Boolean     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x012a:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0143 }
            r6.mEnableRTMPAcc = r8     // Catch:{ all -> 0x0143 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0143 }
            if (r7 == 0) goto L_0x0140
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0143 }
            java.lang.Boolean r0 = r6.mEnableRTMPAcc     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0143 }
            nativeEnableRTMPAcc(r7, r0)     // Catch:{ all -> 0x0143 }
        L_0x0140:
            monitor-exit(r6)     // Catch:{ all -> 0x0143 }
            goto L_0x0380
        L_0x0143:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0143 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x0146:
            if (r8 != 0) goto L_0x014c
            r6.mSurfaceSize = r1     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r2
        L_0x014c:
            boolean r0 = r8 instanceof com.tencent.live2.impl.V2TXLiveDefInner.SurfaceSize     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x016e:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            com.tencent.live2.impl.V2TXLiveDefInner$SurfaceSize r8 = (com.tencent.live2.impl.V2TXLiveDefInner.SurfaceSize) r8     // Catch:{ all -> 0x0192 }
            r6.mSurfaceSize = r8     // Catch:{ all -> 0x0192 }
            android.view.Surface r7 = r6.mSurface     // Catch:{ all -> 0x0192 }
            if (r7 == 0) goto L_0x018f
            com.tencent.liteav.videobase.videobase.DisplayTarget r0 = new com.tencent.liteav.videobase.videobase.DisplayTarget     // Catch:{ all -> 0x0192 }
            int r1 = r8.width     // Catch:{ all -> 0x0192 }
            int r8 = r8.height     // Catch:{ all -> 0x0192 }
            r0.<init>(r7, r1, r8)     // Catch:{ all -> 0x0192 }
            r6.mDisplayTarget = r0     // Catch:{ all -> 0x0192 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0192 }
            if (r7 == 0) goto L_0x018f
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0192 }
            com.tencent.liteav.videobase.videobase.DisplayTarget r0 = r6.mDisplayTarget     // Catch:{ all -> 0x0192 }
            nativeSetRenderView(r7, r0)     // Catch:{ all -> 0x0192 }
        L_0x018f:
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            goto L_0x0380
        L_0x0192:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x0195:
            if (r8 != 0) goto L_0x01ad
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            r6.mSurface = r1     // Catch:{ all -> 0x01aa }
            r6.mDisplayTarget = r1     // Catch:{ all -> 0x01aa }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x01a7
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x01aa }
            nativeSetRenderView(r7, r1)     // Catch:{ all -> 0x01aa }
        L_0x01a7:
            monitor-exit(r6)     // Catch:{ all -> 0x01aa }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r2
        L_0x01aa:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01aa }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x01ad:
            boolean r0 = r8 instanceof android.view.Surface     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x01cf
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x01cf:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            android.view.Surface r8 = (android.view.Surface) r8     // Catch:{ all -> 0x01f3 }
            r6.mSurface = r8     // Catch:{ all -> 0x01f3 }
            com.tencent.live2.impl.V2TXLiveDefInner$SurfaceSize r7 = r6.mSurfaceSize     // Catch:{ all -> 0x01f3 }
            if (r7 == 0) goto L_0x01f0
            com.tencent.liteav.videobase.videobase.DisplayTarget r0 = new com.tencent.liteav.videobase.videobase.DisplayTarget     // Catch:{ all -> 0x01f3 }
            int r1 = r7.width     // Catch:{ all -> 0x01f3 }
            int r7 = r7.height     // Catch:{ all -> 0x01f3 }
            r0.<init>(r8, r1, r7)     // Catch:{ all -> 0x01f3 }
            r6.mDisplayTarget = r0     // Catch:{ all -> 0x01f3 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x01f3 }
            if (r7 == 0) goto L_0x01f0
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x01f3 }
            com.tencent.liteav.videobase.videobase.DisplayTarget r0 = r6.mDisplayTarget     // Catch:{ all -> 0x01f3 }
            nativeSetRenderView(r7, r0)     // Catch:{ all -> 0x01f3 }
        L_0x01f0:
            monitor-exit(r6)     // Catch:{ all -> 0x01f3 }
            goto L_0x0380
        L_0x01f3:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01f3 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x01f6:
            boolean r0 = r8 instanceof java.lang.String     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x0218
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x0218:
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03a4 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0256 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0256 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "framework"
            int r0 = r1.optInt(r0, r2)     // Catch:{ all -> 0x0253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0253 }
            r6.mFramework = r0     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "component"
            int r0 = r1.optInt(r0, r2)     // Catch:{ all -> 0x0253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0253 }
            r6.mComponent = r0     // Catch:{ all -> 0x0253 }
            boolean r0 = r6.isNativeValid()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0250
            long r0 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0253 }
            java.lang.Integer r4 = r6.mFramework     // Catch:{ all -> 0x0253 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0253 }
            java.lang.Integer r5 = r6.mComponent     // Catch:{ all -> 0x0253 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0253 }
            nativeSetFramework(r0, r4, r5)     // Catch:{ all -> 0x0253 }
        L_0x0250:
            monitor-exit(r6)     // Catch:{ all -> 0x0253 }
            goto L_0x0380
        L_0x0253:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0253 }
            throw r0     // Catch:{ Exception -> 0x0256 }
        L_0x0256:
            r0 = move-exception
            java.lang.String r1 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r4 = "setProperty error, key:"
            r2.<init>(r4)     // Catch:{ all -> 0x03a4 }
            r2.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r2.append(r7)     // Catch:{ all -> 0x03a4 }
            r2.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r1, (java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x0275:
            boolean r7 = r8 instanceof java.lang.String     // Catch:{ all -> 0x03a4 }
            if (r7 != 0) goto L_0x027b
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x027b:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03a4 }
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x0285
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x0285:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            r6.mLEBEnv = r8     // Catch:{ all -> 0x0298 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0298 }
            if (r7 == 0) goto L_0x0295
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = r6.mLEBEnv     // Catch:{ all -> 0x0298 }
            nativeSetLEBEnv(r7, r0)     // Catch:{ all -> 0x0298 }
        L_0x0295:
            monitor-exit(r6)     // Catch:{ all -> 0x0298 }
            goto L_0x0380
        L_0x0298:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0298 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x029b:
            boolean r0 = r8 instanceof java.lang.Boolean     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x02bd
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x02bd:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x02c9 }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x02c9 }
            r6.mClearLastImage = r7     // Catch:{ all -> 0x02c9 }
            monitor-exit(r6)     // Catch:{ all -> 0x02c9 }
            goto L_0x0380
        L_0x02c9:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02c9 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x02cc:
            boolean r0 = r8 instanceof java.lang.Integer     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x02ee:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0307 }
            r6.mRetryInterval = r8     // Catch:{ all -> 0x0307 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0307 }
            if (r7 == 0) goto L_0x0304
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0307 }
            java.lang.Integer r0 = r6.mRetryInterval     // Catch:{ all -> 0x0307 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0307 }
            nativeSetRetryInterval(r7, r0)     // Catch:{ all -> 0x0307 }
        L_0x0304:
            monitor-exit(r6)     // Catch:{ all -> 0x0307 }
            goto L_0x0380
        L_0x0307:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0307 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x030a:
            boolean r0 = r8 instanceof java.lang.Integer     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x032c:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0344 }
            r6.mRetryLimits = r8     // Catch:{ all -> 0x0344 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0344 }
            if (r7 == 0) goto L_0x0342
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0344 }
            java.lang.Integer r0 = r6.mRetryLimits     // Catch:{ all -> 0x0344 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0344 }
            nativeSetRetryLimits(r7, r0)     // Catch:{ all -> 0x0344 }
        L_0x0342:
            monitor-exit(r6)     // Catch:{ all -> 0x0344 }
            goto L_0x0380
        L_0x0344:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0344 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x0347:
            boolean r0 = r8 instanceof java.lang.Boolean     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x0369
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r3
        L_0x0369:
            monitor-enter(r6)     // Catch:{ all -> 0x03a4 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0382 }
            r6.mEnableHardwareDecode = r8     // Catch:{ all -> 0x0382 }
            boolean r7 = r6.isNativeValid()     // Catch:{ all -> 0x0382 }
            if (r7 == 0) goto L_0x037f
            long r7 = r6.mNativeV2TXLivePlayerJni     // Catch:{ all -> 0x0382 }
            java.lang.Boolean r0 = r6.mEnableHardwareDecode     // Catch:{ all -> 0x0382 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0382 }
            nativeEnableHardwareDecode(r7, r0)     // Catch:{ all -> 0x0382 }
        L_0x037f:
            monitor-exit(r6)     // Catch:{ all -> 0x0382 }
        L_0x0380:
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r2
        L_0x0382:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0382 }
            throw r7     // Catch:{ all -> 0x03a4 }
        L_0x0385:
            java.lang.String r0 = "V2TXLivePlayerJni"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "setProperty error, key:"
            r1.<init>(r2)     // Catch:{ all -> 0x03a4 }
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = ", value:"
            r1.append(r7)     // Catch:{ all -> 0x03a4 }
            r1.append(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r7)     // Catch:{ all -> 0x03a4 }
            r7 = -4
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            return r7
        L_0x03a4:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03a4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePlayerJni.setProperty(java.lang.String, java.lang.Object):int");
    }

    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        synchronized (this) {
            int i = C171651.f46354b[v2TXLiveFillMode.ordinal()];
            if (i == 1) {
                this.mScaleType = GLConstants.GLScaleType.CENTER_CROP;
            } else if (i != 2) {
                this.mScaleType = GLConstants.GLScaleType.FIT_CENTER;
            } else {
                this.mScaleType = GLConstants.GLScaleType.FILL;
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetRenderFillMode = nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, this.mScaleType.mValue);
            return nativeSetRenderFillMode;
        }
    }

    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        synchronized (this) {
            int i = C171651.f46353a[v2TXLiveRotation.ordinal()];
            if (i == 1) {
                this.mRotation = Rotation.ROTATION_90;
            } else if (i == 2) {
                this.mRotation = Rotation.ROTATION_180;
            } else if (i != 3) {
                this.mRotation = Rotation.NORMAL;
            } else {
                this.mRotation = Rotation.ROTATION_270;
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetRenderRotation = nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, this.mRotation.mValue);
            return nativeSetRenderRotation;
        }
    }

    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        synchronized (this) {
            if (tXCloudVideoView != null) {
                this.mDisplayTarget = new DisplayTarget(tXCloudVideoView);
            } else {
                this.mDisplayTarget = null;
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetRenderView = nativeSetRenderView(this.mNativeV2TXLivePlayerJni, this.mDisplayTarget);
            return nativeSetRenderView;
        }
    }

    public void showDebugView(boolean z) {
        synchronized (this) {
            this.mShowDebugView = Boolean.valueOf(z);
            if (isNativeValid()) {
                nativeShowDebugView(this.mNativeV2TXLivePlayerJni, z);
            }
        }
    }

    public int snapshot() {
        synchronized (this) {
            if (!isNativeValid()) {
                return -3;
            }
            int nativeSnapshot = nativeSnapshot(this.mNativeV2TXLivePlayerJni);
            return nativeSnapshot;
        }
    }

    public int startPlay(String str) {
        int nativeStartPlay;
        synchronized (this) {
            if (!isNativeValid()) {
                long nativeCreate = nativeCreate(new WeakReference(this));
                this.mNativeV2TXLivePlayerJni = nativeCreate;
                Boolean bool = this.mShowDebugView;
                if (bool != null) {
                    nativeShowDebugView(nativeCreate, bool.booleanValue());
                }
                Boolean bool2 = this.mEnableExtensionCallback;
                if (bool2 != null) {
                    nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, bool2.booleanValue());
                }
                nativeSetRenderView(this.mNativeV2TXLivePlayerJni, this.mDisplayTarget);
                Rotation rotation = this.mRotation;
                if (rotation != null) {
                    nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, rotation.mValue);
                }
                GLConstants.GLScaleType gLScaleType = this.mScaleType;
                if (gLScaleType != null) {
                    nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, gLScaleType.mValue);
                }
                Boolean bool3 = this.mIsPauseAudio;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        nativePauseAudio(this.mNativeV2TXLivePlayerJni);
                    } else {
                        nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
                    }
                }
                Boolean bool4 = this.mIsPauseVideo;
                if (bool4 != null) {
                    if (bool4.booleanValue()) {
                        nativePauseVideo(this.mNativeV2TXLivePlayerJni);
                    } else {
                        nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
                    }
                }
                Integer num = this.mVolume;
                if (num != null) {
                    nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, num.intValue());
                }
                Float f = this.mMin;
                if (!(f == null || this.mMax == null)) {
                    nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f.floatValue(), this.mMax.floatValue());
                }
                Integer num2 = this.mVolumeIntervalMs;
                if (num2 != null) {
                    nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, num2.intValue());
                }
                Boolean bool5 = this.mEnableCustomRendering;
                if (!(bool5 == null || this.mPixelFormatType == null || this.mBufferType == null)) {
                    nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, bool5.booleanValue(), this.mPixelFormatType.getValue(), this.mBufferType.ordinal());
                }
                if (this.mSEIPayloadSet.size() > 0) {
                    for (Integer intValue : this.mSEIPayloadSet) {
                        nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, true, intValue.intValue());
                    }
                }
                if (!TextUtils.isEmpty(this.mLEBEnv)) {
                    nativeSetLEBEnv(this.mNativeV2TXLivePlayerJni, this.mLEBEnv);
                }
                Boolean bool6 = this.mEnableHardwareDecode;
                if (bool6 != null) {
                    nativeEnableHardwareDecode(this.mNativeV2TXLivePlayerJni, bool6.booleanValue());
                }
                Integer num3 = this.mRetryLimits;
                if (num3 != null) {
                    nativeSetRetryLimits(this.mNativeV2TXLivePlayerJni, num3.intValue());
                }
                Integer num4 = this.mRetryInterval;
                if (num4 != null) {
                    nativeSetRetryInterval(this.mNativeV2TXLivePlayerJni, num4.intValue());
                }
                Integer num5 = this.mFramework;
                if (!(num5 == null || this.mComponent == null)) {
                    nativeSetFramework(this.mNativeV2TXLivePlayerJni, num5.intValue(), this.mComponent.intValue());
                }
                Boolean bool7 = this.mEnableRTMPAcc;
                if (bool7 != null) {
                    nativeEnableRTMPAcc(this.mNativeV2TXLivePlayerJni, bool7.booleanValue());
                }
                Integer num6 = this.mAudioRoute;
                if (num6 != null) {
                    nativeSetAudioRoute(this.mNativeV2TXLivePlayerJni, num6.intValue());
                }
                Integer num7 = this.mAudioCodecType;
                if (num7 != null) {
                    nativeSetAudioCodecType(this.mNativeV2TXLivePlayerJni, num7.intValue());
                }
            }
            nativeStartPlay = nativeStartPlay(this.mNativeV2TXLivePlayerJni, str);
        }
        return nativeStartPlay;
    }

    public int stopPlay() {
        synchronized (this) {
            DisplayTarget displayTarget = this.mDisplayTarget;
            if (displayTarget != null && this.mClearLastImage) {
                displayTarget.hideAll();
            }
            if (isNativeValid()) {
                nativeStopPlay(this.mNativeV2TXLivePlayerJni);
                nativeDestroy(this.mNativeV2TXLivePlayerJni);
                this.mNativeV2TXLivePlayerJni = 0;
            }
        }
        return 0;
    }

    public int switchStream(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                LiteavLog.m16898e(TAG, "Invalid params.");
                return -2;
            } else if (!isNativeValid()) {
                return 0;
            } else {
                int nativeSwitchStream = nativeSwitchStream(this.mNativeV2TXLivePlayerJni, str);
                return nativeSwitchStream;
            }
        }
    }

    public int setRenderView(TextureView textureView) {
        synchronized (this) {
            if (textureView != null) {
                this.mDisplayTarget = new DisplayTarget(textureView);
            } else {
                this.mDisplayTarget = null;
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetRenderView = nativeSetRenderView(this.mNativeV2TXLivePlayerJni, this.mDisplayTarget);
            return nativeSetRenderView;
        }
    }

    public int setRenderView(SurfaceView surfaceView) {
        synchronized (this) {
            if (surfaceView != null) {
                this.mDisplayTarget = new DisplayTarget(surfaceView);
            } else {
                this.mDisplayTarget = null;
            }
            if (!isNativeValid()) {
                return 0;
            }
            int nativeSetRenderView = nativeSetRenderView(this.mNativeV2TXLivePlayerJni, this.mDisplayTarget);
            return nativeSetRenderView;
        }
    }
}
