package fo0;

import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.IXWebLibraryLoader;
import p206nj.C88957l;

/* renamed from: fo0.h */
public class C32141h implements IXWebLibraryLoader {
    public boolean afterLoad() {
        C88957l.m111079o("skia-canvas-log-bridge", C80662g.class.getClassLoader());
        return true;
    }

    public boolean beforeLoad() {
        return false;
    }

    public boolean load(String str) {
        Log.m105925i("Luggage.XWebCanvasLogic", "load %s", str);
        try {
            C88957l.m111079o(str, C80662g.class.getClassLoader());
            return true;
        } catch (Throwable th) {
            Log.m105921e("Luggage.XWebCanvasLogic", "load %s fail, %s", str, th);
            return false;
        }
    }
}
