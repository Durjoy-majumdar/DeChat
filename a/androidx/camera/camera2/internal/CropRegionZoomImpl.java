package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import p202m2.C117512b;

final class CropRegionZoomImpl implements ZoomControl.ZoomImpl {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private Rect mCurrentCropRect = null;
    private Rect mPendingZoomCropRegion = null;
    private C117512b.C117513a<Void> mPendingZoomRatioCompleter;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
    }

    private static Rect getCropRectByRatio(Rect rect, float f) {
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    private Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        Rect rect = this.mCurrentCropRect;
        if (rect != null) {
            builder.setCaptureRequestOption(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    public Rect getCropSensorRegion() {
        Rect rect = this.mCurrentCropRect;
        return rect != null ? rect : getSensorRect();
    }

    public float getMaxZoom() {
        Float f = (Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue() < getMinZoom() ? getMinZoom() : f.floatValue();
    }

    public float getMinZoom() {
        return 1.0f;
    }

    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.mPendingZoomCropRegion;
            if (rect2 != null && rect2.equals(rect)) {
                this.mPendingZoomRatioCompleter.mo182231a(null);
                this.mPendingZoomRatioCompleter = null;
                this.mPendingZoomCropRegion = null;
            }
        }
    }

    public void resetZoom() {
        this.mPendingZoomCropRegion = null;
        this.mCurrentCropRect = null;
        C117512b.C117513a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.mo182232b(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    public void setZoomRatio(float f, C117512b.C117513a<Void> aVar) {
        this.mCurrentCropRect = getCropRectByRatio(getSensorRect(), f);
        C117512b.C117513a<Void> aVar2 = this.mPendingZoomRatioCompleter;
        if (aVar2 != null) {
            aVar2.mo182232b(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomCropRegion = this.mCurrentCropRect;
        this.mPendingZoomRatioCompleter = aVar;
    }
}
