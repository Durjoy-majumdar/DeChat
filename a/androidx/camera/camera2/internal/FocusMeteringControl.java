package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;
import p202m2.C117512b;

class FocusMeteringControl {
    private static final MeteringRectangle[] EMPTY_RECTANGLES = new MeteringRectangle[0];
    private static final String TAG = "FocusMeteringControl";
    private MeteringRectangle[] mAeRects;
    private MeteringRectangle[] mAfRects;
    private ScheduledFuture<?> mAutoCancelHandle;
    private MeteringRectangle[] mAwbRects;
    private final Camera2CameraControlImpl mCameraControl;
    public Integer mCurrentAfState = 0;
    public final Executor mExecutor;
    public long mFocusTimeoutCounter = 0;
    private volatile boolean mIsActive = false;
    public boolean mIsAutoFocusCompleted = false;
    public boolean mIsFocusSuccessful = false;
    private boolean mIsInAfAutoMode = false;
    private final MeteringRegionCorrection mMeteringRegionCorrection;
    private volatile Rational mPreviewAspectRatio = null;
    public C117512b.C117513a<FocusMeteringResult> mRunningActionCompleter;
    public C117512b.C117513a<Void> mRunningCancelCompleter;
    private final ScheduledExecutorService mScheduler;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel = null;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus = null;
    private int mTemplate = 1;

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mRunningActionCompleter = null;
        this.mRunningCancelCompleter = null;
        this.mCameraControl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mMeteringRegionCorrection = new MeteringRegionCorrection(quirks);
    }

    private void completeActionFuture(boolean z) {
        C117512b.C117513a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.mo182231a(FocusMeteringResult.create(z));
            this.mRunningActionCompleter = null;
        }
    }

    private void completeCancelFuture() {
        C117512b.C117513a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.mo182231a(null);
            this.mRunningCancelCompleter = null;
        }
    }

    private void disableAutoCancel() {
        ScheduledFuture<?> scheduledFuture = this.mAutoCancelHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoCancelHandle = null;
        }
    }

    private void executeMeteringAction(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, FocusMeteringAction focusMeteringAction) {
        long j;
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        disableAutoCancel();
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr2;
        this.mAwbRects = meteringRectangleArr3;
        if (shouldTriggerAF()) {
            this.mIsInAfAutoMode = true;
            this.mIsAutoFocusCompleted = false;
            this.mIsFocusSuccessful = false;
            j = this.mCameraControl.updateSessionConfigSynchronous();
            triggerAf((C117512b.C117513a<CameraCaptureResult>) null, true);
        } else {
            this.mIsInAfAutoMode = false;
            this.mIsAutoFocusCompleted = true;
            this.mIsFocusSuccessful = false;
            j = this.mCameraControl.updateSessionConfigSynchronous();
        }
        this.mCurrentAfState = 0;
        FocusMeteringControl$$g focusMeteringControl$$g = new FocusMeteringControl$$g(this, isAfModeSupported(), j);
        this.mSessionListenerForFocus = focusMeteringControl$$g;
        this.mCameraControl.addCaptureResultListener(focusMeteringControl$$g);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            long j2 = this.mFocusTimeoutCounter + 1;
            this.mFocusTimeoutCounter = j2;
            this.mAutoCancelHandle = this.mScheduler.schedule(new FocusMeteringControl$$h(this, j2), focusMeteringAction.getAutoCancelDurationInMillis(), TimeUnit.MILLISECONDS);
        }
    }

    private void failActionFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        C117512b.C117513a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException(str));
            this.mRunningActionCompleter = null;
        }
    }

    private void failCancelFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForCancel);
        C117512b.C117513a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException(str));
            this.mRunningCancelCompleter = null;
        }
    }

    private Rational getDefaultAspectRatio() {
        if (this.mPreviewAspectRatio != null) {
            return this.mPreviewAspectRatio;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        return new Rational(cropSensorRegion.width(), cropSensorRegion.height());
    }

    private static PointF getFovAdjustedPoint(MeteringPoint meteringPoint, Rational rational, Rational rational2, int i, MeteringRegionCorrection meteringRegionCorrection) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                correctedPoint.y = (((float) ((((double) doubleValue) - 1.0d) / 2.0d)) + correctedPoint.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                correctedPoint.x = (((float) ((((double) doubleValue2) - 1.0d) / 2.0d)) + correctedPoint.x) * (1.0f / doubleValue2);
            }
        }
        return correctedPoint;
    }

    private static MeteringRectangle getMeteringRect(MeteringPoint meteringPoint, PointF pointF, Rect rect) {
        int width = (int) (((float) rect.left) + (pointF.x * ((float) rect.width())));
        int height = (int) (((float) rect.top) + (pointF.y * ((float) rect.height())));
        int size = ((int) (meteringPoint.getSize() * ((float) rect.width()))) / 2;
        int size2 = ((int) (meteringPoint.getSize() * ((float) rect.height()))) / 2;
        Rect rect2 = new Rect(width - size, height - size2, width + size, height + size2);
        rect2.left = rangeLimit(rect2.left, rect.right, rect.left);
        rect2.right = rangeLimit(rect2.right, rect.right, rect.left);
        rect2.top = rangeLimit(rect2.top, rect.bottom, rect.top);
        rect2.bottom = rangeLimit(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private List<MeteringRectangle> getMeteringRectangles(List<MeteringPoint> list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (MeteringPoint next : list) {
            if (arrayList.size() == i) {
                break;
            } else if (isValid(next)) {
                MeteringRectangle meteringRect = getMeteringRect(next, getFovAdjustedPoint(next, rational2, rational, i2, this.mMeteringRegionCorrection), rect);
                if (!(meteringRect.getWidth() == 0 || meteringRect.getHeight() == 0)) {
                    arrayList.add(meteringRect);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean isAfModeSupported() {
        return this.mCameraControl.getSupportedAfMode(1) == 1;
    }

    private static boolean isValid(MeteringPoint meteringPoint) {
        return meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$cancelFocusAndMetering$6(C117512b.C117513a aVar) {
        this.mExecutor.execute(new FocusMeteringControl$$b(this, aVar));
        return "cancelFocusAndMetering";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$cancelFocusAndMeteringInternal$7(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j)) {
            return false;
        }
        completeCancelFuture();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$executeMeteringAction$2(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (shouldTriggerAF()) {
            if (!z || num == null) {
                this.mIsFocusSuccessful = true;
                this.mIsAutoFocusCompleted = true;
            } else if (this.mCurrentAfState.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.mIsFocusSuccessful = true;
                    this.mIsAutoFocusCompleted = true;
                } else if (num.intValue() == 5) {
                    this.mIsFocusSuccessful = false;
                    this.mIsAutoFocusCompleted = true;
                }
            }
        }
        if (!this.mIsAutoFocusCompleted || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j)) {
            if (!this.mCurrentAfState.equals(num) && num != null) {
                this.mCurrentAfState = num;
            }
            return false;
        }
        completeActionFuture(this.mIsFocusSuccessful);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$3(long j) {
        if (j == this.mFocusTimeoutCounter) {
            cancelFocusAndMeteringWithoutAsyncResult();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$4(long j) {
        this.mExecutor.execute(new FocusMeteringControl$$e(this, j));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$startFocusAndMetering$1(FocusMeteringAction focusMeteringAction, C117512b.C117513a aVar) {
        this.mExecutor.execute(new FocusMeteringControl$$d(this, aVar, focusMeteringAction));
        return "startFocusAndMetering";
    }

    private static int rangeLimit(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    private boolean shouldTriggerAF() {
        return this.mAfRects.length > 0;
    }

    public void addFocusMeteringOptions(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.mCameraControl.getSupportedAfMode(this.mIsInAfAutoMode ? 1 : getDefaultAfMode())));
        MeteringRectangle[] meteringRectangleArr = this.mAfRects;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.mAeRects;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.mAwbRects;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void cancelAfAeTrigger(boolean z, boolean z2) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.mTemplate);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.addImplementationOptions(builder2.build());
            this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
    }

    public C112608f<Void> cancelFocusAndMetering() {
        return C117512b.m165760a(new FocusMeteringControl$$c(this));
    }

    /* renamed from: cancelFocusAndMeteringInternal */
    public void lambda$cancelFocusAndMetering$5(C117512b.C117513a<Void> aVar) {
        failCancelFuture("Cancelled by another cancelFocusAndMetering()");
        failActionFuture("Cancelled by cancelFocusAndMetering()");
        this.mRunningCancelCompleter = aVar;
        disableAutoCancel();
        if (shouldTriggerAF()) {
            cancelAfAeTrigger(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mIsInAfAutoMode = false;
        long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        if (this.mRunningCancelCompleter != null) {
            FocusMeteringControl$$f focusMeteringControl$$f = new FocusMeteringControl$$f(this, this.mCameraControl.getSupportedAfMode(getDefaultAfMode()), updateSessionConfigSynchronous);
            this.mSessionListenerForCancel = focusMeteringControl$$f;
            this.mCameraControl.addCaptureResultListener(focusMeteringControl$$f);
        }
    }

    public void cancelFocusAndMeteringWithoutAsyncResult() {
        lambda$cancelFocusAndMetering$5((C117512b.C117513a<Void>) null);
    }

    public int getDefaultAfMode() {
        return this.mTemplate != 3 ? 4 : 3;
    }

    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        Rect rect = cropSensorRegion;
        return !getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, rect, 1).isEmpty() || !getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, rect, 2).isEmpty() || !getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, rect, 4).isEmpty();
    }

    public void setActive(boolean z) {
        if (z != this.mIsActive) {
            this.mIsActive = z;
            if (!this.mIsActive) {
                cancelFocusAndMeteringWithoutAsyncResult();
            }
        }
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mPreviewAspectRatio = rational;
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
    }

    public C112608f<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return C117512b.m165760a(new FocusMeteringControl$$a(this, focusMeteringAction));
    }

    /* renamed from: startFocusAndMeteringInternal */
    public void lambda$startFocusAndMetering$0(C117512b.C117513a<FocusMeteringResult> aVar, FocusMeteringAction focusMeteringAction) {
        if (!this.mIsActive) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        Rational rational = defaultAspectRatio;
        Rect rect = cropSensorRegion;
        List<MeteringRectangle> meteringRectangles = getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), rational, rect, 1);
        List<MeteringRectangle> meteringRectangles2 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), rational, rect, 2);
        List<MeteringRectangle> meteringRectangles3 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), rational, rect, 4);
        if (!meteringRectangles.isEmpty() || !meteringRectangles2.isEmpty() || !meteringRectangles3.isEmpty()) {
            failActionFuture("Cancelled by another startFocusAndMetering()");
            failCancelFuture("Cancelled by another startFocusAndMetering()");
            disableAutoCancel();
            this.mRunningActionCompleter = aVar;
            MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
            executeMeteringAction((MeteringRectangle[]) meteringRectangles.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles2.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles3.toArray(meteringRectangleArr), focusMeteringAction);
            return;
        }
        aVar.mo182232b(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
    }

    public void triggerAePrecapture(final C117512b.C117513a<Void> aVar) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            builder.addImplementationOptions(builder2.build());
            builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                public void onCaptureCancelled() {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is closed"));
                    }
                }

                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182231a(null);
                    }
                }

                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182232b(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                    }
                }
            });
            this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        } else if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }

    public void triggerAf(final C117512b.C117513a<CameraCaptureResult> aVar, boolean z) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mCameraControl.getSupportedAeMode(1)));
            }
            builder.addImplementationOptions(builder2.build());
            builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                public void onCaptureCancelled() {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is closed"));
                    }
                }

                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182231a(cameraCaptureResult);
                    }
                }

                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    C117512b.C117513a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo182232b(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                    }
                }
            });
            this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        } else if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }
}
