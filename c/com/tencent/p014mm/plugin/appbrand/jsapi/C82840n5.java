package com.tencent.p014mm.plugin.appbrand.jsapi;

import fl0.C86920e;
import fy3.C32228q;
import gy3.C87413o;
import kr0.C88267e;
import org.json.JSONObject;
import rx3.C13598b0;
import uz2.C65489g0;
import uz2.C65492p;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n5 */
public final class C82840n5 extends C87413o implements C32228q<Integer, String, C65489g0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88267e f242254d;

    /* renamed from: e */
    public final /* synthetic */ int f242255e;

    /* renamed from: f */
    public final /* synthetic */ C82867o5 f242256f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82840n5(C88267e eVar, int i, C82867o5 o5Var) {
        super(3);
        this.f242254d = eVar;
        this.f242255e = i;
        this.f242256f = o5Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65492p pVar;
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        C65489g0 g0Var = (C65489g0) obj3;
        JSONObject jSONObject = new JSONObject();
        if (!(g0Var == null || (pVar = g0Var.f188444e) == null)) {
            String str2 = pVar.f188457f;
            boolean z = false;
            if (!(str2 == null || C112551y.m153811k(str2))) {
                jSONObject.put("tailType", pVar.f188457f);
            }
            String str3 = pVar.f188458g;
            if (!(str3 == null || C112551y.m153811k(str3))) {
                jSONObject.put("tailUserName", pVar.f188458g);
            }
            String str4 = pVar.f188459h;
            if (!(str4 == null || C112551y.m153811k(str4))) {
                jSONObject.put("tailPath", pVar.f188459h);
            }
            String str5 = pVar.f188460i;
            if (str5 == null || C112551y.m153811k(str5)) {
                z = true;
            }
            if (!z) {
                jSONObject.put("tailUrl", pVar.f188460i);
            }
        }
        this.f242254d.mo109647a(this.f242255e, this.f242256f.mo115111l((String) null, intValue != 0 ? intValue != 1 ? intValue != 2 ? C86920e.f252314d : C86920e.f252312b : C86920e.f252326p : C86920e.f252311a, jSONObject));
        return C13598b0.f38549a;
    }
}
