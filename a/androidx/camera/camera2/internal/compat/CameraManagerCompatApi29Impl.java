package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import j20.C117292a;
import java.util.concurrent.Executor;
import k20.C9556a;

class CameraManagerCompatApi29Impl extends CameraManagerCompatApi28Impl {
    public CameraManagerCompatApi29Impl(Context context) {
        super(context);
    }

    public CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.mCameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            CameraManager cameraManager = this.mCameraManager;
            C9556a aVar = new C9556a();
            aVar.mo10233c(stateCallback);
            aVar.mo10233c(executor);
            aVar.mo10233c(str);
            C117292a.m165364j(cameraManager, aVar.mo10232b(), "androidx/camera/camera2/internal/compat/CameraManagerCompatApi29Impl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
