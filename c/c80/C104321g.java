package c80;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: c80.g */
public final class C104321g {

    /* renamed from: a */
    public CaptureRequest.Builder f308779a;

    /* renamed from: b */
    public CameraCharacteristics f308780b;

    /* renamed from: c */
    public boolean f308781c;

    /* renamed from: a */
    public final boolean mo146010a(boolean z) {
        Rect rect;
        if (this.f308781c) {
            Log.m105924i("MicroMsg.Camera.Camera2ZoomHelper", "when zoomIn isZooming");
            return false;
        }
        CaptureRequest.Builder builder = this.f308779a;
        if (builder == null || this.f308780b == null) {
            Log.m105920e("MicroMsg.Camera.Camera2ZoomHelper", "when zoomIn but res is ready");
            return false;
        }
        this.f308781c = true;
        Rect rect2 = null;
        if (builder != null) {
            try {
                rect = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Camera.Camera2ZoomHelper", e, "onZoomIn error:", new Object[0]);
                this.f308781c = false;
                return false;
            } catch (Throwable th) {
                this.f308781c = false;
                throw th;
            }
        } else {
            rect = null;
        }
        CameraCharacteristics cameraCharacteristics = this.f308780b;
        if (cameraCharacteristics != null) {
            rect2 = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        C87412m.m108591d(rect2);
        C87412m.m108591d(rect);
        float width = ((float) rect2.width()) / ((float) rect.width());
        CameraCharacteristics cameraCharacteristics2 = this.f308780b;
        C87412m.m108591d(cameraCharacteristics2);
        Float f = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            f = Float.valueOf(0.0f);
        }
        float floatValue = f.floatValue();
        if (width >= floatValue) {
            this.f308781c = false;
            return false;
        }
        if (z) {
            float f2 = width + 0.1f;
            if (f2 < floatValue) {
                floatValue = f2;
            }
        } else {
            if (width == 1.0f) {
                this.f308781c = false;
                return false;
            }
            floatValue = width - 0.1f;
            if (floatValue <= 1.0f) {
                floatValue = 1.0f;
            }
        }
        float width2 = ((float) rect2.width()) / floatValue;
        float height = ((float) rect2.height()) / floatValue;
        float f3 = (float) 2;
        float width3 = (((float) rect2.width()) - width2) / f3;
        float height2 = (((float) rect2.height()) - height) / f3;
        Rect rect3 = new Rect((int) width3, (int) height2, (int) (width3 + width2), (int) (height2 + height));
        CaptureRequest.Builder builder2 = this.f308779a;
        if (builder2 != null) {
            builder2.set(CaptureRequest.SCALER_CROP_REGION, rect3);
        }
        this.f308781c = false;
        return true;
    }
}
