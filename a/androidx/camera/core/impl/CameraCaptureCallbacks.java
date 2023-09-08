package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CameraCaptureCallbacks {

    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {
        private final List<CameraCaptureCallback> mCallbacks = new ArrayList();

        public ComboCameraCaptureCallback(List<CameraCaptureCallback> list) {
            for (CameraCaptureCallback next : list) {
                if (!(next instanceof NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(next);
                }
            }
        }

        public List<CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public void onCaptureCancelled() {
            for (CameraCaptureCallback onCaptureCancelled : this.mCallbacks) {
                onCaptureCancelled.onCaptureCancelled();
            }
        }

        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback onCaptureCompleted : this.mCallbacks) {
                onCaptureCompleted.onCaptureCompleted(cameraCaptureResult);
            }
        }

        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            for (CameraCaptureCallback onCaptureFailed : this.mCallbacks) {
                onCaptureFailed.onCaptureFailed(cameraCaptureFailure);
            }
        }
    }

    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        }

        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
        }
    }

    private CameraCaptureCallbacks() {
    }

    public static CameraCaptureCallback createComboCallback(List<CameraCaptureCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new ComboCameraCaptureCallback(list);
    }

    public static CameraCaptureCallback createNoOpCallback() {
        return new NoOpCameraCaptureCallback();
    }

    public static CameraCaptureCallback createComboCallback(CameraCaptureCallback... cameraCaptureCallbackArr) {
        return createComboCallback((List<CameraCaptureCallback>) Arrays.asList(cameraCaptureCallbackArr));
    }
}
