package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx0.C45469b;
import iy0.C46368o;
import iy0.C9263p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kr0.C33983a1;
import ny0.C47307b;
import oy0.C35337b;
import q73.C35796c0;
import q73.C89547f;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C90363p0;
import t73.C48558d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.f */
public final class C40709f {
    static {
        new C40709f();
    }

    /* renamed from: a */
    public static final void m43950a() {
        C40789z.f109643d.clearAll();
        C40789z.f109644e.clearAll();
        C46368o.C46369a.f124959b.clearAll();
        C40717k0.f109363a.getClass();
        C40717k0.f109364b.clearAll();
        C86013q1.m106446g(C48558d.f129901M.mo119976n(), true);
        C40717k0.f109365c.clearAll();
        C86013q1.m106446g(C48558d.f129902N.mo119976n(), true);
        C40717k0.f109366d.clearAll();
        C86013q1.m106446g(C48558d.f129903P.mo119976n(), true);
        C48558d f = WebPrefetcherManifest.f109312a.mo63594f();
        synchronized (f.f129913G) {
            HashMap<String, Integer> hashMap = f.f129913G;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(hashMap.size()));
            for (T next : hashMap.entrySet()) {
                Map.Entry entry = (Map.Entry) next;
                String str = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                String str2 = f.f129908B;
                Log.m105918d(str2, "clearAll destroy context: " + intValue);
                f.mo115375F0(intValue).destroy();
                linkedHashMap.put(C13598b0.f38549a, ((Map.Entry) next).getValue());
            }
            f.f129913G.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C86013q1.m106446g(C48558d.f129904Q.mo119976n(), true);
        C45469b.f123066j.clearAll();
        C45469b.f123067n.clearAll();
        C45469b.f123068o.clearAll();
        C47307b.f126967b.clearAll();
        C40716j0.m43979g().clearAll();
        ((MMKVSlotManager) ((C36570n) C89547f.f257694M).getValue()).clearAll();
        C40714i.f109361c.clear();
        C40714i.f109359a.clear();
        C35796c0.f95588a.mo60404e().clearAll();
        for (String str3 : (List) ((C36570n) C35796c0.f95595h).getValue()) {
            Log.m105927v("MicroMsg.WebCanvasStorageLogic", "clearPkgInfo clear wxa download info %s", str3);
            ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56531Dh(str3, 0);
        }
        C35337b.f94642a.mo60211d().clearAll();
        C9263p.f29013a.clearAll();
    }
}
