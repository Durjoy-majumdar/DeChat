package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.concurrent.Executor;

public final class CameraManagerCompat {
    private final Map<String, CameraCharacteristicsCompat> mCameraCharacteristicsMap = new ArrayMap(4);
    private final CameraManagerCompatImpl mImpl;

    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        private boolean mDisabled = false;
        private final Executor mExecutor;
        private final Object mLock = new Object();
        public final CameraManager.AvailabilityCallback mWrappedCallback;

        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAccessPrioritiesChanged$0() {
            ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.mWrappedCallback);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAvailable$1(String str) {
            this.mWrappedCallback.onCameraAvailable(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraUnavailable$2(String str) {
            this.mWrappedCallback.onCameraUnavailable(str);
        }

        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$a(this));
                }
            }
        }

        public void onCameraAvailable(String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$c(this, str));
                }
            }
        }

        public void onCameraUnavailable(String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$b(this, str));
                }
            }
        }

        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }
    }

    public interface CameraManagerCompatImpl {
        CameraCharacteristics getCameraCharacteristics(String str);

        String[] getCameraIdList();

        CameraManager getCameraManager();

        void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    public static CameraManagerCompat from(Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(String str) {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str));
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(10002, e.getMessage(), e);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public String[] getCameraIdList() {
        return this.mImpl.getCameraIdList();
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    public static CameraManagerCompat from(Context context, Handler handler) {
        return new CameraManagerCompat(C16491a.m15419a(context, handler));
    }

    public static CameraManagerCompat from(CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }
}
