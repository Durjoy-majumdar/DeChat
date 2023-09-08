package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

public class ExposureControl {
    private static final int DEFAULT_EXPOSURE_COMPENSATION = 0;
    private final Camera2CameraControlImpl mCameraControl;
    private final Executor mExecutor;
    private final ExposureStateImpl mExposureStateImpl;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mRunningCaptureResultListener;
    private C117512b.C117513a<Integer> mRunningCompleter;

    public ExposureControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCameraControl = camera2CameraControlImpl;
        this.mExposureStateImpl = new ExposureStateImpl(cameraCharacteristicsCompat, 0);
        this.mExecutor = executor;
    }

    private void clearRunningTask() {
        C117512b.C117513a<Integer> aVar = this.mRunningCompleter;
        if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.mRunningCompleter = null;
        }
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = this.mRunningCaptureResultListener;
        if (captureResultListener != null) {
            this.mCameraControl.removeCaptureResultListener(captureResultListener);
            this.mRunningCaptureResultListener = null;
        }
    }

    public static ExposureState getDefaultExposureState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return new ExposureStateImpl(cameraCharacteristicsCompat, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setExposureCompensationIndex$0(int i, C117512b.C117513a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i) {
                return false;
            }
            aVar.mo182231a(Integer.valueOf(i));
            return true;
        } else if (num2 == null || num2.intValue() != i) {
            return false;
        } else {
            aVar.mo182231a(Integer.valueOf(i));
            return true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setExposureCompensationIndex$1(C117512b.C117513a aVar, int i) {
        boolean z = false;
        if (!this.mIsActive) {
            this.mExposureStateImpl.setExposureCompensationIndex(0);
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        clearRunningTask();
        C20434g.m22021e(this.mRunningCompleter == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        if (this.mRunningCaptureResultListener == null) {
            z = true;
        }
        C20434g.m22021e(z, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        ExposureControl$$c exposureControl$$c = new ExposureControl$$c(i, aVar);
        this.mRunningCaptureResultListener = exposureControl$$c;
        this.mRunningCompleter = aVar;
        this.mCameraControl.addCaptureResultListener(exposureControl$$c);
        this.mCameraControl.updateSessionConfigSynchronous();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$setExposureCompensationIndex$2(int i, C117512b.C117513a aVar) {
        this.mExecutor.execute(new ExposureControl$$a(this, aVar, i));
        return "setExposureCompensationIndex[" + i + "]";
    }

    public ExposureState getExposureState() {
        return this.mExposureStateImpl;
    }

    public void setActive(boolean z) {
        if (z != this.mIsActive) {
            this.mIsActive = z;
            if (!z) {
                this.mExposureStateImpl.setExposureCompensationIndex(0);
                clearRunningTask();
            }
        }
    }

    public void setCaptureRequestOption(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.mExposureStateImpl.getExposureCompensationIndex()));
    }

    public C112608f<Integer> setExposureCompensationIndex(int i) {
        if (!this.mExposureStateImpl.isExposureCompensationSupported()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> exposureCompensationRange = this.mExposureStateImpl.getExposureCompensationRange();
        if (!exposureCompensationRange.contains(Integer.valueOf(i))) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Requested ExposureCompensation " + i + " is not within valid range [" + exposureCompensationRange.getUpper() + ".." + exposureCompensationRange.getLower() + "]"));
        }
        this.mExposureStateImpl.setExposureCompensationIndex(i);
        return Futures.nonCancellationPropagating(C117512b.m165760a(new ExposureControl$$b(this, i)));
    }
}
