package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.C0125s;

final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraUseCaseAdapter.CameraId cameraId;
    private final C0125s lifecycleOwner;

    public AutoValue_LifecycleCameraRepository_Key(C0125s sVar, CameraUseCaseAdapter.CameraId cameraId2) {
        if (sVar != null) {
            this.lifecycleOwner = sVar;
            if (cameraId2 != null) {
                this.cameraId = cameraId2;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.Key)) {
            return false;
        }
        LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
        return this.lifecycleOwner.equals(key.getLifecycleOwner()) && this.cameraId.equals(key.getCameraId());
    }

    public CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    public C0125s getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.lifecycleOwner + ", cameraId=" + this.cameraId + "}";
    }
}
