package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.utils.C84712a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.b */
public final class C82124b extends C84712a<C82126b> implements C82131e {

    /* renamed from: g */
    public static final HashMap<String, C82124b> f240897g = new HashMap<>();

    /* renamed from: h */
    public static final C82131e f240898h = C82125a.f240899d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.b$a */
    public static final class C82125a implements C82131e {

        /* renamed from: d */
        public static final C82125a f240899d = new C82125a();

        /* renamed from: c */
        public final void mo114560c(C82197q qVar, C83125x6<C81879g> x6Var) {
            C87412m.m108594g(qVar, ProviderConstants.API_PATH);
            C87412m.m108594g(x6Var, "<name for destructuring parameter 1>");
            int i = x6Var.f242919e;
            Log.m105920e("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dummy execute name[" + qVar.mo114779e() + "], callbackId[" + i + "], appId[" + ((C81879g) x6Var.f242916b).getAppId() + ']');
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.b$b */
    public static final class C82126b implements C84712a.C84713a {

        /* renamed from: d */
        public final C82197q f240900d;

        /* renamed from: e */
        public final C83125x6<C81879g> f240901e;

        /* renamed from: f */
        public final String f240902f;

        /* renamed from: g */
        public final C82157g f240903g;

        public C82126b(C82197q qVar, C83125x6<C81879g> x6Var, String str, C82157g gVar) {
            C87412m.m108594g(qVar, ProviderConstants.API_PATH);
            C87412m.m108594g(x6Var, "context");
            C87412m.m108594g(str, "key");
            C87412m.m108594g(gVar, "authWithTimeoutListener");
            this.f240900d = qVar;
            this.f240901e = x6Var;
            this.f240902f = str;
            this.f240903g = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C82126b)) {
                return false;
            }
            C82126b bVar = (C82126b) obj;
            return C87412m.m108589b(this.f240900d, bVar.f240900d) && C87412m.m108589b(this.f240901e, bVar.f240901e) && C87412m.m108589b(this.f240902f, bVar.f240902f) && C87412m.m108589b(this.f240903g, bVar.f240903g);
        }

        public int hashCode() {
            return (((((this.f240900d.hashCode() * 31) + this.f240901e.hashCode()) * 31) + this.f240902f.hashCode()) * 31) + this.f240903g.hashCode();
        }

        public String toString() {
            return "Task(api=" + this.f240900d + ", context=" + this.f240901e + ", key=" + this.f240902f + ", authWithTimeoutListener=" + this.f240903g + ')';
        }
    }

    public C82124b(int i) {
        super(i);
    }

    /* renamed from: c */
    public void mo114560c(C82197q qVar, C83125x6<C81879g> x6Var) {
        C87412m.m108594g(qVar, ProviderConstants.API_PATH);
        C87412m.m108594g(x6Var, "invokeContext");
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        String str = "name[" + qVar.mo114779e() + "], callbackId[" + x6Var.f242919e + "], appId[" + gVar.getAppId() + "] component[" + gVar.getComponentId() + ']';
        int size = this.f247102e.size();
        int i = this.f247103f.get();
        long optLong = jSONObject.optLong("timeout", -1);
        Log.m105924i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dispatch " + str + ", queueLength:" + size + ", inFlightTasksCount:" + i + ", timeout:" + optLong);
        jSONObject.put("queueLength", size);
        mo117441d(new C82126b(qVar, x6Var, str, new C82157g(qVar, x6Var, optLong)));
    }

    /* renamed from: e */
    public boolean mo114561e(C84712a.C84713a aVar) {
        boolean z;
        C82126b bVar = (C82126b) aVar;
        C87412m.m108594g(bVar, "task");
        C82157g gVar = bVar.f240903g;
        synchronized (gVar) {
            z = gVar.f240980h;
        }
        return z;
    }

    /* renamed from: g */
    public void mo114562g(C84712a.C84713a aVar, C32224a aVar2) {
        C82126b bVar = (C82126b) aVar;
        C87412m.m108594g(bVar, "task");
        C87412m.m108594g(aVar2, "onEnd");
        C82197q qVar = bVar.f240900d;
        C83125x6<C81879g> x6Var = bVar.f240901e;
        String str = bVar.f240902f;
        C82157g gVar = bVar.f240903g;
        C82123a aVar3 = new C82123a(new C29501d(str, aVar2));
        synchronized (gVar) {
            gVar.f240979g = aVar3;
        }
        Log.m105924i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "runTask " + str);
        if (((C81879g) x6Var.f242916b).isRunning()) {
            qVar.mo114534w(x6Var, bVar.f240903g);
        } else {
            aVar2.invoke();
        }
    }
}
