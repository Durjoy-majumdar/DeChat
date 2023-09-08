package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

public final class CameraDeviceCompat {
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final CameraDeviceCompatImpl mImpl;

    public interface CameraDeviceCompatImpl {
        void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat);

        CameraDevice unwrap();
    }

    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
        private final Executor mExecutor;
        public final CameraDevice.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$3(CameraDevice cameraDevice) {
            this.mWrappedCallback.onClosed(cameraDevice);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onDisconnected$1(CameraDevice cameraDevice) {
            this.mWrappedCallback.onDisconnected(cameraDevice);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2(CameraDevice cameraDevice, int i) {
            this.mWrappedCallback.onError(cameraDevice, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpened$0(CameraDevice cameraDevice) {
            this.mWrappedCallback.onOpened(cameraDevice);
        }

        public void onClosed(CameraDevice cameraDevice) {
            this.mExecutor.execute(new CameraDeviceCompat$StateCallbackExecutorWrapper$$a(this, cameraDevice));
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            this.mExecutor.execute(new CameraDeviceCompat$StateCallbackExecutorWrapper$$b(this, cameraDevice));
        }

        public void onError(CameraDevice cameraDevice, int i) {
            this.mExecutor.execute(new CameraDeviceCompat$StateCallbackExecutorWrapper$$d(this, cameraDevice, i));
        }

        public void onOpened(CameraDevice cameraDevice) {
            this.mExecutor.execute(new CameraDeviceCompat$StateCallbackExecutorWrapper$$c(this, cameraDevice));
        }
    }

    private CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new CameraDeviceCompatApi28Impl(cameraDevice);
        } else if (i >= 24) {
            this.mImpl = CameraDeviceCompatApi24Impl.create(cameraDevice, handler);
        } else if (i >= 23) {
            this.mImpl = CameraDeviceCompatApi23Impl.create(cameraDevice, handler);
        } else {
            this.mImpl = CameraDeviceCompatBaseImpl.create(cameraDevice, handler);
        }
    }

    public static CameraDeviceCompat toCameraDeviceCompat(CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, MainThreadAsyncHandler.getInstance());
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) {
        this.mImpl.createCaptureSession(sessionConfigurationCompat);
    }

    public CameraDevice toCameraDevice() {
        return this.mImpl.unwrap();
    }

    public static CameraDeviceCompat toCameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }
}
