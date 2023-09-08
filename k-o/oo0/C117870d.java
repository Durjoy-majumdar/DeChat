package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.d */
public class C117870d implements C118080q.C118099n {

    /* renamed from: a */
    public final /* synthetic */ int f352385a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352386b;

    public C117870d(C89248j jVar, int i, C82381f fVar) {
        this.f352385a = i;
        this.f352386b = fVar;
    }

    /* renamed from: a */
    public void mo182589a(double d, double d2) {
        C117844w.C117858n nVar = new C117844w.C117858n();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352385a);
            jSONObject.put("longitude", d);
            jSONObject.put("latitude", d2);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        nVar.f242407f = jSONObject.toString();
        this.f352386b.mo109669n(nVar, (int[]) null);
    }
}
