package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83968x0;
import org.json.JSONObject;

/* renamed from: fm0.z */
public class C86992z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252457d;

    /* renamed from: e */
    public final /* synthetic */ String f252458e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252459f;

    /* renamed from: g */
    public final /* synthetic */ int f252460g;

    /* renamed from: h */
    public final /* synthetic */ C86925a0 f252461h;

    public C86992z(C86925a0 a0Var, C81879g gVar, String str, JSONObject jSONObject, int i) {
        this.f252461h = a0Var;
        this.f252457d = gVar;
        this.f252458e = str;
        this.f252459f = jSONObject;
        this.f252460g = i;
    }

    public void run() {
        C83849m0 Z = this.f252457d.getRuntime().mo113042Z();
        String str = this.f252458e;
        JSONObject jSONObject = this.f252459f;
        Z.getClass();
        Z.mo116338c0(new C83968x0(Z, str, jSONObject));
        this.f252457d.mo109647a(this.f252460g, this.f252461h.mo115109j("ok"));
    }
}
