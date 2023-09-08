package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Collections;
import java.util.Set;

class CameraCharacteristicsBaseImpl implements CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {
    public final CameraCharacteristics mCameraCharacteristics;

    public CameraCharacteristicsBaseImpl(CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    public <T> T get(CameraCharacteristics.Key<T> key) {
        return this.mCameraCharacteristics.get(key);
    }

    public Set<String> getPhysicalCameraIds() {
        return Collections.emptySet();
    }

    public CameraCharacteristics unwrap() {
        return this.mCameraCharacteristics;
    }
}
