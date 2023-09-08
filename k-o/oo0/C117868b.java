package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.b */
public class C117868b implements C118080q.C118098m {

    /* renamed from: a */
    public final /* synthetic */ int f352381a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352382b;

    public C117868b(C89248j jVar, int i, C82381f fVar) {
        this.f352381a = i;
        this.f352382b = fVar;
    }

    /* renamed from: a */
    public void mo182587a(C118080q.C118107v vVar) {
        C117844w.C117857m mVar = new C117844w.C117857m();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352381a);
            jSONObject.put("data", vVar.f353056a);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        mVar.f242407f = jSONObject.toString();
        this.f352382b.mo109669n(mVar, (int[]) null);
    }
}
