package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import p202m2.C117512b;

final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private C117512b.C117513a<Void> mPendingZoomRatioCompleter;
    private final Range<Float> mZoomRatioRange;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mZoomRatioRange = (Range) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.mCurrentZoomRatio));
    }

    public Rect getCropSensorRegion() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public float getMaxZoom() {
        return this.mZoomRatioRange.getUpper().floatValue();
    }

    public float getMinZoom() {
        return this.mZoomRatioRange.getLower().floatValue();
    }

    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.mPendingZoomRatio == f.floatValue()) {
                    this.mPendingZoomRatioCompleter.mo182231a(null);
                    this.mPendingZoomRatioCompleter = null;
                }
            }
        }
    }

    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        C117512b.C117513a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    public void setZoomRatio(float f, C117512b.C117513a<Void> aVar) {
        this.mCurrentZoomRatio = f;
        C117512b.C117513a<Void> aVar2 = this.mPendingZoomRatioCompleter;
        if (aVar2 != null) {
            aVar2.mo182232b(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomRatio = this.mCurrentZoomRatio;
        this.mPendingZoomRatioCompleter = aVar;
    }
}
