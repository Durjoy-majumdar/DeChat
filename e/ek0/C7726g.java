package ek0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: ek0.g */
public final class C7726g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f26166d;

    /* renamed from: e */
    public final /* synthetic */ int f26167e;

    /* renamed from: f */
    public final /* synthetic */ C7727h f26168f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7726g(C81879g gVar, int i, C7727h hVar) {
        super(0);
        this.f26166d = gVar;
        this.f26167e = i;
        this.f26168f = hVar;
    }

    public Object invoke() {
        C81879g gVar = this.f26166d;
        int i = this.f26167e;
        C7727h hVar = this.f26168f;
        hVar.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        gVar.mo109647a(i, hVar.mo115115p("cancel", jSONObject));
        return C13598b0.f38549a;
    }
}
