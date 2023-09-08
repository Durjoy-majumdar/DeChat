package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraInfo;

public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new CameraConfigProvider$$a();

    CameraConfig getConfig(CameraInfo cameraInfo, Context context);
}
