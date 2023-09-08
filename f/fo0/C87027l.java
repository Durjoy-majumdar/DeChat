package fo0;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;
import js0.C88023q;

/* renamed from: fo0.l */
public class C87027l {

    /* renamed from: a */
    public static boolean f252546a;

    /* renamed from: b */
    public static SparseArray<SkiaCanvasApp> f252547b = new SparseArray<>();

    /* renamed from: fo0.l$a */
    public static class C87028a extends C88023q implements C83174m.C83175a {
        public C87028a(Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: a */
    public static SkiaCanvasApp m108053a(C82381f fVar) {
        int i;
        SkiaCanvasApp skiaCanvasApp;
        Class<C87027l> cls = C87027l.class;
        if (fVar instanceof C81925i2) {
            i = fVar.hashCode();
            synchronized (cls) {
                skiaCanvasApp = f252547b.get(i);
            }
        } else if (fVar instanceof C83780d1) {
            i = ((C83780d1) fVar).mo116160O0().hashCode();
            synchronized (cls) {
                skiaCanvasApp = f252547b.get(i);
            }
        } else {
            skiaCanvasApp = null;
            i = -1;
        }
        if (skiaCanvasApp == null) {
            Log.m105921e("Luggage.XWebCanvasLogic", "id:%d app is null, err", Integer.valueOf(i));
        }
        return skiaCanvasApp;
    }
}
