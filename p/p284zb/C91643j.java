package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;
import p284zb.C91627a;

/* renamed from: zb.j */
public class C91643j extends C91627a.C91629c {

    /* renamed from: b */
    public final /* synthetic */ C91640i f262615b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91643j(C91640i iVar, C82510g gVar) {
        super(gVar);
        this.f262615b = iVar;
    }

    /* renamed from: a */
    public void mo121817a() {
        if (this.f262615b.mo124764Z() == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: component released when resumeLoopTasks");
            return;
        }
        C83181q b0 = C91640i.m115126b0(this.f262615b);
        if (b0 == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        } else {
            b0.mo115405a();
        }
    }

    /* renamed from: d */
    public boolean mo121818d() {
        if (this.f262615b.mo124764Z() == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: component released when doInnerLoopTask");
            return true;
        }
        C83181q b0 = C91640i.m115126b0(this.f262615b);
        if (b0 != null) {
            return b0.mo115408d();
        }
        Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        return true;
    }

    /* renamed from: e */
    public void mo122291e(String str) {
        this.f262615b.mo122630w0(str);
    }

    /* renamed from: l */
    public boolean mo122294l(String str, String str2) {
        JSONObject jSONObject;
        Log.m105925i("Luggage.BaseAppBrandServiceLogic", "syncInitModule appId:%s, module:%s, params:%s", this.f262615b.mo125521g0(), str, str2);
        if (!Util.isNullOrNil(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException e) {
                Log.printErrStackTrace("Luggage.BaseAppBrandServiceLogic", e, "hy: param is not in json format", new Object[0]);
            }
            return this.f262615b.mo120922s0(str, jSONObject);
        }
        jSONObject = null;
        return this.f262615b.mo120922s0(str, jSONObject);
    }
}
