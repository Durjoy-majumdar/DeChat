package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONObject;
import sl0.C90220f;
import sp0.C90318o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j7 */
public class C82553j7 implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f241659d;

    /* renamed from: e */
    public final /* synthetic */ String f241660e;

    /* renamed from: f */
    public final /* synthetic */ C90220f f241661f;

    public C82553j7(C82558k7 k7Var, C82381f fVar, String str, C90220f fVar2) {
        this.f241659d = fVar;
        this.f241660e = str;
        this.f241661f = fVar2;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        C82381f fVar = this.f241659d;
        String str2 = this.f241660e;
        C90220f fVar2 = this.f241661f;
        if (bVar == C88508b.SUSPEND || bVar == C88508b.DESTROYED) {
            AtomicInteger atomicInteger = C90318o.f259278b;
            C83101e a = C90318o.C90320b.f259280a.mo124551a(str);
            if (a != null) {
                a.mo115345g(a.mo115339a(str2));
                HashMap hashMap = new HashMap();
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, "interrupted");
                hashMap.put("socketTaskId", str2);
                hashMap.put("state", "close");
                String jSONObject = new JSONObject(hashMap).toString();
                C90220f.C90222b bVar2 = new C90220f.C90222b();
                bVar2.mo115161k(fVar);
                bVar2.mo115163m(jSONObject);
                bVar2.mo115159i(fVar2.f259018g.mo122426a(str2));
                fVar2.f259018g.mo122427b(str2);
            }
        }
    }
}
