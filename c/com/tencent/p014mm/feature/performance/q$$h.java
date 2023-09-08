package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.Log;
import lb0.C88394b;
import oa1.C117731d;
import p1028re.C89928a;

/* renamed from: com.tencent.mm.feature.performance.q$$h */
public class q$$h implements C89928a {
    public q$$h(C80864q qVar) {
    }

    /* renamed from: a */
    public void mo391a(int i) {
        if (!C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false)) {
            Log.m105924i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        Log.m105925i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "systemTrim: level %s", Integer.valueOf(i));
        String str = C88394b.f255384g;
        ((C88394b.C88401f) C88394b.C88418q.f255427a.f255390e).mo122809a();
    }

    /* renamed from: b */
    public void mo392b() {
        int size;
        if (!C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false)) {
            Log.m105924i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        Object[] objArr = new Object[1];
        String str = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        C88394b.C88401f fVar = (C88394b.C88401f) bVar.f255390e;
        synchronized (fVar.f255405a) {
            size = fVar.f255405a.size();
        }
        objArr[0] = Integer.valueOf(size);
        Log.m105925i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "backgroundTrim: %s", objArr);
        ((C88394b.C88401f) bVar.f255390e).mo122809a();
    }
}
