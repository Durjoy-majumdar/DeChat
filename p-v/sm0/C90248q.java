package sm0;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import p823sg.C77710q;
import p963fc.C86812g;

/* renamed from: sm0.q */
public final class C90248q {

    /* renamed from: a */
    public static final C90248q f259063a = new C90248q();

    /* renamed from: a */
    public final C26165b mo124477a(C86812g gVar) {
        C87412m.m108594g(gVar, "runtime");
        C26165b bVar = (C26165b) gVar.mo113032U(C26165b.class);
        if (bVar != null) {
            return bVar;
        }
        AppBrandInitConfigLU l1 = gVar.mo113036W();
        String a = l1 != null ? C77710q.m93738a(l1.f234818T) : null;
        if (a == null) {
            Log.m105920e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin is null");
            return null;
        }
        String str = gVar.f238147j;
        if (str == null) {
            Log.m105920e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, appId is null");
            return null;
        }
        C81439t0 c = C82419d1.m101177c(a, str);
        C81410b0 mkdir = c.mkdir("wxfile://clientdata/TSMStorage", true);
        C87412m.m108593f(mkdir, "clientPrivateFS.mkdir(sm…ageDirRelativePath, true)");
        if (C81410b0.OK == mkdir || C81410b0.RET_ALREADY_EXISTS == mkdir) {
            String i = C86013q1.m106448i(new C86009m1(c.f238992d, "TSMStorage").mo119971i(), true);
            if (i == null) {
                Log.m105920e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, smStorageRootPath is null");
                return null;
            }
            Log.m105924i("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin: " + a + ", appId: " + str + ", smStorageRootPath: " + i);
            C27667r rVar = new C27667r(i, str, a, (C8480h) null);
            gVar.mo113059i(rVar);
            return rVar;
        }
        Log.m105920e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, mkdir fail, ret: " + mkdir);
        return null;
    }
}
