package d80;

import a80.C103326b;
import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.camera.core.MeteringPointFactory;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: d80.g */
public final class C107024g extends MeteringPointFactory {

    /* renamed from: a */
    public final C103326b f320412a = new C103326b();

    /* renamed from: b */
    public final Matrix f320413b = new Matrix();

    public PointF convertPoint(float f, float f2) {
        float width = f / this.f320412a.f304664d.width();
        float height = f2 / this.f320412a.f304664d.height();
        float[] fArr = new float[2];
        this.f320413b.mapPoints(fArr, new float[]{width, height});
        Log.m105924i("MicroMsg.Camera.CameraKitFocusHelper", "convertPoint origin:[" + width + ' ' + height + "] dest:[" + fArr[0] + ' ' + fArr[1] + ']');
        return new PointF(fArr[0], fArr[1]);
    }
}
