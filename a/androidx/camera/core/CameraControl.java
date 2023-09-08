package androidx.camera.core;

import p1167z8.C112608f;

public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }

    C112608f<Void> cancelFocusAndMetering();

    C112608f<Void> enableTorch(boolean z);

    C112608f<Integer> setExposureCompensationIndex(int i);

    C112608f<Void> setLinearZoom(float f);

    C112608f<Void> setZoomRatio(float f);

    C112608f<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);
}
