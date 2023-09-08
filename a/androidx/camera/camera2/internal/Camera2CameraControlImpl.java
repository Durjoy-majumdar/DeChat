package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p1167z8.C112608f;
import p202m2.C117512b;

public class Camera2CameraControlImpl implements CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final String TAG = "Camera2CameraControlImp";
    public static final String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final AeFpsRange mAeFpsRange;
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final Camera2CapturePipeline mCamera2CapturePipeline;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    public final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;
    private volatile C112608f<Void> mFlashModeChangeSessionUpdateFuture;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final Object mLock;
    private final AtomicLong mNextSessionUpdateId;
    public final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;
    private int mUseCount;
    private final ZoomControl mZoomControl;
    public ZslControl mZslControl;

    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        public Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();
        public Set<CameraCaptureCallback> mCallbacks = new HashSet();

        public void addCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        public void onCaptureCancelled() {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new Camera2CameraControlImpl$CameraCaptureCallbackSet$$b(next));
                } catch (RejectedExecutionException e) {
                    Logger.m15474e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new Camera2CameraControlImpl$CameraCaptureCallbackSet$$c(next, cameraCaptureResult));
                } catch (RejectedExecutionException e) {
                    Logger.m15474e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new Camera2CameraControlImpl$CameraCaptureCallbackSet$$a(next, cameraCaptureFailure));
                } catch (RejectedExecutionException e) {
                    Logger.m15474e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void removeCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        public final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(Executor executor) {
            this.mExecutor = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$0(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener next : this.mResultListeners) {
                if (next.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                this.mResultListeners.removeAll(hashSet);
            }
        }

        public void addListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Camera2CameraControlImpl$CameraControlSessionCallback$$a(this, totalCaptureResult));
        }

        public void removeListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    public interface CaptureResultListener {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new Quirks(new ArrayList()));
    }

    private int getSupportedAwbMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i, iArr) ? i : isModeInList(1, iArr) ? 1 : 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private boolean isModeInList(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((androidx.camera.core.impl.TagBundle) r4).getTag(TAG_SESSION_UPDATE_ID);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isSessionUpdated(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof androidx.camera.core.impl.TagBundle
            if (r0 == 0) goto L_0x002b
            androidx.camera.core.impl.TagBundle r4 = (androidx.camera.core.impl.TagBundle) r4
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.getTag(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0021
            return r1
        L_0x0021:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            r4 = 1
            return r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addInteropConfig$1() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSessionCameraCaptureCallback$8(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearInteropConfig$2() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        addCaptureResultListener(this.mCamera2CameraControl.getCaptureRequestListener());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSessionCameraCaptureCallback$9(CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C112608f lambda$submitStillCaptureRequests$5(List list, int i, int i2, int i3, Void voidR) {
        return this.mCamera2CapturePipeline.submitStillCaptures(list, i, i2, i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionConfigAsync$6(C117512b.C117513a aVar) {
        Futures.propagate(waitForSessionUpdateId(updateSessionConfigSynchronous()), aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateSessionConfigAsync$7(C117512b.C117513a aVar) {
        this.mExecutor.execute(new Camera2CameraControlImpl$$j(this, aVar));
        return "updateSessionConfigAsync";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$waitForSessionUpdateId$3(long j, C117512b.C117513a aVar, TotalCaptureResult totalCaptureResult) {
        if (!isSessionUpdated(totalCaptureResult, j)) {
            return false;
        }
        aVar.mo182231a(null);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$waitForSessionUpdateId$4(long j, C117512b.C117513a aVar) {
        addCaptureResultListener(new Camera2CameraControlImpl$$h(j, aVar));
        return "waitForSessionUpdateId:" + j;
    }

    private C112608f<Void> waitForSessionUpdateId(long j) {
        return C117512b.m165760a(new Camera2CameraControlImpl$$g(this, j));
    }

    public void addCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    public void addInteropConfig(Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new Camera2CameraControlImpl$$b(), CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Camera2CameraControlImpl$$f(this, executor, cameraCaptureCallback));
    }

    public void addZslConfig(Size size, SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(size, builder);
    }

    public C112608f<Void> cancelFocusAndMetering() {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new Camera2CameraControlImpl$$e(), CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i != 0) {
                this.mUseCount = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public C112608f<Void> enableTorch(boolean z) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z));
    }

    public void enableTorchInternal(boolean z) {
        this.mIsTorchOn = z;
        if (!z) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    public Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    public ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    public int getFlashMode() {
        return this.mFlashMode;
    }

    public FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        Object captureRequestTag = this.mCamera2CameraControl.getCamera2ImplConfig().getCaptureRequestTag((Object) null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.mSessionConfigBuilder.addTag(Camera2CameraControl.TAG_KEY, captureRequestTag);
        }
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073 A[LOOP:0: B:10:0x006d->B:12:0x0073, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.Config getSessionOptions() {
        /*
            r7 = this;
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            androidx.camera.camera2.internal.FocusMeteringControl r1 = r7.mFocusMeteringControl
            r1.addFocusMeteringOptions(r0)
            androidx.camera.camera2.internal.compat.workaround.AeFpsRange r1 = r7.mAeFpsRange
            r1.addAeFpsRangeOptions(r0)
            androidx.camera.camera2.internal.ZoomControl r1 = r7.mZoomControl
            r1.addZoomOption(r0)
            boolean r1 = r7.mIsTorchOn
            r3 = 2
            if (r1 == 0) goto L_0x002d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L_0x0033
        L_0x002d:
            int r1 = r7.mFlashMode
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0035
        L_0x0033:
            r1 = 1
            goto L_0x003d
        L_0x0035:
            r1 = 3
            goto L_0x003d
        L_0x0037:
            androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r1 = r7.mAutoFlashAEModeDisabler
            int r1 = r1.getCorrectedAeMode(r3)
        L_0x003d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.getSupportedAeMode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.getSupportedAwbMode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            androidx.camera.camera2.internal.ExposureControl r1 = r7.mExposureControl
            r1.setCaptureRequestOption(r0)
            androidx.camera.camera2.interop.Camera2CameraControl r1 = r7.mCamera2CameraControl
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.getCamera2ImplConfig()
            r1.getClass()
            java.util.Set r2 = androidx.camera.core.impl.C16539j.m15574e(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x006d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.Config$Option r3 = (androidx.camera.core.impl.Config.Option) r3
            androidx.camera.core.impl.MutableConfig r4 = r0.getMutableConfig()
            androidx.camera.core.impl.Config$OptionPriority r5 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            java.lang.Object r6 = androidx.camera.core.impl.C16539j.m15575f(r1, r3)
            r4.insertOption(r3, r5, r6)
            goto L_0x006d
        L_0x0087:
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraControlImpl.getSessionOptions():androidx.camera.core.impl.Config");
    }

    public int getSupportedAeMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i, iArr) ? i : isModeInList(1, iArr) ? 1 : 0;
    }

    public int getSupportedAfMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i, iArr)) {
            return i;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    public int getUseCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mUseCount;
        }
        return i;
    }

    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    public ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    public void removeCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Camera2CameraControlImpl$$a(this, cameraCaptureCallback));
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z) {
        this.mFocusMeteringControl.setActive(z);
        this.mZoomControl.setActive(z);
        this.mTorchControl.setActive(z);
        this.mExposureControl.setActive(z);
        this.mCamera2CameraControl.setActive(z);
    }

    public C112608f<Integer> setExposureCompensationIndex(int i) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : this.mExposureControl.setExposureCompensationIndex(i);
    }

    public void setFlashMode(int i) {
        if (!isControlInUse()) {
            Logger.m15477w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i;
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    public C112608f<Void> setLinearZoom(float f) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f));
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
        this.mFocusMeteringControl.setTemplate(i);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    public C112608f<Void> setZoomRatio(float f) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f));
    }

    public void setZslDisabled(boolean z) {
        this.mZslControl.setZslDisabled(z);
    }

    public C112608f<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    public C112608f<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i, int i2) {
        if (!isControlInUse()) {
            Logger.m15477w(TAG, "Camera is not active.");
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return FutureChain.from(this.mFlashModeChangeSessionUpdateFuture).transformAsync(new Camera2CameraControlImpl$$i(this, list, i, getFlashMode(), i2), this.mExecutor);
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new Camera2CameraControlImpl$$c(this));
    }

    public C112608f<Void> updateSessionConfigAsync() {
        return Futures.nonCancellationPropagating(C117512b.m165760a(new Camera2CameraControlImpl$$d(this)));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        this.mLock = new Object();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler();
        this.mNextSessionUpdateId = new AtomicLong(0);
        this.mFlashModeChangeSessionUpdateFuture = Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        if (Build.VERSION.SDK_INT >= 23) {
            this.mZslControl = new ZslControlImpl(cameraCharacteristicsCompat);
        } else {
            this.mZslControl = new ZslControlNoOpImpl();
        }
        this.mAeFpsRange = new AeFpsRange(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor);
        executor.execute(new Camera2CameraControlImpl$$k(this));
    }
}
