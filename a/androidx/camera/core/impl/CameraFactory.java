package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import java.util.Set;

public interface CameraFactory {

    public interface Provider {
        CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector);
    }

    Set<String> getAvailableCameraIds();

    CameraInternal getCamera(String str);

    Object getCameraManager();
}
