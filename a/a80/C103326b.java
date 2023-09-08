package a80;

import android.graphics.RectF;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: a80.b */
public class C103326b {

    /* renamed from: a */
    public int f304661a;

    /* renamed from: b */
    public int f304662b;

    /* renamed from: c */
    public int f304663c;

    /* renamed from: d */
    public RectF f304664d = new RectF();

    /* renamed from: a */
    public void mo143119a(boolean z, int i, int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        RectF rectF;
        Log.m105924i("MicroMsg.Camera.CameraKitFocusHelper", "updateFocusParam mirrorX:" + z + " rotate:" + i + " textureWidth:" + i2 + " textureHeight:" + i3 + " viewWidth:" + i4 + " viewHeight:" + i5);
        if (i5 <= 0 || i4 <= 0) {
            Log.m105920e("MicroMsg.Camera.CameraKitFocusHelper", "ignore updateTransformer,for width:" + i4 + " height:" + i5);
            return;
        }
        this.f304663c = i;
        this.f304661a = i4;
        this.f304662b = i5;
        float f3 = (float) i5;
        float f4 = (float) i4;
        float f5 = (f3 * 1.0f) / f4;
        if (i == -270 || i == -90 || i == 90 || i == 270) {
            f2 = ((float) i2) * 1.0f;
            f = (float) i3;
        } else {
            f2 = ((float) i3) * 1.0f;
            f = (float) i2;
        }
        float f6 = f2 / f;
        if (f5 > f6) {
            float f7 = ((f5 - f6) * f4) / ((float) 2);
            rectF = new RectF(((float) 0) - f7, 0.0f, f4 + f7, f3);
        } else {
            float f8 = ((f6 - f5) * f3) / ((float) 2);
            rectF = new RectF(0.0f, ((float) 0) - f8, f4, f3 + f8);
        }
        this.f304664d = rectF;
        Log.m105924i("MicroMsg.Camera.CameraKitFocusHelper", "calculate real preview rect:" + this.f304664d);
    }
}
