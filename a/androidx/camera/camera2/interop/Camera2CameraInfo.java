package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.core.CameraInfo;
import java.util.Map;
import p329d3.C20434g;

public final class Camera2CameraInfo {
    private static final String TAG = "Camera2CameraInfo";
    private final Camera2CameraInfoImpl mCamera2CameraInfoImpl;

    public Camera2CameraInfo(Camera2CameraInfoImpl camera2CameraInfoImpl) {
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
    }

    public static CameraCharacteristics extractCameraCharacteristics(CameraInfo cameraInfo) {
        C20434g.m22021e(cameraInfo instanceof Camera2CameraInfoImpl, "CameraInfo does not contain any Camera2 information.");
        return ((Camera2CameraInfoImpl) cameraInfo).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }

    public static Camera2CameraInfo from(CameraInfo cameraInfo) {
        C20434g.m22018b(cameraInfo instanceof Camera2CameraInfoImpl, "CameraInfo doesn't contain Camera2 implementation.");
        return ((Camera2CameraInfoImpl) cameraInfo).getCamera2CameraInfo();
    }

    public <T> T getCameraCharacteristic(CameraCharacteristics.Key<T> key) {
        return this.mCamera2CameraInfoImpl.getCameraCharacteristicsCompat().get(key);
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        return this.mCamera2CameraInfoImpl.getCameraCharacteristicsMap();
    }

    public String getCameraId() {
        return this.mCamera2CameraInfoImpl.getCameraId();
    }
}
