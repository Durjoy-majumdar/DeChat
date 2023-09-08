package g01;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ImageReader;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: g01.b */
public final class C107658b {

    /* renamed from: a */
    public int f322059a;

    /* renamed from: b */
    public int f322060b;

    /* renamed from: c */
    public ImageReader f322061c;

    /* renamed from: d */
    public Surface f322062d;

    /* renamed from: e */
    public Surface f322063e;

    /* renamed from: f */
    public final Object f322064f = new Object();

    /* renamed from: g */
    public Bitmap f322065g;

    /* renamed from: h */
    public final Paint f322066h = new Paint();

    public C107658b(int i, int i2) {
        this.f322059a = i;
        this.f322060b = i2;
    }

    /* renamed from: a */
    public final void mo158073a() {
        Bitmap bitmap;
        synchronized (this.f322064f) {
            Surface surface = this.f322063e;
            if (!(surface == null || (bitmap = this.f322065g) == null)) {
                try {
                    if (surface.isValid() && this.f322061c != null) {
                        Canvas lockCanvas = surface.lockCanvas((Rect) null);
                        C87412m.m108593f(lockCanvas, "surface.lockCanvas(null)");
                        lockCanvas.drawColor(-16777216);
                        lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f322066h);
                        surface.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.ScreenCastImageReader", "error happened " + e.fillInStackTrace());
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
