package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.TagBundle;
import p329d3.C20434g;

final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {
    private final CameraCaptureCallback mCameraCaptureCallback;

    public CaptureCallbackAdapter(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback != null) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        TagBundle tagBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C20434g.m22018b(tag instanceof TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            tagBundle = (TagBundle) tag;
        } else {
            tagBundle = TagBundle.emptyBundle();
        }
        this.mCameraCaptureCallback.onCaptureCompleted(new Camera2CameraCaptureResult(tagBundle, totalCaptureResult));
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.mCameraCaptureCallback.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}
