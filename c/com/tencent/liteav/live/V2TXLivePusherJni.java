package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.live2.impl.p312a.C17635b;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

@JNINamespace("liteav")
public class V2TXLivePusherJni extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherJni";
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManager mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeV2TXLivePusherJni));
    private TXDeviceManager mDeviceManager = new TXDeviceManagerImpl(nativeCreateDeviceManager(this.mNativeV2TXLivePusherJni));
    private long mNativeV2TXLivePusherJni;
    private V2TXLivePusherObserver mObserver;
    private Surface mSurface;
    private V2TXLiveDefInner.SurfaceSize mSurfaceSize;

    /* renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1 */
    public static /* synthetic */ class C171661 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46358a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46359b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46360c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f46361d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f46362e;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009e */
        static {
            /*
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType[] r0 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46362e = r0
                r1 = 1
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r2 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46362e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46362e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType[] r3 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46361d = r3
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f46361d     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r4 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.tencent.live2.V2TXLiveDef$V2TXLiveBufferType[] r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46360c = r3
                com.tencent.live2.V2TXLiveDef$V2TXLiveBufferType r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f46360c     // Catch:{ NoSuchFieldError -> 0x005e }
                com.tencent.live2.V2TXLiveDef$V2TXLiveBufferType r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r3 = f46360c     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.tencent.live2.V2TXLiveDef$V2TXLiveBufferType r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                com.tencent.live2.V2TXLiveDef$V2TXLivePixelFormat[] r3 = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46359b = r3
                com.tencent.live2.V2TXLiveDef$V2TXLivePixelFormat r4 = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r3 = f46359b     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tencent.live2.V2TXLiveDef$V2TXLivePixelFormat r4 = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation[] r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46358a = r3
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r4 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                int[] r1 = f46358a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180     // Catch:{ NoSuchFieldError -> 0x009e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f46358a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tencent.live2.V2TXLiveDef$V2TXLiveRotation r1 = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePusherJni.C171661.<clinit>():void");
        }
    }

    public V2TXLivePusherJni(Context context, int i) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        long nativeCreate = nativeCreate(new WeakReference(this), i);
        this.mNativeV2TXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
    }

    private int enable3A(String str, Object obj) {
        if (!(obj instanceof String)) {
            LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
            return -2;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            boolean z = jSONObject.getBoolean("enable");
            int i = jSONObject.getInt(FirebaseAnalytics.C113379b.LEVEL);
            if (i >= 0) {
                if (i <= 100) {
                    if (str.equals("enableAGC")) {
                        nativeEnableAGC(this.mNativeV2TXLivePusherJni, z, i);
                        return 0;
                    } else if (!str.equals("enableANS")) {
                        return 0;
                    } else {
                        nativeEnableANS(this.mNativeV2TXLivePusherJni, z, i);
                        return 0;
                    }
                }
            }
            Objects.toString(obj);
            return -2;
        } catch (Exception unused) {
            Objects.toString(obj);
            return -2;
        }
    }

    private static native long nativeCreate(WeakReference<V2TXLivePusherJni> weakReference, int i);

    private static native long nativeCreateAudioEffectManager(long j);

    private static native long nativeCreateBeautyManager(long j);

    private static native long nativeCreateDeviceManager(long j);

    private static native void nativeDestroy(long j);

    private static native void nativeEnableAGC(long j, boolean z, int i);

    private static native void nativeEnableANS(long j, boolean z, int i);

    private static native void nativeEnableCameraZoom(long j, boolean z);

    private static native int nativeEnableCustomAudioCapture(long j, boolean z);

    private static native int nativeEnableCustomVideoCapture(long j, boolean z);

    private static native int nativeEnableCustomVideoProcess(long j, boolean z, int i, int i2);

    private static native void nativeEnableExtensionCallback(long j, boolean z);

    private static native void nativeEnableRealtimeMode(long j, boolean z);

    private static native int nativeEnableVolumeEvaluation(long j, int i);

    private static native int nativeIsPushing(long j);

    private static native int nativePauseAudio(long j);

    private static native int nativePauseVideo(long j);

    private static native int nativeResumeAudio(long j);

    private static native int nativeResumeVideo(long j);

    private static native int nativeSendCustomAudioFrame(long j, byte[] bArr, int i, int i2);

    private static native int nativeSendCustomVideoFrame(long j, PixelFrame pixelFrame);

    private static native int nativeSendSeiMessage(long j, int i, byte[] bArr);

    private static native int nativeSetAudioQuality(long j, int i);

    private static native int nativeSetEncoderMirror(long j, boolean z);

    private static native void nativeSetFramework(long j, int i, int i2);

    private static native void nativeSetMetaData(long j, HashMap<String, String> hashMap);

    private static native int nativeSetMixTranscodingConfig(long j, String str);

    private static native int nativeSetProperty(long j, String str, Object obj);

    private static native int nativeSetRenderMirror(long j, int i);

    private static native int nativeSetRenderRotation(long j, int i);

    private static native int nativeSetRenderView(long j, DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j, int i, int i2, int i3, int i4, int i5);

    private static native int nativeSetWatermark(long j, Bitmap bitmap, float f, float f2, float f3);

    private static native void nativeShowDebugView(long j, boolean z);

    private static native int nativeSnapshot(long j);

    private static native int nativeStartCamera(long j, boolean z);

    private static native int nativeStartMicrophone(long j);

    private static native int nativeStartPush(long j, String str);

    private static native int nativeStartScreenCapture(long j);

    private static native int nativeStartVirtualCamera(long j, Bitmap bitmap);

    private static native int nativeStopCamera(long j);

    private static native int nativeStopMicrophone(long j);

    private static native int nativeStopPush(long j);

    private static native int nativeStopScreenCapture(long j);

    private static native int nativeStopVirtualCamera(long j);

    private static boolean pixelFrameToV2VideoFrame(PixelFrame pixelFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        int i = C171661.f46361d[pixelFrame.getPixelFormatType().ordinal()];
        if (i == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i != 2) {
            return false;
        } else {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i2 = C171661.f46362e[pixelFrame.getPixelBufferType().ordinal()];
        if (i2 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
            v2TXLiveVideoFrame.texture = v2TXLiveTexture;
            v2TXLiveTexture.textureId = pixelFrame.getTextureId();
            if (pixelFrame.getGLContext() instanceof EGLContext) {
                v2TXLiveVideoFrame.texture.eglContext10 = (EGLContext) pixelFrame.getGLContext();
            } else if (pixelFrame.getGLContext() instanceof android.opengl.EGLContext) {
                v2TXLiveVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) pixelFrame.getGLContext();
            }
        } else if (i2 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.data = pixelFrame.getData();
        } else if (i2 != 3) {
            return false;
        } else {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.buffer = pixelFrame.getBuffer();
        }
        v2TXLiveVideoFrame.width = pixelFrame.getWidth();
        v2TXLiveVideoFrame.height = pixelFrame.getHeight();
        v2TXLiveVideoFrame.rotation = pixelFrame.getRotation().mValue;
        return true;
    }

    private static boolean v2VideoFrameToPixelFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, PixelFrame pixelFrame) {
        int i = C171661.f46359b[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        if (i == 1) {
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.I420);
        } else if (i != 2) {
            return false;
        } else {
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        }
        int i2 = C171661.f46360c[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i2 == 1) {
            pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.TEXTURE_2D);
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            if (v2TXLiveTexture == null) {
                return false;
            }
            pixelFrame.setTextureId(v2TXLiveTexture.textureId);
            EGLContext eGLContext = v2TXLiveVideoFrame.texture.eglContext10;
            if (eGLContext != null) {
                pixelFrame.setGLContext(eGLContext);
            }
            android.opengl.EGLContext eGLContext2 = v2TXLiveVideoFrame.texture.eglContext14;
            if (eGLContext2 != null) {
                pixelFrame.setGLContext(eGLContext2);
            }
            if (pixelFrame.getGLContext() == null) {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                if (egl10 == null) {
                    return false;
                }
                pixelFrame.setGLContext(egl10.eglGetCurrentContext());
            }
        } else if (i2 == 2) {
            pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.BYTE_ARRAY);
            pixelFrame.setData(v2TXLiveVideoFrame.data);
        } else if (i2 != 3) {
            return false;
        } else {
            pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.BYTE_BUFFER);
            pixelFrame.setBuffer(v2TXLiveVideoFrame.buffer);
        }
        pixelFrame.setWidth(v2TXLiveVideoFrame.width);
        pixelFrame.setHeight(v2TXLiveVideoFrame.height);
        pixelFrame.setRotation(Rotation.m139836a(v2TXLiveVideoFrame.rotation));
        return true;
    }

    public static V2TXLivePusherJni weakToStrongReference(WeakReference<V2TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public int enableCustomAudioCapture(boolean z) {
        return nativeEnableCustomAudioCapture(this.mNativeV2TXLivePusherJni, z);
    }

    public int enableCustomVideoCapture(boolean z) {
        return nativeEnableCustomVideoCapture(this.mNativeV2TXLivePusherJni, z);
    }

    public int enableCustomVideoProcess(boolean z, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
    }

    public int enableVolumeEvaluation(int i) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePusherJni, i);
    }

    public void finalize() {
        super.finalize();
        release();
    }

    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    public TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public int isPushing() {
        return nativeIsPushing(this.mNativeV2TXLivePusherJni);
    }

    public void onCaptureFirstAudioFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstAudioFrame();
        }
    }

    public void onCaptureFirstVideoFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstVideoFrame();
        }
    }

    public int onCustomPreprocessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
        V2TXLivePusherObserver v2TXLivePusherObserver;
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        if (!pixelFrameToV2VideoFrame(pixelFrame, v2TXLiveVideoFrame)) {
            return -1;
        }
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2 = new V2TXLiveDef.V2TXLiveVideoFrame();
        if (!pixelFrameToV2VideoFrame(pixelFrame2, v2TXLiveVideoFrame2) || (v2TXLivePusherObserver = this.mObserver) == null) {
            return -1;
        }
        int onProcessVideoFrame = v2TXLivePusherObserver.onProcessVideoFrame(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        if (!v2VideoFrameToPixelFrame(v2TXLiveVideoFrame2, pixelFrame2)) {
            return -1;
        }
        return onProcessVideoFrame;
    }

    public void onEnterRoom(int i, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onEnterRoom((long) i);
        }
    }

    public void onError(int i, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onError(i, str, bundle);
        }
    }

    public void onExitRoom(int i, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onExitRoom(i);
        }
    }

    public void onGLContextCreated() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextCreated();
        }
    }

    public void onGLContextDestroyed() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextDestroyed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onMicrophoneVolumeUpdate(i);
        }
    }

    public void onNetworkQuality(int i) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onNetworkQuality(i);
        }
    }

    public void onPushEvent(int i, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onPushEvent(i, bundle);
        }
    }

    public void onPushNetStatus(Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onPushNetStatus(bundle);
        }
    }

    public void onPushStatusUpdate(int i, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i == 0) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = "connecting to the server.";
        } else if (i == 1) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = "connected to the server successfully.";
        } else if (i == 2) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = "reconnecting to the server.";
        } else if (i == 3) {
            str = "disconnected from the server.";
        }
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onPushStatusUpdate(v2TXLivePushStatus, str, bundle);
        }
    }

    public void onSetMixTranscodingConfig(int i, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSetMixTranscodingConfig(i, str);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSnapshotComplete(bitmap);
        }
    }

    public void onStatisticsUpdate(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics = new V2TXLiveDef.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.appCpu = i;
            v2TXLivePusherStatistics.systemCpu = i2;
            v2TXLivePusherStatistics.width = i3;
            v2TXLivePusherStatistics.height = i4;
            v2TXLivePusherStatistics.fps = i5;
            v2TXLivePusherStatistics.videoBitrate = i6;
            v2TXLivePusherStatistics.audioBitrate = i7;
            v2TXLivePusherObserver.onStatisticsUpdate(v2TXLivePusherStatistics);
        }
    }

    public void onUserAudioAvailable(String str, boolean z) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onUserAudioAvailable(str, z);
        }
    }

    public void onUserOffline(String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onRemoteUserExit(str, 0);
        }
    }

    public void onUserOnline(String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onRemoteUserEnter(str);
        }
    }

    public void onUserVideoAvailable(String str, int i, boolean z) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            ((C17635b) v2TXLivePusherObserver).onUserVideoAvailable(str, i, z);
        }
    }

    public void onWarning(int i, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onWarning(i, str, bundle);
        }
    }

    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePusherJni);
    }

    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePusherJni);
    }

    public void release() {
        long j = this.mNativeV2TXLivePusherJni;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeV2TXLivePusherJni = 0;
        }
    }

    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePusherJni);
    }

    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePusherJni);
    }

    public int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        return nativeSendCustomAudioFrame(this.mNativeV2TXLivePusherJni, v2TXLiveAudioFrame.data, v2TXLiveAudioFrame.sampleRate, v2TXLiveAudioFrame.channel);
    }

    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        PixelFrame pixelFrame = new PixelFrame();
        if (!v2VideoFrameToPixelFrame(v2TXLiveVideoFrame, pixelFrame)) {
            return -1;
        }
        return nativeSendCustomVideoFrame(this.mNativeV2TXLivePusherJni, pixelFrame);
    }

    public int sendSeiMessage(int i, byte[] bArr) {
        return nativeSendSeiMessage(this.mNativeV2TXLivePusherJni, i, bArr);
    }

    public int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return nativeSetAudioQuality(this.mNativeV2TXLivePusherJni, v2TXLiveAudioQuality.ordinal());
    }

    public int setEncoderMirror(boolean z) {
        return nativeSetEncoderMirror(this.mNativeV2TXLivePusherJni, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            if (r9 == 0) goto L_0x00f6
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ee }
            r2.<init>()     // Catch:{ Exception -> 0x00ee }
            java.lang.String r1 = "videoWidth"
            int r3 = r9.videoWidth     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "videoHeight"
            int r3 = r9.videoHeight     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "videoBitrate"
            int r3 = r9.videoBitrate     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "videoFramerate"
            int r3 = r9.videoFramerate     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "videoGOP"
            int r3 = r9.videoGOP     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "backgroundColor"
            int r3 = r9.backgroundColor     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "backgroundImage"
            java.lang.String r3 = r9.backgroundImage     // Catch:{ Exception -> 0x00eb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00eb }
            if (r3 == 0) goto L_0x0045
            r3 = r0
            goto L_0x0047
        L_0x0045:
            java.lang.String r3 = r9.backgroundImage     // Catch:{ Exception -> 0x00eb }
        L_0x0047:
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "audioSampleRate"
            int r3 = r9.audioSampleRate     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "audioBitrate"
            int r3 = r9.audioBitrate     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "audioChannels"
            int r3 = r9.audioChannels     // Catch:{ Exception -> 0x00eb }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "outputStreamId"
            java.lang.String r3 = r9.outputStreamId     // Catch:{ Exception -> 0x00eb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00eb }
            if (r3 == 0) goto L_0x006b
            r3 = r0
            goto L_0x006d
        L_0x006b:
            java.lang.String r3 = r9.outputStreamId     // Catch:{ Exception -> 0x00eb }
        L_0x006d:
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00eb }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x00eb }
            r1.<init>()     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList<com.tencent.live2.V2TXLiveDef$V2TXLiveMixStream> r9 = r9.mixStreams     // Catch:{ Exception -> 0x00eb }
            r3 = 0
        L_0x0078:
            int r4 = r9.size()     // Catch:{ Exception -> 0x00eb }
            if (r3 >= r4) goto L_0x00e5
            java.lang.Object r4 = r9.get(r3)     // Catch:{ Exception -> 0x00eb }
            com.tencent.live2.V2TXLiveDef$V2TXLiveMixStream r4 = (com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream) r4     // Catch:{ Exception -> 0x00eb }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00eb }
            r5.<init>()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "userId"
            java.lang.String r7 = r4.userId     // Catch:{ Exception -> 0x00eb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00eb }
            if (r7 == 0) goto L_0x0096
            r7 = r0
            goto L_0x0098
        L_0x0096:
            java.lang.String r7 = r4.userId     // Catch:{ Exception -> 0x00eb }
        L_0x0098:
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "streamId"
            java.lang.String r7 = r4.streamId     // Catch:{ Exception -> 0x00eb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00eb }
            if (r7 == 0) goto L_0x00a8
            r7 = r0
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r7 = r4.streamId     // Catch:{ Exception -> 0x00eb }
        L_0x00aa:
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "x"
            int r7 = r4.f47982x     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "y"
            int r7 = r4.f47983y     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "width"
            int r7 = r4.width     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "height"
            int r7 = r4.height     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "zOrder"
            int r7 = r4.zOrder     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = "inputType"
            com.tencent.live2.V2TXLiveDef$V2TXLiveMixInputType r4 = r4.inputType     // Catch:{ Exception -> 0x00eb }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x00eb }
            r5.put(r6, r4)     // Catch:{ Exception -> 0x00eb }
            r1.put(r5)     // Catch:{ Exception -> 0x00eb }
            int r3 = r3 + 1
            goto L_0x0078
        L_0x00e5:
            java.lang.String r9 = "mixStreamList"
            r2.put(r9, r1)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00f0
        L_0x00eb:
            r1 = r2
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            r2 = r1
        L_0x00f0:
            if (r2 == 0) goto L_0x00f6
            java.lang.String r0 = r2.toString()
        L_0x00f6:
            long r1 = r8.mNativeV2TXLivePusherJni
            int r9 = nativeSetMixTranscodingConfig(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePusherJni.setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef$V2TXLiveTranscodingConfig):int");
    }

    public void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
        this.mObserver = v2TXLivePusherObserver;
        if (v2TXLivePusherObserver != null && (v2TXLivePusherObserver instanceof C17635b)) {
            nativeEnableExtensionCallback(this.mNativeV2TXLivePusherJni, true);
        }
    }

    public int setProperty(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2131574212:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioCodecType)) {
                    c = 0;
                    break;
                }
                break;
            case -631683974:
                if (str.equals("enableAGC")) {
                    c = 1;
                    break;
                }
                break;
            case -631683741:
                if (str.equals("enableANS")) {
                    c = 2;
                    break;
                }
                break;
            case 480042124:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
                    c = 3;
                    break;
                }
                break;
            case 1120433643:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
                    c = 4;
                    break;
                }
                break;
            case 1309735633:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2EnableRealtimeMode)) {
                    c = 5;
                    break;
                }
                break;
            case 1538362833:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetMetaData)) {
                    c = 6;
                    break;
                }
                break;
            case 2048424571:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2EnableCameraZoom)) {
                    c = 7;
                    break;
                }
                break;
            case 2085561276:
                if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework)) {
                    c = 8;
                    break;
                }
                break;
            case 2132058329:
                if (str.equals(V2TXLiveProperty.kV2SetVideoQualityEx)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 9:
                return nativeSetProperty(this.mNativeV2TXLivePusherJni, str, obj);
            case 1:
            case 2:
                return enable3A(str, obj);
            case 3:
                if (obj == null) {
                    this.mSurfaceSize = null;
                    break;
                } else if (obj instanceof V2TXLiveDefInner.SurfaceSize) {
                    V2TXLiveDefInner.SurfaceSize surfaceSize = (V2TXLiveDefInner.SurfaceSize) obj;
                    this.mSurfaceSize = surfaceSize;
                    Surface surface = this.mSurface;
                    if (surface != null) {
                        nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surface, surfaceSize.width, surfaceSize.height));
                        break;
                    }
                } else {
                    LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                break;
            case 4:
                if (obj == null) {
                    this.mSurface = null;
                    nativeSetRenderView(this.mNativeV2TXLivePusherJni, (DisplayTarget) null);
                    break;
                } else if (obj instanceof Surface) {
                    Surface surface2 = (Surface) obj;
                    this.mSurface = surface2;
                    V2TXLiveDefInner.SurfaceSize surfaceSize2 = this.mSurfaceSize;
                    if (surfaceSize2 != null) {
                        nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surface2, surfaceSize2.width, surfaceSize2.height));
                        break;
                    }
                } else {
                    LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                break;
            case 5:
                if (obj instanceof Boolean) {
                    nativeEnableRealtimeMode(this.mNativeV2TXLivePusherJni, ((Boolean) obj).booleanValue());
                    break;
                } else {
                    return -2;
                }
            case 6:
                if (obj instanceof HashMap) {
                    nativeSetMetaData(this.mNativeV2TXLivePusherJni, (HashMap) obj);
                    break;
                } else {
                    LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
            case 7:
                if (obj instanceof Boolean) {
                    nativeEnableCameraZoom(this.mNativeV2TXLivePusherJni, ((Boolean) obj).booleanValue());
                    break;
                } else {
                    return -2;
                }
            case 8:
                if (!(obj instanceof String)) {
                    LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                try {
                    JSONObject jSONObject = new JSONObject((String) obj);
                    nativeSetFramework(this.mNativeV2TXLivePusherJni, jSONObject.optInt("framework", 0), jSONObject.optInt("component", 0));
                    break;
                } catch (Exception e) {
                    LiteavLog.m16899e(TAG, "setProperty error, key:" + str + ", value:" + obj, (Throwable) e);
                    return -2;
                }
            default:
                LiteavLog.m16898e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                return -2;
        }
        return 0;
    }

    public int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return nativeSetRenderMirror(this.mNativeV2TXLivePusherJni, v2TXLiveMirrorType.ordinal());
    }

    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        int i = C171661.f46358a[v2TXLiveRotation.ordinal()];
        return nativeSetRenderRotation(this.mNativeV2TXLivePusherJni, (i != 1 ? i != 2 ? i != 3 ? Rotation.NORMAL : Rotation.ROTATION_270 : Rotation.ROTATION_180 : Rotation.ROTATION_90).mValue);
    }

    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(tXCloudVideoView));
    }

    public int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        return nativeSetVideoQuality(this.mNativeV2TXLivePusherJni, v2TXLiveVideoEncoderParam.videoResolution.ordinal(), v2TXLiveVideoEncoderParam.videoResolutionMode.ordinal(), v2TXLiveVideoEncoderParam.videoFps, v2TXLiveVideoEncoderParam.videoBitrate, v2TXLiveVideoEncoderParam.minVideoBitrate);
    }

    public int setWatermark(Bitmap bitmap, float f, float f2, float f3) {
        return nativeSetWatermark(this.mNativeV2TXLivePusherJni, bitmap, f, f2, f3);
    }

    public void showDebugView(boolean z) {
        nativeShowDebugView(this.mNativeV2TXLivePusherJni, z);
    }

    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePusherJni);
    }

    public int startCamera(boolean z) {
        return nativeStartCamera(this.mNativeV2TXLivePusherJni, z);
    }

    public int startMicrophone() {
        return nativeStartMicrophone(this.mNativeV2TXLivePusherJni);
    }

    public int startPush(String str) {
        return nativeStartPush(this.mNativeV2TXLivePusherJni, str);
    }

    public int startScreenCapture() {
        return nativeStartScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    public int startVirtualCamera(Bitmap bitmap) {
        return nativeStartVirtualCamera(this.mNativeV2TXLivePusherJni, bitmap);
    }

    public int stopCamera() {
        return nativeStopCamera(this.mNativeV2TXLivePusherJni);
    }

    public int stopMicrophone() {
        return nativeStopMicrophone(this.mNativeV2TXLivePusherJni);
    }

    public int stopPush() {
        return nativeStopPush(this.mNativeV2TXLivePusherJni);
    }

    public int stopScreenCapture() {
        return nativeStopScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    public int stopVirtualCamera() {
        return nativeStopVirtualCamera(this.mNativeV2TXLivePusherJni);
    }

    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(textureView));
    }

    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surfaceView));
    }
}
