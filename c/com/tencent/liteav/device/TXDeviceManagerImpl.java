package com.tencent.liteav.device;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.device.TXDeviceManager;

@JNINamespace("liteav::manager")
public class TXDeviceManagerImpl implements TXDeviceManager {
    private long mNativeDeviceMgr;

    /* renamed from: com.tencent.liteav.device.TXDeviceManagerImpl$1 */
    public static /* synthetic */ class C171621 {

        /* renamed from: $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute */
        public static final /* synthetic */ int[] f46342x386638d7;

        /* renamed from: $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXCameraCaptureMode */
        public static final /* synthetic */ int[] f46343x18710c60;

        /* renamed from: $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType */
        public static final /* synthetic */ int[] f46344x3f00e6c7;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        static {
            /*
                com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode[] r0 = com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46343x18710c60 = r0
                r1 = 1
                com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode r2 = com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46343x18710c60     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode r3 = com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46343x18710c60     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode r4 = com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f46343x18710c60     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode r4 = com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tencent.liteav.device.TXDeviceManager$TXAudioRoute[] r3 = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46342x386638d7 = r3
                com.tencent.liteav.device.TXDeviceManager$TXAudioRoute r4 = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r3 = f46342x386638d7     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tencent.liteav.device.TXDeviceManager$TXAudioRoute r4 = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.tencent.liteav.device.TXDeviceManager$TXSystemVolumeType[] r3 = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46344x3f00e6c7 = r3
                com.tencent.liteav.device.TXDeviceManager$TXSystemVolumeType r4 = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto     // Catch:{ NoSuchFieldError -> 0x005f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f46344x3f00e6c7     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.tencent.liteav.device.TXDeviceManager$TXSystemVolumeType r3 = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f46344x3f00e6c7     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.tencent.liteav.device.TXDeviceManager$TXSystemVolumeType r1 = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.device.TXDeviceManagerImpl.C171621.<clinit>():void");
        }
    }

    public static class CameraCaptureParam {
        private TXDeviceManager.TXCameraCaptureParam mParams;

        public CameraCaptureParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
            this.mParams = tXCameraCaptureParam;
        }

        public int getHeight() {
            return this.mParams.height;
        }

        public int getMode() {
            return TXDeviceManagerImpl.cameraCaptureModeAsInt(this.mParams.mode);
        }

        public int getWidth() {
            return this.mParams.width;
        }
    }

    public TXDeviceManagerImpl(long j) {
        this.mNativeDeviceMgr = j;
    }

    public static int audioRouteAsInt(TXDeviceManager.TXAudioRoute tXAudioRoute) {
        int i = C171621.f46342x386638d7[tXAudioRoute.ordinal()];
        return (i == 1 || i != 2) ? 0 : 1;
    }

    public static TXDeviceManager.TXAudioRoute audioRouteFromInt(int i) {
        return i == 0 ? TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone : i == 1 ? TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece : TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
    }

    public static int cameraCaptureModeAsInt(TXDeviceManager.TXCameraCaptureMode tXCameraCaptureMode) {
        int i = C171621.f46343x18710c60[tXCameraCaptureMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }
    }

    public static TXDeviceManager.TXCameraCaptureMode cameraCaptureModeFromInt(int i) {
        return i == 0 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : i == 1 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance : i == 2 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality : i == 3 ? TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual : TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto;
    }

    private static native void nativeDestroy(long j);

    private static native int nativeEnableCameraAutoFocus(long j, boolean z);

    private static native boolean nativeEnableCameraTorch(long j, boolean z);

    private static native float nativeGetCameraZoomMaxRatio(long j);

    private static native boolean nativeIsAutoFocusEnabled(long j);

    private static native boolean nativeIsCameraAutoFocusFaceModeSupported(long j);

    private static native boolean nativeIsCameraFocusPositionInPreviewSupported(long j);

    private static native boolean nativeIsCameraTorchSupported(long j);

    private static native boolean nativeIsCameraZoomSupported(long j);

    private static native boolean nativeIsFrontCamera(long j);

    private static native boolean nativeIsLowLatencyEarMonitorSupported(long j);

    private static native int nativeSetAudioRoute(long j, int i);

    private static native void nativeSetCameraCapturerParam(long j, CameraCaptureParam cameraCaptureParam);

    private static native int nativeSetCameraFocusPosition(long j, int i, int i2);

    private static native int nativeSetCameraZoomRatio(long j, float f);

    private static native int nativeSetSystemVolumeType(long j, int i);

    private static native int nativeSwitchCamera(long j, boolean z);

    public static int systemVolumeTypeAsInt(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        int i = C171621.f46344x3f00e6c7[tXSystemVolumeType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
            return 1;
        }
    }

    public static TXDeviceManager.TXSystemVolumeType systemVolumeTypefromInt(int i) {
        return i == 0 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto : i == 1 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia : i == 2 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP : TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    }

    public int enableCameraAutoFocus(boolean z) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeEnableCameraAutoFocus(j, z);
        }
        return 0;
    }

    public boolean enableCameraTorch(boolean z) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeEnableCameraTorch(j, z);
        }
        return false;
    }

    public void finalize() {
        super.finalize();
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeDeviceMgr = 0;
        }
    }

    public float getCameraZoomMaxRatio() {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeGetCameraZoomMaxRatio(j);
        }
        return 0.0f;
    }

    public boolean isAutoFocusEnabled() {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeIsAutoFocusEnabled(j);
        }
        return false;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        long j = this.mNativeDeviceMgr;
        if (j == 0) {
            return false;
        }
        return nativeIsCameraAutoFocusFaceModeSupported(j);
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
        long j = this.mNativeDeviceMgr;
        if (j == 0) {
            return false;
        }
        return nativeIsCameraFocusPositionInPreviewSupported(j);
    }

    public boolean isCameraTorchSupported() {
        long j = this.mNativeDeviceMgr;
        if (j == 0) {
            return false;
        }
        return nativeIsCameraTorchSupported(j);
    }

    public boolean isCameraZoomSupported() {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeIsCameraZoomSupported(j);
        }
        return false;
    }

    public boolean isFrontCamera() {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeIsFrontCamera(j);
        }
        return false;
    }

    public boolean isLowLatencyEarMonitorSupported() {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeIsLowLatencyEarMonitorSupported(j);
        }
        return false;
    }

    public int setAudioRoute(TXDeviceManager.TXAudioRoute tXAudioRoute) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeSetAudioRoute(j, audioRouteAsInt(tXAudioRoute));
        }
        return 0;
    }

    public void setCameraCapturerParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            nativeSetCameraCapturerParam(j, new CameraCaptureParam(tXCameraCaptureParam));
        }
    }

    public int setCameraFocusPosition(int i, int i2) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeSetCameraFocusPosition(j, i, i2);
        }
        return 0;
    }

    public int setCameraZoomRatio(float f) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeSetCameraZoomRatio(j, f);
        }
        return 0;
    }

    public int setSystemVolumeType(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeSetSystemVolumeType(j, systemVolumeTypeAsInt(tXSystemVolumeType));
        }
        return 0;
    }

    public int switchCamera(boolean z) {
        long j = this.mNativeDeviceMgr;
        if (j != 0) {
            return nativeSwitchCamera(j, z);
        }
        return 0;
    }
}
