package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k20.C9556a;

class CameraManagerCompatBaseImpl implements CameraManagerCompat.CameraManagerCompatImpl {
    public final CameraManager mCameraManager;
    public final Object mObject;

    public static final class CameraManagerCompatParamsApi21 {
        public final Handler mCompatHandler;
        public final Map<CameraManager.AvailabilityCallback, CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap = new HashMap();

        public CameraManagerCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraManagerCompatBaseImpl(Context context, Object obj) {
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
        this.mObject = obj;
    }

    public static CameraManagerCompatBaseImpl create(Context context, Handler handler) {
        return new CameraManagerCompatBaseImpl(context, new CameraManagerCompatParamsApi21(handler));
    }

    public CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.mCameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public String[] getCameraIdList() {
        try {
            return this.mCameraManager.getCameraIdList();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public CameraManager getCameraManager() {
        return this.mCameraManager;
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback);
        CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
        try {
            CameraManager cameraManager = this.mCameraManager;
            Handler handler = cameraManagerCompatParamsApi21.mCompatHandler;
            C9556a aVar = new C9556a();
            aVar.mo10233c(handler);
            aVar.mo10233c(stateCallbackExecutorWrapper);
            aVar.mo10233c(str);
            C117292a.m165364j(cameraManager, aVar.mo10232b(), "androidx/camera/camera2/internal/compat/CameraManagerCompatBaseImpl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper = null;
            CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
            if (availabilityCallback != null) {
                synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                    availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.get(availabilityCallback);
                    if (availabilityCallbackExecutorWrapper == null) {
                        availabilityCallbackExecutorWrapper = new CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                        cameraManagerCompatParamsApi21.mWrapperMap.put(availabilityCallback, availabilityCallbackExecutorWrapper);
                    }
                }
            }
            this.mCameraManager.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.mCompatHandler);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (availabilityCallback != null) {
            CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        if (availabilityCallbackExecutorWrapper != null) {
            availabilityCallbackExecutorWrapper.setDisabled();
        }
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }
}
