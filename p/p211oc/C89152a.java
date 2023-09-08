package p211oc;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.skyline.SkylineLogic;
import java.util.HashMap;
import p194lc.C88435b0;

/* renamed from: oc.a */
public final class C89152a {

    /* renamed from: a */
    public static final C89152a f256872a = new C89152a();

    /* renamed from: a */
    public final HashMap<String, Object> mo123488a(C81879g gVar) {
        C88435b0 b0Var;
        HashMap<String, Object> hashMap = new HashMap<>(5);
        hashMap.put("userAgent", SkylineLogic.INSTANCE.version());
        if (!(gVar == null || (b0Var = (C88435b0) gVar.getRuntime().mo113021O(C88435b0.class, false)) == null)) {
            hashMap.put("isSupportSkyline", Boolean.valueOf(b0Var.f255445g));
            hashMap.put("isLibSupportSkyline", Boolean.valueOf(b0Var.f255446h));
            C88435b0.C34216b bVar = b0Var.f255444f;
            hashMap.put("enableSkyline", Boolean.valueOf(bVar != null ? bVar.f92264a : b0Var.f255442d));
            hashMap.put("switchRenderMode", Integer.valueOf(b0Var.f255447i));
        }
        return hashMap;
    }
}
