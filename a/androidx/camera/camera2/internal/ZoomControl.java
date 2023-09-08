package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;

final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final String TAG = "ZoomControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new Camera2CameraControlImpl.CaptureResultListener() {
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };
    private final ZoomStateImpl mCurrentZoomState;
    private final Executor mExecutor;
    private boolean mIsActive = false;
    public final ZoomImpl mZoomImpl;
    private final C54219z<ZoomState> mZoomStateLiveData;

    public interface ZoomImpl {
        void addRequestOption(Camera2ImplConfig.Builder builder);

        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f, C117512b.C117513a<Void> aVar);
    }

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = createZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new C54219z<>(ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    private static ZoomImpl createZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAndroidRZoomSupported(cameraCharacteristicsCompat) ? new AndroidRZoomImpl(cameraCharacteristicsCompat) : new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    public static ZoomState getDefaultZoomState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return ImmutableZoomState.create(zoomStateImpl);
    }

    private static boolean isAndroidRZoomSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.VERSION.SDK_INT >= 30 && cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$setLinearZoom$3(ZoomState zoomState, C117512b.C117513a aVar) {
        this.mExecutor.execute(new ZoomControl$$b(this, aVar, zoomState));
        return "setLinearZoom";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$setZoomRatio$1(ZoomState zoomState, C117512b.C117513a aVar) {
        this.mExecutor.execute(new ZoomControl$$c(this, aVar, zoomState));
        return "setZoomRatio";
    }

    /* access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio */
    public void lambda$setZoomRatio$0(C117512b.C117513a<Void> aVar, ZoomState zoomState) {
        ZoomState create;
        if (!this.mIsActive) {
            synchronized (this.mCurrentZoomState) {
                this.mCurrentZoomState.setZoomRatio(1.0f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            }
            updateLiveData(create);
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        updateLiveData(zoomState);
        this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), aVar);
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    private void updateLiveData(ZoomState zoomState) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    public void addZoomOption(Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    public Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    public LiveData<ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }

    public void setActive(boolean z) {
        ZoomState create;
        if (this.mIsActive != z) {
            this.mIsActive = z;
            if (!z) {
                synchronized (this.mCurrentZoomState) {
                    this.mCurrentZoomState.setZoomRatio(1.0f);
                    create = ImmutableZoomState.create(this.mCurrentZoomState);
                }
                updateLiveData(create);
                this.mZoomImpl.resetZoom();
                this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
            }
        }
    }

    public C112608f<Void> setLinearZoom(float f) {
        ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return C117512b.m165760a(new ZoomControl$$d(this, create));
    }

    public C112608f<Void> setZoomRatio(float f) {
        ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return C117512b.m165760a(new ZoomControl$$a(this, create));
    }
}
