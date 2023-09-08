package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

interface Camera2OutputConfig {
    int getId();

    String getPhysicalCameraId();

    int getSurfaceGroupId();

    List<Camera2OutputConfig> getSurfaceSharingOutputConfigs();
}
