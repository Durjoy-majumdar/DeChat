package p176jc;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.jni.ISkylineLibraryLoader;
import p206nj.C88957l;

/* renamed from: jc.t */
public final class C33533t implements ISkylineLibraryLoader {
    public boolean afterLoad() {
        return false;
    }

    public boolean beforeLoad() {
        return false;
    }

    public boolean load(String str) {
        Log.m105924i("SkylineLogic", "load libName:" + str);
        if (str == null) {
            return false;
        }
        try {
            C88957l.m111078n(str);
            return true;
        } catch (Error e) {
            Log.m105920e("SkylineLogic", "load fail: " + str + ", e: " + e);
            return true;
        }
    }
}
