package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.plugin.appbrand.game.preload.C81889e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jk0.C87975a;
import org.json.JSONObject;
import sp0.C90272a;
import sp0.C90280d;
import sp0.C90322q;
import tl0.C90509a;
import tl0.C90512b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.h */
public class C82025h extends C90512b {
    public static final int CTRL_INDEX = 269;
    public static final String NAME = "createDownloadTask";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.h$a */
    public static class C82026a extends C90509a {
        public C82026a(C90280d.C90282b bVar, C87975a aVar) {
            super(bVar, aVar);
        }

        /* renamed from: c */
        public void mo114486c(C82381f fVar, C90272a aVar, boolean z, JSONObject jSONObject, int i, Map<String, String> map, C90280d.C90281a aVar2, String str) {
            boolean z2;
            C90322q qVar;
            Boolean valueOf;
            C90272a aVar3 = aVar;
            String optString = jSONObject.optString("url");
            if (Util.isNullOrNil(optString)) {
                Log.m105924i("MicroMsg.JsApiCreateDownloadTaskGame", "url is null");
                C82381f fVar2 = fVar;
                mo124673e(fVar, str, "url is null or nil", 600005);
                return;
            }
            C82381f fVar3 = fVar;
            String str2 = str;
            C81889e d = C81889e.m100570d();
            if (d != null) {
                synchronized (d.f240200g) {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = d.f240200g;
                    boolean z3 = false;
                    z2 = true;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(optString)) {
                        C90322q qVar2 = d.f240195b;
                        if (qVar2 != null) {
                            synchronized (qVar2.f259291i) {
                                valueOf = Boolean.valueOf(((HashMap) qVar2.f259291i).containsKey(optString));
                            }
                            if (valueOf.booleanValue()) {
                                z3 = true;
                            }
                        }
                        z2 = z3;
                    } else {
                        Log.m105925i("MicroMsg.WAGamePreloadManager", "predownloadingList has url:%s,size:%d", optString, Integer.valueOf(d.f240200g.size()));
                        d.f240205l.addAndGet(1);
                    }
                }
                if (z2 && (qVar = d.f240195b) != null) {
                    qVar.mo124552b(jSONObject, i, map, z ? aVar3.f259140t : null, aVar3.f259146z, aVar2, str, "createDownloadTask");
                    return;
                }
            }
            super.mo114486c(fVar, aVar, z, jSONObject, i, map, aVar2, str);
        }
    }

    public C82025h(C90280d.C90282b bVar) {
        super(bVar);
    }

    /* renamed from: w */
    public C90509a mo114485w(C90280d.C90282b bVar) {
        return new C82026a(bVar, this.f259018g);
    }
}
