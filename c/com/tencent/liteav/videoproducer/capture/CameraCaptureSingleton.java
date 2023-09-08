package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17237l;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.C104530af;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.p1097a.C104526a;
import com.tencent.liteav.videoproducer.capture.p1098b.C104534a;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("liteav::video")
public class CameraCaptureSingleton implements SurfaceTexture.OnFrameAvailableListener, CaptureSourceInterface, C104529ae {
    private static final int DELAY_FOR_RESTART_CAMERA = 2000;
    private static final int DELAY_FOR_SWITCH_TO_CAMERA1 = 1000;
    private static final int HOLD_POOL_MAX_SIZE = 1;
    private static final String TAG = "CameraCaptureSingleton";
    private static final boolean USE_DEFAULT_FRONT_CAMERA = true;
    private static volatile CameraCaptureSingleton sInstance;
    /* access modifiers changed from: private */
    public C17404ad mCameraController;
    private volatile Rotation mCameraRotation;
    private final C104530af mCameraSupervisor = new C104530af();
    public CameraCaptureParams mCurrentCaptureParams = null;
    public C104516e mEGLCore;
    private boolean mEnableTapToFocus;
    private boolean mEnableZoom;
    private final AtomicBoolean mExpectFrontCamera;
    private float mExposureCompensation;
    public C17223e mGLTexturePool;
    private boolean mIsCameraAutoFocusFaceModeSupported;
    /* access modifiers changed from: private */
    public boolean mIsCameraInRestarting;
    /* access modifiers changed from: private */
    public boolean mIsCameraInSwitching;
    private boolean mIsFirstFrameCaptured;
    private boolean mIsFocusPositionInPreviewSupported;
    private boolean mIsTorchSupported;
    private boolean mIsZoomSupported;
    private final C17416aq mListenerManager = new C17416aq();
    private final float[] mMatrix = new float[16];
    private int mMaxZoomLevel;
    private int mOESTextureId;
    public int mPausedCount = 0;
    private PixelFrame mPixelFrame;
    /* access modifiers changed from: private */
    public final Runnable mRestartCameraRunnable;
    /* access modifiers changed from: private */
    public final C17118l mSequenceTaskRunner;
    private ServerVideoProducerConfig mServerConfig;
    private Object mSharedContext;
    private SurfaceTexture mSurfaceTexture;
    /* access modifiers changed from: private */
    public final Runnable mSwitchToCamera1Runnable;
    private C17237l mTextureHolderPool;
    private float mZoomPercent;

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton$3 */
    public static /* synthetic */ class C173983 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47182a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.liteav.videoproducer.capture.af$a[] r0 = com.tencent.liteav.videoproducer.capture.C104530af.C104531a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47182a = r0
                com.tencent.liteav.videoproducer.capture.af$a r1 = com.tencent.liteav.videoproducer.capture.C104530af.C104531a.MOCK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47182a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoproducer.capture.af$a r1 = com.tencent.liteav.videoproducer.capture.C104530af.C104531a.CAMERA_2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47182a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoproducer.capture.af$a r1 = com.tencent.liteav.videoproducer.capture.C104530af.C104531a.CAMERA_1     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.C173983.<clinit>():void");
        }
    }

    private CameraCaptureSingleton(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.mExpectFrontCamera = atomicBoolean;
        this.mOESTextureId = -1;
        this.mEnableTapToFocus = false;
        this.mEnableZoom = false;
        this.mZoomPercent = 0.0f;
        this.mExposureCompensation = 0.0f;
        this.mCameraRotation = Rotation.NORMAL;
        this.mIsFirstFrameCaptured = false;
        this.mIsZoomSupported = false;
        this.mIsTorchSupported = false;
        this.mIsFocusPositionInPreviewSupported = false;
        this.mIsCameraAutoFocusFaceModeSupported = false;
        this.mMaxZoomLevel = 0;
        this.mIsCameraInRestarting = false;
        this.mIsCameraInSwitching = false;
        this.mServerConfig = null;
        this.mRestartCameraRunnable = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
                r0 = r4.f47180a;
             */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = "CameraCaptureSingleton"
                    java.lang.String r1 = "restart camera runnable."
                    com.tencent.liteav.base.util.LiteavLog.m16901i(r0, r1)
                    com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton r1 = com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.this
                    r2 = 1
                    boolean unused = r1.mIsCameraInRestarting = r2
                    int r1 = com.tencent.liteav.base.system.LiteavSystemInfo.getAppBackgroundState()
                    if (r1 != r2) goto L_0x0019
                    java.lang.String r1 = "not in Foreground"
                    com.tencent.liteav.base.util.LiteavLog.m16901i(r0, r1)
                    goto L_0x002c
                L_0x0019:
                    com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton r0 = com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.this
                    com.tencent.liteav.videoproducer.capture.ad r0 = r0.mCameraController
                    if (r0 != 0) goto L_0x002c
                    com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton r0 = com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.this
                    com.tencent.liteav.videoproducer.capture.CameraCaptureParams r1 = r0.mCurrentCaptureParams
                    if (r1 == 0) goto L_0x002c
                    boolean r0 = r0.openCamera(r1)
                    goto L_0x002d
                L_0x002c:
                    r0 = 0
                L_0x002d:
                    if (r0 != 0) goto L_0x0040
                    com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton r0 = com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.this
                    com.tencent.liteav.base.util.l r0 = r0.mSequenceTaskRunner
                    com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton r1 = com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.this
                    java.lang.Runnable r1 = r1.mRestartCameraRunnable
                    r2 = 2000(0x7d0, double:9.88E-321)
                    r0.mo19370a(r1, r2)
                L_0x0040:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton.C173961.run():void");
            }
        };
        this.mSwitchToCamera1Runnable = new Runnable() {
            public final void run() {
                boolean z;
                LiteavLog.m16901i(CameraCaptureSingleton.TAG, "switch to camera1 runnable.");
                boolean unused = CameraCaptureSingleton.this.mIsCameraInSwitching = true;
                if (LiteavSystemInfo.getAppBackgroundState() == 1) {
                    LiteavLog.m16901i(CameraCaptureSingleton.TAG, "not in Foreground");
                    z = false;
                } else {
                    CameraCaptureSingleton cameraCaptureSingleton = CameraCaptureSingleton.this;
                    z = cameraCaptureSingleton.openCamera(cameraCaptureSingleton.mCurrentCaptureParams);
                }
                if (!z) {
                    CameraCaptureSingleton.this.mSequenceTaskRunner.mo19370a(CameraCaptureSingleton.this.mSwitchToCamera1Runnable, 1000);
                }
            }
        };
        this.mSequenceTaskRunner = new C17118l();
        atomicBoolean.set(true);
    }

    private void checkFirstFrameCaptured() {
        if (!this.mIsFirstFrameCaptured) {
            this.mIsFirstFrameCaptured = true;
            LiteavLog.m16896d(TAG, "camera capture first frame.");
        }
    }

    private void closeCamera() {
        LiteavLog.m16901i(TAG, "closeCamera");
        try {
            C17404ad adVar = this.mCameraController;
            if (adVar != null) {
                adVar.mo20546a();
            }
        } catch (Exception e) {
            LiteavLog.m16898e(TAG, "closeCamera fail, Exception:".concat(String.valueOf(e)));
        } catch (Throwable th) {
            this.mCameraRotation = Rotation.NORMAL;
            this.mCameraController = null;
            this.mMaxZoomLevel = 0;
            throw th;
        }
        this.mCameraRotation = Rotation.NORMAL;
        this.mCameraController = null;
        this.mMaxZoomLevel = 0;
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        OpenGlUtils.deleteTexture(this.mOESTextureId);
        this.mOESTextureId = -1;
        this.mPixelFrame = null;
        this.mIsFirstFrameCaptured = false;
    }

    private C17404ad createCameraController(C104530af.C104531a aVar) {
        C17404ad adVar;
        int i = C173983.f47182a[aVar.ordinal()];
        if (i != 1) {
            adVar = i != 2 ? new C104526a() : new C104534a(this.mSequenceTaskRunner);
        } else {
            Object obj = null;
            try {
                obj = Class.forName("com.tencent.liteav.videoengine.demo.mock.camera.MockCameraController").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
            }
            adVar = (C17404ad) obj;
        }
        if (adVar != null) {
            adVar.mo20549a(this.mServerConfig);
        }
        LiteavLog.m16901i(TAG, "createCameraController, CameraAPIType:" + aVar + ", return camera controller: " + adVar);
        return adVar;
    }

    public static CameraCaptureSingleton getInstance() {
        if (sInstance == null) {
            synchronized (CameraCaptureSingleton.class) {
                if (sInstance == null) {
                    sInstance = new CameraCaptureSingleton(ContextUtils.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private void handleCameraStartFailed() {
        LiteavLog.m16900e(TAG, "camera start failed. params: %s", this.mCurrentCaptureParams);
        C17404ad adVar = this.mCameraController;
        if (adVar != null) {
            adVar.mo20546a();
        }
        this.mCameraController = null;
        if (this.mIsCameraInRestarting) {
            this.mSequenceTaskRunner.mo19370a(this.mRestartCameraRunnable, 2000);
        } else if (this.mIsCameraInSwitching) {
            this.mSequenceTaskRunner.mo19370a(this.mSwitchToCamera1Runnable, 1000);
        } else {
            C104530af.C104531a a = this.mCameraSupervisor.mo147209a();
            C104530af afVar = this.mCameraSupervisor;
            if (afVar.f309843a == C104530af.C104531a.CAMERA_2) {
                afVar.f309845c = true;
            }
            if (a != afVar.mo147209a()) {
                LiteavLog.m16905w(TAG, "camera switch from " + a + " to " + this.mCameraSupervisor.mo147209a());
                this.mSequenceTaskRunner.mo19370a(this.mSwitchToCamera1Runnable, 1000);
                return;
            }
            this.mListenerManager.mo20533a(false);
        }
    }

    private void handleCameraStartSuccess() {
        if (this.mCameraController == null || this.mSurfaceTexture == null) {
            LiteavLog.m16898e(TAG, "camera start success, but mCameraController or mSurfaceTexture is null.");
            return;
        }
        LiteavLog.m16902i(TAG, "camera start success. params: %s", this.mCurrentCaptureParams);
        this.mCameraRotation = this.mCameraController.mo20553b();
        this.mIsZoomSupported = this.mCameraController.mo20558e();
        this.mIsTorchSupported = this.mCameraController.mo20559f();
        this.mIsCameraAutoFocusFaceModeSupported = this.mCameraController.mo20560g();
        this.mIsFocusPositionInPreviewSupported = this.mCameraController.mo20561h();
        this.mMaxZoomLevel = this.mCameraController.mo20556c();
        C104507p d = this.mCameraController.mo20557d();
        Rotation rotation = this.mCameraRotation;
        Object obj = this.mSharedContext;
        if (obj == null) {
            obj = this.mEGLCore.mo147198c();
        }
        this.mPixelFrame = initOutputPixelFrame(d, rotation, obj, this.mOESTextureId);
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mListenerManager.mo20533a(true);
        this.mIsCameraInRestarting = false;
        this.mIsCameraInSwitching = false;
    }

    private void initGLComponents(Object obj) {
        if (this.mEGLCore == null) {
            this.mEGLCore = new C104516e();
            if (this.mTextureHolderPool == null) {
                this.mTextureHolderPool = new C17237l();
            }
            try {
                this.mEGLCore.mo147196a(obj, (Surface) null, 128, 128);
                this.mEGLCore.mo147195a();
                this.mSharedContext = obj;
            } catch (C104518g e) {
                LiteavLog.m16899e(TAG, "initializeEGL failed.", (Throwable) e);
                this.mListenerManager.mo20531a();
                this.mEGLCore = null;
            }
            if (this.mEGLCore != null) {
                this.mGLTexturePool = new C17223e();
            }
        }
    }

    private static PixelFrame initOutputPixelFrame(C104507p pVar, Rotation rotation, Object obj, int i) {
        PixelFrame pixelFrame = new PixelFrame();
        if (rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270) {
            pixelFrame.setWidth(pVar.f309737b);
            pixelFrame.setHeight(pVar.f309736a);
        } else {
            pixelFrame.setWidth(pVar.f309736a);
            pixelFrame.setHeight(pVar.f309737b);
        }
        pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.TEXTURE_OES);
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        pixelFrame.setRotation(Rotation.NORMAL);
        pixelFrame.setGLContext(obj);
        pixelFrame.setTextureId(i);
        return pixelFrame;
    }

    private boolean isNeedRestartCamera(CameraCaptureParams cameraCaptureParams) {
        boolean z;
        boolean z2;
        Boolean bool = cameraCaptureParams.f47179a;
        CameraCaptureParams cameraCaptureParams2 = this.mCurrentCaptureParams;
        if (bool != cameraCaptureParams2.f47179a) {
            cameraCaptureParams2.f47179a = bool;
            cameraCaptureParams2.f47184c = cameraCaptureParams.f47184c;
            cameraCaptureParams2.f47185d = cameraCaptureParams.f47185d;
            z2 = true;
            z = true;
        } else {
            C17404ad adVar = this.mCameraController;
            if (adVar == null) {
                z2 = false;
            } else {
                z2 = adVar.mo20551a(cameraCaptureParams.f47184c, cameraCaptureParams.f47185d, this.mListenerManager.mo20572b() <= 1);
            }
            if (!z2) {
                CameraCaptureParams cameraCaptureParams3 = this.mCurrentCaptureParams;
                cameraCaptureParams3.f47184c = cameraCaptureParams.f47184c;
                cameraCaptureParams3.f47185d = cameraCaptureParams.f47185d;
            }
            z = false;
        }
        if ((this.mListenerManager.mo20572b() <= 1 && this.mCurrentCaptureParams.f47183b != cameraCaptureParams.f47183b) || (this.mListenerManager.mo20572b() > 1 && this.mCurrentCaptureParams.f47183b < cameraCaptureParams.f47183b)) {
            this.mCurrentCaptureParams.f47183b = cameraCaptureParams.f47183b;
            z = true;
        }
        return z || !z2;
    }

    public static /* synthetic */ void lambda$enableCameraZoom$6(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        cameraCaptureSingleton.mEnableZoom = z;
        cameraCaptureSingleton.mListenerManager.mo20536d(z);
    }

    public static /* synthetic */ void lambda$enableTapToFocus$4(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        cameraCaptureSingleton.mEnableTapToFocus = z;
        C17404ad adVar = cameraCaptureSingleton.mCameraController;
        if (adVar != null) {
            adVar.mo20555b(z);
        }
        cameraCaptureSingleton.mListenerManager.mo20535c(z);
    }

    public static /* synthetic */ void lambda$onCameraError$10(CameraCaptureSingleton cameraCaptureSingleton, C17404ad adVar) {
        C17404ad adVar2 = cameraCaptureSingleton.mCameraController;
        if (adVar2 != null && adVar2 == adVar) {
            LiteavLog.m16905w(TAG, "VideoCapture: camera error");
            cameraCaptureSingleton.closeCamera();
            cameraCaptureSingleton.mSequenceTaskRunner.mo19370a(cameraCaptureSingleton.mRestartCameraRunnable, 2000);
        }
    }

    public static /* synthetic */ void lambda$onFrameAvailable$11(CameraCaptureSingleton cameraCaptureSingleton, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = cameraCaptureSingleton.mSurfaceTexture;
        if (surfaceTexture2 == null || surfaceTexture != surfaceTexture2) {
            LiteavLog.m16901i(TAG, "mSurfaceTexture= " + cameraCaptureSingleton.mSurfaceTexture + " ,surfaceTexture= " + surfaceTexture);
        } else if (cameraCaptureSingleton.makeCurrent()) {
            cameraCaptureSingleton.checkFirstFrameCaptured();
            cameraCaptureSingleton.onCaptureFrameAvailable();
        }
    }

    public static /* synthetic */ void lambda$setExposureCompensation$9(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        cameraCaptureSingleton.mExposureCompensation = f;
        C17404ad adVar = cameraCaptureSingleton.mCameraController;
        if (adVar != null) {
            adVar.mo20554b(f);
        }
    }

    public static /* synthetic */ void lambda$setServerConfig$1(CameraCaptureSingleton cameraCaptureSingleton, ServerVideoProducerConfig serverVideoProducerConfig) {
        cameraCaptureSingleton.mServerConfig = serverVideoProducerConfig;
        C104530af afVar = cameraCaptureSingleton.mCameraSupervisor;
        int camera2SupportMinApiLevel = serverVideoProducerConfig.getCamera2SupportMinApiLevel();
        afVar.f309844b = camera2SupportMinApiLevel;
        LiteavLog.m16901i("CameraSupervisor", "setCamera2SupportMinApiLevel apiLevel:".concat(String.valueOf(camera2SupportMinApiLevel)));
        LiteavLog.m16901i(TAG, "setServerConfig minApiLevel:" + serverVideoProducerConfig.getCamera2SupportMinApiLevel());
    }

    public static /* synthetic */ void lambda$setZoomLevel$7(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        int i = cameraCaptureSingleton.mMaxZoomLevel;
        if (i <= 0) {
            LiteavLog.m16905w(TAG, "setZoomLevel maxZoomLevel=".concat(String.valueOf(i)));
        } else {
            cameraCaptureSingleton.setZoomInternal(f / ((float) i));
        }
    }

    public static /* synthetic */ void lambda$start$12(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.C17399a aVar, CameraCaptureParams cameraCaptureParams) {
        cameraCaptureSingleton.mListenerManager.mo20571a(aVar);
        if (cameraCaptureSingleton.mEGLCore == null || cameraCaptureSingleton.mCurrentCaptureParams == null) {
            cameraCaptureSingleton.initGLComponents(C104533au.m139873a().mo147211b());
            cameraCaptureSingleton.openCamera(cameraCaptureParams);
            return;
        }
        LiteavLog.m16901i(TAG, "capture source has already started!");
        cameraCaptureSingleton.updateParamsInternal(cameraCaptureParams);
    }

    public static /* synthetic */ void lambda$startAutoFocusAtPosition$5(CameraCaptureSingleton cameraCaptureSingleton, int i, int i2) {
        C17404ad adVar;
        if (cameraCaptureSingleton.mEnableTapToFocus && (adVar = cameraCaptureSingleton.mCameraController) != null) {
            adVar.mo20548a(i, i2);
        }
    }

    public static /* synthetic */ void lambda$stop$13(CameraCaptureSingleton cameraCaptureSingleton) {
        LiteavLog.m16901i(TAG, "stop listener count: " + cameraCaptureSingleton.mListenerManager.mo20572b());
        if (cameraCaptureSingleton.mListenerManager.mo20572b() == 0) {
            cameraCaptureSingleton.closeCamera();
            cameraCaptureSingleton.mZoomPercent = 0.0f;
            cameraCaptureSingleton.mCurrentCaptureParams = null;
            cameraCaptureSingleton.uninitGLComponents();
        }
    }

    public static /* synthetic */ void lambda$switchCamera$2(CameraCaptureSingleton cameraCaptureSingleton) {
        boolean z = cameraCaptureSingleton.mExpectFrontCamera.get();
        CameraCaptureParams cameraCaptureParams = cameraCaptureSingleton.mCurrentCaptureParams;
        if (cameraCaptureParams != null && cameraCaptureParams.f47179a.booleanValue() != z) {
            cameraCaptureSingleton.closeCamera();
            cameraCaptureSingleton.mZoomPercent = 0.0f;
            cameraCaptureSingleton.mCurrentCaptureParams.f47179a = Boolean.valueOf(z);
            cameraCaptureSingleton.openCamera(cameraCaptureSingleton.mCurrentCaptureParams);
        }
    }

    public static /* synthetic */ void lambda$turnOnTorch$3(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        C17404ad adVar = cameraCaptureSingleton.mCameraController;
        if (adVar != null) {
            adVar.mo20550a(z);
        }
    }

    public static /* synthetic */ void lambda$updateParams$15(CameraCaptureSingleton cameraCaptureSingleton, CameraCaptureParams cameraCaptureParams) {
        if (cameraCaptureSingleton.mEGLCore != null && cameraCaptureSingleton.mCurrentCaptureParams != null) {
            LiteavLog.m16901i(TAG, "capture source has already started!");
            cameraCaptureSingleton.updateParamsInternal(cameraCaptureParams);
        }
    }

    private void onCaptureFrameAvailable() {
        C17237l lVar;
        if (this.mGLTexturePool == null || (lVar = this.mTextureHolderPool) == null) {
            LiteavLog.m16905w(TAG, "onCaptureFrameAvailable mGLTexturePool:" + this.mGLTexturePool + " mTextureHolderPool:" + this.mTextureHolderPool);
            return;
        }
        C17237l.C17239b bVar = null;
        try {
            bVar = (C17237l.C17239b) lVar.mo20203a();
        } catch (InterruptedException unused) {
        }
        if (this.mPixelFrame.getMatrix() == null) {
            this.mPixelFrame.setMatrix(this.mMatrix);
        }
        try {
            this.mSurfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(this.mMatrix);
        } catch (Exception e) {
            LiteavLog.m16905w(TAG, "updateTexImage exception: ".concat(String.valueOf(e)));
        }
        bVar.mo20215a(36197, this.mOESTextureId, this.mPixelFrame.getWidth(), this.mPixelFrame.getHeight());
        PixelFrame a = bVar.mo20196a(this.mPixelFrame.getGLContext());
        a.setMirrorHorizontal(isFrontCamera());
        a.setMatrix(this.mMatrix);
        a.setTimestamp(TimeUtil.m16909a());
        this.mListenerManager.mo20532a(this, a);
        bVar.release();
        a.release();
    }

    /* access modifiers changed from: private */
    public boolean openCamera(CameraCaptureParams cameraCaptureParams) {
        if (this.mCameraController != null) {
            LiteavLog.m16898e(TAG, "camera is opened, you should Stop it first.");
            return true;
        }
        boolean openCameraInternal = openCameraInternal(cameraCaptureParams);
        if (openCameraInternal) {
            handleCameraStartSuccess();
        } else {
            handleCameraStartFailed();
        }
        return openCameraInternal;
    }

    private boolean openCameraInternal(CameraCaptureParams cameraCaptureParams) {
        if (!makeCurrent()) {
            LiteavLog.m16898e(TAG, "openCameraInternal: set opengl context fail.");
            return false;
        }
        this.mOESTextureId = OpenGlUtils.generateTextureOES();
        this.mSurfaceTexture = new SurfaceTexture(this.mOESTextureId);
        this.mCameraController = createCameraController(this.mCameraSupervisor.mo147209a());
        if (cameraCaptureParams.f47179a == null) {
            cameraCaptureParams.f47179a = Boolean.valueOf(this.mExpectFrontCamera.get());
            LiteavLog.m16905w(TAG, "openCameraInternal frontCamera not set, use expect front camera:" + cameraCaptureParams.f47179a);
        }
        this.mCurrentCaptureParams = cameraCaptureParams;
        this.mCameraController.mo20555b(this.mEnableTapToFocus);
        this.mCameraController.mo20554b(this.mExposureCompensation);
        this.mCameraController.mo20547a(this.mZoomPercent);
        this.mListenerManager.mo20535c(this.mEnableTapToFocus);
        this.mListenerManager.mo20536d(this.mEnableZoom);
        return this.mCameraController.mo20552a(this.mCurrentCaptureParams, this.mSurfaceTexture, (C104529ae) this);
    }

    /* access modifiers changed from: private */
    public void setZoomInternal(float f) {
        C17404ad adVar;
        LiteavLog.m16901i(TAG, "setZoomInternal ".concat(String.valueOf(f)));
        if (((double) Math.abs(this.mZoomPercent - f)) >= 0.001d && (adVar = this.mCameraController) != null) {
            this.mZoomPercent = f;
            adVar.mo20547a(f);
        }
    }

    private void updateParamsInternal(CameraCaptureParams cameraCaptureParams) {
        if (cameraCaptureParams.f47179a == null) {
            cameraCaptureParams.f47179a = this.mCurrentCaptureParams.f47179a;
            LiteavLog.m16901i(TAG, "params not set frontCamera, use mCurrentCaptureParams frontCamera:" + this.mCurrentCaptureParams.f47179a);
        }
        if (isNeedRestartCamera(cameraCaptureParams)) {
            LiteavLog.m16901i(TAG, "reopen camera params: ".concat(String.valueOf(cameraCaptureParams)));
            updateCamera(cameraCaptureParams);
        }
    }

    public void enableCameraZoom(boolean z) {
        LiteavLog.m16901i(TAG, "enableCameraZoom ".concat(String.valueOf(z)));
        runInGLThread(C17452p.m17531a(this, z));
    }

    public void enableMockCamera(boolean z) {
        this.mCameraSupervisor.f309846d = z;
    }

    public void enableTapToFocus(boolean z) {
        LiteavLog.m16901i(TAG, "enableTapToFocus ".concat(String.valueOf(z)));
        runInGLThread(C17450n.m17529a(this, z));
    }

    public C104530af.C104531a getCameraAPIType() {
        return this.mCameraSupervisor.mo147209a();
    }

    public Rotation getCameraRotation() {
        return this.mCameraRotation;
    }

    public int getMaxZoomLevel() {
        return this.mMaxZoomLevel;
    }

    public boolean isAutoFocusEnabled() {
        return !this.mEnableTapToFocus;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.mIsCameraAutoFocusFaceModeSupported;
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.mIsFocusPositionInPreviewSupported;
    }

    public boolean isFrontCamera() {
        Boolean bool;
        CameraCaptureParams cameraCaptureParams = this.mCurrentCaptureParams;
        if (cameraCaptureParams == null || (bool = cameraCaptureParams.f47179a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isTorchSupported() {
        return this.mIsTorchSupported;
    }

    public boolean isZoomSupported() {
        return this.mIsZoomSupported;
    }

    public boolean makeCurrent() {
        C104516e eVar = this.mEGLCore;
        if (eVar == null) {
            LiteavLog.m16898e(TAG, "makeCurrent on mEGLCore is null");
            return false;
        }
        try {
            eVar.mo147195a();
            return true;
        } catch (C104518g e) {
            LiteavLog.m16899e(TAG, "make current failed.", (Throwable) e);
            this.mListenerManager.mo20531a();
            return false;
        }
    }

    public void onCameraError(C17404ad adVar) {
        runInGLThread(C17440d.m17519a(this, adVar));
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        runInGLThread(C17441e.m17520a(this, surfaceTexture));
    }

    public void pause() {
        LiteavLog.m16901i(TAG, "pause");
        runInGLThread(C17444h.m17523a(this));
    }

    public void pauseInternal() {
        this.mPausedCount++;
        int b = this.mListenerManager.mo20572b();
        LiteavLog.m16901i(TAG, "pauseInternal paused cnt= " + this.mPausedCount + " , listener cnt=" + b);
        if (this.mPausedCount > b) {
            this.mPausedCount = b;
        }
        if (b != this.mPausedCount) {
            LiteavLog.m16901i(TAG, "pauseInternal listeners is not zero.");
        } else {
            closeCamera();
        }
    }

    public void removeListener(CaptureSourceInterface.C17399a aVar) {
        runInGLThread(C17425b.m17489a(this, aVar));
    }

    public void resume() {
        LiteavLog.m16901i(TAG, "resume");
        runInGLThread(C17445i.m17524a(this));
    }

    public void resumeInternal(CameraCaptureParams cameraCaptureParams) {
        LiteavLog.m16902i(TAG, "resumeInternal pausedCount %d, listeners size = %d", Integer.valueOf(this.mPausedCount), Integer.valueOf(this.mListenerManager.mo20572b()));
        if (this.mListenerManager.mo20572b() == this.mPausedCount) {
            openCamera(cameraCaptureParams);
        }
        int i = this.mPausedCount - 1;
        this.mPausedCount = i;
        if (i < 0) {
            this.mPausedCount = 0;
        }
    }

    public void runInGLThread(Runnable runnable) {
        this.mSequenceTaskRunner.mo19369a(runnable);
    }

    public void setExposureCompensation(float f) {
        LiteavLog.m16901i(TAG, "setExposureCompensation ".concat(String.valueOf(f)));
        runInGLThread(C17439c.m17518a(this, f));
    }

    public void setPercentOfMaxZoomLevel(float f) {
        runInGLThread(C17454r.m17533a(this, f));
    }

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
        runInGLThread(C17447k.m17526a(this, serverVideoProducerConfig));
    }

    public void setZoomLevel(float f) {
        LiteavLog.m16901i(TAG, "setZoomLevel ".concat(String.valueOf(f)));
        runInGLThread(C17453q.m17532a(this, f));
    }

    public void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar) {
        LiteavLog.m16901i(TAG, "Start ".concat(String.valueOf(obj)));
        runInGLThread(C17442f.m17521a(this, aVar, new CameraCaptureParams((CameraCaptureParams) captureParams)));
    }

    public void startAutoFocusAtPosition(int i, int i2) {
        LiteavLog.m16901i(TAG, "startAutoFocusAtPosition " + i + ", " + i2);
        runInGLThread(C17451o.m17530a(this, i, i2));
    }

    public void stop() {
        LiteavLog.m16901i(TAG, "Stop");
        runInGLThread(C17443g.m17522a(this));
    }

    public void switchCamera(boolean z) {
        LiteavLog.m16901i(TAG, "switchCamera ".concat(String.valueOf(z)));
        this.mExpectFrontCamera.set(z);
        runInGLThread(C17448l.m17527a(this));
    }

    public void turnOnTorch(boolean z) {
        LiteavLog.m16901i(TAG, "turnOnTorch ".concat(String.valueOf(z)));
        runInGLThread(C17449m.m17528a(this, z));
    }

    public void uninitGLComponents() {
        if (this.mEGLCore != null) {
            C17237l lVar = this.mTextureHolderPool;
            if (lVar != null) {
                lVar.mo20205b();
                this.mTextureHolderPool = null;
            }
            try {
                this.mEGLCore.mo147195a();
                C17223e eVar = this.mGLTexturePool;
                if (eVar != null) {
                    eVar.mo20187b();
                    this.mGLTexturePool = null;
                }
            } catch (C104518g e) {
                LiteavLog.m16899e(TAG, "EGLCore destroy failed.", (Throwable) e);
            }
            this.mSharedContext = null;
            C104516e.m139822a(this.mEGLCore);
            this.mEGLCore = null;
            this.mSequenceTaskRunner.mo19372c(this.mRestartCameraRunnable);
            this.mSequenceTaskRunner.mo19372c(this.mSwitchToCamera1Runnable);
        }
    }

    public void updateCamera(CameraCaptureParams cameraCaptureParams) {
        closeCamera();
        openCamera(cameraCaptureParams);
    }

    public void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
        CameraCaptureParams cameraCaptureParams = new CameraCaptureParams((CameraCaptureParams) captureParams);
        LiteavLog.m16901i(TAG, "updateParams");
        runInGLThread(C17446j.m17525a(this, cameraCaptureParams));
    }
}
