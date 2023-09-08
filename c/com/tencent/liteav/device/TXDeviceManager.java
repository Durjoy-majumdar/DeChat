package com.tencent.liteav.device;

public interface TXDeviceManager {

    public enum TXAudioRoute {
        TXAudioRouteSpeakerphone,
        TXAudioRouteEarpiece
    }

    public enum TXCameraCaptureMode {
        TXCameraResolutionStrategyAuto,
        TXCameraResolutionStrategyPerformance,
        TXCameraResolutionStrategyHighQuality,
        TXCameraCaptureManual
    }

    public static class TXCameraCaptureParam {
        public int height;
        public TXCameraCaptureMode mode;
        public int width;
    }

    public enum TXSystemVolumeType {
        TXSystemVolumeTypeAuto,
        TXSystemVolumeTypeMedia,
        TXSystemVolumeTypeVOIP
    }

    int enableCameraAutoFocus(boolean z);

    boolean enableCameraTorch(boolean z);

    float getCameraZoomMaxRatio();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    int setAudioRoute(TXAudioRoute tXAudioRoute);

    void setCameraCapturerParam(TXCameraCaptureParam tXCameraCaptureParam);

    int setCameraFocusPosition(int i, int i2);

    int setCameraZoomRatio(float f);

    int setSystemVolumeType(TXSystemVolumeType tXSystemVolumeType);

    int switchCamera(boolean z);
}
