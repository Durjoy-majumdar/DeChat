package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import tm0.C90538k;

/* renamed from: tm0.b */
public class C90533b extends C82926s {
    private static final int CTRL_INDEX = -1;
    private static final String NAME = "onNetworkWeakChange";

    /* renamed from: s */
    public static void m113357s(C82381f fVar, boolean z) {
        HashMap hashMap = new HashMap();
        C90538k.C90543e x = C90538k.m113361x(MMApplicationContext.getContext());
        hashMap.put("networkType", x.f260172d);
        hashMap.put("weakNet", Boolean.valueOf(z));
        Log.m105925i("MicroMsg.AppBrandOnNetworkWeakChangeEvent", "networkType = %s,weakNet = %b", x.f260172d, Boolean.valueOf(z));
        C90533b bVar = new C90533b();
        bVar.mo115194p(fVar);
        bVar.mo115165o(hashMap);
        bVar.mo115158h();
    }
}
