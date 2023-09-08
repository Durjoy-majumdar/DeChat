package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31922b1;
import hp3.C87581a;
import ii0.C87732a;
import java.util.LinkedList;
import java.util.Map;
import js0.C88022n;
import nr3.C89060f;
import ob0.C35136m;
import te3.ke4;
import te3.v55;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.q */
public enum C81342q implements C31922b1 {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.q$a */
    public class C81343a implements C87581a<Void, String> {
        public C81343a() {
        }

        public Object call(Object obj) {
            try {
                C81342q.m99759q(C81342q.this, (String) obj);
                return null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.PredownloadXmlProcessor", e, "process pbBase64", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: q */
    public static void m99759q(C81342q qVar, String str) {
        qVar.getClass();
        v55 v55 = new v55();
        v55.parseFrom(Base64.decode(str, 0));
        LinkedList<ke4> linkedList = v55.f143332d;
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105921e("MicroMsg.AppBrand.PredownloadXmlProcessor", "process, empty RespInfoList, time %d", Long.valueOf(C88022n.m109570a(v55.f143333e)));
            return;
        }
        C87732a.INSTANCE.mo122144a(0, 3);
        C81340p.m99758a(v55.f143332d, 0, (String) null);
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2 = map.get(".sysmsg.WeAppSyncCommand.Base64JsonContent");
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        C89060f.m111323b(str2).mo123419C(new C81343a());
        return null;
    }
}
