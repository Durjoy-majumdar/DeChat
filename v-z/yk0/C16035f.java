package yk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: yk0.f */
public final class C16035f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f43132d;

    /* renamed from: e */
    public final /* synthetic */ int f43133e;

    /* renamed from: f */
    public final /* synthetic */ C82870p f43134f;

    public C16035f(C82381f fVar, int i, C82870p pVar) {
        this.f43132d = fVar;
        this.f43133e = i;
        this.f43134f = pVar;
    }

    public final void run() {
        C82381f fVar = this.f43132d;
        int i = this.f43133e;
        C82870p pVar = this.f43134f;
        pVar.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        fVar.mo109647a(i, pVar.mo115115p("ok", jSONObject));
    }
}
