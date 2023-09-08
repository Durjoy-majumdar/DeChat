package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;

final class TorchControl {
    public static final int DEFAULT_TORCH_STATE = 0;
    private static final String TAG = "TorchControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    public C117512b.C117513a<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    public boolean mTargetTorchEnabled;
    private final C54219z<Integer> mTorchState = new C54219z<>(0);

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(cameraCharacteristicsCompat);
        camera2CameraControlImpl.addCaptureResultListener(new TorchControl$$c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$enableTorch$2(boolean z, C117512b.C117513a aVar) {
        this.mExecutor.execute(new TorchControl$$a(this, aVar, z));
        return "enableTorch: " + z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(TotalCaptureResult totalCaptureResult) {
        if (this.mEnableTorchCompleter != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.mTargetTorchEnabled) {
                this.mEnableTorchCompleter.mo182231a(null);
                this.mEnableTorchCompleter = null;
            }
        }
        return false;
    }

    private <T> void setLiveDataValue(C54219z<T> zVar, T t) {
        if (Threads.isMainThread()) {
            zVar.setValue(t);
        } else {
            zVar.postValue(t);
        }
    }

    public C112608f<Void> enableTorch(boolean z) {
        if (!this.mHasFlashUnit) {
            Logger.m15471d(TAG, "Unable to enableTorch due to there is no flash unit.");
            return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
        return C117512b.m165760a(new TorchControl$$b(this, z));
    }

    /* renamed from: enableTorchInternal */
    public void lambda$enableTorch$1(C117512b.C117513a<Void> aVar, boolean z) {
        if (!this.mHasFlashUnit) {
            if (aVar != null) {
                aVar.mo182232b(new IllegalStateException("No flash unit"));
            }
        } else if (!this.mIsActive) {
            setLiveDataValue(this.mTorchState, 0);
            if (aVar != null) {
                aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.mTargetTorchEnabled = z;
            this.mCamera2CameraControlImpl.enableTorchInternal(z);
            setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
            C117512b.C117513a<Void> aVar2 = this.mEnableTorchCompleter;
            if (aVar2 != null) {
                aVar2.mo182232b(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.mEnableTorchCompleter = aVar;
        }
    }

    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    public void setActive(boolean z) {
        if (this.mIsActive != z) {
            this.mIsActive = z;
            if (!z) {
                if (this.mTargetTorchEnabled) {
                    this.mTargetTorchEnabled = false;
                    this.mCamera2CameraControlImpl.enableTorchInternal(false);
                    setLiveDataValue(this.mTorchState, 0);
                }
                C117512b.C117513a<Void> aVar = this.mEnableTorchCompleter;
                if (aVar != null) {
                    aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
                    this.mEnableTorchCompleter = null;
                }
            }
        }
    }
}
