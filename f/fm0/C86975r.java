package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.r */
public abstract class C86975r<CONTEXT extends C81879g, Extension> extends C82268c<CONTEXT> {

    /* renamed from: g */
    public final Class<Extension> f252432g;

    public C86975r(Class<Extension> cls) {
        this.f252432g = cls;
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C86972q qVar = new C86972q(this, gVar, i, jSONObject);
        if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
            qVar.run();
        } else {
            gVar.getRuntime().mo113020N0(qVar);
        }
    }

    /* renamed from: w */
    public abstract void mo121371w(CONTEXT context, JSONObject jSONObject, int i, Extension extension);
}
