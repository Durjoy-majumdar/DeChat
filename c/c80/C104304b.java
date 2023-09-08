package c80;

import a80.C103326b;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: c80.b */
public final class C104304b extends C103326b {

    /* renamed from: e */
    public CameraCharacteristics f308720e;

    /* renamed from: f */
    public C104303a f308721f;

    /* renamed from: g */
    public boolean f308722g;

    /* renamed from: a */
    public void mo143119a(boolean z, int i, int i2, int i3, int i4, int i5) {
        super.mo143119a(z, i, i2, i3, i4, i5);
        this.f308722g = z;
    }

    /* renamed from: b */
    public final Rect mo145990b(float f, float f2, float f3, int i, int i2) {
        RectF rectF;
        float f4 = ((float) 80) * f3;
        RectF rectF2 = new RectF();
        rectF2.set(Math.max(f - f4, 0.0f), Math.max(f2 - f4, 0.0f), Math.min(f + f4, (float) i), Math.min(f2 + f4, (float) i2));
        C104303a aVar = this.f308721f;
        if (aVar != null) {
            rectF = new RectF();
            aVar.f308719a.mapRect(rectF, rectF2);
        } else {
            rectF = null;
        }
        Log.m105924i("MicroMsg.Camera.Camera2FocusHelper", "calculateTapArea src:" + rectF2 + " dst:" + rectF);
        Rect rect = new Rect();
        if (rectF != null) {
            rectF.round(rect);
        }
        return rect;
    }

    /* renamed from: c */
    public final boolean mo145991c(boolean z) {
        Integer num;
        if (z) {
            CameraCharacteristics cameraCharacteristics = this.f308720e;
            C87412m.m108591d(cameraCharacteristics);
            Object obj = cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            C87412m.m108591d(obj);
            num = (Integer) obj;
        } else {
            CameraCharacteristics cameraCharacteristics2 = this.f308720e;
            C87412m.m108591d(cameraCharacteristics2);
            Object obj2 = cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
            C87412m.m108591d(obj2);
            num = (Integer) obj2;
        }
        return num.intValue() > 0;
    }
}
