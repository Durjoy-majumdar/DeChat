package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

class CameraCharacteristicsApi28Impl extends CameraCharacteristicsBaseImpl {
    public CameraCharacteristicsApi28Impl(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristics.getPhysicalCameraIds();
    }
}
