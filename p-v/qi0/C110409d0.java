package qi0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;
import pi0.C110232f;

/* renamed from: qi0.d0 */
public class C110409d0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetPixelsActionArg setPixelsActionArg = (SetPixelsActionArg) drawActionArg;
        if (setPixelsActionArg == null) {
            return false;
        }
        return mo161919c(dVar, canvas, setPixelsActionArg.f311133i, setPixelsActionArg.f311129e, setPixelsActionArg.f311130f, setPixelsActionArg.f311131g, setPixelsActionArg.f311132h);
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        try {
            return mo161919c(dVar, canvas, (Bitmap) jSONArray.get(4), C88020k.m109559j(jSONArray, 0), C88020k.m109559j(jSONArray, 1), C88020k.m109559j(jSONArray, 2), C88020k.m109559j(jSONArray, 3));
        } catch (Exception e) {
            Log.m105929w("MicroMsg.SetPixelsAction", "get bitmap data error, %s", android.util.Log.getStackTraceString(e));
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo161919c(C110229d dVar, Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4) {
        boolean z;
        C110229d dVar2 = dVar;
        Canvas canvas2 = canvas;
        Bitmap bitmap2 = bitmap;
        int i5 = i;
        int i6 = i2;
        if (!canvas.isHardwareAccelerated()) {
            z = false;
            Paint paint = dVar2.f329749f;
            if (paint != null) {
                Canvas canvas3 = canvas;
                canvas3.drawRect((float) i5, (float) i6, (float) (i5 + i3), (float) (i6 + i4), paint);
                Log.m105927v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                canvas.drawRect((float) i5, (float) i6, (float) (i5 + i3), (float) (i6 + i4), dVar2.f329748e);
                Log.m105927v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with default clearPaint", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        } else if (canvas2 instanceof C110232f) {
            ((C110232f) canvas2).mo161638a((float) i5, (float) i6, (float) (i5 + i3), (float) (i6 + i4));
            Log.m105927v("MicroMsg.SetPixelsAction", "MCanvas.clearRect(x : %s, y : %s, w : %s, h : %s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            z = false;
        } else {
            Paint paint2 = dVar2.f329749f;
            if (paint2 != null) {
                Canvas canvas4 = canvas;
                z = false;
                canvas4.drawRect((float) i5, (float) i6, (float) (i5 + i3), (float) (i6 + i4), paint2);
                Log.m105927v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                z = false;
                Log.m105927v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) failed", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        }
        if (bitmap2 == null || bitmap.isRecycled()) {
            return z;
        }
        canvas2.drawBitmap(bitmap2, new Rect(z ? 1 : 0, z, bitmap.getWidth(), bitmap.getHeight()), new RectF((float) i5, (float) i6, (float) (i5 + i3), (float) (i6 + i4)), dVar2.f329744a);
        return true;
    }

    public String getMethod() {
        return "__setPixels";
    }
}
