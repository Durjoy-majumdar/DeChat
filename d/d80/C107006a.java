package d80;

import android.util.Range;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ExposureState;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107254b;
import h80.C108171a;

/* renamed from: d80.a */
public final class C107006a {

    /* renamed from: a */
    public Camera f320323a;

    /* renamed from: b */
    public int f320324b;

    /* renamed from: c */
    public Range<Integer> f320325c;

    /* renamed from: d */
    public int f320326d;

    /* renamed from: e */
    public boolean f320327e = true;

    /* renamed from: f */
    public int f320328f;

    /* renamed from: a */
    public final void mo157449a(Camera camera, C107254b bVar, int i) {
        Range<Integer> range;
        CameraInfo cameraInfo;
        ExposureState exposureState;
        CameraInfo cameraInfo2;
        ExposureState exposureState2;
        boolean z = true;
        if (bVar == null || !bVar.f320905f) {
            z = false;
        }
        if (!z) {
            Log.m105924i("MicroMsg.CameraXExpoHelper", "no support to adjust expo");
            return;
        }
        this.f320323a = camera;
        this.f320328f = i;
        if (camera == null || (cameraInfo2 = camera.getCameraInfo()) == null || (exposureState2 = cameraInfo2.getExposureState()) == null || (range = exposureState2.getExposureCompensationRange()) == null) {
            range = new Range<>(0, 0);
        }
        this.f320325c = range;
        StringBuilder sb = new StringBuilder();
        sb.append("from camera expoRange >> ");
        Range<Integer> range2 = this.f320325c;
        String str = null;
        sb.append(range2 != null ? range2.toString() : null);
        Log.m105924i("MicroMsg.CameraXExpoHelper", sb.toString());
        Range<Integer> range3 = this.f320325c;
        this.f320325c = range3 != null ? range3.intersect(-24, 24) : null;
        Camera camera2 = this.f320323a;
        int exposureCompensationIndex = (camera2 == null || (cameraInfo = camera2.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null) ? 0 : exposureState.getExposureCompensationIndex();
        this.f320324b = exposureCompensationIndex;
        if (!this.f320327e) {
            Log.m105924i("MicroMsg.CameraXExpoHelper", "goto check is reset");
            mo157450b();
        } else {
            this.f320326d = exposureCompensationIndex;
        }
        this.f320327e = false;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("bindCameraRes >> expoRange: ");
        Range<Integer> range4 = this.f320325c;
        if (range4 != null) {
            str = range4.toString();
        }
        sb4.append(str);
        sb4.append(", ");
        sb4.append(this.f320324b);
        Log.m105924i("MicroMsg.CameraXExpoHelper", sb4.toString());
    }

    /* renamed from: b */
    public final void mo157450b() {
        Log.m105924i("MicroMsg.CameraXExpoHelper", "resetExpo >> " + this.f320326d + ", " + this.f320324b);
        int i = this.f320324b;
        int i2 = this.f320326d;
        if (i != i2) {
            mo157451c(i2);
            this.f320324b = this.f320326d;
        }
    }

    /* renamed from: c */
    public final void mo157451c(int i) {
        CameraControl cameraControl;
        Log.m105924i("MicroMsg.CameraXExpoHelper", "setExpoDuration >> " + i);
        try {
            Camera camera = this.f320323a;
            if (!(camera == null || (cameraControl = camera.getCameraControl()) == null)) {
                cameraControl.setExposureCompensationIndex(i);
            }
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f320328f);
            if (a != null) {
                a.f310083Z = (long) 1;
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CameraXExpoHelper", "enlargeExpo is error >> " + e.getMessage() + ", " + i);
            CameraReportStruct a2 = C108171a.f323903a.mo158577a(this.f320328f);
            if (a2 != null) {
                a2.f310083Z = (long) 2;
            }
        }
    }
}
