package p1058wb;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import pe3.C47465a;

/* renamed from: wb.a */
public final class C90904a extends C82926s {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onClientRequest";

    /* renamed from: i */
    public static final C90905a f260895i = new C90905a((C8480h) null);

    /* renamed from: wb.a$a */
    public static final class C90905a {
        public C90905a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo124993a(C81879g gVar, int i, int i2, C47465a aVar) {
            C87412m.m108594g(gVar, "env");
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i));
            hashMap.put(ProviderConstants.API_PATH, Integer.valueOf(i2));
            hashMap.put("data", C84782s1.m104464e(aVar != null ? aVar.toByteArray() : null));
            C84782s1.m104463d(gVar.getJsRuntime(), hashMap, (C84782s1.C84783a) gVar.mo109671p(C84782s1.C84783a.class));
            C90904a aVar2 = new C90904a(hashMap, (C8480h) null);
            aVar2.mo115161k(gVar);
            aVar2.mo115158h();
        }
    }

    public C90904a(Map map, C8480h hVar) {
        mo115165o(map);
    }
}
