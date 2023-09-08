package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

public class ZslControlNoOpImpl implements ZslControl {
    public void addZslConfig(Size size, SessionConfig.Builder builder) {
    }

    public ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        return false;
    }

    public void setZslDisabled(boolean z) {
    }
}
